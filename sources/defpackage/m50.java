package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m50 extends View {
    public float A;
    public final float B;
    public final float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public final Paint M;
    public final ValueAnimator N;
    public final tj3 O;
    public AnimatorSet P;
    public final AnimatorSet Q;
    public float R;

    /* renamed from: a, reason: collision with root package name */
    public final long f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3234b;
    public final long c;
    public final long d;
    public final DecelerateInterpolator e;
    public final int f;
    public final int g;
    public final int h;
    public float h0;
    public final int i;
    public final ColorStateList i0;
    public final int j;
    public final ColorStateList j0;
    public final int k;
    public final int k0;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public final RectF p;
    public final RectF q;
    public final RectF r;
    public final RectF s;
    public final RectF t;
    public final RectF u;
    public float v;
    public float w;
    public final float x;
    public final float y;
    public float z;

    public m50(Context context) {
        super(context, null, 0);
        this.f3233a = 32000L;
        this.f3234b = 400L;
        this.c = 800L;
        this.d = 2400L;
        this.e = new DecelerateInterpolator();
        this.f = 65281;
        this.g = 65282;
        this.h = 65283;
        this.i = 65284;
        this.j = 65285;
        this.k = 65286;
        this.n = 65286;
        this.o = 65286;
        RectF rectF = new RectF();
        this.p = rectF;
        RectF rectF2 = new RectF();
        this.q = rectF2;
        RectF rectF3 = new RectF();
        this.r = rectF3;
        RectF rectF4 = new RectF();
        this.s = rectF4;
        RectF rectF5 = new RectF();
        this.t = rectF5;
        this.u = new RectF();
        this.F = 1.0f;
        Paint paint = new Paint(5);
        this.J = paint;
        this.K = new Paint(5);
        Paint paint2 = new Paint(5);
        this.L = paint2;
        Paint paint3 = new Paint(5);
        this.M = paint3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.N = ofFloat;
        this.P = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        setFocusable(true);
        float f = 71 * tf3.F;
        float f2 = -f;
        rectF4.set(f2, f2, f, f);
        float f3 = 66 * tf3.F;
        float f4 = -f3;
        rectF.set(f4, f4, f3, f3);
        float f5 = 62 * tf3.F;
        float f6 = -f5;
        rectF5.set(f6, f6, f5, f5);
        rectF2.set(rectF);
        rectF3.set(rectF);
        float f7 = 6 * tf3.F;
        rectF3.inset(f7, f7);
        paint.setColor(-13841976);
        paint.setStrokeWidth(9 * tf3.F);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-13841976);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setColor(-13841976);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(3 * tf3.F);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new l50(this, 2));
        float f8 = tf3.F;
        this.x = 17 * f8;
        this.y = 15 * f8;
        this.B = 4 * f8;
        this.C = f8 * 3.2f;
        tj3 a2 = tj3.a(getResources(), R.drawable.tv_ic_connect_toggle, context.getTheme());
        this.O = a2;
        if (a2 != null) {
            a2.setBounds(new Rect(0, 0, tf3.K(31), tf3.K(32)));
        }
        float f9 = 110;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "firstRingRadius", 0.0f, tf3.F * f9);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(3000L);
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "secondRingRadius", 0.0f, f9 * tf3.F);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setDuration(3000L);
        ofFloat3.setStartDelay(600L);
        ofFloat3.addUpdateListener(new l50(this, 3));
        ofFloat3.setRepeatCount(-1);
        animatorSet.playTogether(ofFloat2, ofFloat3);
        this.i0 = ColorStateList.valueOf(-13841976);
        this.j0 = ColorStateList.valueOf(-6710887);
        this.k0 = tf3.K(39);
    }

    private final ValueAnimator[] getCenterDisConnAnimator() {
        float f;
        float f2 = 1.0f;
        if (this.n == 65283) {
            f = 1.0f;
            f2 = 0.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "largePointRadius", this.D, 0.0f).setDuration(100L);
        duration.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "littlePointRadius", this.D, 0.0f).setDuration(100L);
        duration2.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "powerDarkScale", this.F, f2).setDuration(100L);
        duration3.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, "powerLightScale", this.G, f).setDuration(100L);
        duration4.setInterpolator(new LinearInterpolator());
        return new ValueAnimator[]{duration, duration2, duration3, duration4};
    }

    private final void setFirstRingRadius(float f) {
        this.R = f;
    }

    private final void setLargePointDistance(float f) {
        this.z = f;
    }

    private final void setLargePointRadius(float f) {
        this.D = f;
    }

    private final void setLittlePointDistance(float f) {
        this.A = f;
        postInvalidateOnAnimation();
    }

    private final void setLittlePointRadius(float f) {
        this.E = f;
    }

    private final void setPowerDarkScale(float f) {
        this.F = f;
        postInvalidateOnAnimation();
    }

    private final void setPowerLightScale(float f) {
        this.G = f;
        postInvalidateOnAnimation();
    }

    private final void setSecondRingRadius(float f) {
        this.h0 = f;
    }

    public final void a() {
        boolean isFocused = isFocused();
        AnimatorSet animatorSet = this.Q;
        if (isFocused) {
            if (!isPressed()) {
                animate().scaleX(1.1f).scaleY(1.1f).start();
            } else {
                animate().scaleX(1.0f).scaleY(1.0f).start();
            }
            animatorSet.start();
            return;
        }
        animatorSet.cancel();
        animate().scaleX(1.0f).scaleY(1.0f).start();
    }

    public final int getAlphaCalc() {
        return this.k0;
    }

    public final ColorStateList getPowerOffIconTintColor() {
        return this.j0;
    }

    public final ColorStateList getPowerOnIconTintColor() {
        return this.i0;
    }

    public final int getSTATE_CONNECTED() {
        return this.g;
    }

    public final int getSTATE_CONNECTING() {
        return this.f;
    }

    public final int getSTATE_DISCONNECTED() {
        return this.k;
    }

    public final int getSTATE_DISCONNECTING() {
        return this.j;
    }

    public final int getSTATE_RECONNECTED() {
        return this.i;
    }

    public final int getSTATE_RECONNECTING() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        float interpolation;
        float interpolation2;
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        boolean isFocused = isFocused();
        RectF rectF = this.s;
        if (isFocused) {
            Paint paint = this.M;
            float f = 255;
            float f2 = (this.R - rectF.right) * f;
            float f3 = this.k0;
            paint.setAlpha(255 - ((int) (f2 / f3)));
            canvas.drawCircle(0.0f, 0.0f, this.R, paint);
            paint.setAlpha(255 - ((int) (((this.h0 - rectF.right) * f) / f3)));
            canvas.drawCircle(0.0f, 0.0f, this.h0, paint);
        }
        canvas.drawOval(rectF, tf3.E(-14474461));
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        if (this.m) {
            long j = this.d;
            long j2 = currentTimeMillis % j;
            long j3 = this.c;
            long j4 = this.f3234b;
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
            float f4 = (((float) j2) / ((float) j)) * 450.0f;
            long j7 = this.f3233a;
            this.v = ((((((float) (currentTimeMillis % j7)) / ((float) j7)) * 360.0f) + (f4 + (interpolation2 * 270.0f))) % 360.0f) + 90;
            this.w = hx2.f(1.0f, interpolation2, interpolation * 270.0f, 40.0f);
        }
        canvas.drawArc(this.p, this.v, this.w, false, this.J);
        canvas.drawOval(this.t, this.K);
        tj3 tj3Var = this.O;
        if (tj3Var != null) {
            float f5 = this.F;
            int save = canvas.save();
            canvas.scale(f5, f5, 0.0f, 0.0f);
            try {
                canvas.save();
                canvas.translate(-tj3Var.getBounds().exactCenterX(), -tj3Var.getBounds().exactCenterY());
                tj3Var.setTintList(this.j0);
                tj3Var.draw(canvas);
                canvas.restore();
                canvas.restoreToCount(save);
                float f6 = this.G;
                save = canvas.save();
                canvas.scale(f6, f6, 0.0f, 0.0f);
                try {
                    canvas.save();
                    canvas.translate(-tj3Var.getBounds().exactCenterX(), -tj3Var.getBounds().exactCenterY());
                    tj3Var.setTintList(this.i0);
                    tj3Var.draw(canvas);
                    canvas.restore();
                } finally {
                }
            } finally {
            }
        }
        boolean z3 = true;
        if (this.D == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.E == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        if (this.z != this.x) {
            z3 = false;
        }
        if (!z3) {
            canvas.save();
            for (int i = 0; i < 7; i++) {
                double d = ((i * 2) * 3.141592653589793d) / 7;
                double d2 = 0.0f + d;
                float sin = ((float) Math.sin(d2)) * this.z;
                float cos = ((float) Math.cos(d2)) * this.z;
                float f7 = this.D;
                Paint paint2 = this.L;
                canvas.drawCircle(sin, cos, f7, paint2);
                double d3 = d + 0.72f;
                canvas.drawCircle(((float) Math.sin(d3)) * this.A, ((float) Math.cos(d3)) * this.A, this.E, paint2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.K.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, -12040120, -14606047, Shader.TileMode.CLAMP));
        float f2 = i;
        float f3 = 172;
        float f4 = (16.0f * f2) / f3;
        this.u.set(f4, f4, f2 - f4, f - f4);
        float f5 = (f2 * 7.88f) / f3;
        this.H = f5;
        this.I = f5 / 2.0f;
    }

    public final void setConnectState(int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3 = this.n;
        int i4 = this.f;
        if (i3 == i && i != i4) {
            return;
        }
        this.o = i3;
        this.n = i;
        setLargePointRadius(0.0f);
        setLittlePointRadius(0.0f);
        int i5 = this.h;
        if (i == i4 || i == i5) {
            z = true;
        } else {
            z = false;
        }
        ValueAnimator valueAnimator = this.N;
        if (z) {
            this.P.cancel();
            this.P = new AnimatorSet();
            this.l = System.currentTimeMillis();
            valueAnimator.start();
            this.m = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new l50(this, 0));
            AnimatorSet animatorSet = this.P;
            uo uoVar = new uo((hx2) null);
            ((ArrayList) uoVar.f4707a).add(ofFloat);
            uoVar.d(getCenterDisConnAnimator());
            animatorSet.playTogether((Animator[]) ((ArrayList) uoVar.f4707a).toArray(new Animator[((ArrayList) uoVar.f4707a).size()]));
            this.P.start();
            return;
        }
        RectF rectF = this.q;
        RectF rectF2 = this.p;
        if (i == this.g) {
            valueAnimator.cancel();
            this.m = false;
            this.P.cancel();
            this.P = new AnimatorSet();
            int i6 = this.o;
            if (i6 != i5 && i6 != i4) {
                setPowerDarkScale(0.0f);
                setPowerLightScale(1.0f);
                rectF2.set(rectF);
                this.w = 360.0f;
                postInvalidateOnAnimation();
                return;
            }
            float f = this.v;
            int i7 = 90;
            if (f > 90) {
                i7 = 450;
            }
            float f2 = i7;
            long j = ((((f2 - f) + 360) - this.w) / 360.0f) * 500;
            if (j > 500) {
                j = 500;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, f2);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setDuration(j);
            ofFloat2.addUpdateListener(new l50(this, 4));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.w, 360.0f);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setDuration(j);
            ofFloat3.addUpdateListener(new l50(this, 5));
            float f3 = this.x;
            float f4 = this.y + f3;
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "largePointDistance", f3, f4).setDuration(400L);
            long j2 = 300 + j;
            duration.setStartDelay(j2);
            duration.setInterpolator(new ul3(1));
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "littlePointDistance", f3, f4).setDuration(400L);
            long j3 = 330 + j;
            duration2.setStartDelay(j3);
            duration2.setInterpolator(new ul3(1));
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "largePointRadius", this.B, 0.0f).setDuration(400L);
            duration3.setInterpolator(new ul3(2));
            duration3.setStartDelay(j2);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, "littlePointRadius", this.C, 0.0f).setDuration(400L);
            duration4.setInterpolator(new ul3(2));
            duration4.setStartDelay(j3);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(this, "powerDarkScale", this.F, 0.0f).setDuration(350L);
            duration5.setInterpolator(new LinearInterpolator());
            duration5.setStartDelay(j);
            if (this.o == i5) {
                i2 = 2;
                duration5 = ObjectAnimator.ofFloat(this, "powerLightScale", 1.0f, 0.0f).setDuration(200L);
                duration5.setInterpolator(new LinearInterpolator());
                duration5.setStartDelay(j);
            } else {
                i2 = 2;
            }
            float[] fArr = new float[i2];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(this, "powerLightScale", fArr).setDuration(500L);
            duration6.setInterpolator(new OvershootInterpolator());
            duration6.setStartDelay(200 + j);
            float[] fArr2 = new float[i2];
            fArr2[0] = this.I;
            fArr2[1] = this.H;
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(this, "progressPaintStrokeWidth", fArr2).setDuration(150L);
            duration7.setInterpolator(new LinearInterpolator());
            duration7.setStartDelay(j);
            this.P.playTogether(ofFloat2, ofFloat3, duration, duration2, duration3, duration4, duration5, duration6, duration7);
            this.P.addListener(new o4(this, 12));
            this.P.start();
            return;
        }
        if (i == this.k || i == this.j) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            valueAnimator.cancel();
            this.m = false;
            this.P.cancel();
            this.P = new AnimatorSet();
            float f5 = rectF2.left;
            float f6 = this.r.left;
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1 - ((f5 - f6) / (rectF.left - f6)), 1.0f);
            ofFloat4.setDuration(100L);
            ofFloat4.setInterpolator(new LinearInterpolator());
            ofFloat4.addUpdateListener(new l50(this, 1));
            AnimatorSet animatorSet2 = this.P;
            uo uoVar2 = new uo((hx2) null);
            ((ArrayList) uoVar2.f4707a).add(ofFloat4);
            uoVar2.d(getCenterDisConnAnimator());
            animatorSet2.playTogether((Animator[]) ((ArrayList) uoVar2.f4707a).toArray(new Animator[((ArrayList) uoVar2.f4707a).size()]));
            this.P.start();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        a();
    }
}
