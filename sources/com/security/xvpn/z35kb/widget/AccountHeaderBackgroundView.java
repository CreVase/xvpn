package com.security.xvpn.z35kb.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.io0;
import defpackage.tf3;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class AccountHeaderBackgroundView extends View {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f1620a;

    /* renamed from: b, reason: collision with root package name */
    public float f1621b;
    public final PointF c;
    public float d;
    public PointF e;
    public ValueAnimator f;

    public AccountHeaderBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1620a = new PointF(0.0f, 0.0f);
        this.c = new PointF(0.0f, 0.0f);
        this.e = new PointF(0.0f, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(10000L);
        ofFloat.addUpdateListener(new io0(this, 5));
        this.f = ofFloat;
    }

    public final ValueAnimator getAnim() {
        return this.f;
    }

    public final PointF getCircle1Point() {
        return this.f1620a;
    }

    public final float getCircle1Radius() {
        return this.f1621b;
    }

    public final PointF getCircle2Point() {
        return this.c;
    }

    public final float getCircle2Radius() {
        return this.d;
    }

    public final PointF getRotatePoint() {
        return this.e;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float currentTimeMillis = ((float) (System.currentTimeMillis() % 360000)) / 1000.0f;
        PointF pointF = this.e;
        canvas.rotate(currentTimeMillis, pointF.x, pointF.y);
        canvas.drawColor(v73.j(1000084));
        PointF pointF2 = this.f1620a;
        canvas.drawCircle(pointF2.x, pointF2.y, this.f1621b, tf3.E(v73.j(1000085)));
        PointF pointF3 = this.c;
        canvas.drawCircle(pointF3.x, pointF3.y, this.d, tf3.E(v73.j(1000085)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = 375;
        float f3 = (31.0f * f) / f2;
        this.f1620a.set((21.0f * f) / f2, f3);
        this.c.set((437.0f * f) / f2, f3);
        this.e.set((221.0f * f) / f2, f3);
        this.f1621b = (178.0f * f) / f2;
        this.d = (f * 156.0f) / f2;
        postInvalidateOnAnimation();
    }

    public final void setAnim(ValueAnimator valueAnimator) {
        this.f = valueAnimator;
    }

    public final void setCircle1Radius(float f) {
        this.f1621b = f;
    }

    public final void setCircle2Radius(float f) {
        this.d = f;
    }

    public final void setRotatePoint(PointF pointF) {
        this.e = pointF;
    }
}
