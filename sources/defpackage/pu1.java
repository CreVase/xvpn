package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class pu1 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3919a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3920b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public pu1(Runnable runnable) {
        this.f3919a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f3920b.iterator();
        while (it.hasNext()) {
            if (((u11) ((kv1) it.next())).f4613a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(kv1 kv1Var) {
        this.f3920b.remove(kv1Var);
        ou1 ou1Var = (ou1) this.c.remove(kv1Var);
        if (ou1Var != null) {
            ou1Var.f3731a.b(ou1Var.f3732b);
            ou1Var.f3732b = null;
        }
        this.f3919a.run();
    }
}
