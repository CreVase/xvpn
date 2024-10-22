package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class nn implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3493a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3494b = new ArrayList(1);
    public int c;
    public ce0 d;

    public nn(boolean z) {
        this.f3493a = z;
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        ArrayList arrayList = this.f3494b;
        if (!arrayList.contains(hb3Var)) {
            arrayList.add(hb3Var);
            this.c++;
        }
    }

    @Override // defpackage.zd0
    public Map k() {
        return Collections.emptyMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:            if (r4 == false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r9) {
        /*
            r8 = this;
            ce0 r0 = r8.d
            int r1 = defpackage.wi3.f5017a
            r1 = 0
            r2 = 0
        L6:
            int r3 = r8.c
            if (r2 >= r3) goto L3b
            java.util.ArrayList r3 = r8.f3494b
            java.lang.Object r3 = r3.get(r2)
            hb3 r3 = (defpackage.hb3) r3
            boolean r4 = r8.f3493a
            mg0 r3 = (defpackage.mg0) r3
            monitor-enter(r3)
            ji2 r5 = defpackage.mg0.n     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L29
            int r4 = r0.i     // Catch: java.lang.Throwable -> L38
            r5 = 8
            r4 = r4 & r5
            r6 = 1
            if (r4 != r5) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r6 = 0
        L2a:
            if (r6 != 0) goto L2e
            monitor-exit(r3)
            goto L35
        L2e:
            long r4 = r3.h     // Catch: java.lang.Throwable -> L38
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L38
            long r4 = r4 + r6
            r3.h = r4     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
        L35:
            int r2 = r2 + 1
            goto L6
        L38:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.p(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0017, B:9:0x001c, B:19:0x002f, B:22:0x0036, B:24:0x0058, B:26:0x0072, B:28:0x0084, B:29:0x007b, B:30:0x0092), top: B:6:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r14 = this;
            ce0 r0 = r14.d
            int r1 = defpackage.wi3.f5017a
            r1 = 0
            r2 = 0
        L6:
            int r3 = r14.c
            if (r2 >= r3) goto L9f
            java.util.ArrayList r3 = r14.f3494b
            java.lang.Object r3 = r3.get(r2)
            hb3 r3 = (defpackage.hb3) r3
            boolean r4 = r14.f3493a
            mg0 r3 = (defpackage.mg0) r3
            monitor-enter(r3)
            ji2 r5 = defpackage.mg0.n     // Catch: java.lang.Throwable -> L9c
            r11 = 1
            if (r4 == 0) goto L2a
            int r4 = r0.i     // Catch: java.lang.Throwable -> L9c
            r5 = 8
            r4 = r4 & r5
            if (r4 != r5) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 != 0) goto L2a
            r4 = 1
            goto L2b
        L2a:
            r4 = 0
        L2b:
            if (r4 != 0) goto L2f
            monitor-exit(r3)
            goto L98
        L2f:
            int r4 = r3.f     // Catch: java.lang.Throwable -> L9c
            if (r4 <= 0) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            defpackage.cp3.m(r4)     // Catch: java.lang.Throwable -> L9c
            f10 r4 = r3.d     // Catch: java.lang.Throwable -> L9c
            t43 r4 = (defpackage.t43) r4     // Catch: java.lang.Throwable -> L9c
            r4.getClass()     // Catch: java.lang.Throwable -> L9c
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9c
            long r4 = r3.g     // Catch: java.lang.Throwable -> L9c
            long r4 = r12 - r4
            int r6 = (int) r4     // Catch: java.lang.Throwable -> L9c
            long r4 = r3.j     // Catch: java.lang.Throwable -> L9c
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L9c
            long r4 = r4 + r7
            r3.j = r4     // Catch: java.lang.Throwable -> L9c
            long r4 = r3.k     // Catch: java.lang.Throwable -> L9c
            long r7 = r3.h     // Catch: java.lang.Throwable -> L9c
            long r4 = r4 + r7
            r3.k = r4     // Catch: java.lang.Throwable -> L9c
            if (r6 <= 0) goto L92
            float r4 = (float) r7     // Catch: java.lang.Throwable -> L9c
            r5 = 1174011904(0x45fa0000, float:8000.0)
            float r4 = r4 * r5
            float r5 = (float) r6     // Catch: java.lang.Throwable -> L9c
            float r4 = r4 / r5
            gw2 r5 = r3.c     // Catch: java.lang.Throwable -> L9c
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L9c
            double r7 = java.lang.Math.sqrt(r7)     // Catch: java.lang.Throwable -> L9c
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L9c
            r5.a(r4, r7)     // Catch: java.lang.Throwable -> L9c
            long r4 = r3.j     // Catch: java.lang.Throwable -> L9c
            r7 = 2000(0x7d0, double:9.88E-321)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L7b
            long r4 = r3.k     // Catch: java.lang.Throwable -> L9c
            r7 = 524288(0x80000, double:2.590327E-318)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L84
        L7b:
            gw2 r4 = r3.c     // Catch: java.lang.Throwable -> L9c
            float r4 = r4.b()     // Catch: java.lang.Throwable -> L9c
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9c
            r3.l = r4     // Catch: java.lang.Throwable -> L9c
        L84:
            long r7 = r3.h     // Catch: java.lang.Throwable -> L9c
            long r9 = r3.l     // Catch: java.lang.Throwable -> L9c
            r5 = r3
            r5.c(r6, r7, r9)     // Catch: java.lang.Throwable -> L9c
            r3.g = r12     // Catch: java.lang.Throwable -> L9c
            r4 = 0
            r3.h = r4     // Catch: java.lang.Throwable -> L9c
        L92:
            int r4 = r3.f     // Catch: java.lang.Throwable -> L9c
            int r4 = r4 - r11
            r3.f = r4     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r3)
        L98:
            int r2 = r2 + 1
            goto L6
        L9c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9f:
            r0 = 0
            r14.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.q():void");
    }

    public final void r() {
        for (int i = 0; i < this.c; i++) {
            ((hb3) this.f3494b.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0015, B:9:0x001a, B:19:0x002d, B:21:0x0031, B:22:0x003e), top: B:6:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.ce0 r8) {
        /*
            r7 = this;
            r7.d = r8
            r0 = 0
            r1 = 0
        L4:
            int r2 = r7.c
            if (r1 >= r2) goto L4a
            java.util.ArrayList r2 = r7.f3494b
            java.lang.Object r2 = r2.get(r1)
            hb3 r2 = (defpackage.hb3) r2
            boolean r3 = r7.f3493a
            mg0 r2 = (defpackage.mg0) r2
            monitor-enter(r2)
            ji2 r4 = defpackage.mg0.n     // Catch: java.lang.Throwable -> L47
            r4 = 1
            if (r3 == 0) goto L28
            int r3 = r8.i     // Catch: java.lang.Throwable -> L47
            r5 = 8
            r3 = r3 & r5
            if (r3 != r5) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 != 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r2)
            goto L44
        L2d:
            int r3 = r2.f     // Catch: java.lang.Throwable -> L47
            if (r3 != 0) goto L3e
            f10 r3 = r2.d     // Catch: java.lang.Throwable -> L47
            t43 r3 = (defpackage.t43) r3     // Catch: java.lang.Throwable -> L47
            r3.getClass()     // Catch: java.lang.Throwable -> L47
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L47
            r2.g = r5     // Catch: java.lang.Throwable -> L47
        L3e:
            int r3 = r2.f     // Catch: java.lang.Throwable -> L47
            int r3 = r3 + r4
            r2.f = r3     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
        L44:
            int r1 = r1 + 1
            goto L4
        L47:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.s(ce0):void");
    }
}
