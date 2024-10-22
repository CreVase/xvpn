package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.sf2;

/* loaded from: classes2.dex */
public class RectProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1637b;
    public int c;
    public final int d;
    public final float e;
    public Paint f;
    public RectF g;

    public RectProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1636a = -256;
        this.f1637b = 0;
        this.c = 0;
        this.d = 100;
        this.e = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.RectProgressBar);
        this.f1637b = obtainStyledAttributes.getColor(3, 0);
        this.f1636a = obtainStyledAttributes.getColor(4, -11153696);
        this.c = obtainStyledAttributes.getInteger(2, 0);
        this.d = obtainStyledAttributes.getInteger(1, 100);
        this.e = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        this.g = new RectF();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.f.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.g.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f.setColor(this.f1637b);
        RectF rectF = this.g;
        Paint paint = this.f;
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, paint);
        this.g.right = ((getWidth() * 1.0f) * this.c) / this.d;
        this.f.setColor(this.f1636a);
        canvas.drawRoundRect(this.g, f, f, this.f);
    }

    public void setProgress(int i) {
        this.c = i;
        invalidate();
    }
}
