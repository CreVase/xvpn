package com.security.xvpn.z35kb.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Keep;
import defpackage.d83;
import defpackage.hx2;
import defpackage.v73;
import defpackage.w73;

/* loaded from: classes2.dex */
public class ConnectButton extends View implements Runnable, w73 {
    public static final DecelerateInterpolator N = new DecelerateInterpolator();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public Handler L;
    public boolean M;

    /* renamed from: a, reason: collision with root package name */
    public int f1624a;

    /* renamed from: b, reason: collision with root package name */
    public int f1625b;
    public float c;
    public float d;
    public final Path e;
    public int f;
    public final RectF g;
    public final RectF h;
    public final RectF i;
    public RectF j;
    public Paint k;
    public Paint l;
    public Paint m;
    public Paint n;
    public Paint o;
    public float p;
    public Bitmap q;
    public long r;
    public boolean s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public boolean x;
    public AnimatorSet y;
    public float z;

    public ConnectButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1624a = v73.j(1000127);
        this.f1625b = v73.j(1000128);
        this.e = new Path();
        this.f = 65286;
        this.g = new RectF();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.p = 0.0f;
        this.s = false;
        this.t = 32000L;
        this.u = 400L;
        this.v = 800L;
        this.w = 2400L;
        this.x = false;
        this.y = new AnimatorSet();
        this.H = 1.0f;
        this.I = 0.0f;
        this.M = false;
        this.L = new Handler(Looper.getMainLooper());
        Paint paint = new Paint(5);
        this.k = paint;
        paint.setColor(this.f1625b);
        this.k.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(5);
        this.l = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(5);
        this.m = paint3;
        paint3.setColor(v73.j(1000123));
        this.m.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(5);
        this.o = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStrokeWidth(30.0f);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setColor(v73.j(1000126));
        this.n = new Paint(5);
        setContentDescription("X-VPN is OFF, double tap to Connect");
    }

    private ValueAnimator[] getCenterDisConnAnimator() {
        float f;
        float f2 = 1.0f;
        if (this.f == 65283) {
            f = 1.0f;
            f2 = 0.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "largePointRadius", this.F, 0.0f).setDuration(100L);
        duration.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "littlePointRadius", this.F, 0.0f).setDuration(100L);
        duration2.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "powerDarkScale", this.H, f2).setDuration(100L);
        duration3.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, "powerLightScale", this.I, f).setDuration(100L);
        duration4.setInterpolator(new LinearInterpolator());
        return new ValueAnimator[]{duration, duration2, duration3, duration4};
    }

    public final void a(int i, int i2) {
        Path path = this.e;
        path.reset();
        RectF rectF = this.i;
        path.addCircle(0.0f, 0.0f, rectF.width() / 2.0f, Path.Direction.CW);
        float f = i;
        Path path2 = new Path();
        path2.addCircle(0.0f, 0.0f, (rectF.width() / 2.0f) - ((3.18f * f) / 172.0f), Path.Direction.CW);
        Path path3 = new Path();
        float f2 = -i;
        path3.addRect(new RectF((f2 * 6.32f) / 172.0f, (18.97f * f2) / 172.0f, (6.32f * f) / 172.0f, 0.03639535f), Path.Direction.CW);
        Path path4 = new Path();
        path4.addRect(new RectF((f * 1.58f) / 172.0f, (f2 * 16.0f) / 172.0f, (f2 * 1.58f) / 172.0f, (2.49f * f) / 172.0f), Path.Direction.CW);
        int i3 = Build.VERSION.SDK_INT;
        path.op(path2, Path.Op.DIFFERENCE);
        path.op(path3, Path.Op.DIFFERENCE);
        path.op(path4, Path.Op.UNION);
        this.n.setStyle(Paint.Style.FILL);
        this.o.setStrokeWidth(this.K);
        RectF rectF2 = new RectF(this.g);
        this.j = rectF2;
        rectF2.inset((this.o.getStrokeWidth() / 2.0f) * 1.5f, (this.o.getStrokeWidth() / 2.0f) * 1.5f);
        this.z = (17.0f * f) / 172.0f;
        this.A = (7.0f * f) / 172.0f;
        float f3 = (2.0f * f) / 172.0f;
        this.D = f3;
        this.E = f3 * 0.8f;
        Bitmap bitmap = this.q;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.q.recycle();
        }
        this.q = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(this.q);
        this.m.setShadowLayer((f * 8.0f) / 172.0f, 0.0f, (i2 * 16.0f) / 172.0f, v73.j(1000129));
        if (i3 <= 26) {
            setLayerType(1, null);
        }
        canvas.drawOval(this.h, this.m);
        this.m.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        setLayerType(2, null);
        int i4 = this.f;
        if (i4 == 65282 || i4 == 65284) {
            this.o.setStrokeWidth(this.J);
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        RectF rectF = this.h;
        if (Math.sqrt(Math.pow(motionEvent.getX() - rectF.centerX(), 2.0d) + Math.pow(y - rectF.centerY(), 2.0d)) <= rectF.width() / 2.0f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d83.a(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d83.d(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        Canvas canvas2;
        Bitmap bitmap;
        float interpolation;
        float interpolation2;
        super.onDraw(canvas);
        RectF rectF2 = this.g;
        canvas.drawOval(rectF2, this.l);
        long currentTimeMillis = System.currentTimeMillis() - this.r;
        if (this.s) {
            long j = this.w;
            long j2 = currentTimeMillis % j;
            long j3 = this.v;
            long j4 = this.u;
            long j5 = j3 + j4;
            long j6 = j5 + j4;
            rectF = rectF2;
            DecelerateInterpolator decelerateInterpolator = N;
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
            float f = (((float) j2) / ((float) j)) * 450.0f;
            long j7 = this.t;
            this.c = ((((((float) (currentTimeMillis % j7)) / ((float) j7)) * 360.0f) + (f + (interpolation2 * 270.0f))) % 360.0f) + 90.0f;
            this.d = hx2.f(1.0f, interpolation2, interpolation * 270.0f, 40.0f);
        } else {
            rectF = rectF2;
        }
        canvas.drawArc(this.j, this.c, this.d, false, this.o);
        if (!this.x && (bitmap = this.q) != null && !bitmap.isRecycled()) {
            canvas2 = canvas;
            canvas2.drawBitmap(this.q, 0.0f, 0.0f, this.k);
        } else {
            canvas2 = canvas;
            canvas2.drawOval(this.h, this.m);
        }
        canvas.save();
        RectF rectF3 = this.i;
        canvas2.translate(rectF3.centerX(), rectF3.centerY());
        float f2 = this.H;
        Path path = this.e;
        if (f2 != 0.0f) {
            canvas.save();
            float f3 = this.H;
            canvas2.scale(f3, f3);
            this.n.setColor(this.f1624a);
            canvas2.drawPath(path, this.n);
            canvas.restore();
        }
        if (this.I != 0.0f) {
            canvas.save();
            float f4 = this.I;
            canvas2.scale(f4, f4);
            this.n.setColor(this.f1625b);
            canvas2.drawPath(path, this.n);
            canvas.restore();
        }
        canvas.restore();
        if ((this.F != 0.0f || this.G != 0.0f) && this.B != this.z) {
            canvas.save();
            canvas2.translate(rectF.centerX(), rectF.centerY());
            for (int i = 0; i < 7; i++) {
                double d = ((i * 2) * 3.141592653589793d) / 7.0d;
                double d2 = 0.0f + d;
                canvas2.drawCircle(((float) Math.sin(d2)) * this.B, ((float) Math.cos(d2)) * this.B, this.F, this.k);
                double d3 = d + 0.72f;
                canvas2.drawCircle(((float) Math.sin(d3)) * this.C, ((float) Math.cos(d3)) * this.C, this.G, this.k);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = (16.0f * f) / 172.0f;
        RectF rectF = this.g;
        float f3 = i2;
        rectF.set(f2, f2, f - f2, f3 - f2);
        float f4 = (7.88f * f) / 172.0f;
        this.p = f4;
        this.J = f4;
        this.K = f4 / 2.0f;
        this.l.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, new int[]{v73.j(1000124), v73.j(1000124), v73.j(1000125)}, new float[]{0.0f, (2.0f - (this.p / (rectF.width() / 2.0f))) / 2.0f, 1.0f}, Shader.TileMode.MIRROR));
        float f5 = (23.78f * f) / 172.0f;
        this.h.set(f5, f5, f - f5, f3 - f5);
        float f6 = (71.0f * f) / 172.0f;
        this.i.set(f6, f6, f - f6, f3 - f6);
        a(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:            if (r0 != 3) goto L20;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L27
            r3 = 2
            r4 = 3
            if (r0 == r3) goto L11
            if (r0 == r4) goto L27
            goto L3b
        L11:
            boolean r0 = r5.M
            if (r0 == 0) goto L16
            return r1
        L16:
            boolean r0 = r5.b(r6)
            if (r0 != 0) goto L3b
            r5.x = r1
            r5.invalidate()
            r5.M = r2
            r6.setAction(r4)
            goto L3b
        L27:
            r5.x = r1
            r5.M = r2
            r5.invalidate()
            goto L3b
        L2f:
            boolean r0 = r5.b(r6)
            if (r0 != 0) goto L36
            return r1
        L36:
            r5.x = r2
            r5.invalidate()
        L3b:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.ConnectButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        this.m.setColor(v73.j(1000123));
        RectF rectF = this.g;
        if (rectF.width() > 0.0f) {
            this.l.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, new int[]{v73.j(1000124), v73.j(1000124), v73.j(1000125)}, new float[]{0.0f, (2.0f - (this.p / (rectF.width() / 2.0f))) / 2.0f, 1.0f}, Shader.TileMode.MIRROR));
            this.o.setColor(v73.j(1000126));
            this.f1625b = v73.j(1000128);
            this.f1624a = v73.j(1000127);
            a(getMeasuredWidth(), getMeasuredHeight());
        }
        invalidate();
    }

    @Override // java.lang.Runnable
    public final void run() {
        invalidate();
        this.L.postDelayed(this, 12L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:            if (r2 == 65282) goto L36;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setConnectState(int r21) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.ConnectButton.setConnectState(int):void");
    }

    @Keep
    public void setLargePointDistance(float f) {
        this.B = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setLargePointRadius(float f) {
        this.F = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setLittlePointDistance(float f) {
        this.C = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setLittlePointRadius(float f) {
        this.G = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setPowerDarkScale(float f) {
        this.H = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setPowerLightScale(float f) {
        this.I = f;
        postInvalidateOnAnimation();
    }

    @Keep
    public void setProgressPaintStrokeWidth(float f) {
        this.o.setStrokeWidth(f);
        postInvalidateOnAnimation();
    }
}
