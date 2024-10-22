package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class vt1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4892a;

    /* renamed from: b, reason: collision with root package name */
    public final rt1 f4893b;
    public final CopyOnWriteArrayList c;
    public final long d = 0;

    public vt1(CopyOnWriteArrayList copyOnWriteArrayList, int i, rt1 rt1Var) {
        this.c = copyOnWriteArrayList;
        this.f4892a = i;
        this.f4893b = rt1Var;
    }

    public final long a(long j) {
        long K = wi3.K(j);
        if (K == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + K;
    }

    public final void b(et1 et1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            wi3.F(ut1Var.f4735a, new cq0(11, this, ut1Var.f4736b, et1Var));
        }
    }

    public final void c(xl1 xl1Var, long j, long j2) {
        d(xl1Var, new et1(1, -1, null, 0, null, a(j), a(j2)));
    }

    public final void d(xl1 xl1Var, et1 et1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            wi3.F(ut1Var.f4735a, new tt1(this, ut1Var.f4736b, xl1Var, et1Var, 2));
        }
    }

    public final void e(xl1 xl1Var, y01 y01Var, long j, long j2) {
        f(xl1Var, new et1(1, -1, y01Var, 0, null, a(j), a(j2)));
    }

    public final void f(xl1 xl1Var, et1 et1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            wi3.F(ut1Var.f4735a, new tt1(this, ut1Var.f4736b, xl1Var, et1Var, 1));
        }
    }

    public final void g(xl1 xl1Var, int i, y01 y01Var, long j, long j2, IOException iOException, boolean z) {
        h(xl1Var, new et1(i, -1, y01Var, 0, null, a(j), a(j2)), iOException, z);
    }

    public final void h(xl1 xl1Var, et1 et1Var, IOException iOException, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            wi3.F(ut1Var.f4735a, new au1(this, ut1Var.f4736b, xl1Var, et1Var, iOException, z, 1));
        }
    }

    public final void i(xl1 xl1Var, y01 y01Var, long j, long j2) {
        j(xl1Var, new et1(1, -1, y01Var, 0, null, a(j), a(j2)));
    }

    public final void j(xl1 xl1Var, et1 et1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            wi3.F(ut1Var.f4735a, new tt1(this, ut1Var.f4736b, xl1Var, et1Var, 0));
        }
    }
}
