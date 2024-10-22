package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j40 extends fo {
    public final HashMap h = new HashMap();
    public Handler i;
    public hb3 j;

    @Override // defpackage.fo
    public final void c() {
        for (i40 i40Var : this.h.values()) {
            i40Var.f2535a.b(i40Var.f2536b);
        }
    }

    @Override // defpackage.fo
    public final void e() {
        for (i40 i40Var : this.h.values()) {
            i40Var.f2535a.d(i40Var.f2536b);
        }
    }

    @Override // defpackage.fo
    public void i() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((i40) it.next()).f2535a.i();
        }
    }

    @Override // defpackage.fo
    public void o() {
        HashMap hashMap = this.h;
        for (i40 i40Var : hashMap.values()) {
            i40Var.f2535a.n(i40Var.f2536b);
            fo foVar = i40Var.f2535a;
            eb3 eb3Var = i40Var.c;
            foVar.q(eb3Var);
            foVar.p(eb3Var);
        }
        hashMap.clear();
    }

    public abstract rt1 r(Object obj, rt1 rt1Var);

    public long s(long j, Object obj) {
        return j;
    }

    public int t(int i, Object obj) {
        return i;
    }

    public abstract void u(Object obj, fo foVar, a93 a93Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [st1, h40] */
    public final void v(final Object obj, fo foVar) {
        HashMap hashMap = this.h;
        cp3.e(!hashMap.containsKey(obj));
        ?? r1 = new st1() { // from class: h40
            @Override // defpackage.st1
            public final void a(fo foVar2, a93 a93Var) {
                j40.this.u(obj, foVar2, a93Var);
            }
        };
        eb3 eb3Var = new eb3(this, obj);
        hashMap.put(obj, new i40(foVar, r1, eb3Var));
        Handler handler = this.i;
        handler.getClass();
        vt1 vt1Var = foVar.c;
        vt1Var.getClass();
        vt1Var.c.add(new ut1(handler, eb3Var));
        Handler handler2 = this.i;
        handler2.getClass();
        un0 un0Var = foVar.d;
        un0Var.getClass();
        un0Var.c.add(new tn0(handler2, eb3Var));
        hb3 hb3Var = this.j;
        z52 z52Var = this.g;
        cp3.o(z52Var);
        foVar.j(r1, hb3Var, z52Var);
        if (!(!this.f2126b.isEmpty())) {
            foVar.b(r1);
        }
    }
}
