package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.tf3;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class BorderLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f1622a;

    /* renamed from: b, reason: collision with root package name */
    public float f1623b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public final Path h;
    public final Path i;
    public final RectF j;
    public final Paint k;

    public BorderLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        float f = tf3.F;
        float f2 = 17 * f;
        this.f1622a = f2;
        this.f1623b = f2;
        this.c = f2;
        this.d = f2;
        this.e = f2;
        this.f = 1 * f;
        this.g = 1000100;
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f);
        this.k = paint;
        Paint paint2 = new Paint(5);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a() {
        Path path = this.h;
        path.reset();
        RectF rectF = this.j;
        float f = this.f1623b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        Path path2 = this.i;
        RectF rectF2 = new RectF(rectF);
        float f5 = this.f;
        rectF2.inset(f5 / 2.0f, f5 / 2.0f);
        float f6 = this.f1623b;
        float f7 = this.c;
        float f8 = this.d;
        float f9 = this.e;
        path2.addRoundRect(rectF2, new float[]{f6, f6, f7, f7, f8, f8, f9, f9}, Path.Direction.CW);
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1622a > 0.0f) {
            canvas.clipPath(this.h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.clipPath(this.h);
        super.draw(canvas);
        Paint paint = this.k;
        paint.setColor(v73.j(this.g));
        canvas.drawPath(this.i, paint);
    }

    public final int getBorderColorId() {
        return this.g;
    }

    public final float getBorderWidth() {
        return this.f;
    }

    public final float getBottomLeftRadius() {
        return this.d;
    }

    public final float getBottomRightRadius() {
        return this.e;
    }

    public final float getCornerRadius() {
        return this.f1622a;
    }

    public final float getTopLeftRadius() {
        return this.f1623b;
    }

    public final float getTopRightRadius() {
        return this.c;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j.set(0.0f, 0.0f, i, i2);
        a();
    }

    public final void setBorderColorId(int i) {
        this.g = i;
        postInvalidateOnAnimation();
    }

    public final void setBorderWidth(float f) {
        this.f = f;
    }

    public final void setBottomLeftRadius(float f) {
        this.d = f;
        a();
    }

    public final void setBottomRightRadius(float f) {
        this.e = f;
        a();
    }

    public final void setCornerRadius(float f) {
        this.f1622a = f;
        setTopLeftRadius(f);
        setTopRightRadius(f);
        setBottomLeftRadius(f);
        setBottomRightRadius(f);
        a();
    }

    public final void setTopLeftRadius(float f) {
        this.f1623b = f;
        a();
    }

    public final void setTopRightRadius(float f) {
        this.c = f;
        a();
    }
}
