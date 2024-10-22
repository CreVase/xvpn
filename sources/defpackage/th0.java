package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class th0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4503b;
    public final /* synthetic */ zh0 c;

    public /* synthetic */ th0(zh0 zh0Var, ArrayList arrayList, int i) {
        this.f4502a = i;
        this.c = zh0Var;
        this.f4503b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        int i = this.f4502a;
        zh0 zh0Var = this.c;
        ArrayList arrayList = this.f4503b;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yh0 yh0Var = (yh0) it.next();
                    h hVar = yh0Var.f5333a;
                    zh0Var.getClass();
                    View view3 = hVar.f281a;
                    int i2 = yh0Var.d - yh0Var.f5334b;
                    int i3 = yh0Var.e - yh0Var.c;
                    if (i2 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i3 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    zh0Var.p.add(hVar);
                    animate.setDuration(zh0Var.e).setListener(new vh0(zh0Var, hVar, i2, view3, i3, animate)).start();
                }
                arrayList.clear();
                zh0Var.m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    xh0 xh0Var = (xh0) it2.next();
                    zh0Var.getClass();
                    h hVar2 = xh0Var.f5159a;
                    if (hVar2 == null) {
                        view = null;
                    } else {
                        view = hVar2.f281a;
                    }
                    h hVar3 = xh0Var.f5160b;
                    if (hVar3 != null) {
                        view2 = hVar3.f281a;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = zh0Var.r;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(zh0Var.f);
                        arrayList2.add(xh0Var.f5159a);
                        duration.translationX(xh0Var.e - xh0Var.c);
                        duration.translationY(xh0Var.f - xh0Var.d);
                        duration.alpha(0.0f).setListener(new wh0(zh0Var, xh0Var, duration, view, 0)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(xh0Var.f5160b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(zh0Var.f).alpha(1.0f).setListener(new wh0(zh0Var, xh0Var, animate2, view2, 1)).start();
                    }
                }
                arrayList.clear();
                zh0Var.n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    h hVar4 = (h) it3.next();
                    zh0Var.getClass();
                    View view4 = hVar4.f281a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    zh0Var.o.add(hVar4);
                    animate3.alpha(1.0f).setDuration(zh0Var.c).setListener(new uh0(zh0Var, hVar4, view4, animate3)).start();
                }
                arrayList.clear();
                zh0Var.l.remove(arrayList);
                return;
        }
    }
}
