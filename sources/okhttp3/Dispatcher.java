package okhttp3;

import defpackage.a20;
import defpackage.d20;
import defpackage.m20;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (m20.L(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (m20.L(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable idleCallback;
        synchronized (this) {
            if (deque.remove(t)) {
                idleCallback = getIdleCallback();
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && idleCallback != null) {
            idleCallback.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                    break;
                }
                if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            if (runningCallsCount() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
        }
        return z;
    }

    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m151deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(m20.d1(" Dispatcher", Util.okHttpName), false));
        }
        return this.executorServiceOrNull;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        arrayList = new ArrayList(a20.C0(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        ArrayDeque<RealCall> arrayDeque;
        ArrayList arrayList;
        arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        arrayList = new ArrayList(a20.C0(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        return Collections.unmodifiableList(d20.M0(arrayList, arrayDeque));
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequests = i;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "max < 1: ").toString());
    }

    public final void setMaxRequestsPerHost(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "max < 1: ").toString());
    }

    public final void finished$okhttp(RealCall realCall) {
        finished(this.runningSyncCalls, realCall);
    }

    public Dispatcher(ExecutorService executorService) {
        this();
        this.executorServiceOrNull = executorService;
    }
}
