package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zh0 extends lh2 {
    public static TimeInterpolator s;
    public boolean g = true;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((h) arrayList.get(size)).f281a.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // defpackage.lh2
    public final boolean a(h hVar, h hVar2, kh2 kh2Var, kh2 kh2Var2) {
        int i;
        int i2;
        int i3 = kh2Var.f2946a;
        int i4 = kh2Var.f2947b;
        if (hVar2.z()) {
            int i5 = kh2Var.f2946a;
            i2 = kh2Var.f2947b;
            i = i5;
        } else {
            i = kh2Var2.f2946a;
            i2 = kh2Var2.f2947b;
        }
        if (hVar == hVar2) {
            return g(hVar, i3, i4, i, i2);
        }
        View view = hVar.f281a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(hVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(hVar2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = hVar2.f281a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        this.k.add(new xh0(hVar, hVar2, i3, i4, i, i2));
        return true;
    }

    @Override // defpackage.lh2
    public final void d(h hVar) {
        View view = hVar.f281a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((yh0) arrayList.get(size)).f5333a == hVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(hVar);
                arrayList.remove(size);
            }
        }
        j(hVar, this.k);
        if (this.h.remove(hVar)) {
            view.setAlpha(1.0f);
            c(hVar);
        }
        if (this.i.remove(hVar)) {
            view.setAlpha(1.0f);
            c(hVar);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(hVar, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((yh0) arrayList5.get(size4)).f5333a == hVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(hVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(hVar)) {
                    view.setAlpha(1.0f);
                    c(hVar);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.q.remove(hVar);
                this.o.remove(hVar);
                this.r.remove(hVar);
                this.p.remove(hVar);
                i();
                return;
            }
        }
    }

    @Override // defpackage.lh2
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            yh0 yh0Var = (yh0) arrayList.get(size);
            View view = yh0Var.f5333a.f281a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(yh0Var.f5333a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((h) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            h hVar = (h) arrayList3.get(size3);
            hVar.f281a.setAlpha(1.0f);
            c(hVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            xh0 xh0Var = (xh0) arrayList4.get(size4);
            h hVar2 = xh0Var.f5159a;
            if (hVar2 != null) {
                k(xh0Var, hVar2);
            }
            h hVar3 = xh0Var.f5160b;
            if (hVar3 != null) {
                k(xh0Var, hVar3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    yh0 yh0Var2 = (yh0) arrayList6.get(size6);
                    View view2 = yh0Var2.f5333a.f281a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(yh0Var2.f5333a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    h hVar4 = (h) arrayList8.get(size8);
                    hVar4.f281a.setAlpha(1.0f);
                    c(hVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    xh0 xh0Var2 = (xh0) arrayList10.get(size10);
                    h hVar5 = xh0Var2.f5159a;
                    if (hVar5 != null) {
                        k(xh0Var2, hVar5);
                    }
                    h hVar6 = xh0Var2.f5160b;
                    if (hVar6 != null) {
                        k(xh0Var2, hVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList arrayList11 = this.f3128b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            p71.C(arrayList11.get(0));
            throw null;
        }
    }

    @Override // defpackage.lh2
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean g(h hVar, int i, int i2, int i3, int i4) {
        View view = hVar.f281a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) hVar.f281a.getTranslationY());
        l(hVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(hVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new yh0(hVar, translationX, translationY, i3, i4));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f3128b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                p71.C(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(h hVar, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                xh0 xh0Var = (xh0) arrayList.get(size);
                if (k(xh0Var, hVar) && xh0Var.f5159a == null && xh0Var.f5160b == null) {
                    arrayList.remove(xh0Var);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(xh0 xh0Var, h hVar) {
        if (xh0Var.f5160b == hVar) {
            xh0Var.f5160b = null;
        } else if (xh0Var.f5159a == hVar) {
            xh0Var.f5159a = null;
        } else {
            return false;
        }
        hVar.f281a.setAlpha(1.0f);
        View view = hVar.f281a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(hVar);
        return true;
    }

    public final void l(h hVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        hVar.f281a.animate().setInterpolator(s);
        d(hVar);
    }
}
