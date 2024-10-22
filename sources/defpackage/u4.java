package defpackage;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public final class u4 extends a11 {
    public final /* synthetic */ ActionMenuItemView j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.j = actionMenuItemView;
    }

    @Override // defpackage.a11
    public final gt2 b() {
        w4 w4Var;
        v4 v4Var = this.j.m;
        if (v4Var == null || (w4Var = ((x4) v4Var).f5113a.t) == null) {
            return null;
        }
        return w4Var.a();
    }

    @Override // defpackage.a11
    public final boolean c() {
        gt2 b2;
        ActionMenuItemView actionMenuItemView = this.j;
        iu1 iu1Var = actionMenuItemView.k;
        if (iu1Var == null || !iu1Var.a(actionMenuItemView.h) || (b2 = b()) == null || !b2.b()) {
            return false;
        }
        return true;
    }
}
