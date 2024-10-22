package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class q23 extends ju1 implements SubMenu {
    public final su1 A;
    public final ju1 z;

    public q23(Context context, ju1 ju1Var, su1 su1Var) {
        super(context);
        this.z = ju1Var;
        this.A = su1Var;
    }

    @Override // defpackage.ju1
    public final boolean d(su1 su1Var) {
        return this.z.d(su1Var);
    }

    @Override // defpackage.ju1
    public final boolean e(ju1 ju1Var, MenuItem menuItem) {
        if (!super.e(ju1Var, menuItem) && !this.z.e(ju1Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ju1
    public final boolean f(su1 su1Var) {
        return this.z.f(su1Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.ju1
    public final String j() {
        int i;
        su1 su1Var = this.A;
        if (su1Var != null) {
            i = su1Var.f4414a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return hx2.m("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.ju1
    public final ju1 k() {
        return this.z.k();
    }

    @Override // defpackage.ju1
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.ju1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.ju1
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.ju1, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.ju1, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
