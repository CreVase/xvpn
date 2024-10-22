package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.sf2;

/* loaded from: classes2.dex */
public final class ShapeTextView extends AppCompatTextView {
    public float h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;

    public ShapeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable = new GradientDrawable();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.ShapeView);
        this.h = obtainStyledAttributes.getDimension(3, 0.0f);
        this.i = obtainStyledAttributes.getColor(9, 0);
        this.j = obtainStyledAttributes.getColor(7, 0);
        this.k = (int) obtainStyledAttributes.getDimension(10, 0.0f);
        this.l = obtainStyledAttributes.getDimension(5, 0.0f);
        this.m = obtainStyledAttributes.getDimension(4, 0.0f);
        this.n = obtainStyledAttributes.getDimension(11, 0.0f);
        this.o = obtainStyledAttributes.getDimension(12, 0.0f);
        this.p = obtainStyledAttributes.getDimension(1, 0.0f);
        this.q = obtainStyledAttributes.getDimension(2, 0.0f);
        this.r = obtainStyledAttributes.getColor(8, 0);
        this.s = obtainStyledAttributes.getColor(6, 0);
        this.t = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        float f = this.h;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.n;
            float f3 = this.o;
            float f4 = this.q;
            float f5 = this.p;
            gradientDrawable.setCornerRadii(new float[]{f2, f2, f3, f3, f4, f4, f5, f5});
        } else {
            gradientDrawable.setCornerRadius(f);
        }
        gradientDrawable.setStroke(this.k, this.i, this.l, this.m);
        int i = this.j;
        if (i != 0) {
            gradientDrawable.setColor(i);
        }
        if (this.r != 0 && this.s != 0) {
            int i2 = ((this.t % 360) + 360) % 360;
            if (i2 != 0) {
                if (i2 != 45) {
                    if (i2 != 90) {
                        if (i2 != 135) {
                            if (i2 != 180) {
                                if (i2 != 225) {
                                    if (i2 != 270) {
                                        if (i2 != 315) {
                                            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                        } else {
                                            orientation = GradientDrawable.Orientation.TL_BR;
                                        }
                                    } else {
                                        orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                    }
                                } else {
                                    orientation = GradientDrawable.Orientation.TR_BL;
                                }
                            } else {
                                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                            }
                        } else {
                            orientation = GradientDrawable.Orientation.BR_TL;
                        }
                    } else {
                        orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    }
                } else {
                    orientation = GradientDrawable.Orientation.BL_TR;
                }
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setColors(new int[]{this.r, this.s});
        }
        setBackground(gradientDrawable);
    }

    public final int getShapeAngle() {
        return this.t;
    }

    public final float getShapeBottomLeftRadius() {
        return this.p;
    }

    public final float getShapeBottomRightRadius() {
        return this.q;
    }

    public final float getShapeCornerRadius() {
        return this.h;
    }

    public final float getShapeDashGap() {
        return this.m;
    }

    public final float getShapeDashWidth() {
        return this.l;
    }

    public final int getShapeEndColor() {
        return this.s;
    }

    public final int getShapeSolidColor() {
        return this.j;
    }

    public final int getShapeStartColor() {
        return this.r;
    }

    public final int getShapeStrokeColor() {
        return this.i;
    }

    public final int getShapeStrokeWidth() {
        return this.k;
    }

    public final float getShapeTopLeftRadius() {
        return this.n;
    }

    public final float getShapeTopRightRadius() {
        return this.o;
    }

    public final void setShapeAngle(int i) {
        this.t = i;
    }

    public final void setShapeBottomLeftRadius(float f) {
        this.p = f;
    }

    public final void setShapeBottomRightRadius(float f) {
        this.q = f;
    }

    public final void setShapeCornerRadius(float f) {
        this.h = f;
    }

    public final void setShapeDashGap(float f) {
        this.m = f;
    }

    public final void setShapeDashWidth(float f) {
        this.l = f;
    }

    public final void setShapeEndColor(int i) {
        this.s = i;
    }

    public final void setShapeSolidColor(int i) {
        this.j = i;
    }

    public final void setShapeStartColor(int i) {
        this.r = i;
    }

    public final void setShapeStrokeColor(int i) {
        this.i = i;
    }

    public final void setShapeStrokeWidth(int i) {
        this.k = i;
    }

    public final void setShapeTopLeftRadius(float f) {
        this.n = f;
    }

    public final void setShapeTopRightRadius(float f) {
        this.o = f;
    }
}
