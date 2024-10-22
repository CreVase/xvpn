package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.protobuf.v;

/* loaded from: classes.dex */
public final class t4 implements q33 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f4447a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f4448b;
    public Intent c;
    public char d;
    public char f;
    public Drawable h;
    public final Context i;
    public CharSequence j;
    public CharSequence k;
    public int e = v.DEFAULT_BUFFER_SIZE;
    public int g = v.DEFAULT_BUFFER_SIZE;
    public ColorStateList l = null;
    public PorterDuff.Mode m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public t4(Context context, CharSequence charSequence) {
        this.i = context;
        this.f4447a = charSequence;
    }

    @Override // defpackage.q33
    public final q33 a(tu1 tu1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q33
    public final tu1 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable L0 = t9.L0(drawable);
                this.h = L0;
                Drawable mutate = L0.mutate();
                this.h = mutate;
                if (this.n) {
                    bn0.h(mutate, this.l);
                }
                if (this.o) {
                    bn0.i(this.h, this.m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4447a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4448b;
        if (charSequence == null) {
            return this.f4447a;
        }
        return charSequence;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.p & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.p = i | i2;
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final q33 setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.p & (-17);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.p = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4447a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4448b = charSequence;
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final q33 setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.p & 8;
        if (z) {
            i = 0;
        }
        this.p = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f4447a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = x80.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
