package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.bn0;
import defpackage.ck2;
import defpackage.ew3;
import defpackage.hk1;
import defpackage.ie2;
import defpackage.jf2;
import defpackage.jk2;
import defpackage.ll3;
import defpackage.lv1;
import defpackage.n73;
import defpackage.q01;
import defpackage.re2;
import defpackage.su1;
import defpackage.t9;
import defpackage.tq1;
import defpackage.ue2;
import defpackage.uk3;
import defpackage.xe2;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends q01 implements lv1 {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public su1 B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final tq1 F;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final CheckedTextView z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = true;
        tq1 tq1Var = new tq1(this, 2);
        this.F = tq1Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(jf2.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(re2.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(xe2.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ll3.p(checkedTextView, tq1Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(xe2.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // defpackage.lv1
    public final void c(su1 su1Var) {
        int i;
        StateListDrawable stateListDrawable;
        this.B = su1Var;
        int i2 = su1Var.f4414a;
        if (i2 > 0) {
            setId(i2);
        }
        if (su1Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ie2.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.q(this, stateListDrawable);
        }
        setCheckable(su1Var.isCheckable());
        setChecked(su1Var.isChecked());
        setEnabled(su1Var.isEnabled());
        setTitle(su1Var.e);
        setIcon(su1Var.getIcon());
        setActionView(su1Var.getActionView());
        setContentDescription(su1Var.q);
        ew3.c1(this, su1Var.r);
        su1 su1Var2 = this.B;
        if (su1Var2.e != null || su1Var2.getIcon() != null || this.B.getActionView() == null) {
            z = false;
        }
        CheckedTextView checkedTextView = this.z;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                hk1 hk1Var = (hk1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) hk1Var).width = -1;
                this.A.setLayoutParams(hk1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            hk1 hk1Var2 = (hk1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) hk1Var2).width = -2;
            this.A.setLayoutParams(hk1Var2);
        }
    }

    @Override // defpackage.lv1
    public su1 getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        su1 su1Var = this.B;
        if (su1Var != null && su1Var.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.F.h(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.y) {
            i = 1;
        } else {
            i = 0;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = t9.L0(drawable).mutate();
                bn0.h(drawable, this.C);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.E == null) {
                Resources resources = getResources();
                int i2 = ue2.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = jk2.f2780a;
                Drawable a2 = ck2.a(resources, i2, theme);
                this.E = a2;
                if (a2 != null) {
                    int i3 = this.v;
                    a2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        n73.e(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.C = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.D = z;
        su1 su1Var = this.B;
        if (su1Var != null) {
            setIcon(su1Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        t9.p0(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
