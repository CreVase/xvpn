package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.mg2;
import defpackage.sf2;

/* loaded from: classes2.dex */
public class RatioLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f1634a;

    /* renamed from: b, reason: collision with root package name */
    public float f1635b;
    public float c;

    public RatioLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mg2;
    }

    public float getRatioHeight() {
        return this.c;
    }

    public float getRatioWidth() {
        return this.f1635b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        int i3 = this.f1634a;
        if (i3 == 0) {
            measuredHeight = getMeasuredWidth();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        float f = this.f1635b;
        float f2 = this.c;
        if (f + f2 > 0.0f) {
            float f3 = measuredHeight;
            if (i3 != 0) {
                f3 = (f3 * f) / f2;
            }
            measuredWidth = (int) f3;
            measuredHeight2 = (int) (i3 == 1 ? measuredHeight : (measuredHeight * f2) / f);
            setMeasuredDimension(measuredWidth, measuredHeight2);
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                mg2 mg2Var = (mg2) childAt.getLayoutParams();
                float f4 = measuredWidth;
                float f5 = measuredHeight2;
                float f6 = this.f1635b;
                float f7 = this.c;
                float f8 = mg2Var.f3292a;
                if (f8 > 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).width = (int) ((f8 * f4) / f6);
                }
                float f9 = mg2Var.f3293b;
                if (f9 > 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).height = (int) ((f5 * f9) / f7);
                }
                float f10 = mg2Var.c;
                if (f10 != 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).leftMargin = (int) ((f10 * f4) / f6);
                }
                float f11 = mg2Var.d;
                if (f11 != 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).topMargin = (int) ((f11 * f4) / f6);
                }
                float f12 = mg2Var.e;
                if (f12 != 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).rightMargin = (int) ((f12 * f4) / f6);
                }
                float f13 = mg2Var.f;
                if (f13 != 0.0f) {
                    ((FrameLayout.LayoutParams) mg2Var).bottomMargin = (int) ((f4 * f13) / f6);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE);
                float f14 = mg2Var.f3292a;
                if (f14 > 0.0f) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((FrameLayout.LayoutParams) mg2Var).width, 1073741824);
                }
                float f15 = mg2Var.f3293b;
                if (f15 > 0.0f) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((FrameLayout.LayoutParams) mg2Var).height, 1073741824);
                }
                if (f14 + f15 > 0.0f) {
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                }
            }
        }
    }

    public void setRatioHeight(float f) {
        this.c = f;
    }

    public void setRatioWidth(float f) {
        this.f1635b = f;
    }

    public RatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1634a = 0;
        this.f1635b = 0.0f;
        this.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.RatioLayout);
        this.f1635b = obtainStyledAttributes.getFloat(2, 0.0f);
        this.c = obtainStyledAttributes.getFloat(1, 0.0f);
        this.f1634a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        float f = this.f1635b;
        if ((f == 0.0f || this.c == 0.0f) && f + this.c > 0.0f) {
            throw new IllegalArgumentException("ViewGroup ratio witdh/ratio height can't unset,can't set zore");
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new mg2();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new mg2(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mg2(getContext(), attributeSet);
    }
}
