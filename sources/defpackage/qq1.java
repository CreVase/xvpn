package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qq1 extends jc {
    public final hl1 e;
    public final AccessibilityManager f;
    public final Rect g;
    public final int h;
    public final float i;
    public ColorStateList j;
    public int k;
    public ColorStateList l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qq1(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.he2.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = defpackage.ir1.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.g = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.bg2.MaterialAutoCompleteTextView
            int r4 = defpackage.qf2.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.y73.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_android_inputType
            boolean r1 = r9.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L33
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L33
            r7.setKeyListener(r2)
        L33:
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_simpleItemLayout
            int r1 = defpackage.jf2.mtrl_auto_complete_simple_item
            int r0 = r9.getResourceId(r0, r1)
            r7.h = r0
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_android_popupElevation
            int r1 = defpackage.re2.mtrl_exposed_dropdown_menu_popup_elevation
            int r0 = r9.getDimensionPixelOffset(r0, r1)
            float r0 = (float) r0
            r7.i = r0
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_dropDownBackgroundTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L5a
            int r0 = r9.getColor(r0, r6)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.j = r0
        L5a:
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r0 = r9.getColor(r0, r6)
            r7.k = r0
            int r0 = defpackage.bg2.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r0 = defpackage.m20.j0(r8, r9, r0)
            r7.l = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.f = r0
            hl1 r0 = new hl1
            int r1 = defpackage.ie2.listPopupWindowStyle
            r0.<init>(r8, r2, r1, r6)
            r7.e = r0
            r8 = 1
            r0.y = r8
            td r1 = r0.z
            r1.setFocusable(r8)
            r0.o = r7
            r2 = 2
            r1.setInputMethodMode(r2)
            android.widget.ListAdapter r1 = r7.getAdapter()
            r0.p(r1)
            co2 r1 = new co2
            r1.<init>(r7, r8)
            r0.p = r1
            int r8 = defpackage.bg2.MaterialAutoCompleteTextView_simpleItems
            boolean r0 = r9.hasValue(r8)
            if (r0 == 0) goto La8
            int r8 = r9.getResourceId(r8, r6)
            r7.setSimpleItems(r8)
        La8:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq1.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(qq1 qq1Var, Object obj) {
        qq1Var.setText(qq1Var.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        if (b2 != null && b2.E) {
            return b2.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.E && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                hl1 hl1Var = this.e;
                if (!hl1Var.b()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = hl1Var.c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable g = hl1Var.g();
                if (g != null) {
                    Rect rect = this.g;
                    g.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b2.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean z2;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        hl1 hl1Var = this.e;
        if (hl1Var != null) {
            hl1Var.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof fr1) {
            ((fr1) dropDownBackground).j(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.k = i;
        if (getAdapter() instanceof pq1) {
            ((pq1) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof pq1) {
            ((pq1) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.e.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new pq1(this, getContext(), this.h, strArr));
    }
}
