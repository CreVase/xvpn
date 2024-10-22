package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class fu1 {

    /* renamed from: a, reason: collision with root package name */
    public final z52 f2157a;
    public final eu1 e;
    public final pa h;
    public final j71 i;
    public boolean k;
    public hb3 l;
    public ht2 j = new ht2();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2158b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public fu1(eu1 eu1Var, pa paVar, z43 z43Var, z52 z52Var) {
        this.f2157a = z52Var;
        this.e = eu1Var;
        this.h = paVar;
        this.i = z43Var;
    }

    public final a93 a(int i, List list, ht2 ht2Var) {
        if (!list.isEmpty()) {
            this.j = ht2Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                du1 du1Var = (du1) list.get(i2 - i);
                ArrayList arrayList = this.f2158b;
                if (i2 > 0) {
                    du1 du1Var2 = (du1) arrayList.get(i2 - 1);
                    du1Var.d = du1Var2.f1839a.o.p() + du1Var2.d;
                    du1Var.e = false;
                    du1Var.c.clear();
                } else {
                    du1Var.d = 0;
                    du1Var.e = false;
                    du1Var.c.clear();
                }
                int p = du1Var.f1839a.o.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((du1) arrayList.get(i3)).d += p;
                }
                arrayList.add(i2, du1Var);
                this.d.put(du1Var.f1840b, du1Var);
                if (this.k) {
                    e(du1Var);
                    if (this.c.isEmpty()) {
                        this.g.add(du1Var);
                    } else {
                        cu1 cu1Var = (cu1) this.f.get(du1Var);
                        if (cu1Var != null) {
                            cu1Var.f1677a.b(cu1Var.f1678b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final a93 b() {
        ArrayList arrayList = this.f2158b;
        if (arrayList.isEmpty()) {
            return a93.f42a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            du1 du1Var = (du1) arrayList.get(i2);
            du1Var.d = i;
            i += du1Var.f1839a.o.p();
        }
        return new d62(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            du1 du1Var = (du1) it.next();
            if (du1Var.c.isEmpty()) {
                cu1 cu1Var = (cu1) this.f.get(du1Var);
                if (cu1Var != null) {
                    cu1Var.f1677a.b(cu1Var.f1678b);
                }
                it.remove();
            }
        }
    }

    public final void d(du1 du1Var) {
        if (du1Var.e && du1Var.c.isEmpty()) {
            cu1 cu1Var = (cu1) this.f.remove(du1Var);
            cu1Var.getClass();
            st1 st1Var = cu1Var.f1678b;
            fo foVar = cu1Var.f1677a;
            foVar.n(st1Var);
            x50 x50Var = cu1Var.c;
            foVar.q(x50Var);
            foVar.p(x50Var);
            this.g.remove(du1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [st1, yt1] */
    public final void e(du1 du1Var) {
        oq1 oq1Var = du1Var.f1839a;
        ?? r1 = new st1() { // from class: yt1
            @Override // defpackage.st1
            public final void a(fo foVar, a93 a93Var) {
                ((hu0) fu1.this.e).h.d(22);
            }
        };
        x50 x50Var = new x50(this, du1Var, 26);
        this.f.put(du1Var, new cu1(oq1Var, r1, x50Var));
        Handler l = wi3.l(null);
        vt1 vt1Var = oq1Var.c;
        vt1Var.getClass();
        vt1Var.c.add(new ut1(l, x50Var));
        Handler l2 = wi3.l(null);
        un0 un0Var = oq1Var.d;
        un0Var.getClass();
        un0Var.c.add(new tn0(l2, x50Var));
        oq1Var.j(r1, this.l, this.f2157a);
    }

    public final void f(lt1 lt1Var) {
        IdentityHashMap identityHashMap = this.c;
        du1 du1Var = (du1) identityHashMap.remove(lt1Var);
        du1Var.getClass();
        du1Var.f1839a.m(lt1Var);
        du1Var.c.remove(((lq1) lt1Var).f3173a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(du1Var);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f2158b;
            du1 du1Var = (du1) arrayList.remove(i3);
            this.d.remove(du1Var.f1840b);
            int i4 = -du1Var.f1839a.o.p();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((du1) arrayList.get(i5)).d += i4;
            }
            du1Var.e = true;
            if (this.k) {
                d(du1Var);
            }
        }
    }
}
