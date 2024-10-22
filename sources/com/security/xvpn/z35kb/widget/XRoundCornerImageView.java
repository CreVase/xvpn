package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.sf2;

/* loaded from: classes2.dex */
public class XRoundCornerImageView extends AppCompatImageView {
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public XRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sf2.XRoundCornerImageView, 0, 0);
        try {
            this.d = obtainStyledAttributes.getDimensionPixelSize(2, 4);
            this.e = obtainStyledAttributes.getBoolean(3, false);
            this.f = obtainStyledAttributes.getBoolean(4, false);
            this.g = obtainStyledAttributes.getBoolean(0, false);
            this.h = obtainStyledAttributes.getBoolean(1, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        float f8 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float[] fArr = new float[8];
        boolean z = this.e;
        if (!z && !this.f && !this.g && !this.h) {
            float f9 = this.d;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        } else {
            if (z) {
                f = this.d;
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = this.d;
            } else {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            boolean z2 = this.f;
            if (z2) {
                f3 = this.d;
            } else {
                f3 = 0.0f;
            }
            fArr[2] = f3;
            if (z2) {
                f4 = this.d;
            } else {
                f4 = 0.0f;
            }
            fArr[3] = f4;
            boolean z3 = this.h;
            if (z3) {
                f5 = this.d;
            } else {
                f5 = 0.0f;
            }
            fArr[4] = f5;
            if (z3) {
                f6 = this.d;
            } else {
                f6 = 0.0f;
            }
            fArr[5] = f6;
            boolean z4 = this.g;
            if (z4) {
                f7 = this.d;
            } else {
                f7 = 0.0f;
            }
            fArr[6] = f7;
            if (z4) {
                f8 = this.d;
            }
            fArr[7] = f8;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        try {
            try {
                canvas.clipPath(path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            super.onDraw(canvas);
        }
    }

    public void setRadiusAndRedraw(float f) {
        this.d = f;
        invalidate();
    }
}
