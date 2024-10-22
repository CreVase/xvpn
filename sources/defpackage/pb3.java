package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class pb3 implements Cloneable {
    public static final int[] u = {2, 1, 3, 4};
    public static final mp0 v = new mp0();
    public static final ThreadLocal w = new ThreadLocal();
    public ArrayList k;
    public ArrayList l;
    public pe0 s;

    /* renamed from: a, reason: collision with root package name */
    public final String f3817a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3818b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public wq2 g = new wq2(5);
    public wq2 h = new wq2(5);
    public ub3 i = null;
    public final int[] j = u;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = false;
    public boolean p = false;
    public ArrayList q = null;
    public ArrayList r = new ArrayList();
    public mp0 t = v;

    public static void c(wq2 wq2Var, View view, wb3 wb3Var) {
        ((kg) wq2Var.f5056a).put(view, wb3Var);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) wq2Var.f5057b).indexOfKey(id) >= 0) {
                ((SparseArray) wq2Var.f5057b).put(id, null);
            } else {
                ((SparseArray) wq2Var.f5057b).put(id, view);
            }
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        String k = al3.k(view);
        if (k != null) {
            if (((kg) wq2Var.d).containsKey(k)) {
                ((kg) wq2Var.d).put(k, null);
            } else {
                ((kg) wq2Var.d).put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                ko1 ko1Var = (ko1) wq2Var.c;
                if (ko1Var.f2986a) {
                    ko1Var.d();
                }
                if (fl.f(ko1Var.f2987b, ko1Var.d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((ko1) wq2Var.c).e(itemIdAtPosition, null);
                    if (view2 != null) {
                        uk3.r(view2, false);
                        ((ko1) wq2Var.c).f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                uk3.r(view, true);
                ((ko1) wq2Var.c).f(itemIdAtPosition, view);
            }
        }
    }

    public static kg o() {
        ThreadLocal threadLocal = w;
        kg kgVar = (kg) threadLocal.get();
        if (kgVar == null) {
            kg kgVar2 = new kg();
            threadLocal.set(kgVar2);
            return kgVar2;
        }
        return kgVar;
    }

    public static boolean t(wb3 wb3Var, wb3 wb3Var2, String str) {
        Object obj = wb3Var.f4978a.get(str);
        Object obj2 = wb3Var2.f4978a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public void A(pe0 pe0Var) {
        this.s = pe0Var;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void C(mp0 mp0Var) {
        if (mp0Var == null) {
            this.t = v;
        } else {
            this.t = mp0Var;
        }
    }

    public void D() {
    }

    public void E(long j) {
        this.f3818b = j;
    }

    public final void F() {
        if (this.n == 0) {
            ArrayList arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((ob3) arrayList2.get(i)).d();
                }
            }
            this.p = false;
        }
        this.n++;
    }

    public String G(String str) {
        StringBuilder n = p71.n(str);
        n.append(getClass().getSimpleName());
        n.append("@");
        n.append(Integer.toHexString(hashCode()));
        n.append(": ");
        String sb = n.toString();
        if (this.c != -1) {
            StringBuilder p = p71.p(sb, "dur(");
            p.append(this.c);
            p.append(") ");
            sb = p.toString();
        }
        if (this.f3818b != -1) {
            StringBuilder p2 = p71.p(sb, "dly(");
            p2.append(this.f3818b);
            p2.append(") ");
            sb = p2.toString();
        }
        if (this.d != null) {
            StringBuilder p3 = p71.p(sb, "interp(");
            p3.append(this.d);
            p3.append(") ");
            sb = p3.toString();
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            String l = p71.l(sb, "tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        l = p71.l(l, ", ");
                    }
                    StringBuilder n2 = p71.n(l);
                    n2.append(arrayList.get(i));
                    l = n2.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        l = p71.l(l, ", ");
                    }
                    StringBuilder n3 = p71.n(l);
                    n3.append(arrayList2.get(i2));
                    l = n3.toString();
                }
            }
            return p71.l(l, ")");
        }
        return sb;
    }

    public void a(ob3 ob3Var) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(ob3Var);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public abstract void d(wb3 wb3Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            wb3 wb3Var = new wb3(view);
            if (z) {
                g(wb3Var);
            } else {
                d(wb3Var);
            }
            wb3Var.c.add(this);
            f(wb3Var);
            if (z) {
                c(this.g, view, wb3Var);
            } else {
                c(this.h, view, wb3Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(wb3 wb3Var) {
    }

    public abstract void g(wb3 wb3Var);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                wb3 wb3Var = new wb3(findViewById);
                if (z) {
                    g(wb3Var);
                } else {
                    d(wb3Var);
                }
                wb3Var.c.add(this);
                f(wb3Var);
                if (z) {
                    c(this.g, findViewById, wb3Var);
                } else {
                    c(this.h, findViewById, wb3Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            wb3 wb3Var2 = new wb3(view);
            if (z) {
                g(wb3Var2);
            } else {
                d(wb3Var2);
            }
            wb3Var2.c.add(this);
            f(wb3Var2);
            if (z) {
                c(this.g, view, wb3Var2);
            } else {
                c(this.h, view, wb3Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((kg) this.g.f5056a).clear();
            ((SparseArray) this.g.f5057b).clear();
            ((ko1) this.g.c).b();
        } else {
            ((kg) this.h.f5056a).clear();
            ((SparseArray) this.h.f5057b).clear();
            ((ko1) this.h.c).b();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public pb3 clone() {
        try {
            pb3 pb3Var = (pb3) super.clone();
            pb3Var.r = new ArrayList();
            pb3Var.g = new wq2(5);
            pb3Var.h = new wq2(5);
            pb3Var.k = null;
            pb3Var.l = null;
            return pb3Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, wb3 wb3Var, wb3 wb3Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, wq2 wq2Var, wq2 wq2Var2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        Animator k;
        View view;
        Animator animator;
        wb3 wb3Var;
        Animator animator2;
        wb3 wb3Var2;
        ViewGroup viewGroup2 = viewGroup;
        kg o = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            wb3 wb3Var3 = (wb3) arrayList.get(i);
            wb3 wb3Var4 = (wb3) arrayList2.get(i);
            if (wb3Var3 != null && !wb3Var3.c.contains(this)) {
                wb3Var3 = null;
            }
            if (wb3Var4 != null && !wb3Var4.c.contains(this)) {
                wb3Var4 = null;
            }
            if (wb3Var3 != null || wb3Var4 != null) {
                if (wb3Var3 != null && wb3Var4 != null && !r(wb3Var3, wb3Var4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (k = k(viewGroup2, wb3Var3, wb3Var4)) != null) {
                    if (wb3Var4 != null) {
                        String[] p = p();
                        view = wb3Var4.f4979b;
                        if (p != null && p.length > 0) {
                            wb3Var2 = new wb3(view);
                            wb3 wb3Var5 = (wb3) ((kg) wq2Var2.f5056a).getOrDefault(view, null);
                            if (wb3Var5 != null) {
                                int i2 = 0;
                                while (i2 < p.length) {
                                    HashMap hashMap = wb3Var2.f4978a;
                                    Animator animator3 = k;
                                    String str = p[i2];
                                    hashMap.put(str, wb3Var5.f4978a.get(str));
                                    i2++;
                                    k = animator3;
                                    p = p;
                                }
                            }
                            Animator animator4 = k;
                            int i3 = o.c;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    nb3 nb3Var = (nb3) o.getOrDefault((Animator) o.i(i4), null);
                                    if (nb3Var.c != null && nb3Var.f3431a == view && nb3Var.f3432b.equals(this.f3817a) && nb3Var.c.equals(wb3Var2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = k;
                            wb3Var2 = null;
                        }
                        animator = animator2;
                        wb3Var = wb3Var2;
                    } else {
                        view = wb3Var3.f4979b;
                        animator = k;
                        wb3Var = null;
                    }
                    if (animator != null) {
                        String str2 = this.f3817a;
                        dn3 dn3Var = an3.f118a;
                        o.put(animator, new nb3(view, str2, this, new yp3(viewGroup2), wb3Var));
                        this.r.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.r.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            ArrayList arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ob3) arrayList2.get(i2)).b(this);
                }
            }
            int i3 = 0;
            while (true) {
                ko1 ko1Var = (ko1) this.g.c;
                if (ko1Var.f2986a) {
                    ko1Var.d();
                }
                if (i3 >= ko1Var.d) {
                    break;
                }
                View view = (View) ((ko1) this.g.c).g(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    uk3.r(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                ko1 ko1Var2 = (ko1) this.h.c;
                if (ko1Var2.f2986a) {
                    ko1Var2.d();
                }
                if (i4 < ko1Var2.d) {
                    View view2 = (View) ((ko1) this.h.c).g(i4);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = ll3.f3151a;
                        uk3.r(view2, false);
                    }
                    i4++;
                } else {
                    this.p = true;
                    return;
                }
            }
        }
    }

    public final wb3 n(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ub3 ub3Var = this.i;
        if (ub3Var != null) {
            return ub3Var.n(view, z);
        }
        if (z) {
            arrayList = this.k;
        } else {
            arrayList = this.l;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                wb3 wb3Var = (wb3) arrayList.get(i);
                if (wb3Var == null) {
                    return null;
                }
                if (wb3Var.f4979b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.l;
        } else {
            arrayList2 = this.k;
        }
        return (wb3) arrayList2.get(i);
    }

    public String[] p() {
        return null;
    }

    public final wb3 q(View view, boolean z) {
        wq2 wq2Var;
        ub3 ub3Var = this.i;
        if (ub3Var != null) {
            return ub3Var.q(view, z);
        }
        if (z) {
            wq2Var = this.g;
        } else {
            wq2Var = this.h;
        }
        return (wb3) ((kg) wq2Var.f5056a).getOrDefault(view, null);
    }

    public boolean r(wb3 wb3Var, wb3 wb3Var2) {
        if (wb3Var == null || wb3Var2 == null) {
            return false;
        }
        String[] p = p();
        if (p != null) {
            for (String str : p) {
                if (!t(wb3Var, wb3Var2, str)) {
                }
            }
            return false;
        }
        Iterator it = wb3Var.f4978a.keySet().iterator();
        while (it.hasNext()) {
            if (t(wb3Var, wb3Var2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        int i;
        if (!this.p) {
            kg o = o();
            int i2 = o.c;
            dn3 dn3Var = an3.f118a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                nb3 nb3Var = (nb3) o.k(i3);
                if (nb3Var.f3431a != null) {
                    zp3 zp3Var = nb3Var.d;
                    if ((zp3Var instanceof yp3) && ((yp3) zp3Var).f5374a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        ((Animator) o.i(i3)).pause();
                    }
                }
                i3--;
            }
            ArrayList arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((ob3) arrayList2.get(i)).a();
                    i++;
                }
            }
            this.o = true;
        }
    }

    public void v(ob3 ob3Var) {
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(ob3Var);
        if (this.q.size() == 0) {
            this.q = null;
        }
    }

    public void w(View view) {
        this.f.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        boolean z;
        if (this.o) {
            if (!this.p) {
                kg o = o();
                int i = o.c;
                dn3 dn3Var = an3.f118a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    nb3 nb3Var = (nb3) o.k(i2);
                    if (nb3Var.f3431a != null) {
                        zp3 zp3Var = nb3Var.d;
                        if ((zp3Var instanceof yp3) && ((yp3) zp3Var).f5374a.equals(windowId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ((Animator) o.i(i2)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.q.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((ob3) arrayList2.get(i3)).e();
                    }
                }
            }
            this.o = false;
        }
    }

    public void y() {
        F();
        kg o = o();
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new mb3(this, o));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3818b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new o4(this, 1));
                    animator.start();
                }
            }
        }
        this.r.clear();
        m();
    }

    public void z(long j) {
        this.c = j;
    }
}
