package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.hz0;
import defpackage.jn3;
import defpackage.r70;
import defpackage.vf2;

/* loaded from: classes.dex */
public class Flow extends jn3 {
    public hz0 j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.jn3, defpackage.d70
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.j = new hz0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vf2.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == vf2.ConstraintLayout_Layout_android_orientation) {
                    this.j.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_android_padding) {
                    hz0 hz0Var = this.j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hz0Var.s0 = dimensionPixelSize;
                    hz0Var.t0 = dimensionPixelSize;
                    hz0Var.u0 = dimensionPixelSize;
                    hz0Var.v0 = dimensionPixelSize;
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingStart) {
                    hz0 hz0Var2 = this.j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hz0Var2.u0 = dimensionPixelSize2;
                    hz0Var2.w0 = dimensionPixelSize2;
                    hz0Var2.x0 = dimensionPixelSize2;
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingEnd) {
                    this.j.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingLeft) {
                    this.j.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingTop) {
                    this.j.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingRight) {
                    this.j.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_android_paddingBottom) {
                    this.j.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_wrapMode) {
                    this.j.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.j.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.j.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.j.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.j.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.j.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.j.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.j.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.j.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.j.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.j.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.j.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_verticalBias) {
                    this.j.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == vf2.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.j.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == vf2.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.j.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == vf2.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.j.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_verticalGap) {
                    this.j.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == vf2.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.j.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.j;
        k();
    }

    @Override // defpackage.d70
    public final void i(r70 r70Var, boolean z) {
        hz0 hz0Var = this.j;
        int i = hz0Var.u0;
        if (i > 0 || hz0Var.v0 > 0) {
            if (z) {
                hz0Var.w0 = hz0Var.v0;
                hz0Var.x0 = i;
            } else {
                hz0Var.w0 = i;
                hz0Var.x0 = hz0Var.v0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x084f  */
    @Override // defpackage.jn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.hz0 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 2197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.l(hz0, int, int):void");
    }

    @Override // defpackage.d70, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.j.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.j.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.j.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.j.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.j.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.j.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.j.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.j.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.j.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.j.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.j.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.j.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.j.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.j.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        hz0 hz0Var = this.j;
        hz0Var.s0 = i;
        hz0Var.t0 = i;
        hz0Var.u0 = i;
        hz0Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.j.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.j.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.j.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.j.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.j.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.j.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.j.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.j.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.j.T0 = i;
        requestLayout();
    }
}
