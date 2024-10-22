package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class z21 extends v21 {
    @Override // defpackage.v21
    public final void a(View view, Object obj) {
        ((pb3) obj).b(view);
    }

    @Override // defpackage.v21
    public final void b(Object obj, ArrayList arrayList) {
        boolean z;
        pb3 pb3Var;
        pb3 pb3Var2 = (pb3) obj;
        if (pb3Var2 == null) {
            return;
        }
        int i = 0;
        if (pb3Var2 instanceof ub3) {
            ub3 ub3Var = (ub3) pb3Var2;
            int size = ub3Var.x.size();
            while (i < size) {
                if (i >= 0 && i < ub3Var.x.size()) {
                    pb3Var = (pb3) ub3Var.x.get(i);
                } else {
                    pb3Var = null;
                }
                b(pb3Var, arrayList);
                i++;
            }
            return;
        }
        if (v21.h(pb3Var2.e) && v21.h(null) && v21.h(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && v21.h(pb3Var2.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                pb3Var2.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.v21
    public final void c(ViewGroup viewGroup, Object obj) {
        sb3.a(viewGroup, (pb3) obj);
    }

    @Override // defpackage.v21
    public final boolean e(Object obj) {
        return obj instanceof pb3;
    }

    @Override // defpackage.v21
    public final Object f(Object obj) {
        if (obj != null) {
            return ((pb3) obj).clone();
        }
        return null;
    }

    @Override // defpackage.v21
    public final Object i(Object obj, Object obj2, Object obj3) {
        pb3 pb3Var = (pb3) obj;
        pb3 pb3Var2 = (pb3) obj2;
        pb3 pb3Var3 = (pb3) obj3;
        if (pb3Var != null && pb3Var2 != null) {
            ub3 ub3Var = new ub3();
            ub3Var.H(pb3Var);
            ub3Var.H(pb3Var2);
            ub3Var.y = false;
            pb3Var = ub3Var;
        } else if (pb3Var == null) {
            if (pb3Var2 != null) {
                pb3Var = pb3Var2;
            } else {
                pb3Var = null;
            }
        }
        if (pb3Var3 != null) {
            ub3 ub3Var2 = new ub3();
            if (pb3Var != null) {
                ub3Var2.H(pb3Var);
            }
            ub3Var2.H(pb3Var3);
            return ub3Var2;
        }
        return pb3Var;
    }

    @Override // defpackage.v21
    public final Object j(Object obj, Object obj2) {
        ub3 ub3Var = new ub3();
        if (obj != null) {
            ub3Var.H((pb3) obj);
        }
        ub3Var.H((pb3) obj2);
        return ub3Var;
    }

    @Override // defpackage.v21
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((pb3) obj).a(new x21(view, arrayList));
    }

    @Override // defpackage.v21
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((pb3) obj).a(new y21(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.v21
    public final void m(View view, Object obj) {
        if (view != null) {
            v21.g(view, new Rect());
            ((pb3) obj).A(new w21());
        }
    }

    @Override // defpackage.v21
    public final void n(Object obj, Rect rect) {
        ((pb3) obj).A(new w21());
    }

    @Override // defpackage.v21
    public final void p(Object obj, View view, ArrayList arrayList) {
        ub3 ub3Var = (ub3) obj;
        ArrayList arrayList2 = ub3Var.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v21.d((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(ub3Var, arrayList);
    }

    @Override // defpackage.v21
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ub3 ub3Var = (ub3) obj;
        if (ub3Var != null) {
            ArrayList arrayList3 = ub3Var.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(ub3Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.v21
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        ub3 ub3Var = new ub3();
        ub3Var.H((pb3) obj);
        return ub3Var;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int size;
        pb3 pb3Var;
        pb3 pb3Var2 = (pb3) obj;
        int i = 0;
        if (pb3Var2 instanceof ub3) {
            ub3 ub3Var = (ub3) pb3Var2;
            int size2 = ub3Var.x.size();
            while (i < size2) {
                if (i >= 0 && i < ub3Var.x.size()) {
                    pb3Var = (pb3) ub3Var.x.get(i);
                } else {
                    pb3Var = null;
                }
                s(pb3Var, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (v21.h(pb3Var2.e) && v21.h(null) && v21.h(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ArrayList arrayList3 = pb3Var2.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    pb3Var2.b((View) arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        pb3Var2.w((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
