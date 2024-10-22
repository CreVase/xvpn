package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import defpackage.az1;
import defpackage.f70;
import defpackage.sf2;
import defpackage.ut0;
import defpackage.v73;
import defpackage.zy1;

/* loaded from: classes2.dex */
public class NavigationBarContentConstraintLayout extends ConstraintLayout {
    public az1 A;
    public boolean B;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final int u;
    public int v;
    public int w;
    public Paint x;
    public Paint y;
    public Paint z;

    public NavigationBarContentConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.B = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.NavigationBarContentConstraintLayout, 0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        this.v = obtainStyledAttributes.getColor(3, color);
        this.w = obtainStyledAttributes.getColor(2, color);
        this.u = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(5);
        this.x = paint;
        paint.setStyle(Paint.Style.FILL);
        this.x.setColor(this.v);
        Paint paint2 = new Paint(5);
        this.z = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.z.setColor(-1);
        Paint paint3 = new Paint(5);
        this.y = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.y.setColor(this.w);
        getResources().getColor(R.color.global_window_background);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: b */
    public final f70 generateDefaultLayoutParams() {
        return new zy1();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zy1;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.B && this.w != 0) {
            canvas.drawRect(this.s, this.y);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    /* renamed from: e */
    public final f70 generateLayoutParams(AttributeSet attributeSet) {
        return new zy1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zy1();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z;
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        Rect rect = this.q;
        rect.set(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
        int i = rect.top;
        int i2 = rect.bottom;
        this.r.set(0, 0, getWidth(), i);
        this.t.set(0, i, getWidth(), getHeight() - i2);
        this.s.set(0, getHeight() - i2, getWidth(), getHeight());
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i3);
            zy1 zy1Var = (zy1) childAt.getLayoutParams();
            int i4 = zy1Var.q0;
            if ((i4 & 1) == 1) {
                ((ViewGroup.MarginLayoutParams) zy1Var).topMargin = zy1Var.t0 + i;
                z = true;
            } else {
                z = false;
            }
            if ((i4 & 2) == 2) {
                ((ViewGroup.MarginLayoutParams) zy1Var).bottomMargin = zy1Var.u0 + i2;
                z = true;
            }
            if ((i4 & 4) == 4) {
                childAt.setPadding(childAt.getPaddingLeft(), zy1Var.r0 + i, childAt.getPaddingRight(), childAt.getPaddingBottom());
                z = true;
            }
            if ((zy1Var.q0 & 8) == 8) {
                childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), zy1Var.s0 + i2);
            } else {
                z2 = z;
            }
            if (z2) {
                childAt.setLayoutParams(zy1Var);
            }
            i3++;
        }
        int i5 = this.u;
        if ((i5 & 4) == 4) {
            setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
        }
        if ((i5 & 8) == 8) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
        }
        setWillNotDraw(!this.B);
        postInvalidateOnAnimation();
        az1 az1Var = this.A;
        if (az1Var != null) {
            ((ServerChooseActivity) ((ut0) az1Var).f4734b).s = rect;
        }
        requestLayout();
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        int color = getResources().getColor(R.color.colorBlack);
        boolean z = false;
        if ((getWindowSystemUiVisibility() & 8192) == 0) {
            if (this.v != -1 && !v73.l()) {
                this.v = color;
            } else {
                this.v = 0;
            }
            this.x.setColor(this.v);
        }
        if ((getWindowSystemUiVisibility() & 16) == 0) {
            if (this.w != -1 && !v73.l()) {
                this.w = color;
            } else {
                this.w = 0;
            }
            this.y.setColor(this.w);
        }
        if (((View) getParent()).getId() == 16908290) {
            z = true;
        }
        this.B = z;
        setWillNotDraw(!z);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.q;
        int i5 = rect.top;
        int i6 = rect.bottom;
        this.r.set(0, 0, getWidth(), i5);
        this.t.set(0, i5, getWidth(), getHeight() - i6);
        this.s.set(0, getHeight() - i6, getWidth(), getHeight());
    }

    public void setOnApplyWindowInsetsListener(az1 az1Var) {
        this.A = az1Var;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zy1(layoutParams);
    }
}
