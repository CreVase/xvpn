package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class rg implements Runnable {
    public static final ThreadPoolExecutor i;
    public static gx1 j;

    /* renamed from: a, reason: collision with root package name */
    public final dx1 f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final ex1 f4149b;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final CountDownLatch f;
    public boolean g;
    public final /* synthetic */ sg h;

    static {
        cx1 cx1Var = new cx1();
        i = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), cx1Var);
    }

    public rg(sg sgVar) {
        this.h = sgVar;
        dx1 dx1Var = new dx1(this);
        this.f4148a = dx1Var;
        this.f4149b = new ex1(this, dx1Var);
        this.f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        gx1 gx1Var;
        synchronized (rg.class) {
            if (j == null) {
                j = new gx1();
            }
            gx1Var = j;
        }
        gx1Var.obtainMessage(1, new fx1(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g = false;
        this.h.executePendingTask();
    }
}
