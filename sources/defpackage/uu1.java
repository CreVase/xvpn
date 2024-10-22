package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class uu1 extends tu1 implements ActionProvider.VisibilityListener {
    public ja1 c;

    @Override // defpackage.tu1
    public final boolean a() {
        return this.f4579a.isVisible();
    }

    @Override // defpackage.tu1
    public final View b(MenuItem menuItem) {
        return this.f4579a.onCreateActionView(menuItem);
    }

    @Override // defpackage.tu1
    public final boolean c() {
        return this.f4579a.overridesItemVisibility();
    }

    @Override // defpackage.tu1
    public final void d(ja1 ja1Var) {
        this.c = ja1Var;
        this.f4579a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ja1 ja1Var = this.c;
        if (ja1Var != null) {
            ju1 ju1Var = ((su1) ja1Var.f2735b).n;
            ju1Var.h = true;
            ju1Var.p(true);
        }
    }
}
