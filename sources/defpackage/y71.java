package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y71 extends pp3 {
    @Override // defpackage.lk0
    public final void a(lk0 lk0Var) {
        cn cnVar = (cn) this.f3895b;
        int i = cnVar.s0;
        qk0 qk0Var = this.h;
        Iterator it = qk0Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((qk0) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            qk0Var.d(i2 + cnVar.u0);
        } else {
            qk0Var.d(i3 + cnVar.u0);
        }
    }

    @Override // defpackage.pp3
    public final void d() {
        r70 r70Var = this.f3895b;
        if (r70Var instanceof cn) {
            qk0 qk0Var = this.h;
            qk0Var.f4011b = true;
            cn cnVar = (cn) r70Var;
            int i = cnVar.s0;
            boolean z = cnVar.t0;
            ArrayList arrayList = qk0Var.l;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qk0Var.e = 7;
                            while (i2 < cnVar.r0) {
                                r70 r70Var2 = cnVar.q0[i2];
                                if (z || r70Var2.g0 != 8) {
                                    qk0 qk0Var2 = r70Var2.e.i;
                                    qk0Var2.k.add(qk0Var);
                                    arrayList.add(qk0Var2);
                                }
                                i2++;
                            }
                            m(this.f3895b.e.h);
                            m(this.f3895b.e.i);
                            return;
                        }
                        return;
                    }
                    qk0Var.e = 6;
                    while (i2 < cnVar.r0) {
                        r70 r70Var3 = cnVar.q0[i2];
                        if (z || r70Var3.g0 != 8) {
                            qk0 qk0Var3 = r70Var3.e.h;
                            qk0Var3.k.add(qk0Var);
                            arrayList.add(qk0Var3);
                        }
                        i2++;
                    }
                    m(this.f3895b.e.h);
                    m(this.f3895b.e.i);
                    return;
                }
                qk0Var.e = 5;
                while (i2 < cnVar.r0) {
                    r70 r70Var4 = cnVar.q0[i2];
                    if (z || r70Var4.g0 != 8) {
                        qk0 qk0Var4 = r70Var4.d.i;
                        qk0Var4.k.add(qk0Var);
                        arrayList.add(qk0Var4);
                    }
                    i2++;
                }
                m(this.f3895b.d.h);
                m(this.f3895b.d.i);
                return;
            }
            qk0Var.e = 4;
            while (i2 < cnVar.r0) {
                r70 r70Var5 = cnVar.q0[i2];
                if (z || r70Var5.g0 != 8) {
                    qk0 qk0Var5 = r70Var5.d.h;
                    qk0Var5.k.add(qk0Var);
                    arrayList.add(qk0Var5);
                }
                i2++;
            }
            m(this.f3895b.d.h);
            m(this.f3895b.d.i);
        }
    }

    @Override // defpackage.pp3
    public final void e() {
        r70 r70Var = this.f3895b;
        if (r70Var instanceof cn) {
            int i = ((cn) r70Var).s0;
            qk0 qk0Var = this.h;
            if (i != 0 && i != 1) {
                r70Var.Z = qk0Var.g;
            } else {
                r70Var.Y = qk0Var.g;
            }
        }
    }

    @Override // defpackage.pp3
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.pp3
    public final boolean k() {
        return false;
    }

    public final void m(qk0 qk0Var) {
        qk0 qk0Var2 = this.h;
        qk0Var2.k.add(qk0Var);
        qk0Var.l.add(qk0Var2);
    }
}
