package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bw2 implements lt1, yl1 {

    /* renamed from: a, reason: collision with root package name */
    public final ce0 f541a;

    /* renamed from: b, reason: collision with root package name */
    public final yd0 f542b;
    public final hb3 c;
    public final d5 d;
    public final vt1 e;
    public final va3 f;
    public final long h;
    public final y01 j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;
    public final ArrayList g = new ArrayList();
    public final fm1 i = new fm1("SingleSampleMediaPeriod");

    public bw2(ce0 ce0Var, yd0 yd0Var, hb3 hb3Var, y01 y01Var, long j, d5 d5Var, vt1 vt1Var, boolean z) {
        this.f541a = ce0Var;
        this.f542b = yd0Var;
        this.c = hb3Var;
        this.j = y01Var;
        this.h = j;
        this.d = d5Var;
        this.e = vt1Var;
        this.k = z;
        this.f = new va3(new ua3("", y01Var));
    }

    @Override // defpackage.yl1
    public final void a(am1 am1Var, long j, long j2, boolean z) {
        Uri uri = ((aw2) am1Var).f354b.c;
        xl1 xl1Var = new xl1();
        this.d.getClass();
        this.e.c(xl1Var, 0L, this.h);
    }

    @Override // defpackage.lt1
    public final long b(mu0[] mu0VarArr, boolean[] zArr, rm2[] rm2VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < mu0VarArr.length; i++) {
            rm2 rm2Var = rm2VarArr[i];
            ArrayList arrayList = this.g;
            if (rm2Var != null && (mu0VarArr[i] == null || !zArr[i])) {
                arrayList.remove(rm2Var);
                rm2VarArr[i] = null;
            }
            if (rm2VarArr[i] == null && mu0VarArr[i] != null) {
                zv2 zv2Var = new zv2(this);
                arrayList.add(zv2Var);
                rm2VarArr[i] = zv2Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.yl1
    public final void c(am1 am1Var, long j, long j2) {
        aw2 aw2Var = (aw2) am1Var;
        this.n = (int) aw2Var.f354b.f2688b;
        byte[] bArr = aw2Var.c;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        Uri uri = aw2Var.f354b.c;
        xl1 xl1Var = new xl1();
        this.d.getClass();
        this.e.e(xl1Var, this.j, 0L, this.h);
    }

    @Override // defpackage.hp2
    public final long d() {
        if (!this.l && !this.i.a()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.lt1
    public final long e(long j, mo2 mo2Var) {
        return j;
    }

    @Override // defpackage.lt1
    public final void f() {
    }

    @Override // defpackage.lt1
    public final long g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                zv2 zv2Var = (zv2) arrayList.get(i);
                if (zv2Var.f5557a == 2) {
                    zv2Var.f5557a = 1;
                }
                i++;
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        boolean z;
        if (!this.l) {
            fm1 fm1Var = this.i;
            if (!fm1Var.a()) {
                if (fm1Var.c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    zd0 a2 = this.f542b.a();
                    hb3 hb3Var = this.c;
                    if (hb3Var != null) {
                        a2.d(hb3Var);
                    }
                    ce0 ce0Var = this.f541a;
                    fm1Var.b(new aw2(a2, ce0Var), this, this.d.z(1));
                    this.e.i(new xl1(ce0Var), this.j, 0L, this.h);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hp2
    public final boolean i() {
        return this.i.a();
    }

    @Override // defpackage.lt1
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        kt1Var.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // defpackage.yl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.po3 o(defpackage.am1 r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            r14 = this;
            r0 = r14
            r9 = r20
            r1 = r21
            r2 = r15
            aw2 r2 = (defpackage.aw2) r2
            j13 r2 = r2.f354b
            xl1 r3 = new xl1
            android.net.Uri r2 = r2.c
            r3.<init>()
            long r4 = r0.h
            defpackage.wi3.K(r4)
            d5 r2 = r0.d
            r2.getClass()
            boolean r4 = r9 instanceof defpackage.u42
            r5 = 0
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L5b
            boolean r4 = r9 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L5b
            boolean r4 = r9 instanceof defpackage.d91
            if (r4 != 0) goto L5b
            boolean r4 = r9 instanceof defpackage.em1
            if (r4 != 0) goto L5b
            int r4 = defpackage.ae0.f66b
            r4 = r9
        L35:
            if (r4 == 0) goto L4b
            boolean r10 = r4 instanceof defpackage.ae0
            if (r10 == 0) goto L46
            r10 = r4
            ae0 r10 = (defpackage.ae0) r10
            int r10 = r10.f67a
            r11 = 2008(0x7d8, float:2.814E-42)
            if (r10 != r11) goto L46
            r4 = 1
            goto L4c
        L46:
            java.lang.Throwable r4 = r4.getCause()
            goto L35
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto L4f
            goto L5b
        L4f:
            int r4 = r1 + (-1)
            int r4 = r4 * 1000
            r10 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r10)
            long r10 = (long) r4
            goto L5c
        L5b:
            r10 = r7
        L5c:
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 == 0) goto L69
            int r2 = r2.z(r6)
            if (r1 < r2) goto L67
            goto L69
        L67:
            r1 = 0
            goto L6a
        L69:
            r1 = 1
        L6a:
            boolean r2 = r0.k
            if (r2 == 0) goto L7a
            if (r1 == 0) goto L7a
            java.lang.String r1 = "Loading failed, treating as end-of-stream."
            defpackage.sn1.g(r1, r9)
            r0.l = r6
            po3 r1 = defpackage.fm1.d
            goto L84
        L7a:
            if (r4 == 0) goto L82
            po3 r1 = new po3
            r1.<init>(r5, r10)
            goto L84
        L82:
            po3 r1 = defpackage.fm1.e
        L84:
            r11 = r1
            int r1 = r11.f3886a
            if (r1 == 0) goto L8b
            if (r1 != r6) goto L8c
        L8b:
            r5 = 1
        L8c:
            r10 = r5 ^ 1
            vt1 r1 = r0.e
            r4 = 1
            y01 r5 = r0.j
            long r7 = r0.h
            r12 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r12
            r9 = r20
            r1.g(r2, r3, r4, r5, r7, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.o(am1, long, long, java.io.IOException, int):po3");
    }

    @Override // defpackage.lt1
    public final va3 p() {
        return this.f;
    }

    @Override // defpackage.hp2
    public final long t() {
        if (this.l) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
    }

    @Override // defpackage.hp2
    public final void x(long j) {
    }
}
