package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wc extends pd0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wc(Object obj, int i) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.pd0, defpackage.um3
    public final void b() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((tc) obj).f4484b.v.setVisibility(0);
                return;
            case 1:
                jd jdVar = (jd) obj;
                jdVar.v.setVisibility(0);
                if (jdVar.v.getParent() instanceof View) {
                    View view = (View) jdVar.v.getParent();
                    WeakHashMap weakHashMap = ll3.f3151a;
                    yk3.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.um3
    public final void c() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                tc tcVar = (tc) obj;
                tcVar.f4484b.v.setAlpha(1.0f);
                jd jdVar = tcVar.f4484b;
                jdVar.y.d(null);
                jdVar.y = null;
                return;
            case 1:
                jd jdVar2 = (jd) obj;
                jdVar2.v.setAlpha(1.0f);
                jdVar2.y.d(null);
                jdVar2.y = null;
                return;
            default:
                xc xcVar = (xc) obj;
                xcVar.f5143b.v.setVisibility(8);
                jd jdVar3 = xcVar.f5143b;
                PopupWindow popupWindow = jdVar3.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jdVar3.v.getParent() instanceof View) {
                    View view = (View) jdVar3.v.getParent();
                    WeakHashMap weakHashMap = ll3.f3151a;
                    yk3.c(view);
                }
                jdVar3.v.e();
                jdVar3.y.d(null);
                jdVar3.y = null;
                ViewGroup viewGroup = jdVar3.A;
                WeakHashMap weakHashMap2 = ll3.f3151a;
                yk3.c(viewGroup);
                return;
        }
    }
}
