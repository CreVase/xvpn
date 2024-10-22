package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import defpackage.cp3;
import defpackage.h10;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f1564a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1565b;
    public final ArrayList c;
    public final int d;
    public final float e;
    public final Paint f;
    public final RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;
    public int m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.he2.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.f1564a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.c = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.g = r2
            r2 = 1
            r5.m = r2
            int[] r3 = defpackage.bg2.ClockHandView
            int r4 = defpackage.qf2.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = defpackage.he2.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            defpackage.zf3.c0(r6, r0, r3)
            int r0 = defpackage.he2.motionEasingEmphasizedInterpolator
            uv0 r3 = defpackage.pb.f3812b
            defpackage.zf3.d0(r6, r0, r3)
            int r0 = defpackage.bg2.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.l = r0
            int r0 = defpackage.bg2.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.d = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = defpackage.re2.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.h = r4
            int r4 = defpackage.re2.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.e = r0
            int r0 = defpackage.bg2.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.b(r0)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledTouchSlop()
            java.util.WeakHashMap r6 = defpackage.ll3.f3151a
            r6 = 2
            defpackage.uk3.s(r5, r6)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(int i) {
        if (i == 2) {
            return Math.round(this.l * 0.66f);
        }
        return this.l;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.f1564a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.i = f2;
        this.k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a2 = a(this.m);
        float cos = (((float) Math.cos(this.k)) * a2) + width;
        float sin = (a2 * ((float) Math.sin(this.k))) + height;
        float f3 = this.d;
        this.g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((h10) it.next());
            if (Math.abs(clockFaceView.G - f2) > 0.001f) {
                clockFaceView.G = f2;
                clockFaceView.z();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float a2 = a(this.m);
        float cos = (((float) Math.cos(this.k)) * a2) + f;
        float f2 = height;
        float sin = (a2 * ((float) Math.sin(this.k))) + f2;
        Paint paint = this.f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.d, paint);
        double sin2 = Math.sin(this.k);
        paint.setStrokeWidth(this.h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f, f2, this.e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f1564a.isRunning()) {
            b(this.i);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z = false;
            } else {
                z = this.j;
                if (this.f1565b) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= a(2) + cp3.s(getContext(), 12)) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.m = i;
                }
            }
            z2 = false;
        } else {
            this.j = false;
            z = false;
            z2 = true;
        }
        boolean z5 = this.j;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.i != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3) {
            if (z3 || z) {
                b(f);
            }
            this.j = z5 | z4;
            return true;
        }
        z4 = true;
        this.j = z5 | z4;
        return true;
    }
}
