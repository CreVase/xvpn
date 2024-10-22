package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ub3 extends pb3 {
    public int z;
    public ArrayList x = new ArrayList();
    public boolean y = true;
    public boolean A = false;
    public int B = 0;

    @Override // defpackage.pb3
    public final void A(pe0 pe0Var) {
        this.s = pe0Var;
        this.B |= 8;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((pb3) this.x.get(i)).A(pe0Var);
        }
    }

    @Override // defpackage.pb3
    public final void B(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pb3) this.x.get(i)).B(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.pb3
    public final void C(mp0 mp0Var) {
        super.C(mp0Var);
        this.B |= 4;
        if (this.x != null) {
            for (int i = 0; i < this.x.size(); i++) {
                ((pb3) this.x.get(i)).C(mp0Var);
            }
        }
    }

    @Override // defpackage.pb3
    public final void D() {
        this.B |= 2;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((pb3) this.x.get(i)).D();
        }
    }

    @Override // defpackage.pb3
    public final void E(long j) {
        this.f3818b = j;
    }

    @Override // defpackage.pb3
    public final String G(String str) {
        String G = super.G(str);
        for (int i = 0; i < this.x.size(); i++) {
            StringBuilder p = p71.p(G, "\n");
            p.append(((pb3) this.x.get(i)).G(str + "  "));
            G = p.toString();
        }
        return G;
    }

    public final void H(pb3 pb3Var) {
        this.x.add(pb3Var);
        pb3Var.i = this;
        long j = this.c;
        if (j >= 0) {
            pb3Var.z(j);
        }
        if ((this.B & 1) != 0) {
            pb3Var.B(this.d);
        }
        if ((this.B & 2) != 0) {
            pb3Var.D();
        }
        if ((this.B & 4) != 0) {
            pb3Var.C(this.t);
        }
        if ((this.B & 8) != 0) {
            pb3Var.A(this.s);
        }
    }

    @Override // defpackage.pb3
    public final void a(ob3 ob3Var) {
        super.a(ob3Var);
    }

    @Override // defpackage.pb3
    public final void b(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            ((pb3) this.x.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.pb3
    public final void d(wb3 wb3Var) {
        View view = wb3Var.f4979b;
        if (s(view)) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                pb3 pb3Var = (pb3) it.next();
                if (pb3Var.s(view)) {
                    pb3Var.d(wb3Var);
                    wb3Var.c.add(pb3Var);
                }
            }
        }
    }

    @Override // defpackage.pb3
    public final void f(wb3 wb3Var) {
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((pb3) this.x.get(i)).f(wb3Var);
        }
    }

    @Override // defpackage.pb3
    public final void g(wb3 wb3Var) {
        View view = wb3Var.f4979b;
        if (s(view)) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                pb3 pb3Var = (pb3) it.next();
                if (pb3Var.s(view)) {
                    pb3Var.g(wb3Var);
                    wb3Var.c.add(pb3Var);
                }
            }
        }
    }

    @Override // defpackage.pb3
    /* renamed from: j */
    public final pb3 clone() {
        ub3 ub3Var = (ub3) super.clone();
        ub3Var.x = new ArrayList();
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            pb3 clone = ((pb3) this.x.get(i)).clone();
            ub3Var.x.add(clone);
            clone.i = ub3Var;
        }
        return ub3Var;
    }

    @Override // defpackage.pb3
    public final void l(ViewGroup viewGroup, wq2 wq2Var, wq2 wq2Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3818b;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            pb3 pb3Var = (pb3) this.x.get(i);
            if (j > 0 && (this.y || i == 0)) {
                long j2 = pb3Var.f3818b;
                if (j2 > 0) {
                    pb3Var.E(j2 + j);
                } else {
                    pb3Var.E(j);
                }
            }
            pb3Var.l(viewGroup, wq2Var, wq2Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.pb3
    public final void u(View view) {
        super.u(view);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((pb3) this.x.get(i)).u(view);
        }
    }

    @Override // defpackage.pb3
    public final void v(ob3 ob3Var) {
        super.v(ob3Var);
    }

    @Override // defpackage.pb3
    public final void w(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            ((pb3) this.x.get(i)).w(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.pb3
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((pb3) this.x.get(i)).x(viewGroup);
        }
    }

    @Override // defpackage.pb3
    public final void y() {
        if (this.x.isEmpty()) {
            F();
            m();
            return;
        }
        tb3 tb3Var = new tb3(this);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((pb3) it.next()).a(tb3Var);
        }
        this.z = this.x.size();
        if (!this.y) {
            for (int i = 1; i < this.x.size(); i++) {
                ((pb3) this.x.get(i - 1)).a(new nv0(2, this, (pb3) this.x.get(i)));
            }
            pb3 pb3Var = (pb3) this.x.get(0);
            if (pb3Var != null) {
                pb3Var.y();
                return;
            }
            return;
        }
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            ((pb3) it2.next()).y();
        }
    }

    @Override // defpackage.pb3
    public final void z(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.x) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pb3) this.x.get(i)).z(j);
            }
        }
    }
}
