package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wr3 implements b70 {

    /* renamed from: a, reason: collision with root package name */
    public final vr3 f5060a;

    /* renamed from: b, reason: collision with root package name */
    public final c70[] f5061b;
    public final Object c;

    static {
        bo1.e("WorkConstraintsTracker");
    }

    public wr3(Context context, g63 g63Var, vr3 vr3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f5060a = vr3Var;
        this.f5061b = new c70[]{new ip(applicationContext, g63Var, 0), new ip(applicationContext, g63Var, 1), new ip(applicationContext, g63Var, 4), new ip(applicationContext, g63Var, 2), new ip(applicationContext, g63Var, 3), new qz1(applicationContext, g63Var), new pz1(applicationContext, g63Var)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this.c) {
            for (c70 c70Var : this.f5061b) {
                Object obj = c70Var.f594b;
                if (obj != null && c70Var.b(obj) && c70Var.f593a.contains(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bo1 c = bo1.c();
                    String.format("Work %s constrained by %s", str, c70Var.getClass().getSimpleName());
                    c.a(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.c) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (a(str)) {
                    bo1 c = bo1.c();
                    String.format("Constraints met for %s", str);
                    c.a(new Throwable[0]);
                    arrayList2.add(str);
                }
            }
            vr3 vr3Var = this.f5060a;
            if (vr3Var != null) {
                vr3Var.f(arrayList2);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.c) {
            for (c70 c70Var : this.f5061b) {
                if (c70Var.d != null) {
                    c70Var.d = null;
                    c70Var.d(null, c70Var.f594b);
                }
            }
            for (c70 c70Var2 : this.f5061b) {
                c70Var2.c(collection);
            }
            for (c70 c70Var3 : this.f5061b) {
                if (c70Var3.d != this) {
                    c70Var3.d = this;
                    c70Var3.d(this, c70Var3.f594b);
                }
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            for (c70 c70Var : this.f5061b) {
                ArrayList arrayList = c70Var.f593a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    c70Var.c.b(c70Var);
                }
            }
        }
    }
}
