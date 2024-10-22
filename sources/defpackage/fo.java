package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class fo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2125a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2126b = new HashSet(1);
    public final vt1 c = new vt1(new CopyOnWriteArrayList(), 0, null);
    public final un0 d = new un0(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public a93 f;
    public z52 g;

    public abstract lt1 a(rt1 rt1Var, cf0 cf0Var, long j);

    public final void b(st1 st1Var) {
        HashSet hashSet = this.f2126b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(st1Var);
        if (z && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(st1 st1Var) {
        this.e.getClass();
        HashSet hashSet = this.f2126b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(st1Var);
        if (isEmpty) {
            e();
        }
    }

    public void e() {
    }

    public a93 f() {
        return null;
    }

    public abstract dt1 g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(st1 st1Var, hb3 hb3Var, z52 z52Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        cp3.e(z);
        this.g = z52Var;
        a93 a93Var = this.f;
        this.f2125a.add(st1Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f2126b.add(st1Var);
            k(hb3Var);
        } else if (a93Var != null) {
            d(st1Var);
            st1Var.a(this, a93Var);
        }
    }

    public abstract void k(hb3 hb3Var);

    public final void l(a93 a93Var) {
        this.f = a93Var;
        Iterator it = this.f2125a.iterator();
        while (it.hasNext()) {
            ((st1) it.next()).a(this, a93Var);
        }
    }

    public abstract void m(lt1 lt1Var);

    public final void n(st1 st1Var) {
        ArrayList arrayList = this.f2125a;
        arrayList.remove(st1Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.f2126b.clear();
            o();
            return;
        }
        b(st1Var);
    }

    public abstract void o();

    public final void p(vn0 vn0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            if (tn0Var.f4543b == vn0Var) {
                copyOnWriteArrayList.remove(tn0Var);
            }
        }
    }

    public final void q(wt1 wt1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ut1 ut1Var = (ut1) it.next();
            if (ut1Var.f4736b == wt1Var) {
                copyOnWriteArrayList.remove(ut1Var);
            }
        }
    }
}
