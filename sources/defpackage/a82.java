package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a82 extends mg {
    public ix2[] f;
    public ix2[] g;
    public int h;
    public final y33 i;

    public a82(wq2 wq2Var) {
        super(wq2Var);
        this.f = new ix2[128];
        this.g = new ix2[128];
        this.h = 0;
        this.i = new y33(this, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:            if (r9 < r8) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:            r5 = false;     */
    @Override // defpackage.mg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ix2 d(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
        L4:
            int r4 = r11.h
            if (r2 >= r4) goto L5b
            ix2[] r4 = r11.f
            r5 = r4[r2]
            int r6 = r5.f2671b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L58
        L13:
            y33 r6 = r11.i
            r6.f5263b = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L38
        L1c:
            if (r7 < 0) goto L34
            java.lang.Object r4 = r6.f5263b
            ix2 r4 = (defpackage.ix2) r4
            float[] r4 = r4.h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L34
        L2c:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L31
            goto L35
        L31:
            int r7 = r7 + (-1)
            goto L1c
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L58
            goto L57
        L38:
            r4 = r4[r3]
        L3a:
            if (r7 < 0) goto L54
            float[] r8 = r4.h
            r8 = r8[r7]
            java.lang.Object r9 = r6.f5263b
            ix2 r9 = (defpackage.ix2) r9
            float[] r9 = r9.h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4f
            int r7 = r7 + (-1)
            goto L3a
        L4f:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L54
            goto L55
        L54:
            r5 = 0
        L55:
            if (r5 == 0) goto L58
        L57:
            r3 = r2
        L58:
            int r2 = r2 + 1
            goto L4
        L5b:
            if (r3 != r0) goto L5f
            r12 = 0
            return r12
        L5f:
            ix2[] r12 = r11.f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a82.d(boolean[]):ix2");
    }

    @Override // defpackage.mg
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mg
    public final void i(ok1 ok1Var, mg mgVar, boolean z) {
        boolean z2;
        ix2 ix2Var = mgVar.f3286a;
        if (ix2Var == null) {
            return;
        }
        lg lgVar = mgVar.d;
        int c = lgVar.c();
        for (int i = 0; i < c; i++) {
            ix2 d = lgVar.d(i);
            float g = lgVar.g(i);
            y33 y33Var = this.i;
            y33Var.f5263b = d;
            boolean z3 = d.f2670a;
            float[] fArr = ix2Var.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ix2) y33Var.f5263b).h;
                    float f = (fArr[i2] * g) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((ix2) y33Var.f5263b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((a82) y33Var.d).k((ix2) y33Var.f5263b);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * g;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((ix2) y33Var.f5263b).h[i3] = f3;
                    } else {
                        ((ix2) y33Var.f5263b).h[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                j(d);
            }
            this.f3287b = (mgVar.f3287b * g) + this.f3287b;
        }
        k(ix2Var);
    }

    public final void j(ix2 ix2Var) {
        int i;
        int i2 = this.h + 1;
        ix2[] ix2VarArr = this.f;
        if (i2 > ix2VarArr.length) {
            ix2[] ix2VarArr2 = (ix2[]) Arrays.copyOf(ix2VarArr, ix2VarArr.length * 2);
            this.f = ix2VarArr2;
            this.g = (ix2[]) Arrays.copyOf(ix2VarArr2, ix2VarArr2.length * 2);
        }
        ix2[] ix2VarArr3 = this.f;
        int i3 = this.h;
        ix2VarArr3[i3] = ix2Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ix2VarArr3[i4 - 1].f2671b > ix2Var.f2671b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new z72(this, 0));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ix2Var.f2670a = true;
        ix2Var.a(this);
    }

    public final void k(ix2 ix2Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ix2Var) {
                while (true) {
                    int i2 = this.h;
                    if (i < i2 - 1) {
                        ix2[] ix2VarArr = this.f;
                        int i3 = i + 1;
                        ix2VarArr[i] = ix2VarArr[i3];
                        i = i3;
                    } else {
                        this.h = i2 - 1;
                        ix2Var.f2670a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.mg
    public final String toString() {
        String str = " goal -> (" + this.f3287b + ") : ";
        for (int i = 0; i < this.h; i++) {
            ix2 ix2Var = this.f[i];
            y33 y33Var = this.i;
            y33Var.f5263b = ix2Var;
            str = str + y33Var + " ";
        }
        return str;
    }
}
