package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r70 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final z60 I;
    public final z60 J;
    public final z60 K;
    public final z60 L;
    public final z60 M;
    public final z60 N;
    public final z60 O;
    public final z60 P;
    public final z60[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public r70 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;

    /* renamed from: b, reason: collision with root package name */
    public wv f4113b;
    public int b0;
    public wv c;
    public int c0;
    public float d0;
    public float e0;
    public Object f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final r70[] l0;
    public boolean m;
    public final r70[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4112a = false;
    public c91 d = null;
    public zj3 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public r70() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        z60 z60Var = new z60(this, y60.LEFT);
        this.I = z60Var;
        z60 z60Var2 = new z60(this, y60.TOP);
        this.J = z60Var2;
        z60 z60Var3 = new z60(this, y60.RIGHT);
        this.K = z60Var3;
        z60 z60Var4 = new z60(this, y60.BOTTOM);
        this.L = z60Var4;
        z60 z60Var5 = new z60(this, y60.BASELINE);
        this.M = z60Var5;
        z60 z60Var6 = new z60(this, y60.CENTER_X);
        this.N = z60Var6;
        z60 z60Var7 = new z60(this, y60.CENTER_Y);
        this.O = z60Var7;
        z60 z60Var8 = new z60(this, y60.CENTER);
        this.P = z60Var8;
        this.Q = new z60[]{z60Var, z60Var3, z60Var2, z60Var4, z60Var5, z60Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new r70[]{null, null};
        this.m0 = new r70[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(z60Var);
        arrayList.add(z60Var2);
        arrayList.add(z60Var3);
        arrayList.add(z60Var4);
        arrayList.add(z60Var6);
        arrayList.add(z60Var7);
        arrayList.add(z60Var8);
        arrayList.add(z60Var5);
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, z60 z60Var) {
        if (z60Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(z60Var.f);
        sb.append("'");
        if (z60Var.h != Integer.MIN_VALUE || z60Var.g != 0) {
            sb.append(",");
            sb.append(z60Var.g);
            if (z60Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(z60Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        if (this.g && this.g0 != 8) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (!this.k && (!this.I.c || !this.K.c)) {
            return false;
        }
        return true;
    }

    public boolean C() {
        if (!this.l && (!this.J.c || !this.L.c)) {
            return false;
        }
        return true;
    }

    public void D() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        r70 r70Var = this.T;
        if (r70Var != null && (r70Var instanceof s70)) {
            ((s70) r70Var).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((z60) arrayList.get(i)).j();
        }
    }

    public final void F() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z60 z60Var = (z60) arrayList.get(i);
            z60Var.c = false;
            z60Var.f5433b = 0;
        }
    }

    public void G(wq2 wq2Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        c91 c91Var = this.d;
        boolean z3 = z & c91Var.g;
        zj3 zj3Var = this.e;
        boolean z4 = z2 & zj3Var.g;
        int i3 = c91Var.h.g;
        int i4 = zj3Var.h.g;
        int i5 = c91Var.i.g;
        int i6 = zj3Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(ok1 ok1Var, boolean z) {
        int i;
        int i2;
        zj3 zj3Var;
        c91 c91Var;
        ok1Var.getClass();
        int n = ok1.n(this.I);
        int n2 = ok1.n(this.J);
        int n3 = ok1.n(this.K);
        int n4 = ok1.n(this.L);
        if (z && (c91Var = this.d) != null) {
            qk0 qk0Var = c91Var.h;
            if (qk0Var.j) {
                qk0 qk0Var2 = c91Var.i;
                if (qk0Var2.j) {
                    n = qk0Var.g;
                    n3 = qk0Var2.g;
                }
            }
        }
        if (z && (zj3Var = this.e) != null) {
            qk0 qk0Var3 = zj3Var.h;
            if (qk0Var3.j) {
                qk0 qk0Var4 = zj3Var.i;
                if (qk0Var4.j) {
                    n2 = qk0Var3.g;
                    n4 = qk0Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Y = n;
        this.Z = n2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void b(s70 s70Var, ok1 ok1Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            pg1.c(s70Var, ok1Var, this);
            hashSet.remove(this);
            c(ok1Var, s70Var.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f5432a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((z60) it.next()).d.b(s70Var, ok1Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f5432a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((z60) it2.next()).d.b(s70Var, ok1Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f5432a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((z60) it3.next()).d.b(s70Var, ok1Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f5432a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((z60) it4.next()).d.b(s70Var, ok1Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f5432a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((z60) it5.next()).d.b(s70Var, ok1Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(defpackage.ok1 r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 2017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r70.c(ok1, boolean):void");
    }

    public boolean d() {
        if (this.g0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.ok1 r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.ix2 r34, defpackage.ix2 r35, int r36, boolean r37, defpackage.z60 r38, defpackage.z60 r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r70.e(ok1, boolean, boolean, boolean, boolean, ix2, ix2, int, boolean, z60, z60, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(y60 y60Var, r70 r70Var, y60 y60Var2, int i) {
        boolean z;
        y60 y60Var3 = y60.CENTER;
        y60 y60Var4 = y60.CENTER_Y;
        y60 y60Var5 = y60.CENTER_X;
        y60 y60Var6 = y60.LEFT;
        y60 y60Var7 = y60.TOP;
        y60 y60Var8 = y60.RIGHT;
        y60 y60Var9 = y60.BOTTOM;
        if (y60Var == y60Var3) {
            if (y60Var2 == y60Var3) {
                z60 j = j(y60Var6);
                z60 j2 = j(y60Var8);
                z60 j3 = j(y60Var7);
                z60 j4 = j(y60Var9);
                boolean z2 = true;
                if ((j != null && j.h()) || (j2 != null && j2.h())) {
                    z = false;
                } else {
                    f(y60Var6, r70Var, y60Var6, 0);
                    f(y60Var8, r70Var, y60Var8, 0);
                    z = true;
                }
                if ((j3 != null && j3.h()) || (j4 != null && j4.h())) {
                    z2 = false;
                } else {
                    f(y60Var7, r70Var, y60Var7, 0);
                    f(y60Var9, r70Var, y60Var9, 0);
                }
                if (z && z2) {
                    j(y60Var3).a(r70Var.j(y60Var3), 0);
                    return;
                } else if (z) {
                    j(y60Var5).a(r70Var.j(y60Var5), 0);
                    return;
                } else {
                    if (z2) {
                        j(y60Var4).a(r70Var.j(y60Var4), 0);
                        return;
                    }
                    return;
                }
            }
            if (y60Var2 != y60Var6 && y60Var2 != y60Var8) {
                if (y60Var2 == y60Var7 || y60Var2 == y60Var9) {
                    f(y60Var7, r70Var, y60Var2, 0);
                    f(y60Var9, r70Var, y60Var2, 0);
                    j(y60Var3).a(r70Var.j(y60Var2), 0);
                    return;
                }
                return;
            }
            f(y60Var6, r70Var, y60Var2, 0);
            f(y60Var8, r70Var, y60Var2, 0);
            j(y60Var3).a(r70Var.j(y60Var2), 0);
            return;
        }
        if (y60Var == y60Var5 && (y60Var2 == y60Var6 || y60Var2 == y60Var8)) {
            z60 j5 = j(y60Var6);
            z60 j6 = r70Var.j(y60Var2);
            z60 j7 = j(y60Var8);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(y60Var5).a(j6, 0);
            return;
        }
        if (y60Var == y60Var4 && (y60Var2 == y60Var7 || y60Var2 == y60Var9)) {
            z60 j8 = r70Var.j(y60Var2);
            j(y60Var7).a(j8, 0);
            j(y60Var9).a(j8, 0);
            j(y60Var4).a(j8, 0);
            return;
        }
        if (y60Var == y60Var5 && y60Var2 == y60Var5) {
            j(y60Var6).a(r70Var.j(y60Var6), 0);
            j(y60Var8).a(r70Var.j(y60Var8), 0);
            j(y60Var5).a(r70Var.j(y60Var2), 0);
            return;
        }
        if (y60Var == y60Var4 && y60Var2 == y60Var4) {
            j(y60Var7).a(r70Var.j(y60Var7), 0);
            j(y60Var9).a(r70Var.j(y60Var9), 0);
            j(y60Var4).a(r70Var.j(y60Var2), 0);
            return;
        }
        z60 j9 = j(y60Var);
        z60 j10 = r70Var.j(y60Var2);
        if (j9.i(j10)) {
            y60 y60Var10 = y60.BASELINE;
            if (y60Var == y60Var10) {
                z60 j11 = j(y60Var7);
                z60 j12 = j(y60Var9);
                if (j11 != null) {
                    j11.j();
                }
                if (j12 != null) {
                    j12.j();
                }
            } else if (y60Var != y60Var7 && y60Var != y60Var9) {
                if (y60Var == y60Var6 || y60Var == y60Var8) {
                    z60 j13 = j(y60Var3);
                    if (j13.f != j10) {
                        j13.j();
                    }
                    z60 f = j(y60Var).f();
                    z60 j14 = j(y60Var5);
                    if (j14.h()) {
                        f.j();
                        j14.j();
                    }
                }
            } else {
                z60 j15 = j(y60Var10);
                if (j15 != null) {
                    j15.j();
                }
                z60 j16 = j(y60Var3);
                if (j16.f != j10) {
                    j16.j();
                }
                z60 f2 = j(y60Var).f();
                z60 j17 = j(y60Var4);
                if (j17.h()) {
                    f2.j();
                    j17.j();
                }
            }
            j9.a(j10, i);
        }
    }

    public final void g(z60 z60Var, z60 z60Var2, int i) {
        if (z60Var.d == this) {
            f(z60Var.e, z60Var2.d, z60Var2.e, i);
        }
    }

    public final void h(ok1 ok1Var) {
        ok1Var.k(this.I);
        ok1Var.k(this.J);
        ok1Var.k(this.K);
        ok1Var.k(this.L);
        if (this.a0 > 0) {
            ok1Var.k(this.M);
        }
    }

    public final void i() {
        if (this.d == null) {
            this.d = new c91(this);
        }
        if (this.e == null) {
            this.e = new zj3(this);
        }
    }

    public z60 j(y60 y60Var) {
        switch (y60Var.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(y60Var.name());
        }
    }

    public final int k(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int l() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final r70 m(int i) {
        z60 z60Var;
        z60 z60Var2;
        if (i == 0) {
            z60 z60Var3 = this.K;
            z60 z60Var4 = z60Var3.f;
            if (z60Var4 != null && z60Var4.f == z60Var3) {
                return z60Var4.d;
            }
            return null;
        }
        if (i == 1 && (z60Var2 = (z60Var = this.L).f) != null && z60Var2.f == z60Var) {
            return z60Var2.d;
        }
        return null;
    }

    public final r70 n(int i) {
        z60 z60Var;
        z60 z60Var2;
        if (i == 0) {
            z60 z60Var3 = this.I;
            z60 z60Var4 = z60Var3.f;
            if (z60Var4 != null && z60Var4.f == z60Var3) {
                return z60Var4.d;
            }
            return null;
        }
        if (i == 1 && (z60Var2 = (z60Var = this.J).f) != null && z60Var2.f == z60Var) {
            return z60Var2.d;
        }
        return null;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        q(sb, "left", this.I);
        q(sb, "top", this.J);
        q(sb, "right", this.K);
        q(sb, "bottom", this.L);
        q(sb, "baseline", this.M);
        q(sb, "centerX", this.N);
        q(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.k0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.V;
        int i7 = this.c0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.W;
        int i11 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.d0, 0.5f);
        I(sb, "    verticalBias", this.e0, 0.5f);
        H(this.i0, 0, "    horizontalChainStyle", sb);
        H(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int s() {
        r70 r70Var = this.T;
        if (r70Var != null && (r70Var instanceof s70)) {
            return ((s70) r70Var).x0 + this.Y;
        }
        return this.Y;
    }

    public final int t() {
        r70 r70Var = this.T;
        if (r70Var != null && (r70Var instanceof s70)) {
            return ((s70) r70Var).y0 + this.Z;
        }
        return this.Z;
    }

    public String toString() {
        String str = "";
        StringBuilder n = p71.n("");
        if (this.h0 != null) {
            str = hx2.s(new StringBuilder("id: "), this.h0, " ");
        }
        n.append(str);
        n.append("(");
        n.append(this.Y);
        n.append(", ");
        n.append(this.Z);
        n.append(") - (");
        n.append(this.U);
        n.append(" x ");
        return hx2.r(n, this.V, ")");
    }

    public final boolean u(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.I.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.K.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.J.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.L.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.M.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    public final boolean v(int i, int i2) {
        z60 z60Var;
        z60 z60Var2;
        z60 z60Var3;
        z60 z60Var4;
        if (i == 0) {
            z60 z60Var5 = this.I;
            z60 z60Var6 = z60Var5.f;
            if (z60Var6 != null && z60Var6.c && (z60Var4 = (z60Var3 = this.K).f) != null && z60Var4.c) {
                if ((z60Var4.d() - z60Var3.e()) - (z60Var5.e() + z60Var5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            z60 z60Var7 = this.J;
            z60 z60Var8 = z60Var7.f;
            if (z60Var8 != null && z60Var8.c && (z60Var2 = (z60Var = this.L).f) != null && z60Var2.c) {
                if ((z60Var2.d() - z60Var.e()) - (z60Var7.e() + z60Var7.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(y60 y60Var, r70 r70Var, y60 y60Var2, int i, int i2) {
        j(y60Var).b(r70Var.j(y60Var2), i, i2, true);
    }

    public final boolean x(int i) {
        z60 z60Var;
        z60 z60Var2;
        int i2 = i * 2;
        z60[] z60VarArr = this.Q;
        z60 z60Var3 = z60VarArr[i2];
        z60 z60Var4 = z60Var3.f;
        if (z60Var4 != null && z60Var4.f != z60Var3 && (z60Var2 = (z60Var = z60VarArr[i2 + 1]).f) != null && z60Var2.f == z60Var) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        z60 z60Var = this.I;
        z60 z60Var2 = z60Var.f;
        if (z60Var2 == null || z60Var2.f != z60Var) {
            z60 z60Var3 = this.K;
            z60 z60Var4 = z60Var3.f;
            if (z60Var4 != null && z60Var4.f == z60Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        z60 z60Var = this.J;
        z60 z60Var2 = z60Var.f;
        if (z60Var2 == null || z60Var2.f != z60Var) {
            z60 z60Var3 = this.L;
            z60 z60Var4 = z60Var3.f;
            if (z60Var4 != null && z60Var4.f == z60Var3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
