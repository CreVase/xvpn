package defpackage;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class kj2 {

    /* renamed from: a, reason: collision with root package name */
    public final double f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2956b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final bc3 h;
    public final uy0 i;
    public int j;
    public long k;

    public kj2(bc3 bc3Var, vr2 vr2Var, uy0 uy0Var) {
        double d = vr2Var.d;
        this.f2955a = d;
        this.f2956b = vr2Var.e;
        this.c = vr2Var.f * 1000;
        this.h = bc3Var;
        this.i = uy0Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        boolean z;
        int max;
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        if (this.f.size() == this.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            max = Math.min(100, this.j + currentTimeMillis);
        } else {
            max = Math.max(0, this.j - currentTimeMillis);
        }
        if (this.j != max) {
            this.j = max;
            this.k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final qk qkVar, final TaskCompletionSource taskCompletionSource) {
        final boolean z;
        String str = qkVar.f4009b;
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.a(new ol(qkVar.f4008a, y72.HIGHEST), new fc3() { // from class: jj2
            /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
            @Override // defpackage.fc3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Exception r9) {
                /*
                    r8 = this;
                    kj2 r0 = defpackage.kj2.this
                    r0.getClass()
                    com.google.android.gms.tasks.TaskCompletionSource r1 = r2
                    if (r9 == 0) goto Ld
                    r1.trySetException(r9)
                    goto L63
                Ld:
                    boolean r9 = r3
                    if (r9 == 0) goto L5e
                    java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
                    r2 = 1
                    r9.<init>(r2)
                    java.lang.Thread r3 = new java.lang.Thread
                    lf r4 = new lf
                    r5 = 26
                    r4.<init>(r5, r0, r9)
                    r3.<init>(r4)
                    r3.start()
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                    java.util.concurrent.ExecutorService r3 = defpackage.aj3.f99a
                    r3 = 0
                    r4 = 2
                    long r4 = r0.toNanos(r4)     // Catch: java.lang.Throwable -> L52
                    long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L52
                    long r6 = r6 + r4
                L36:
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L45 java.lang.InterruptedException -> L48
                    r9.await(r4, r0)     // Catch: java.lang.Throwable -> L45 java.lang.InterruptedException -> L48
                    if (r3 == 0) goto L5e
                    java.lang.Thread r9 = java.lang.Thread.currentThread()
                    r9.interrupt()
                    goto L5e
                L45:
                    r9 = move-exception
                    r2 = r3
                    goto L54
                L48:
                    long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L50
                    long r4 = r6 - r3
                    r3 = 1
                    goto L36
                L50:
                    r9 = move-exception
                    goto L54
                L52:
                    r9 = move-exception
                    r2 = 0
                L54:
                    if (r2 == 0) goto L5d
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    r0.interrupt()
                L5d:
                    throw r9
                L5e:
                    qk r9 = r4
                    r1.trySetResult(r9)
                L63:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jj2.a(java.lang.Exception):void");
            }
        });
    }
}
