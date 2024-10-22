package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c70 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f593a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f594b;
    public final q70 c;
    public b70 d;

    public c70(q70 q70Var) {
        this.c = q70Var;
    }

    public abstract boolean a(rs3 rs3Var);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f593a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rs3 rs3Var = (rs3) it.next();
            if (a(rs3Var)) {
                this.f593a.add(rs3Var.f4206a);
            }
        }
        if (this.f593a.isEmpty()) {
            this.c.b(this);
        } else {
            q70 q70Var = this.c;
            synchronized (q70Var.c) {
                try {
                    if (q70Var.d.add(this)) {
                        if (q70Var.d.size() == 1) {
                            q70Var.e = q70Var.a();
                            bo1 c = bo1.c();
                            int i = q70.f;
                            String.format("%s: initial state = %s", q70Var.getClass().getSimpleName(), q70Var.e);
                            c.a(new Throwable[0]);
                            q70Var.d();
                        }
                        Object obj = q70Var.e;
                        this.f594b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.f594b);
    }

    public final void d(b70 b70Var, Object obj) {
        if (!this.f593a.isEmpty() && b70Var != null) {
            if (obj != null && !b(obj)) {
                ((wr3) b70Var).b(this.f593a);
                return;
            }
            ArrayList arrayList = this.f593a;
            wr3 wr3Var = (wr3) b70Var;
            synchronized (wr3Var.c) {
                vr3 vr3Var = wr3Var.f5060a;
                if (vr3Var != null) {
                    vr3Var.d(arrayList);
                }
            }
        }
    }
}
