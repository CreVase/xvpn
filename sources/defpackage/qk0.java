package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class qk0 implements lk0 {
    public final pp3 d;
    public int f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public pp3 f4010a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4011b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public ml0 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public qk0(pp3 pp3Var) {
        this.d = pp3Var;
    }

    @Override // defpackage.lk0
    public final void a(lk0 lk0Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((qk0) it.next()).j) {
                return;
            }
        }
        this.c = true;
        pp3 pp3Var = this.f4010a;
        if (pp3Var != null) {
            pp3Var.a(this);
        }
        if (this.f4011b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        qk0 qk0Var = null;
        int i = 0;
        while (it2.hasNext()) {
            qk0 qk0Var2 = (qk0) it2.next();
            if (!(qk0Var2 instanceof ml0)) {
                i++;
                qk0Var = qk0Var2;
            }
        }
        if (qk0Var != null && i == 1 && qk0Var.j) {
            ml0 ml0Var = this.i;
            if (ml0Var != null) {
                if (ml0Var.j) {
                    this.f = this.h * ml0Var.g;
                } else {
                    return;
                }
            }
            d(qk0Var.g + this.f);
        }
        pp3 pp3Var2 = this.f4010a;
        if (pp3Var2 != null) {
            pp3Var2.a(this);
        }
    }

    public final void b(lk0 lk0Var) {
        this.k.add(lk0Var);
        if (this.j) {
            lk0Var.a(lk0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.f4011b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            lk0 lk0Var = (lk0) it.next();
            lk0Var.a(lk0Var);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3895b.h0);
        sb.append(":");
        sb.append(hx2.B(this.e));
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
