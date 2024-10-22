package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u92 implements lt1, fv0, yl1, dm1, pm2 {
    public static final Map M;
    public static final y01 N;
    public boolean A;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public long G;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4637a;

    /* renamed from: b, reason: collision with root package name */
    public final zd0 f4638b;
    public final xn0 c;
    public final d5 d;
    public final vt1 e;
    public final un0 f;
    public final x92 g;
    public final cf0 h;
    public final String i;
    public final long j;
    public final y33 l;
    public kt1 q;
    public IcyHeaders r;
    public boolean u;
    public boolean v;
    public boolean w;
    public t92 x;
    public lo2 y;
    public final fm1 k = new fm1("ProgressiveMediaPeriod");
    public final u93 m = new u93(4);
    public final p92 n = new p92(this, 0);
    public final p92 o = new p92(this, 1);
    public final Handler p = wi3.k(null);
    public s92[] t = new s92[0];
    public qm2[] s = new qm2[0];
    public long H = -9223372036854775807L;
    public long z = -9223372036854775807L;
    public int B = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        M = Collections.unmodifiableMap(hashMap);
        x01 x01Var = new x01();
        x01Var.f5098a = "icy";
        x01Var.k = "application/x-icy";
        N = x01Var.a();
    }

    public u92(Uri uri, zd0 zd0Var, y33 y33Var, xn0 xn0Var, un0 un0Var, d5 d5Var, vt1 vt1Var, x92 x92Var, cf0 cf0Var, String str, int i) {
        this.f4637a = uri;
        this.f4638b = zd0Var;
        this.c = xn0Var;
        this.f = un0Var;
        this.d = d5Var;
        this.e = vt1Var;
        this.g = x92Var;
        this.h = cf0Var;
        this.i = str;
        this.j = i;
        this.l = y33Var;
    }

    public final qm2 A(s92 s92Var) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (s92Var.equals(this.t[i])) {
                return this.s[i];
            }
        }
        xn0 xn0Var = this.c;
        xn0Var.getClass();
        un0 un0Var = this.f;
        un0Var.getClass();
        qm2 qm2Var = new qm2(this.h, xn0Var, un0Var);
        qm2Var.f = this;
        int i2 = length + 1;
        s92[] s92VarArr = (s92[]) Arrays.copyOf(this.t, i2);
        s92VarArr[length] = s92Var;
        this.t = s92VarArr;
        qm2[] qm2VarArr = (qm2[]) Arrays.copyOf(this.s, i2);
        qm2VarArr[length] = qm2Var;
        this.s = qm2VarArr;
        return qm2Var;
    }

    public final void B() {
        q92 q92Var = new q92(this, this.f4637a, this.f4638b, this.l, this, this.m);
        if (this.v) {
            cp3.m(u());
            long j = this.z;
            if (j != -9223372036854775807L && this.H > j) {
                this.K = true;
                this.H = -9223372036854775807L;
                return;
            }
            lo2 lo2Var = this.y;
            lo2Var.getClass();
            long j2 = lo2Var.g(this.H).f2988a.f3504b;
            long j3 = this.H;
            q92Var.f.f3157a = j2;
            q92Var.i = j3;
            q92Var.h = true;
            q92Var.l = false;
            for (qm2 qm2Var : this.s) {
                qm2Var.t = this.H;
            }
            this.H = -9223372036854775807L;
        }
        this.J = r();
        this.k.b(q92Var, this, this.d.z(this.B));
        this.e.i(new xl1(q92Var.j), null, q92Var.i, this.z);
    }

    public final boolean C() {
        if (!this.D && !u()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yl1
    public final void a(am1 am1Var, long j, long j2, boolean z) {
        q92 q92Var = (q92) am1Var;
        Uri uri = q92Var.f3973b.c;
        xl1 xl1Var = new xl1();
        this.d.getClass();
        this.e.c(xl1Var, q92Var.i, this.z);
        if (!z) {
            for (qm2 qm2Var : this.s) {
                qm2Var.p(false);
            }
            if (this.E > 0) {
                kt1 kt1Var = this.q;
                kt1Var.getClass();
                kt1Var.c(this);
            }
        }
    }

    @Override // defpackage.lt1
    public final long b(mu0[] mu0VarArr, boolean[] zArr, rm2[] rm2VarArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        boolean z;
        mu0 mu0Var;
        boolean z2;
        boolean z3;
        q();
        t92 t92Var = this.x;
        va3 va3Var = t92Var.f4469a;
        int i = this.E;
        int i2 = 0;
        while (true) {
            int length = mu0VarArr.length;
            zArr3 = t92Var.c;
            if (i2 >= length) {
                break;
            }
            rm2 rm2Var = rm2VarArr[i2];
            if (rm2Var != null && (mu0VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((r92) rm2Var).f4116a;
                cp3.m(zArr3[i3]);
                this.E--;
                zArr3[i3] = false;
                rm2VarArr[i2] = null;
            }
            i2++;
        }
        if (!this.C ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i4 = 0; i4 < mu0VarArr.length; i4++) {
            if (rm2VarArr[i4] == null && (mu0Var = mu0VarArr[i4]) != null) {
                if (mu0Var.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cp3.m(z2);
                if (mu0Var.f(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cp3.m(z3);
                int indexOf = va3Var.f4805b.indexOf(mu0Var.a());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                cp3.m(!zArr3[indexOf]);
                this.E++;
                zArr3[indexOf] = true;
                rm2VarArr[i4] = new r92(this, indexOf);
                zArr2[i4] = true;
                if (!z) {
                    qm2 qm2Var = this.s[indexOf];
                    if (!qm2Var.s(j, true) && qm2Var.q + qm2Var.s != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            fm1 fm1Var = this.k;
            if (fm1Var.a()) {
                for (qm2 qm2Var2 : this.s) {
                    qm2Var2.g();
                }
                zl1 zl1Var = fm1Var.f2118b;
                cp3.o(zl1Var);
                zl1Var.a(false);
            } else {
                for (qm2 qm2Var3 : this.s) {
                    qm2Var3.p(false);
                }
            }
        } else if (z) {
            j = g(j);
            for (int i5 = 0; i5 < rm2VarArr.length; i5++) {
                if (rm2VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.C = true;
        return j;
    }

    @Override // defpackage.yl1
    public final void c(am1 am1Var, long j, long j2) {
        lo2 lo2Var;
        long j3;
        q92 q92Var = (q92) am1Var;
        if (this.z == -9223372036854775807L && (lo2Var = this.y) != null) {
            boolean b2 = lo2Var.b();
            long s = s(true);
            if (s == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = s + 10000;
            }
            this.z = j3;
            this.g.s(j3, b2, this.A);
        }
        Uri uri = q92Var.f3973b.c;
        xl1 xl1Var = new xl1();
        this.d.getClass();
        this.e.e(xl1Var, null, q92Var.i, this.z);
        this.K = true;
        kt1 kt1Var = this.q;
        kt1Var.getClass();
        kt1Var.c(this);
    }

    @Override // defpackage.hp2
    public final long d() {
        return t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:            if (java.lang.Math.abs(r7 - r18) <= java.lang.Math.abs(r9 - r18)) goto L34;     */
    @Override // defpackage.lt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r18, defpackage.mo2 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r17.q()
            lo2 r4 = r0.y
            boolean r4 = r4.b()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            lo2 r4 = r0.y
            ko2 r4 = r4.g(r1)
            no2 r7 = r4.f2988a
            long r7 = r7.f3503a
            no2 r4 = r4.f2989b
            long r9 = r4.f3503a
            long r11 = r3.f3328b
            long r3 = r3.f3327a
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L30
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 != 0) goto L30
            r13 = r1
            goto L80
        L30:
            int r13 = defpackage.wi3.f5017a
            long r13 = r1 - r3
            long r3 = r3 ^ r1
            long r15 = r1 ^ r13
            long r3 = r3 & r15
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 >= 0) goto L3e
            r13 = -9223372036854775808
        L3e:
            long r3 = r1 + r11
            long r15 = r1 ^ r3
            long r11 = r11 ^ r3
            long r11 = r11 & r15
            int r15 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4d:
            r5 = 1
            r6 = 0
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 > 0) goto L59
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 > 0) goto L59
            r11 = 1
            goto L5a
        L59:
            r11 = 0
        L5a:
            int r12 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r12 > 0) goto L63
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 > 0) goto L63
            goto L64
        L63:
            r5 = 0
        L64:
            if (r11 == 0) goto L79
            if (r5 == 0) goto L79
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L7f
            goto L7b
        L79:
            if (r11 == 0) goto L7d
        L7b:
            r13 = r7
            goto L80
        L7d:
            if (r5 == 0) goto L80
        L7f:
            r13 = r9
        L80:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u92.e(long, mo2):long");
    }

    @Override // defpackage.lt1
    public final void f() {
        int z = this.d.z(this.B);
        fm1 fm1Var = this.k;
        IOException iOException = fm1Var.c;
        if (iOException == null) {
            zl1 zl1Var = fm1Var.f2118b;
            if (zl1Var != null) {
                if (z == Integer.MIN_VALUE) {
                    z = zl1Var.f5505a;
                }
                IOException iOException2 = zl1Var.e;
                if (iOException2 != null && zl1Var.f > z) {
                    throw iOException2;
                }
            }
            if (this.K && !this.v) {
                throw u42.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.lt1
    public final long g(long j) {
        boolean z;
        q();
        boolean[] zArr = this.x.f4470b;
        if (!this.y.b()) {
            j = 0;
        }
        this.D = false;
        this.G = j;
        if (u()) {
            this.H = j;
            return j;
        }
        if (this.B != 7) {
            int length = this.s.length;
            for (int i = 0; i < length; i++) {
                if (!this.s[i].s(j, false) && (zArr[i] || !this.w)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.I = false;
        this.H = j;
        this.K = false;
        fm1 fm1Var = this.k;
        if (fm1Var.a()) {
            for (qm2 qm2Var : this.s) {
                qm2Var.g();
            }
            zl1 zl1Var = fm1Var.f2118b;
            cp3.o(zl1Var);
            zl1Var.a(false);
        } else {
            fm1Var.c = null;
            for (qm2 qm2Var2 : this.s) {
                qm2Var2.p(false);
            }
        }
        return j;
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        boolean z;
        if (!this.K) {
            fm1 fm1Var = this.k;
            if (fm1Var.c != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.I && (!this.v || this.E != 0)) {
                boolean h = this.m.h();
                if (!fm1Var.a()) {
                    B();
                    return true;
                }
                return h;
            }
        }
        return false;
    }

    @Override // defpackage.hp2
    public final boolean i() {
        if (this.k.a() && this.m.g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fv0
    public final void j() {
        this.u = true;
        this.p.post(this.n);
    }

    @Override // defpackage.lt1
    public final long k() {
        if (this.D) {
            if (this.K || r() > this.J) {
                this.D = false;
                return this.G;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.fv0
    public final xa3 l(int i, int i2) {
        return A(new s92(i, false));
    }

    @Override // defpackage.fv0
    public final void m(lo2 lo2Var) {
        this.p.post(new lf(15, this, lo2Var));
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        this.q = kt1Var;
        this.m.h();
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // defpackage.yl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.po3 o(defpackage.am1 r16, long r17, long r19, java.io.IOException r21, int r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u92.o(am1, long, long, java.io.IOException, int):po3");
    }

    @Override // defpackage.lt1
    public final va3 p() {
        q();
        return this.x.f4469a;
    }

    public final void q() {
        cp3.m(this.v);
        this.x.getClass();
        this.y.getClass();
    }

    public final int r() {
        int i = 0;
        for (qm2 qm2Var : this.s) {
            i += qm2Var.q + qm2Var.p;
        }
        return i;
    }

    public final long s(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.s.length; i++) {
            if (!z) {
                t92 t92Var = this.x;
                t92Var.getClass();
                if (!t92Var.c[i]) {
                }
            }
            j = Math.max(j, this.s[i].i());
        }
        return j;
    }

    @Override // defpackage.hp2
    public final long t() {
        long j;
        boolean z;
        q();
        if (this.K || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.H;
        }
        if (this.w) {
            int length = this.s.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                t92 t92Var = this.x;
                if (t92Var.f4470b[i] && t92Var.c[i]) {
                    qm2 qm2Var = this.s[i];
                    synchronized (qm2Var) {
                        z = qm2Var.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.s[i].i());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = s(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.G;
        }
        return j;
    }

    public final boolean u() {
        if (this.H != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
        long j2;
        int i;
        int i2;
        q();
        if (u()) {
            return;
        }
        boolean[] zArr = this.x.c;
        int length = this.s.length;
        for (int i3 = 0; i3 < length; i3++) {
            qm2 qm2Var = this.s[i3];
            boolean z2 = zArr[i3];
            mm2 mm2Var = qm2Var.f4022a;
            synchronized (qm2Var) {
                int i4 = qm2Var.p;
                if (i4 != 0) {
                    long[] jArr = qm2Var.n;
                    int i5 = qm2Var.r;
                    if (j >= jArr[i5]) {
                        if (z2 && (i2 = qm2Var.s) != i4) {
                            i = i2 + 1;
                        } else {
                            i = i4;
                        }
                        int h = qm2Var.h(i5, i, j, z);
                        if (h != -1) {
                            j2 = qm2Var.f(h);
                        } else {
                            j2 = -1;
                        }
                    }
                }
                j2 = -1;
            }
            mm2Var.a(j2);
        }
    }

    public final void w() {
        boolean z;
        Metadata a2;
        int i;
        y01 y01Var;
        if (!this.L && !this.v && this.u && this.y != null) {
            for (qm2 qm2Var : this.s) {
                synchronized (qm2Var) {
                    if (qm2Var.y) {
                        y01Var = null;
                    } else {
                        y01Var = qm2Var.z;
                    }
                }
                if (y01Var == null) {
                    return;
                }
            }
            this.m.e();
            int length = this.s.length;
            ua3[] ua3VarArr = new ua3[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                y01 l = this.s[i2].l();
                l.getClass();
                String str = l.l;
                boolean g = vw1.g(str);
                if (!g && !vw1.i(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i2] = z;
                this.w = z | this.w;
                IcyHeaders icyHeaders = this.r;
                if (icyHeaders != null) {
                    if (g || this.t[i2].f4296b) {
                        Metadata metadata = l.j;
                        if (metadata == null) {
                            a2 = new Metadata(icyHeaders);
                        } else {
                            a2 = metadata.a(icyHeaders);
                        }
                        x01 x01Var = new x01(l);
                        x01Var.i = a2;
                        l = new y01(x01Var);
                    }
                    if (g && l.f == -1 && l.g == -1 && (i = icyHeaders.f1477a) != -1) {
                        x01 x01Var2 = new x01(l);
                        x01Var2.f = i;
                        l = new y01(x01Var2);
                    }
                }
                int l2 = this.c.l(l);
                x01 a3 = l.a();
                a3.F = l2;
                ua3VarArr[i2] = new ua3(Integer.toString(i2), a3.a());
            }
            this.x = new t92(new va3(ua3VarArr), zArr);
            this.v = true;
            kt1 kt1Var = this.q;
            kt1Var.getClass();
            kt1Var.a(this);
        }
    }

    @Override // defpackage.hp2
    public final void x(long j) {
    }

    public final void y(int i) {
        q();
        t92 t92Var = this.x;
        boolean[] zArr = t92Var.d;
        if (!zArr[i]) {
            y01 y01Var = t92Var.f4469a.a(i).d[0];
            int f = vw1.f(y01Var.l);
            long j = this.G;
            vt1 vt1Var = this.e;
            vt1Var.b(new et1(1, f, y01Var, 0, null, vt1Var.a(j), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    public final void z(int i) {
        q();
        boolean[] zArr = this.x.f4470b;
        if (this.I && zArr[i] && !this.s[i].m(false)) {
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (qm2 qm2Var : this.s) {
                qm2Var.p(false);
            }
            kt1 kt1Var = this.q;
            kt1Var.getClass();
            kt1Var.c(this);
        }
    }
}
