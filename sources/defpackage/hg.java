package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hg implements lg {

    /* renamed from: b, reason: collision with root package name */
    public final mg f2414b;
    public final wq2 c;

    /* renamed from: a, reason: collision with root package name */
    public int f2413a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public hg(mg mgVar, wq2 wq2Var) {
        this.f2414b = mgVar;
        this.c = wq2Var;
    }

    @Override // defpackage.lg
    public final float a(ix2 ix2Var) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            if (this.e[i] == ix2Var.f2671b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // defpackage.lg
    public final boolean b(ix2 ix2Var) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            if (this.e[i] == ix2Var.f2671b) {
                return true;
            }
            i = this.f[i];
        }
        return false;
    }

    @Override // defpackage.lg
    public final int c() {
        return this.f2413a;
    }

    @Override // defpackage.lg
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            ix2 ix2Var = ((ix2[]) this.c.d)[this.e[i]];
            if (ix2Var != null) {
                ix2Var.b(this.f2414b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f2413a = 0;
    }

    @Override // defpackage.lg
    public final ix2 d(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2413a; i3++) {
            if (i3 == i) {
                return ((ix2[]) this.c.d)[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // defpackage.lg
    public final void e(ix2 ix2Var, float f, boolean z) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i = this.h;
        mg mgVar = this.f2414b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = ix2Var.f2671b;
            this.f[0] = -1;
            ix2Var.k++;
            ix2Var.a(mgVar);
            this.f2413a++;
            if (!this.j) {
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2413a; i4++) {
            int i5 = this.e[i];
            int i6 = ix2Var.f2671b;
            if (i5 == i6) {
                float[] fArr = this.g;
                float f2 = fArr[i] + f;
                if (f2 > -0.001f && f2 < 0.001f) {
                    f2 = 0.0f;
                }
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.h) {
                        this.h = this.f[i];
                    } else {
                        int[] iArr2 = this.f;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        ix2Var.b(mgVar);
                    }
                    if (this.j) {
                        this.i = i;
                    }
                    ix2Var.k--;
                    this.f2413a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.e;
        if (i7 >= iArr4.length && this.f2413a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = ix2Var.f2671b;
        this.g[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f[i7] = this.h;
            this.h = i7;
        }
        ix2Var.k++;
        ix2Var.a(mgVar);
        this.f2413a++;
        if (!this.j) {
            this.i++;
        }
        int i11 = this.i;
        int[] iArr8 = this.e;
        if (i11 >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    @Override // defpackage.lg
    public final void f() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // defpackage.lg
    public final float g(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2413a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // defpackage.lg
    public final float h(ix2 ix2Var, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2413a) {
            if (this.e[i] == ix2Var.f2671b) {
                if (i == this.h) {
                    this.h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    ix2Var.b(this.f2414b);
                }
                ix2Var.k--;
                this.f2413a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // defpackage.lg
    public final float i(mg mgVar, boolean z) {
        float a2 = a(mgVar.f3286a);
        h(mgVar.f3286a, z);
        lg lgVar = mgVar.d;
        int c = lgVar.c();
        for (int i = 0; i < c; i++) {
            ix2 d = lgVar.d(i);
            e(d, lgVar.a(d) * a2, z);
        }
        return a2;
    }

    @Override // defpackage.lg
    public final void j(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // defpackage.lg
    public final void k(ix2 ix2Var, float f) {
        if (f == 0.0f) {
            h(ix2Var, true);
            return;
        }
        int i = this.h;
        mg mgVar = this.f2414b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = ix2Var.f2671b;
            this.f[0] = -1;
            ix2Var.k++;
            ix2Var.a(mgVar);
            this.f2413a++;
            if (!this.j) {
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2413a; i4++) {
            int i5 = this.e[i];
            int i6 = ix2Var.f2671b;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.f2413a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = ix2Var.f2671b;
        this.g[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f[i7] = this.h;
            this.h = i7;
        }
        ix2Var.k++;
        ix2Var.a(mgVar);
        int i11 = this.f2413a + 1;
        this.f2413a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f2413a; i2++) {
            StringBuilder n = p71.n(p71.l(str, " -> "));
            n.append(this.g[i]);
            n.append(" : ");
            StringBuilder n2 = p71.n(n.toString());
            n2.append(((ix2[]) this.c.d)[this.e[i]]);
            str = n2.toString();
            i = this.f[i];
        }
        return str;
    }
}
