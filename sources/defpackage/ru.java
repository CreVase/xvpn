package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class ru implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final x50 f4215a = new x50(13, (Object) null);

    public static void a(hs3 hs3Var, String str) {
        WorkDatabase workDatabase = hs3Var.s;
        ts3 n = workDatabase.n();
        ok0 i = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            fs3 e = n.e(str2);
            if (e != fs3.SUCCEEDED && e != fs3.FAILED) {
                n.l(fs3.CANCELLED, str2);
            }
            linkedList.addAll(i.a(str2));
        }
        v82 v82Var = hs3Var.v;
        synchronized (v82Var.k) {
            bo1 c = bo1.c();
            String str3 = v82.l;
            boolean z = true;
            String.format("Processor cancelling %s", str);
            c.a(new Throwable[0]);
            v82Var.i.add(str);
            bt3 bt3Var = (bt3) v82Var.f.remove(str);
            if (bt3Var == null) {
                z = false;
            }
            if (bt3Var == null) {
                bt3Var = (bt3) v82Var.g.remove(str);
            }
            v82.c(str, bt3Var);
            if (z) {
                v82Var.i();
            }
        }
        Iterator it = hs3Var.u.iterator();
        while (it.hasNext()) {
            ((hn2) it.next()).c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        x50 x50Var = this.f4215a;
        try {
            b();
            x50Var.B(m32.e0);
        } catch (Throwable th) {
            x50Var.B(new j32(th));
        }
    }
}
