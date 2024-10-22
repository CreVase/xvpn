package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vp3 extends pd0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ xp3 h;

    public /* synthetic */ vp3(xp3 xp3Var, int i) {
        this.g = i;
        this.h = xp3Var;
    }

    @Override // defpackage.um3
    public final void c() {
        View view;
        int i = this.g;
        xp3 xp3Var = this.h;
        switch (i) {
            case 0:
                if (xp3Var.o && (view = xp3Var.g) != null) {
                    view.setTranslationY(0.0f);
                    xp3Var.d.setTranslationY(0.0f);
                }
                xp3Var.d.setVisibility(8);
                xp3Var.d.setTransitioning(false);
                xp3Var.s = null;
                g5 g5Var = xp3Var.k;
                if (g5Var != null) {
                    g5Var.g(xp3Var.j);
                    xp3Var.j = null;
                    xp3Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = xp3Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    yk3.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                xp3Var.s = null;
                xp3Var.d.requestLayout();
                return;
        }
    }
}
