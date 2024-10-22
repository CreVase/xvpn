package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class mo implements mu0 {

    /* renamed from: a, reason: collision with root package name */
    public final ua3 f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3324b;
    public final int[] c;
    public final y01[] d;
    public int e;

    public mo(ua3 ua3Var, int[] iArr) {
        boolean z;
        y01[] y01VarArr;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        ua3Var.getClass();
        this.f3323a = ua3Var;
        int length = iArr.length;
        this.f3324b = length;
        this.d = new y01[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            y01VarArr = ua3Var.d;
            if (i >= length2) {
                break;
            }
            this.d[i] = y01VarArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.d, new xz0(8));
        this.c = new int[this.f3324b];
        int i2 = 0;
        while (true) {
            int i3 = this.f3324b;
            if (i2 < i3) {
                int[] iArr2 = this.c;
                y01 y01Var = this.d[i2];
                int i4 = 0;
                while (true) {
                    if (i4 < y01VarArr.length) {
                        if (y01Var == y01VarArr[i4]) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                iArr2[i2] = i4;
                i2++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.mu0
    public final ua3 a() {
        return this.f3323a;
    }

    @Override // defpackage.mu0
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.mu0
    public final y01 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.mu0
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mo moVar = (mo) obj;
        if (this.f3323a == moVar.f3323a && Arrays.equals(this.c, moVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mu0
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.mu0
    public void g() {
    }

    @Override // defpackage.mu0
    public final y01 h() {
        b();
        return this.d[0];
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.c) + (System.identityHashCode(this.f3323a) * 31);
        }
        return this.e;
    }

    @Override // defpackage.mu0
    public void i(float f) {
    }

    @Override // defpackage.mu0
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.mu0
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.mu0
    public final int l(int i) {
        for (int i2 = 0; i2 < this.f3324b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.mu0
    public final int length() {
        return this.c.length;
    }
}
