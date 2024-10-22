package defpackage;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class sb extends Thread {
    public static final WeakReference h = new WeakReference(new qb());
    public static final v73 i = new v73();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f4302a;

    /* renamed from: b, reason: collision with root package name */
    public final v73 f4303b;
    public final Handler c;
    public final int d;
    public String e;
    public volatile int f;
    public final qw3 g;

    public sb() {
        super("xvpn-anr-watcher-thread");
        this.f4302a = h;
        this.f4303b = i;
        this.c = new Handler(Looper.getMainLooper());
        this.e = "";
        this.f = 0;
        this.g = new qw3(this, 21);
        this.d = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ko3 ko3Var;
        setName("|ANR-NightWatch|");
        while (!isInterrupted()) {
            int i2 = this.f;
            this.c.post(this.g);
            try {
                Thread.sleep(this.d);
                if (this.f == i2 && !Debug.isDebuggerConnected()) {
                    String str = this.e;
                    io3 io3Var = null;
                    if (str != null) {
                        int i3 = ko3.f2990b;
                        Thread thread = Looper.getMainLooper().getThread();
                        TreeMap treeMap = new TreeMap(new z72(thread, 2));
                        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && entry.getValue().length > 0)) {
                                treeMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!treeMap.containsKey(thread)) {
                            treeMap.put(thread, thread.getStackTrace());
                        }
                        for (Map.Entry entry2 : treeMap.entrySet()) {
                            io3Var = new io3(new jo3(ko3.a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue()), io3Var);
                        }
                        ko3Var = new ko3(io3Var);
                    } else {
                        int i4 = ko3.f2990b;
                        Thread thread2 = Looper.getMainLooper().getThread();
                        ko3Var = new ko3(new io3(new jo3(ko3.a(thread2), thread2.getStackTrace()), null));
                    }
                    if (this.f4302a.get() != null) {
                        ((rb) this.f4302a.get()).a(ko3Var);
                        return;
                    }
                    return;
                }
            } catch (InterruptedException e) {
                this.f4303b.getClass();
                e.getMessage();
                return;
            }
        }
    }
}
