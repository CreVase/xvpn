package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class hi3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final xa3[] f2430b;

    public hi3(List list) {
        this.f2429a = list;
        this.f2430b = new xa3[list.size()];
    }

    public final void a(long j, r42 r42Var) {
        if (r42Var.c - r42Var.f4099b < 9) {
            return;
        }
        int f = r42Var.f();
        int f2 = r42Var.f();
        int v = r42Var.v();
        if (f == 434 && f2 == 1195456820 && v == 3) {
            pd0.s(j, r42Var, this.f2430b);
        }
    }

    public final void b(fv0 fv0Var, qc3 qc3Var) {
        boolean z;
        int i = 0;
        while (true) {
            xa3[] xa3VarArr = this.f2430b;
            if (i < xa3VarArr.length) {
                qc3Var.a();
                qc3Var.b();
                xa3 l = fv0Var.l(qc3Var.d, 3);
                y01 y01Var = (y01) this.f2429a.get(i);
                String str = y01Var.l;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z = false;
                } else {
                    z = true;
                }
                cp3.f(z, "Invalid closed caption mime type provided: " + str);
                x01 x01Var = new x01();
                qc3Var.b();
                x01Var.f5098a = qc3Var.e;
                x01Var.k = str;
                x01Var.d = y01Var.d;
                x01Var.c = y01Var.c;
                x01Var.C = y01Var.D;
                x01Var.m = y01Var.n;
                l.e(new y01(x01Var));
                xa3VarArr[i] = l;
                i++;
            } else {
                return;
            }
        }
    }
}
