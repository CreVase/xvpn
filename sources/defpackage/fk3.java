package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final class fk3 {

    /* renamed from: a, reason: collision with root package name */
    public final ny0 f2105a = new ny0();

    /* renamed from: b, reason: collision with root package name */
    public final bk3 f2106b;
    public final ek3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fk3(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            ny0 r0 = new ny0
            r0.<init>()
            r3.f2105a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = defpackage.wi3.f5017a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            dk3 r2 = new dk3
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            ck3 r2 = new ck3
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f2106b = r2
            if (r2 == 0) goto L41
            ek3 r0 = defpackage.ek3.e
        L41:
            r3.c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.k = r0
            r3.l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.i = r4
            r4 = 0
            r3.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk3.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (wi3.f5017a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            ak3.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:            if (java.lang.Math.abs(r2 - r9.g) < r0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:            if (r0.e >= 30) goto L47;     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = defpackage.wi3.f5017a
            r1 = 30
            if (r0 < r1) goto L90
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L90
        Lc:
            ny0 r0 = r9.f2105a
            boolean r2 = r0.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L36
            boolean r2 = r0.a()
            if (r2 == 0) goto L33
            my0 r2 = r0.f3561a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L2a
        L27:
            long r6 = r2.f
            long r6 = r6 / r4
        L2a:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L38
        L33:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L38
        L36:
            float r2 = r9.f
        L38:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L3f
            return
        L3f:
            r5 = 1
            r6 = 0
            int r7 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r7 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            boolean r1 = r0.a()
            if (r1 == 0) goto L6a
            boolean r1 = r0.a()
            if (r1 == 0) goto L5a
            my0 r0 = r0.f3561a
            long r0 = r0.f
            goto L5f
        L5a:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5f:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 == 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L88
            goto L89
        L80:
            if (r7 == 0) goto L83
            goto L89
        L83:
            int r0 = r0.e
            if (r0 < r1) goto L88
            goto L89
        L88:
            r5 = 0
        L89:
            if (r5 == 0) goto L90
            r9.g = r2
            r9.c(r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk3.b():void");
    }

    public final void c(boolean z) {
        Surface surface;
        float f;
        if (wi3.f5017a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (z && this.h == f) {
                        return;
                    }
                    this.h = f;
                    ak3.a(surface, f);
                }
            }
            f = 0.0f;
            if (z) {
            }
            this.h = f;
            ak3.a(surface, f);
        }
    }
}
