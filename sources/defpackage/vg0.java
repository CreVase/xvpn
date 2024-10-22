package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.a;

/* loaded from: classes.dex */
public final class vg0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f4829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(a aVar, Looper looper) {
        super(looper);
        this.f4829b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.os.Message r8, defpackage.ps1 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            wg0 r0 = (defpackage.wg0) r0
            boolean r1 = r0.f5002b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r0.d
            r3 = 1
            int r1 = r1 + r3
            r0.d = r1
            com.google.android.exoplayer2.drm.a r4 = r7.f4829b
            d5 r4 = r4.j
            r5 = 3
            int r4 = r4.z(r5)
            if (r1 <= r4) goto L1c
            return r2
        L1c:
            xl1 r1 = new xl1
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L33
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L3d
        L33:
            ge0 r1 = new ge0
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L3d:
            com.google.android.exoplayer2.drm.a r1 = r7.f4829b
            d5 r1 = r1.j
            int r0 = r0.d
            r1.getClass()
            boolean r1 = r9 instanceof defpackage.u42
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof defpackage.d91
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof defpackage.em1
            if (r1 != 0) goto L82
            int r1 = defpackage.ae0.f66b
        L5d:
            if (r9 == 0) goto L73
            boolean r1 = r9 instanceof defpackage.ae0
            if (r1 == 0) goto L6e
            r1 = r9
            ae0 r1 = (defpackage.ae0) r1
            int r1 = r1.f67a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L6e
            r9 = 1
            goto L74
        L6e:
            java.lang.Throwable r9 = r9.getCause()
            goto L5d
        L73:
            r9 = 0
        L74:
            if (r9 == 0) goto L77
            goto L82
        L77:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L83
        L82:
            r0 = r4
        L83:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L88
            return r2
        L88:
            monitor-enter(r7)
            boolean r9 = r7.f4828a     // Catch: java.lang.Throwable -> L98
            if (r9 != 0) goto L96
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L98
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            return r3
        L96:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            return r2
        L98:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg0.a(android.os.Message, ps1):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th;
        wg0 wg0Var = (wg0) message.obj;
        try {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    a aVar = this.f4829b;
                    th = aVar.l.c(aVar.m, (ht0) wg0Var.c);
                } else {
                    throw new RuntimeException();
                }
            } else {
                th = this.f4829b.l.e((it0) wg0Var.c);
            }
        } catch (ps1 e) {
            boolean a2 = a(message, e);
            th = e;
            if (a2) {
                return;
            }
        } catch (Exception e2) {
            sn1.g("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            th = e2;
        }
        d5 d5Var = this.f4829b.j;
        long j = wg0Var.f5001a;
        d5Var.getClass();
        synchronized (this) {
            if (!this.f4828a) {
                this.f4829b.o.obtainMessage(message.what, Pair.create(wg0Var.c, th)).sendToTarget();
            }
        }
    }
}
