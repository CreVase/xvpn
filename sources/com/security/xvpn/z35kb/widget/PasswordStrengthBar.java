package com.security.xvpn.z35kb.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.io0;
import defpackage.tf3;

/* loaded from: classes2.dex */
public final class PasswordStrengthBar extends View {
    public static final /* synthetic */ int r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f1632a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1633b;
    public final int c;
    public final int d;
    public final Integer[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public int m;
    public int n;
    public int o;
    public Paint p;
    public final ValueAnimator q;

    public PasswordStrengthBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1632a = -53971;
        this.f1633b = -22272;
        this.c = -12466926;
        this.d = -1513240;
        this.e = new Integer[]{-1513240, -53971, -22272, -12466926};
        this.f = -53971;
        this.g = -22272;
        this.h = -22272;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.m = tf3.K(7);
        this.n = tf3.K(4);
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.FILL);
        this.p = paint;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(160L);
        ofFloat.addUpdateListener(new io0(this, 8));
        this.q = ofFloat;
    }

    public final ValueAnimator getAnim() {
        return this.q;
    }

    public final int getAnimIndex() {
        return this.j;
    }

    public final int getCurrentIndex() {
        return this.k;
    }

    public final int getDividerWidth() {
        return this.m;
    }

    public final int getDrawIndex() {
        return this.i;
    }

    public final int getLevel1Color() {
        return this.f1632a;
    }

    public final int getLevel2Color() {
        return this.f1633b;
    }

    public final int getLevel3Color() {
        return this.c;
    }

    public final Integer[] getLevelColorGroup() {
        return this.e;
    }

    public final Paint getPaint() {
        return this.p;
    }

    public final int getSectionBgColor() {
        return this.d;
    }

    public final int getSectionColor() {
        return this.f;
    }

    public final int getSectionHeight() {
        return this.n;
    }

    public final float getSectionProgress() {
        return this.l;
    }

    public final int getSectionWidth() {
        return this.o;
    }

    public final int getStartColor() {
        return this.g;
    }

    public final int getTargetColor() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < 3; i++) {
            this.p.setColor(this.d);
            int i2 = this.o;
            int i3 = this.m;
            float f = i + 1.0f;
            canvas.drawRect((i3 * i * 1.0f) + (i2 * i), 0.0f, (i2 * f) + (i3 * i), this.n, this.p);
            this.p.setColor(this.f);
            if ((!tf3.Y(this) && i <= this.i) || (tf3.Y(this) && 2 - i <= this.i)) {
                int i4 = this.o;
                int i5 = this.m;
                canvas.drawRect((i5 * i * 1.0f) + (i4 * i), 0.0f, (i4 * f) + (i5 * i), this.n, this.p);
            }
            this.p.setColor(this.f);
            if (!tf3.Y(this) && i == this.j) {
                int i6 = this.o;
                int i7 = this.m;
                canvas.drawRect((i7 * i * 1.0f) + (i6 * i), 0.0f, (i7 * i) + (i6 * i) + this.l, this.n, this.p);
            } else if (tf3.Y(this) && 2 - i == this.j) {
                int i8 = this.o;
                int i9 = this.m;
                canvas.drawRect((((i9 * i) + (i8 * i)) + i8) - this.l, 0.0f, (i9 * i * 1.0f) + (i8 * i) + i8, this.n, this.p);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.n, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.o = (i - (this.m * 2)) / 3;
    }

    public final void setAnimIndex(int i) {
        this.j = i;
    }

    public final void setCurrentIndex(int i) {
        this.k = i;
    }

    public final void setDividerWidth(int i) {
        this.m = i;
    }

    public final void setDrawIndex(int i) {
        this.i = i;
    }

    public final void setPaint(Paint paint) {
        this.p = paint;
    }

    public final void setPasswordLevel(int i) {
        int i2 = i - 1;
        int i3 = this.k;
        if (i2 == i3) {
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (i2 > i3) {
            valueAnimator.setFloatValues(0.0f, 1.0f);
            this.i = i2 - 1;
        } else {
            valueAnimator.setFloatValues(1.0f, 0.0f);
            this.i = i2;
        }
        this.j = this.i + 1;
        this.g = this.f;
        this.h = this.e[i].intValue();
        this.k = i2;
        valueAnimator.start();
    }

    public final void setSectionColor(int i) {
        this.f = i;
    }

    public final void setSectionHeight(int i) {
        this.n = i;
    }

    public final void setSectionProgress(float f) {
        this.l = f;
    }

    public final void setSectionWidth(int i) {
        this.o = i;
    }

    public final void setStartColor(int i) {
        this.g = i;
    }

    public final void setTargetColor(int i) {
        this.h = i;
    }
}
