package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ix2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2670a;
    public float e;
    public int l;

    /* renamed from: b, reason: collision with root package name */
    public int f2671b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public mg[] i = new mg[16];
    public int j = 0;
    public int k = 0;

    public ix2(int i) {
        this.l = i;
    }

    public final void a(mg mgVar) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i < i2) {
                if (this.i[i] == mgVar) {
                    return;
                } else {
                    i++;
                }
            } else {
                mg[] mgVarArr = this.i;
                if (i2 >= mgVarArr.length) {
                    this.i = (mg[]) Arrays.copyOf(mgVarArr, mgVarArr.length * 2);
                }
                mg[] mgVarArr2 = this.i;
                int i3 = this.j;
                mgVarArr2[i3] = mgVar;
                this.j = i3 + 1;
                return;
            }
        }
    }

    public final void b(mg mgVar) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == mgVar) {
                while (i2 < i - 1) {
                    mg[] mgVarArr = this.i;
                    int i3 = i2 + 1;
                    mgVarArr[i2] = mgVarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.f2671b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.f2670a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2671b - ((ix2) obj).f2671b;
    }

    public final void d(ok1 ok1Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(ok1Var, this, false);
        }
        this.j = 0;
    }

    public final void e(ok1 ok1Var, mg mgVar) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(ok1Var, mgVar, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f2671b;
    }
}
