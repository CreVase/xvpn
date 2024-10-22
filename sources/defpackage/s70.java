package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s70 extends lp3 {
    public int t0;
    public int x0;
    public int y0;
    public final y33 r0 = new y33(this);
    public final pk0 s0 = new pk0(this);
    public mp3 u0 = null;
    public boolean v0 = false;
    public final ok1 w0 = new ok1();
    public int z0 = 0;
    public int A0 = 0;
    public vv[] B0 = new vv[4];
    public vv[] C0 = new vv[4];
    public int D0 = 257;
    public boolean E0 = false;
    public boolean F0 = false;
    public WeakReference G0 = null;
    public WeakReference H0 = null;
    public WeakReference I0 = null;
    public WeakReference J0 = null;
    public final HashSet K0 = new HashSet();
    public final fp L0 = new fp();

    public static void V(r70 r70Var, mp3 mp3Var, fp fpVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (mp3Var == null) {
            return;
        }
        if (r70Var.g0 != 8 && !(r70Var instanceof t61) && !(r70Var instanceof cn)) {
            int[] iArr = r70Var.p0;
            fpVar.f2130a = iArr[0];
            boolean z5 = true;
            fpVar.f2131b = iArr[1];
            fpVar.c = r70Var.r();
            fpVar.d = r70Var.l();
            fpVar.i = false;
            fpVar.j = 0;
            if (fpVar.f2130a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (fpVar.f2131b == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && r70Var.W > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && r70Var.W > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && r70Var.u(0) && r70Var.r == 0 && !z3) {
                fpVar.f2130a = 2;
                if (z2 && r70Var.s == 0) {
                    fpVar.f2130a = 1;
                }
                z = false;
            }
            if (z2 && r70Var.u(1) && r70Var.s == 0 && !z4) {
                fpVar.f2131b = 2;
                if (z && r70Var.r == 0) {
                    fpVar.f2131b = 1;
                }
                z2 = false;
            }
            if (r70Var.B()) {
                fpVar.f2130a = 1;
                z = false;
            }
            if (r70Var.C()) {
                fpVar.f2131b = 1;
                z2 = false;
            }
            int[] iArr2 = r70Var.t;
            if (z3) {
                if (iArr2[0] == 4) {
                    fpVar.f2130a = 1;
                } else if (!z2) {
                    if (fpVar.f2131b == 1) {
                        i2 = fpVar.d;
                    } else {
                        fpVar.f2130a = 2;
                        mp3Var.b(r70Var, fpVar);
                        i2 = fpVar.f;
                    }
                    fpVar.f2130a = 1;
                    fpVar.c = (int) (r70Var.W * i2);
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    fpVar.f2131b = 1;
                } else if (!z) {
                    if (fpVar.f2130a == 1) {
                        i = fpVar.c;
                    } else {
                        fpVar.f2131b = 2;
                        mp3Var.b(r70Var, fpVar);
                        i = fpVar.e;
                    }
                    fpVar.f2131b = 1;
                    if (r70Var.X == -1) {
                        fpVar.d = (int) (i / r70Var.W);
                    } else {
                        fpVar.d = (int) (r70Var.W * i);
                    }
                }
            }
            mp3Var.b(r70Var, fpVar);
            r70Var.O(fpVar.e);
            r70Var.L(fpVar.f);
            r70Var.E = fpVar.h;
            int i3 = fpVar.g;
            r70Var.a0 = i3;
            if (i3 <= 0) {
                z5 = false;
            }
            r70Var.E = z5;
            fpVar.j = 0;
            return;
        }
        fpVar.e = 0;
        fpVar.f = 0;
    }

    @Override // defpackage.lp3, defpackage.r70
    public final void D() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        super.D();
    }

    @Override // defpackage.r70
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.q0.get(i)).P(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0810 A[LOOP:14: B:300:0x080e->B:301:0x0810, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0608 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.lp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s70.R():void");
    }

    public final void S(int i, r70 r70Var) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            vv[] vvVarArr = this.C0;
            if (i2 >= vvVarArr.length) {
                this.C0 = (vv[]) Arrays.copyOf(vvVarArr, vvVarArr.length * 2);
            }
            vv[] vvVarArr2 = this.C0;
            int i3 = this.z0;
            vvVarArr2[i3] = new vv(r70Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            vv[] vvVarArr3 = this.B0;
            if (i4 >= vvVarArr3.length) {
                this.B0 = (vv[]) Arrays.copyOf(vvVarArr3, vvVarArr3.length * 2);
            }
            vv[] vvVarArr4 = this.B0;
            int i5 = this.A0;
            vvVarArr4[i5] = new vv(r70Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void T(ok1 ok1Var) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean W = W(64);
        c(ok1Var, W);
        int size = this.q0.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            r70 r70Var = (r70) this.q0.get(i2);
            boolean[] zArr = r70Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (r70Var instanceof cn) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                r70 r70Var2 = (r70) this.q0.get(i3);
                if (r70Var2 instanceof cn) {
                    cn cnVar = (cn) r70Var2;
                    for (int i4 = 0; i4 < cnVar.r0; i4++) {
                        r70 r70Var3 = cnVar.q0[i4];
                        if (cnVar.t0 || r70Var3.d()) {
                            int i5 = cnVar.s0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    r70Var3.S[1] = true;
                                }
                            } else {
                                r70Var3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            r70 r70Var4 = (r70) this.q0.get(i6);
            r70Var4.getClass();
            if (!(r70Var4 instanceof hz0) && !(r70Var4 instanceof t61)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (r70Var4 instanceof hz0) {
                    hashSet.add(r70Var4);
                } else {
                    r70Var4.c(ok1Var, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hz0 hz0Var = (hz0) ((r70) it.next());
                int i7 = 0;
                while (true) {
                    if (i7 < hz0Var.r0) {
                        if (hashSet.contains(hz0Var.q0[i7])) {
                            z3 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    hz0Var.c(ok1Var, W);
                    hashSet.remove(hz0Var);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((r70) it2.next()).c(ok1Var, W);
                }
                hashSet.clear();
            }
        }
        if (ok1.p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                r70 r70Var5 = (r70) this.q0.get(i8);
                r70Var5.getClass();
                if (!(r70Var5 instanceof hz0) && !(r70Var5 instanceof t61)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    hashSet2.add(r70Var5);
                }
            }
            if (this.p0[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            b(this, ok1Var, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                r70 r70Var6 = (r70) it3.next();
                pg1.c(this, ok1Var, r70Var6);
                r70Var6.c(ok1Var, W);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                r70 r70Var7 = (r70) this.q0.get(i9);
                if (r70Var7 instanceof s70) {
                    int[] iArr = r70Var7.p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        r70Var7.M(1);
                    }
                    if (i11 == 2) {
                        r70Var7.N(1);
                    }
                    r70Var7.c(ok1Var, W);
                    if (i10 == 2) {
                        r70Var7.M(i10);
                    }
                    if (i11 == 2) {
                        r70Var7.N(i11);
                    }
                } else {
                    pg1.c(this, ok1Var, r70Var7);
                    if (!(r70Var7 instanceof hz0) && !(r70Var7 instanceof t61)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        r70Var7.c(ok1Var, W);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            t9.k(this, ok1Var, null, 0);
        }
        if (this.A0 > 0) {
            t9.k(this, ok1Var, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        pk0 pk0Var = this.s0;
        s70 s70Var = (s70) pk0Var.c;
        int k = s70Var.k(0);
        int k2 = s70Var.k(1);
        int s = s70Var.s();
        int t = s70Var.t();
        Object obj = pk0Var.e;
        if (z4 && (k == 2 || k2 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pp3 pp3Var = (pp3) it.next();
                if (pp3Var.f == i && !pp3Var.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && k == 2) {
                    s70Var.M(1);
                    s70Var.O(pk0Var.e(s70Var, 0));
                    s70Var.d.e.d(s70Var.r());
                }
            } else if (z4 && k2 == 2) {
                s70Var.N(1);
                s70Var.L(pk0Var.e(s70Var, 1));
                s70Var.e.e.d(s70Var.l());
            }
        }
        int[] iArr = s70Var.p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int r = s70Var.r() + s;
                s70Var.d.i.d(r);
                s70Var.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int l = s70Var.l() + t;
                s70Var.e.i.d(l);
                s70Var.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        pk0Var.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pp3 pp3Var2 = (pp3) it2.next();
            if (pp3Var2.f == i && (pp3Var2.f3895b != s70Var || pp3Var2.g)) {
                pp3Var2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            pp3 pp3Var3 = (pp3) it3.next();
            if (pp3Var3.f == i && (z2 || pp3Var3.f3895b != s70Var)) {
                if (!pp3Var3.h.j || !pp3Var3.i.j || (!(pp3Var3 instanceof wv) && !pp3Var3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        s70Var.M(k);
        s70Var.N(k2);
        return z3;
    }

    public final boolean W(int i) {
        if ((this.D0 & i) == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.r70
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((r70) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
