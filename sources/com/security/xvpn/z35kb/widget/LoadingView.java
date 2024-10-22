package com.security.xvpn.z35kb.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import defpackage.hx2;
import defpackage.io0;

/* loaded from: classes2.dex */
public final class LoadingView extends View {
    public static final /* synthetic */ int p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f1630a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1631b;
    public final long c;
    public final long d;
    public final DecelerateInterpolator e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public long j;
    public final RectF k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final ValueAnimator o;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1630a = 32000L;
        this.f1631b = 400L;
        this.c = 800L;
        this.d = 2400L;
        this.e = new DecelerateInterpolator();
        this.f = 103.333336f;
        this.g = 206.66667f;
        this.k = new RectF();
        Paint paint = new Paint(5);
        this.l = paint;
        Paint paint2 = new Paint(5);
        this.m = paint2;
        Paint paint3 = new Paint(5);
        this.n = paint3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o = ofFloat;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1241687145);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-14582);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-11219233);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        ofFloat.addUpdateListener(new io0(this, 7));
        ofFloat.setDuration(10000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.o;
        if (!valueAnimator.isRunning()) {
            this.j = System.currentTimeMillis();
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float interpolation;
        float interpolation2;
        super.onDraw(canvas);
        long currentTimeMillis = System.currentTimeMillis() - this.j;
        long j = this.d;
        long j2 = currentTimeMillis % j;
        long j3 = this.c;
        long j4 = this.f1631b;
        long j5 = j3 + j4;
        long j6 = j5 + j4;
        DecelerateInterpolator decelerateInterpolator = this.e;
        if (j2 < j4) {
            interpolation = 0.0f;
        } else if (j2 > j5) {
            interpolation = 1.0f;
        } else {
            interpolation = decelerateInterpolator.getInterpolation(((float) (j2 - j4)) / ((float) j3));
        }
        if (j2 < j6) {
            interpolation2 = 0.0f;
        } else if (j2 > j3 + j6) {
            interpolation2 = 1.0f;
        } else {
            interpolation2 = decelerateInterpolator.getInterpolation(((float) (j2 - j6)) / ((float) j3));
        }
        float f = ((((float) j2) / ((float) j)) * 450.0f) + (interpolation2 * 270.0f);
        long j7 = this.f1630a;
        float f2 = (((((float) ((currentTimeMillis % j7) / j7)) * 360.0f) + f) % 360.0f) + 90;
        this.h = f2;
        float f3 = hx2.f(1.0f, interpolation2, interpolation * 270.0f, 25.0f);
        this.i = f3;
        RectF rectF = this.k;
        canvas.drawArc(rectF, f2, f3, false, this.l);
        float f4 = 3;
        float min = Math.min(this.f, Math.max((this.i * 2.0f) / f4, 25.0f));
        float min2 = Math.min(this.g, (((this.i - min) * 2.0f) / f4) + min);
        canvas.drawArc(rectF, Math.max(this.i - min2, 0.0f) + this.h, min2, false, this.m);
        canvas.drawArc(rectF, Math.max(this.i - min, 0.0f) + this.h, min, false, this.n);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.k;
        float f = i;
        float f2 = i2;
        rectF.set(0.0f, 0.0f, f, f2);
        rectF.inset(f * 0.15f, f2 * 0.15f);
        this.l.setStrokeWidth(rectF.width() / 25.0f);
        this.m.setStrokeWidth(rectF.width() / 15.0f);
        this.n.setStrokeWidth(rectF.width() / 11.0f);
    }
}
