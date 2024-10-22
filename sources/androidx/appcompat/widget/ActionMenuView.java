package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.a5;
import defpackage.b5;
import defpackage.bn3;
import defpackage.c5;
import defpackage.d5;
import defpackage.e5;
import defpackage.f5;
import defpackage.hk1;
import defpackage.hu1;
import defpackage.ik1;
import defpackage.iu1;
import defpackage.iv1;
import defpackage.ja1;
import defpackage.ju1;
import defpackage.mv1;
import defpackage.su1;
import defpackage.w4;

/* loaded from: classes.dex */
public class ActionMenuView extends ik1 implements iu1, mv1 {
    public f5 A;
    public ju1 p;
    public Context q;
    public int r;
    public boolean s;
    public b5 t;
    public iv1 u;
    public hu1 v;
    public boolean w;
    public int x;
    public final int y;
    public final int z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static e5 l(ViewGroup.LayoutParams layoutParams) {
        e5 e5Var;
        if (layoutParams != null) {
            if (layoutParams instanceof e5) {
                e5Var = new e5((e5) layoutParams);
            } else {
                e5Var = new e5(layoutParams);
            }
            if (((LinearLayout.LayoutParams) e5Var).gravity <= 0) {
                ((LinearLayout.LayoutParams) e5Var).gravity = 16;
            }
            return e5Var;
        }
        e5 e5Var2 = new e5();
        ((LinearLayout.LayoutParams) e5Var2).gravity = 16;
        return e5Var2;
    }

    @Override // defpackage.iu1
    public final boolean a(su1 su1Var) {
        return this.p.q(su1Var, null, 0);
    }

    @Override // defpackage.mv1
    public final void b(ju1 ju1Var) {
        this.p = ju1Var;
    }

