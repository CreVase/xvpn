package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class wu1 implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f5073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu1 f5074b;

    public wu1(yu1 yu1Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5074b = yu1Var;
        this.f5073a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f5073a.onMenuItemActionCollapse(this.f5074b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f5073a.onMenuItemActionExpand(this.f5074b.m(menuItem));
    }
}
