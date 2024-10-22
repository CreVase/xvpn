package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bv implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f534b;

    public /* synthetic */ bv(Object obj, int i) {
        this.f533a = i;
        this.f534b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f533a;
        boolean z = false;
        Object obj = this.f534b;
        switch (i) {
            case 0:
                fv fvVar = (fv) obj;
                if (fvVar.b()) {
                    ArrayList arrayList = fvVar.i;
                    if (arrayList.size() > 0 && !((ev) arrayList.get(0)).f1999a.y) {
                        View view = fvVar.p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ev) it.next()).f1999a.show();
                            }
                            return;
                        }
                        fvVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q03 q03Var = (q03) obj;
                if (q03Var.b()) {
                    hv1 hv1Var = q03Var.i;
                    if (!hv1Var.y) {
                        View view2 = q03Var.n;
                        if (view2 != null && view2.isShown()) {
                            hv1Var.show();
                            return;
                        } else {
                            q03Var.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                b bVar = (b) obj;
                if (!bVar.getInternalPopup().b()) {
                    bVar.f.n(ce.b(bVar), ce.a(bVar));
                }
                ViewTreeObserver viewTreeObserver = bVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    be.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                he heVar = (he) obj;
                b bVar2 = heVar.H;
                WeakHashMap weakHashMap = ll3.f3151a;
                if (xk3.b(bVar2) && bVar2.getGlobalVisibleRect(heVar.F)) {
                    z = true;
                }
                if (!z) {
                    heVar.dismiss();
                    return;
                } else {
                    heVar.r();
                    heVar.show();
                    return;
                }
        }
    }
}
