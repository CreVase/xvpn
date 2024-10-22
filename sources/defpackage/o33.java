package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o33 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ p33 E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3592a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public tu1 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3593b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public o33(p33 p33Var, Menu menu) {
        this.E = p33Var;
        this.f3592a = menu;
    }

    public final void a(MenuItem menuItem) {
        boolean z;
        Object obj;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z2 = false;
        if (this.r >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        p33 p33Var = this.E;
        if (str != null) {
            if (!p33Var.c.isRestricted()) {
                if (p33Var.d == null) {
                    p33Var.d = p33.a(p33Var.c);
                }
                menuItem.setOnMenuItemClickListener(new n33(p33Var.d, this.y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof su1) {
                su1 su1Var = (su1) menuItem;
                su1Var.x = (su1Var.x & (-5)) | 4;
            } else if (menuItem instanceof yu1) {
                yu1 yu1Var = (yu1) menuItem;
                try {
                    Method method = yu1Var.e;
                    q33 q33Var = yu1Var.d;
                    if (method == null) {
                        yu1Var.e = q33Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    yu1Var.e.invoke(q33Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            Class<?>[] clsArr = p33.e;
            Object[] objArr = p33Var.f3774a;
            try {
                Constructor<?> constructor = Class.forName(str2, false, p33Var.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                obj = constructor.newInstance(objArr);
            } catch (Exception unused2) {
                obj = null;
            }
            menuItem.setActionView((View) obj);
            z2 = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z2) {
            menuItem.setActionView(i2);
        }
        tu1 tu1Var = this.z;
        if (tu1Var != null && (menuItem instanceof q33)) {
            ((q33) menuItem).a(tu1Var);
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof q33;
        if (z3) {
            ((q33) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            qu1.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((q33) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            qu1.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z3) {
            ((q33) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            qu1.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z3) {
            ((q33) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            qu1.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((q33) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                qu1.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z3) {
                ((q33) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                qu1.i(menuItem, colorStateList);
            }
        }
    }
}
