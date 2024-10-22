package androidx.fragment.app;

import android.view.View;
import defpackage.sx2;
import defpackage.tx2;
import defpackage.ux2;
import defpackage.xu;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends ux2 {
    public final r h;

    public v(tx2 tx2Var, sx2 sx2Var, r rVar, xu xuVar) {
        super(tx2Var, sx2Var, rVar.c, xuVar);
        this.h = rVar;
    }

    @Override // defpackage.ux2
    public final void b() {
        if (!this.g) {
            if (p.I(2)) {
                toString();
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.i();
    }

    @Override // defpackage.ux2
    public final void d() {
        boolean z;
        sx2 sx2Var = this.f4754b;
        sx2 sx2Var2 = sx2.ADDING;
        r rVar = this.h;
        if (sx2Var == sx2Var2) {
            Fragment fragment = rVar.c;
            View findFocus = fragment.mView.findFocus();
            if (findFocus != null) {
                fragment.setFocusedView(findFocus);
                if (p.I(2)) {
                    findFocus.toString();
                    fragment.toString();
                }
            }
            View requireView = this.c.requireView();
            if (requireView.getParent() == null) {
                rVar.a();
                requireView.setAlpha(0.0f);
            }
            if (requireView.getAlpha() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            return;
        }
        if (sx2Var == sx2.REMOVING) {
            Fragment fragment2 = rVar.c;
            View requireView2 = fragment2.requireView();
            if (p.I(2)) {
                Objects.toString(requireView2.findFocus());
                requireView2.toString();
                fragment2.toString();
            }
            requireView2.clearFocus();
        }
    }
}
