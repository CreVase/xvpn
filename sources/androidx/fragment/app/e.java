package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import defpackage.al3;
import defpackage.df2;
import defpackage.fv2;
import defpackage.hx2;
import defpackage.kg;
import defpackage.ll3;
import defpackage.m20;
import defpackage.mp1;
import defpackage.sx2;
import defpackage.tx2;
import defpackage.ux2;
import defpackage.xk3;
import defpackage.xl3;
import defpackage.xu;
import defpackage.ya0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f224a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f225b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public e(ViewGroup viewGroup) {
        this.f224a = viewGroup;
    }

    public static void a(ux2 ux2Var) {
        ux2Var.f4753a.a(ux2Var.c.mView);
    }

    public static void b(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (xl3.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    b(arrayList, childAt);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void f(View view, kg kgVar) {
        WeakHashMap weakHashMap = ll3.f3151a;
        String k = al3.k(view);
        if (k != null) {
            kgVar.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(childAt, kgVar);
                }
            }
        }
    }

    public static final e i(ViewGroup viewGroup, p pVar) {
        pVar.H();
        int i = df2.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof e) {
            return (e) tag;
        }
        e eVar = new e(viewGroup);
        viewGroup.setTag(i, eVar);
        return eVar;
    }

    public static void k(kg kgVar, Collection collection) {
        Set entrySet = kgVar.entrySet();
        fv2 fv2Var = new fv2(collection, 1);
        Iterator it = ((mp1) entrySet).iterator();
        while (it.hasNext()) {
            if (!((Boolean) fv2Var.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public final void c(tx2 tx2Var, sx2 sx2Var, r rVar) {
        synchronized (this.f225b) {
            xu xuVar = new xu();
            ux2 g = g(rVar.c);
            if (g != null) {
                g.c(tx2Var, sx2Var);
                return;
            }
            final v vVar = new v(tx2Var, sx2Var, rVar, xuVar);
            this.f225b.add(vVar);
            final int i = 0;
            vVar.d.add(new Runnable(this) { // from class: androidx.fragment.app.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f246b;

                {
                    this.f246b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    v vVar2 = vVar;
                    e eVar = this.f246b;
                    switch (i2) {
                        case 0:
                            if (eVar.f225b.contains(vVar2)) {
                                vVar2.f4753a.a(vVar2.c.mView);
                                return;
                            }
                            return;
                        default:
                            eVar.f225b.remove(vVar2);
                            eVar.c.remove(vVar2);
                            return;
                    }
                }
            });
            final int i2 = 1;
            vVar.d.add(new Runnable(this) { // from class: androidx.fragment.app.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f246b;

                {
                    this.f246b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    v vVar2 = vVar;
                    e eVar = this.f246b;
                    switch (i22) {
                        case 0:
                            if (eVar.f225b.contains(vVar2)) {
                                vVar2.f4753a.a(vVar2.c.mView);
                                return;
                            }
                            return;
                        default:
                            eVar.f225b.remove(vVar2);
                            eVar.c.remove(vVar2);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04af  */
    /* JADX WARN: Type inference failed for: r10v5, types: [uu2] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.d(java.util.ArrayList, boolean):void");
    }

    public final void e() {
        if (!this.e) {
            ViewGroup viewGroup = this.f224a;
            WeakHashMap weakHashMap = ll3.f3151a;
            if (!xk3.b(viewGroup)) {
                h();
                this.d = false;
                return;
            }
            synchronized (this.f225b) {
                if (!this.f225b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ux2 ux2Var = (ux2) it.next();
                        if (p.I(2)) {
                            Objects.toString(ux2Var);
                        }
                        ux2Var.a();
                        if (!ux2Var.g) {
                            this.c.add(ux2Var);
                        }
                    }
                    l();
                    ArrayList arrayList2 = new ArrayList(this.f225b);
                    this.f225b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((ux2) it2.next()).d();
                    }
                    d(arrayList2, this.d);
                    this.d = false;
                }
            }
        }
    }

    public final ux2 g(Fragment fragment) {
        Object obj;
        boolean z;
        Iterator it = this.f225b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ux2 ux2Var = (ux2) obj;
                if (m20.L(ux2Var.c, fragment) && !ux2Var.f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ux2) obj;
    }

    public final void h() {
        ViewGroup viewGroup = this.f224a;
        WeakHashMap weakHashMap = ll3.f3151a;
        boolean b2 = xk3.b(viewGroup);
        synchronized (this.f225b) {
            l();
            Iterator it = this.f225b.iterator();
            while (it.hasNext()) {
                ((ux2) it.next()).d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                ux2 ux2Var = (ux2) it2.next();
                if (p.I(2)) {
                    if (!b2) {
                        Objects.toString(this.f224a);
                    }
                    Objects.toString(ux2Var);
                }
                ux2Var.a();
            }
            Iterator it3 = new ArrayList(this.f225b).iterator();
            while (it3.hasNext()) {
                ux2 ux2Var2 = (ux2) it3.next();
                if (p.I(2)) {
                    if (!b2) {
                        Objects.toString(this.f224a);
                    }
                    Objects.toString(ux2Var2);
                }
                ux2Var2.a();
            }
        }
    }

    public final void j() {
        boolean z;
        Fragment fragment;
        Object obj;
        boolean z2;
        synchronized (this.f225b) {
            l();
            ArrayList arrayList = this.f225b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                z = false;
                fragment = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    ux2 ux2Var = (ux2) obj;
                    tx2 J = ya0.J(ux2Var.c.mView);
                    tx2 tx2Var = ux2Var.f4753a;
                    tx2 tx2Var2 = tx2.VISIBLE;
                    if (tx2Var == tx2Var2 && J != tx2Var2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ux2 ux2Var2 = (ux2) obj;
            if (ux2Var2 != null) {
                fragment = ux2Var2.c;
            }
            if (fragment != null) {
                z = fragment.isPostponed();
            }
            this.e = z;
        }
    }

    public final void l() {
        tx2 tx2Var;
        Iterator it = this.f225b.iterator();
        while (it.hasNext()) {
            ux2 ux2Var = (ux2) it.next();
            if (ux2Var.f4754b == sx2.ADDING) {
                int visibility = ux2Var.c.requireView().getVisibility();
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility == 8) {
                            tx2Var = tx2.GONE;
                        } else {
                            throw new IllegalArgumentException(hx2.m("Unknown visibility ", visibility));
                        }
                    } else {
                        tx2Var = tx2.INVISIBLE;
                    }
                } else {
                    tx2Var = tx2.VISIBLE;
                }
                ux2Var.c(tx2Var, sx2.NONE);
            }
        }
    }
}
