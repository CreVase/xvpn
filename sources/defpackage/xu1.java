package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class xu1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f5224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu1 f5225b;

    public xu1(yu1 yu1Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5225b = yu1Var;
        this.f5224a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f5224a.onMenuItemClick(this.f5225b.m(menuItem));
    }
}
