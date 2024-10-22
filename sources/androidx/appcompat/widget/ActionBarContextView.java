package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b5;
import defpackage.bn3;
import defpackage.cg2;
import defpackage.h5;
import defpackage.ie2;
import defpackage.ju1;
import defpackage.kf2;
import defpackage.ll3;
import defpackage.m4;
import defpackage.mv1;
import defpackage.p;
import defpackage.rm3;
import defpackage.uk3;
import defpackage.w4;
import defpackage.ye2;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final p f148a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f149b;
    public ActionMenuView c;
    public b5 d;
    public int e;
    public rm3 f;
    public boolean g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public View k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.ie2.actionModeStyle
            r5.<init>(r6, r7, r0)
            p r1 = new p
            r1.<init>(r5)
            r5.f148a = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            int r3 = defpackage.ie2.actionBarPopupTheme
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L2c
            int r2 = r1.resourceId
            if (r2 == 0) goto L2c
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.f149b = r2
            goto L2e
        L2c:
            r5.f149b = r6
        L2e:
            int[] r1 = defpackage.cg2.ActionMode
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            int r0 = defpackage.cg2.ActionMode_background
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L48
            int r1 = r7.getResourceId(r0, r2)
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = defpackage.ew3.P0(r6, r1)
            goto L4c
        L48:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r0)
        L4c:
            java.util.WeakHashMap r0 = defpackage.ll3.f3151a
            defpackage.uk3.q(r5, r6)
            int r6 = defpackage.cg2.ActionMode_titleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.q = r6
            int r6 = defpackage.cg2.ActionMode_subtitleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.r = r6
            int r6 = defpackage.cg2.ActionMode_height
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.e = r6
            int r6 = defpackage.cg2.ActionMode_closeItemLayout
            int r0 = defpackage.kf2.abc_action_mode_close_item_material
            int r6 = r7.getResourceId(r6, r0)
            r5.t = r6
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int j(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(h5 h5Var) {
        View view = this.k;
        int i = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
            this.k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        View findViewById = this.k.findViewById(ye2.action_mode_close_button);
        this.l = findViewById;
        findViewById.setOnClickListener(new m4(this, h5Var, i));
        ju1 d = h5Var.d();
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.i();
            w4 w4Var = b5Var.t;
            if (w4Var != null && w4Var.b()) {
                w4Var.j.dismiss();
            }
        }
        b5 b5Var2 = new b5(getContext());
        this.d = b5Var2;
        b5Var2.l = true;
        b5Var2.m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d.b(this.d, this.f149b);
        b5 b5Var3 = this.d;
        mv1 mv1Var = b5Var3.h;
        if (mv1Var == null) {
            mv1 mv1Var2 = (mv1) b5Var3.d.inflate(b5Var3.f, (ViewGroup) this, false);
            b5Var3.h = mv1Var2;
            mv1Var2.b(b5Var3.c);
            b5Var3.h();
        }
        mv1 mv1Var3 = b5Var3.h;
        if (mv1Var != mv1Var3) {
            ((ActionMenuView) mv1Var3).setPresenter(b5Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) mv1Var3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.q(actionMenuView, null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        int i;
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(kf2.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(ye2.action_bar_title);
            this.p = (TextView) this.n.findViewById(ye2.action_bar_subtitle);
            int i2 = this.q;
            if (i2 != 0) {
                this.o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.r;
            if (i3 != 0) {
                this.p.setTextAppearance(getContext(), i3);
            }
        }
        this.o.setText(this.i);
        this.p.setText(this.j);
        boolean z = !TextUtils.isEmpty(this.i);
        boolean z2 = !TextUtils.isEmpty(this.j);
        TextView textView = this.p;
        int i4 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.n;
        if (!z && !z2) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public final void e() {
        removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, cg2.ActionBar, ie2.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(cg2.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        b5 b5Var = this.d;
        if (b5Var != null) {
            Configuration configuration2 = b5Var.f401b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            b5Var.p = i;
            ju1 ju1Var = b5Var.c;
            if (ju1Var != null) {
                ju1Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.f148a.f3757b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            rm3 rm3Var = this.f;
            if (rm3Var != null) {
                rm3Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final rm3 l(int i, long j) {
        rm3 rm3Var = this.f;
        if (rm3Var != null) {
            rm3Var.b();
        }
        p pVar = this.f148a;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            rm3 a2 = ll3.a(this);
            a2.a(1.0f);
            a2.c(j);
            pVar.c.f = a2;
            pVar.f3757b = i;
            a2.d(pVar);
            return a2;
        }
        rm3 a3 = ll3.a(this);
        a3.a(0.0f);
        a3.c(j);
        pVar.c.f = a3;
        pVar.f3757b = i;
        a3.d(pVar);
        return a3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.i();
            w4 w4Var = this.d.t;
            if (w4Var != null && w4Var.b()) {
                w4Var.j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a2 = bn3.a(this);
        if (a2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            if (a2) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (a2) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            if (a2) {
                i7 = paddingLeft - i5;
            } else {
                i7 = paddingLeft + i5;
            }
            int j = j(this.k, i7, paddingTop, paddingTop2, a2) + i7;
            if (a2) {
                i8 = j - i6;
            } else {
                i8 = j + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null && linearLayout.getVisibility() != 8) {
            paddingLeft += j(this.n, paddingLeft, paddingTop, paddingTop2, a2);
        }
        View view2 = this.m;
        if (view2 != null) {
            j(view2, paddingLeft, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            j(actionMenuView, paddingRight, paddingTop, paddingTop2, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.e;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.k;
                if (view != null) {
                    int f = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                    paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.n;
                if (linearLayout != null && this.m == null) {
                    if (this.s) {
                        this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.n;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.e <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null && (linearLayout = this.n) != null) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        ll3.q(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
