package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class zy1 extends f70 {
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final int u0;

    public zy1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q0 = 0;
        this.s0 = 0;
        this.u0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.layout_margin, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, sf2.NavigationBarContentConstraintLayout_Layout[0]});
        this.q0 = obtainStyledAttributes.getInt(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s0 = dimensionPixelSize;
        this.r0 = dimensionPixelSize;
        obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.r0 = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.s0 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.u0 = dimensionPixelSize2;
        this.t0 = dimensionPixelSize2;
        obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize2);
        this.t0 = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize2);
        obtainStyledAttributes.getDimensionPixelSize(8, dimensionPixelSize2);
        this.u0 = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize2);
        obtainStyledAttributes.recycle();
    }

    public zy1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.q0 = 0;
        this.s0 = 0;
        this.u0 = 0;
    }

    public zy1() {
        super(-2, -2);
        this.q0 = 0;
        this.s0 = 0;
        this.u0 = 0;
    }
}
