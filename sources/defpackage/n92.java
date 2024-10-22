package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class n92 implements RunnableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final u93 f3417a = new u93(4);

    /* renamed from: b, reason: collision with root package name */
    public final u93 f3418b = new u93(4);
    public final Object c = new Object();
    public Exception d;
    public Thread e;
    public boolean f;
    public final /* synthetic */ o92 g;

    public n92(o92 o92Var) {
        this.g = o92Var;
    }

    public final void a() {
        u93 u93Var = this.f3418b;
        synchronized (u93Var) {
            boolean z = false;
            while (!u93Var.f4639a) {
                try {
                    u93Var.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean cancel(boolean z) {
        synchronized (this.c) {
            if (!this.f && !this.f3418b.g()) {
                this.f = true;
                this.g.d.j = true;
                Thread thread = this.e;
                if (thread != null) {
                    if (z) {
                        thread.interrupt();
                    }
                } else {
                    this.f3417a.h();
                    this.f3418b.h();
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:            throw new java.io.InterruptedIOException();     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b5 A[Catch: IOException -> 0x01ae, TryCatch #3 {IOException -> 0x01ae, blocks: (B:90:0x018d, B:93:0x0194, B:98:0x01a8, B:99:0x01a3, B:107:0x01b5, B:109:0x01b9, B:112:0x01c3, B:114:0x01cd, B:117:0x01dd, B:118:0x01d8, B:119:0x01e0, B:124:0x01e2, B:125:0x01e7, B:129:0x01ea, B:132:0x01f3, B:137:0x0206, B:140:0x0201), top: B:89:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ea A[Catch: IOException -> 0x01ae, TryCatch #3 {IOException -> 0x01ae, blocks: (B:90:0x018d, B:93:0x0194, B:98:0x01a8, B:99:0x01a3, B:107:0x01b5, B:109:0x01b9, B:112:0x01c3, B:114:0x01cd, B:117:0x01dd, B:118:0x01d8, B:119:0x01e0, B:124:0x01e2, B:125:0x01e7, B:129:0x01ea, B:132:0x01f3, B:137:0x0206, B:140:0x0201), top: B:89:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194 A[Catch: IOException -> 0x01ae, TryCatch #3 {IOException -> 0x01ae, blocks: (B:90:0x018d, B:93:0x0194, B:98:0x01a8, B:99:0x01a3, B:107:0x01b5, B:109:0x01b9, B:112:0x01c3, B:114:0x01cd, B:117:0x01dd, B:118:0x01d8, B:119:0x01e0, B:124:0x01e2, B:125:0x01e7, B:129:0x01ea, B:132:0x01f3, B:137:0x0206, B:140:0x0201), top: B:89:0x018d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n92.c():void");
    }

    @Override // java.util.concurrent.Future
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object get() {
        this.f3418b.c();
        if (!this.f) {
            if (this.d == null) {
                return null;
            }
            throw new ExecutionException(this.d);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        u93 u93Var = this.f3418b;
        synchronized (u93Var) {
            if (convert <= 0) {
                z = u93Var.f4639a;
            } else {
                ((t43) ((f10) u93Var.f4640b)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    u93Var.c();
                } else {
                    while (!u93Var.f4639a && elapsedRealtime < j2) {
                        u93Var.wait(j2 - elapsedRealtime);
                        ((t43) ((f10) u93Var.f4640b)).getClass();
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = u93Var.f4639a;
            }
        }
        if (z) {
            if (!this.f) {
                if (this.d == null) {
                    return null;
                }
                throw new ExecutionException(this.d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isDone() {
        return this.f3418b.g();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void run() {
        synchronized (this.c) {
            if (this.f) {
                return;
            }
            this.e = Thread.currentThread();
            this.f3417a.h();
            try {
                try {
                    c();
                    synchronized (this.c) {
                        this.f3418b.h();
                        this.e = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.f3418b.h();
                        this.e = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.f3418b.h();
                    this.e = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f;
    }
}