    @Override // defpackage.ik1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e5;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.ik1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e5 e5Var = new e5();
        ((LinearLayout.LayoutParams) e5Var).gravity = 16;
        return e5Var;
    }

    @Override // defpackage.ik1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            ju1 ju1Var = new ju1(context);
            this.p = ju1Var;
            ju1Var.e = new ja1(this, 3);
            b5 b5Var = new b5(context);
            this.t = b5Var;
            b5Var.l = true;
            b5Var.m = true;
            iv1 iv1Var = this.u;
            if (iv1Var == null) {
                iv1Var = new d5();
            }
            b5Var.e = iv1Var;
            this.p.b(b5Var, this.q);
            b5 b5Var2 = this.t;
            b5Var2.h = this;
            this.p = b5Var2.c;
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b5 b5Var = this.t;
        a5 a5Var = b5Var.i;
        if (a5Var != null) {
            return a5Var.getDrawable();
        }
        if (b5Var.k) {
            return b5Var.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.ik1
    /* renamed from: h */
    public final hk1 generateDefaultLayoutParams() {
        e5 e5Var = new e5();
        ((LinearLayout.LayoutParams) e5Var).gravity = 16;
        return e5Var;
    }

    @Override // defpackage.ik1
    /* renamed from: i */
    public final hk1 generateLayoutParams(AttributeSet attributeSet) {
        return new e5(getContext(), attributeSet);
    }

    @Override // defpackage.ik1
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ hk1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof c5)) {
            z = false | ((c5) childAt).a();
        }
        if (i > 0 && (childAt2 instanceof c5)) {
            return z | ((c5) childAt2).b();
        }
        return z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b5 b5Var = this.t;
        if (b5Var != null) {
            b5Var.h();
            if (this.t.k()) {
                this.t.i();
                this.t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b5 b5Var = this.t;
        if (b5Var != null) {
            b5Var.i();
            w4 w4Var = b5Var.t;
            if (w4Var != null && w4Var.b()) {
                w4Var.j.dismiss();
            }
        }
    }

    @Override // defpackage.ik1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = bn3.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e5 e5Var = (e5) childAt.getLayoutParams();
                if (e5Var.f1884a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) e5Var).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) e5Var).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) e5Var).leftMargin) + ((LinearLayout.LayoutParams) e5Var).rightMargin;
                    m(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                e5 e5Var2 = (e5) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !e5Var2.f1884a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) e5Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) e5Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            e5 e5Var3 = (e5) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !e5Var3.f1884a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) e5Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) e5Var3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // defpackage.ik1, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z6;
        int i9;
        int i10;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i12;
        boolean z8;
        ju1 ju1Var;
        boolean z9 = this.w;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        if (z9 != z) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (ju1Var = this.p) != null && size != this.x) {
            this.x = size;
            ju1Var.p(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i13 = size2 - paddingRight;
            int i14 = this.y;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = (i16 / i15) + i14;
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            long j = 0;
            int i22 = 0;
            while (true) {
                i3 = this.z;
                if (i21 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i21);
                int i23 = size3;
                int i24 = i13;
                if (childAt.getVisibility() == 8) {
                    i10 = mode;
                    i11 = paddingBottom;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i25 = i19 + 1;
                    if (z11) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    e5 e5Var = (e5) childAt.getLayoutParams();
                    e5Var.f = false;
                    e5Var.c = 0;
                    e5Var.f1885b = 0;
                    e5Var.d = false;
                    ((LinearLayout.LayoutParams) e5Var).leftMargin = 0;
                    ((LinearLayout.LayoutParams) e5Var).rightMargin = 0;
                    if (z11 && ((ActionMenuItemView) childAt).l()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    e5Var.e = z6;
                    if (e5Var.f1884a) {
                        i9 = 1;
                    } else {
                        i9 = i15;
                    }
                    e5 e5Var2 = (e5) childAt.getLayoutParams();
                    i10 = mode;
                    i11 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i9 > 0 && (!z7 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z7 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (!e5Var2.f1884a && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    e5Var2.d = z8;
                    e5Var2.f1885b = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i12, 1073741824), makeMeasureSpec);
                    i20 = Math.max(i20, i12);
                    if (e5Var.d) {
                        i22++;
                    }
                    if (e5Var.f1884a) {
                        z10 = true;
                    }
                    i15 -= i12;
                    i18 = Math.max(i18, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i25;
                }
                i21++;
                size3 = i23;
                i13 = i24;
                paddingBottom = i11;
                mode = i10;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            if (z10 && i19 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i22 > 0 && i15 > 0) {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    e5 e5Var3 = (e5) getChildAt(i31).getLayoutParams();
                    boolean z13 = z12;
                    if (e5Var3.d) {
                        int i32 = e5Var3.f1885b;
                        if (i32 < i29) {
                            j2 = 1 << i31;
                            i29 = i32;
                            i30 = 1;
                        } else if (i32 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z12 = z13;
                }
                z3 = z12;
                j |= j2;
                if (i30 > i15) {
                    break;
                }
                int i33 = i29 + 1;
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    e5 e5Var4 = (e5) childAt2.getLayoutParams();
                    int i35 = i18;
                    int i36 = childMeasureSpec;
                    int i37 = childCount2;
                    long j3 = 1 << i34;
                    if ((j2 & j3) == 0) {
                        if (e5Var4.f1885b == i33) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && e5Var4.e) {
                            r4 = 1;
                            r4 = 1;
                            if (i15 == 1) {
                                childAt2.setPadding(i3 + i17, 0, i3, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        e5Var4.f1885b += r4;
                        e5Var4.f = r4;
                        i15--;
                    }
                    i34++;
                    childMeasureSpec = i36;
                    i18 = i35;
                    childCount2 = i37;
                }
                z12 = true;
            }
            z3 = z12;
            int i38 = i18;
            int i39 = childMeasureSpec;
            int i40 = childCount2;
            if (!z10 && i19 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z4 || i20 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((e5) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    int i41 = i40 - 1;
                    if ((j & (1 << i41)) != 0 && !((e5) getChildAt(i41).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i15 * i17) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z14 = z3;
                i4 = i40;
                for (int i42 = 0; i42 < i4; i42++) {
                    if ((j & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        e5 e5Var5 = (e5) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            e5Var5.c = i8;
                            e5Var5.f = true;
                            if (i42 == 0 && !e5Var5.e) {
                                ((LinearLayout.LayoutParams) e5Var5).leftMargin = (-i8) / 2;
                            }
                        } else if (e5Var5.f1884a) {
                            e5Var5.c = i8;
                            e5Var5.f = true;
                            ((LinearLayout.LayoutParams) e5Var5).rightMargin = (-i8) / 2;
                        } else {
                            if (i42 != 0) {
                                ((LinearLayout.LayoutParams) e5Var5).leftMargin = i8 / 2;
                            }
                            if (i42 != i4 - 1) {
                                ((LinearLayout.LayoutParams) e5Var5).rightMargin = i8 / 2;
                            }
                        }
                        z14 = true;
                    }
                }
                z5 = z14;
            } else {
                i4 = i40;
                z5 = z3;
            }
            if (z5) {
                int i43 = 0;
                while (i43 < i4) {
                    View childAt4 = getChildAt(i43);
                    e5 e5Var6 = (e5) childAt4.getLayoutParams();
                    if (!e5Var6.f) {
                        i7 = i39;
                    } else {
                        i7 = i39;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((e5Var6.f1885b * i17) + e5Var6.c, 1073741824), i7);
                    }
                    i43++;
                    i39 = i7;
                }
            }
            if (i26 != 1073741824) {
                i6 = i27;
                i5 = i38;
            } else {
                i5 = i28;
                i6 = i27;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            e5 e5Var7 = (e5) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) e5Var7).rightMargin = 0;
            ((LinearLayout.LayoutParams) e5Var7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(f5 f5Var) {
        this.A = f5Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b5 b5Var = this.t;
        a5 a5Var = b5Var.i;
        if (a5Var != null) {
            a5Var.setImageDrawable(drawable);
        } else {
            b5Var.k = true;
            b5Var.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(b5 b5Var) {
        this.t = b5Var;
        b5Var.h = this;
        this.p = b5Var.c;
    }

    @Override // defpackage.ik1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e5(getContext(), attributeSet);
    }
}
