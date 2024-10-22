package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.protobuf.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class su1 implements q33 {
    public tu1 A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4415b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public final ju1 n;
    public q23 o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = v.DEFAULT_BUFFER_SIZE;
    public int k = v.DEFAULT_BUFFER_SIZE;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public su1(ju1 ju1Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = ju1Var;
        this.f4414a = i2;
        this.f4415b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.q33
    public final q33 a(tu1 tu1Var) {
        this.z = null;
        this.A = tu1Var;
        this.n.p(true);
        tu1 tu1Var2 = this.A;
        if (tu1Var2 != null) {
            tu1Var2.d(new ja1(this, 2));
        }
        return this;
    }

    @Override // defpackage.q33
    public final tu1 b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = t9.L0(drawable).mutate();
            if (this.u) {
                bn0.h(drawable, this.s);
            }
            if (this.v) {
                bn0.i(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        tu1 tu1Var;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (tu1Var = this.A) != null) {
            this.z = tu1Var.b(this);
        }
        if (this.z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.n.f(this);
    }

    public final boolean f() {
        if ((this.x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z) {
        if (z) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        tu1 tu1Var = this.A;
        if (tu1Var != null) {
            View b2 = tu1Var.b(this);
            this.z = b2;
            return b2;
        }
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4415b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i != 0) {
            Drawable P0 = ew3.P0(this.n.f2830a, i);
            this.m = 0;
            this.l = P0;
            return d(P0);
        }
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4414a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        tu1 tu1Var = this.A;
        if (tu1Var != null && tu1Var.c()) {
            if ((this.x & 8) == 0 && this.A.a()) {
                return true;
            }
            return false;
        }
        if ((this.x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f4414a) > 0) {
            view.setId(i);
        }
        ju1 ju1Var = this.n;
        ju1Var.k = true;
        ju1Var.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.x;
        int i3 = i2 & 4;
        ju1 ju1Var = this.n;
        int i4 = 2;
        if (i3 != 0) {
            ju1Var.getClass();
            ArrayList arrayList = ju1Var.f;
            int size = arrayList.size();
            ju1Var.w();
            for (int i5 = 0; i5 < size; i5++) {
                su1 su1Var = (su1) arrayList.get(i5);
                if (su1Var.f4415b == this.f4415b) {
                    boolean z3 = true;
                    if ((su1Var.x & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && su1Var.isCheckable()) {
                        if (su1Var != this) {
                            z3 = false;
                        }
                        int i6 = su1Var.x;
                        int i7 = i6 & (-3);
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        su1Var.x = i8;
                        if (i6 != i8) {
                            su1Var.n.p(false);
                        }
                    }
                }
            }
            ju1Var.v();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i4 = 0;
            }
            int i10 = i4 | i9;
            this.x = i10;
            if (i2 != i10) {
                ju1Var.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        ju1 ju1Var = this.n;
        ju1Var.k = true;
        ju1Var.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        q23 q23Var = this.o;
        if (q23Var != null) {
            q23Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.x;
        int i3 = i2 & (-9);
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.x = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            ju1 ju1Var = this.n;
            ju1Var.h = true;
            ju1Var.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final q33 setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final q33 setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.q33, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.n.f2830a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        ju1 ju1Var = this.n;
        Context context = ju1Var.f2830a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f4414a) > 0) {
            inflate.setId(i2);
        }
        ju1Var.k = true;
        ju1Var.p(true);
        return this;
    }
}
