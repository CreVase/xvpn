package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class un0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4702a;

    /* renamed from: b, reason: collision with root package name */
    public final rt1 f4703b;
    public final CopyOnWriteArrayList c;

    public un0(CopyOnWriteArrayList copyOnWriteArrayList, int i, rt1 rt1Var) {
        this.c = copyOnWriteArrayList;
        this.f4702a = i;
        this.f4703b = rt1Var;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new sn0(this, tn0Var.f4543b, 2));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new sn0(this, tn0Var.f4543b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new sn0(this, tn0Var.f4543b, 3));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new vk0(this, tn0Var.f4543b, i, 3));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new cq0(10, this, tn0Var.f4543b, exc));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            wi3.F(tn0Var.f4542a, new sn0(this, tn0Var.f4543b, 0));
        }
    }
}
