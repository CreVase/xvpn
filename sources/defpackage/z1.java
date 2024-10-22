package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public a2[] f5412a;

    /* renamed from: b, reason: collision with root package name */
    public int f5413b;
    public int c;

    public final a2 c() {
        a2 a2Var;
        synchronized (this) {
            a2[] a2VarArr = this.f5412a;
            if (a2VarArr == null) {
                a2VarArr = e();
                this.f5412a = a2VarArr;
            } else if (this.f5413b >= a2VarArr.length) {
                Object[] copyOf = Arrays.copyOf(a2VarArr, a2VarArr.length * 2);
                this.f5412a = (a2[]) copyOf;
                a2VarArr = (a2[]) copyOf;
            }
            int i = this.c;
            do {
                a2Var = a2VarArr[i];
                if (a2Var == null) {
                    a2Var = d();
                    a2VarArr[i] = a2Var;
                }
                i++;
                if (i >= a2VarArr.length) {
                    i = 0;
                }
            } while (!a2Var.a(this));
            this.c = i;
            this.f5413b++;
        }
        return a2Var;
    }

    public abstract a2 d();

    public abstract a2[] e();

    public final void f(a2 a2Var) {
        int i;
        c90[] b2;
        synchronized (this) {
            int i2 = this.f5413b - 1;
            this.f5413b = i2;
            if (i2 == 0) {
                this.c = 0;
            }
            b2 = a2Var.b(this);
        }
        for (c90 c90Var : b2) {
            if (c90Var != null) {
                c90Var.resumeWith(ch3.f636a);
            }
        }
    }
}
