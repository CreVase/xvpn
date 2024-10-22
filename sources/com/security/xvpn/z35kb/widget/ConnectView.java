package com.security.xvpn.z35kb.widget;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import defpackage.bx3;
import defpackage.g53;
import defpackage.hx2;
import defpackage.io0;
import defpackage.k9;
import defpackage.n50;
import defpackage.py2;

/* loaded from: classes2.dex */
public class ConnectView extends View {
    public static final /* synthetic */ int N = 0;
    public PathMeasure A;
    public float B;
    public k9 C;
    public float D;
    public float E;
    public float F;
    public float G;
    public double H;
    public double I;
    public boolean J;
    public int K;
    public Paint L;
    public int M;

    /* renamed from: a, reason: collision with root package name */
    public final int f1626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1627b;
    public int c;
    public final int d;
    public final int e;
    public Paint f;
    public Paint g;
    public Paint h;
    public Paint i;
    public Paint j;
    public Path k;
    public Path l;
    public final int m;
    public final int n;
    public Point o;
    public Path p;
    public Paint q;
    public Paint r;
    public boolean s;
    public boolean t;
    public ValueAnimator u;
    public ValueAnimator v;
    public ValueAnimator w;
    public ValueAnimator x;
    public py2 y;
    public io0 z;

    public ConnectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1626a = a(8);
        this.f1627b = a(20);
        int a2 = a(172);
        this.d = a2;
        int a3 = a(172);
        this.e = a3;
        int a4 = a(4);
        this.m = a4;
        this.n = a(13);
        this.o = new Point(a2 / 2, a3 / 2);
        this.s = false;
        this.t = false;
        this.I = -0.15707963267948966d;
        this.J = false;
        this.M = 1;
        this.K = 0;
        setLayerType(1, null);
        this.M = 1;
        this.p = new Path();
        this.A = new PathMeasure();
        Paint paint = getPaint();
        this.f = paint;
        paint.setColor(-1);
        Paint paint2 = getPaint();
        this.g = paint2;
        paint2.setColor(855638016);
        Paint paint3 = getPaint();
        this.h = paint3;
        paint3.setColor(-1579290);
        Paint paint4 = getPaint();
        this.i = paint4;
        paint4.setColor(-2565928);
        this.i.setStrokeWidth(a4);
        this.i.setStyle(Paint.Style.STROKE);
        Paint paint5 = getPaint();
        this.r = paint5;
        paint5.setStrokeWidth(1.0f);
        this.r.setColor(-65536);
        Paint paint6 = getPaint();
        this.L = paint6;
        paint6.setStyle(Paint.Style.FILL);
        this.L.setColor(-11084559);
        Paint paint7 = getPaint();
        this.q = paint7;
        paint7.setColor(-11084559);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setStrokeWidth((r12 * 3) / 5);
        this.q.setStrokeCap(Paint.Cap.ROUND);
        Paint paint8 = getPaint();
        this.j = paint8;
        paint8.setColor(-11153696);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth((int) (bx3.z(context) * 2.5f));
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("progress", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.25f, 0.5f), Keyframe.ofFloat(0.5f, 0.75f), Keyframe.ofFloat(0.75f, 0.85f), Keyframe.ofFloat(0.97f, 0.97f));
        this.y = new py2(this, 2);
        this.z = new io0(this, 6);
        ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(ofKeyframe).setDuration(15000L);
        this.u = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.u.addUpdateListener(this.z);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1750L);
        this.v = duration2;
        duration2.setRepeatCount(1073741823);
        this.v.addUpdateListener(this.z);
        ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1000.0f).setDuration(500L);
        this.w = duration3;
        duration3.setInterpolator(new LinearInterpolator());
        this.w.addListener(this.y);
        this.w.addUpdateListener(this.z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, 1.0f);
        this.x = ofFloat;
        ofFloat.setDuration(200L);
        this.x.addListener(this.y);
        this.x.addUpdateListener(this.z);
        this.C = new k9(this);
        setFocusable(true);
        c();
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        return paint;
    }

    public final int a(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void b(Canvas canvas, float f) {
        int i = this.K;
        int i2 = this.m;
        int i3 = this.n;
        if (i == 1) {
            this.D = (i3 * f) + i3;
            float f2 = (((i3 * f) * 3.0f) / 2.0f) + i3;
            this.E = f2;
            if (f2 >= i3 * 2) {
                this.E = i3 * 2;
            }
            this.F = ((i2 * 2) / 5) * f;
            this.G = (i2 / 2) * f;
        } else if (i == 2) {
            this.D = i3 * 2;
            this.E = i3 * 2;
            float f3 = 1.0f - f;
            this.F = ((i2 * 2) / 5) * f3;
            this.G = (i2 / 2) * f3;
        }
        canvas.save();
        Point point = this.o;
        canvas.translate(point.x, point.y);
        for (int i4 = 0; i4 < 7; i4++) {
            canvas.drawCircle(this.D * ((float) Math.sin(this.H)), this.D * ((float) Math.cos(this.H)), this.F, this.L);
            this.H += 0.8975979010256552d;
            canvas.drawCircle(this.E * ((float) Math.sin(this.I)), this.E * ((float) Math.cos(this.I)), this.G, this.L);
            this.I += 0.8975979010256552d;
        }
        canvas.restore();
    }

    public final void c() {
        int x = hx2.x(this.M);
        if (x != 0) {
            if (x != 1) {
                if (x == 2 || x == 3 || x == 5) {
                    setContentDescription("X-VPN is ON, double tap to Disconnect");
                    return;
                }
                return;
            }
            setContentDescription("X-VPN is Connecting, double tap to Disconnect");
            return;
        }
        setContentDescription("X-VPN is OFF, double tap to Connect");
    }

    public final void d() {
        RectF rectF = new RectF();
        int i = this.f1626a;
        int i2 = this.f1627b;
        rectF.set((this.q.getStrokeWidth() / 2.0f) + (i2 - (i / 2)), (this.q.getStrokeWidth() / 2.0f) + (i2 - (i / 2)), ((i / 2) + (getWidth() - i2)) - (this.q.getStrokeWidth() / 2.0f), ((i / 2) + (getHeight() - i2)) - (this.q.getStrokeWidth() / 2.0f));
        this.p.addArc(rectF, 0.0f, 360.0f);
        this.A.setPath(this.p, true);
        this.k = new Path();
        this.l = new Path();
        e(this.n, this.m);
    }

    public final void e(float f, float f2) {
        this.k.reset();
        this.l.reset();
        Path path = this.l;
        Point point = this.o;
        path.moveTo(point.x, point.y);
        Path path2 = this.l;
        Point point2 = this.o;
        path2.lineTo(point2.x, (point2.y - f) - ((f2 * 2.0f) / 3.0f));
        Path path3 = this.k;
        Point point3 = this.o;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        path3.moveTo(point3.x - f3, (point3.y - f) - f4);
        Path path4 = this.k;
        Point point4 = this.o;
        path4.lineTo(point4.x - f3, point4.y);
        Path path5 = this.k;
        Point point5 = this.o;
        path5.lineTo(point5.x + f3, point5.y);
        Path path6 = this.k;
        Point point6 = this.o;
        path6.lineTo(point6.x + f3, (point6.y - f) - f4);
        this.k.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:            if (r4 != 5) goto L48;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.ConnectView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.J = z;
        invalidate();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0 && (i == 23 || i == 66)) {
            this.s = true;
            postDelayed(new g53(this, 10), 50L);
            invalidate();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.d, this.e);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.o = new Point(getWidth() / 2, getHeight() / 2);
        this.c = (getWidth() / 2) - this.f1627b;
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        int i = this.f1627b;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (x2 < i || x2 > getWidth() - i || y2 < i || y2 > getHeight() - i) {
                        this.s = false;
                        invalidate();
                    }
                }
            } else if (x >= i && x <= getWidth() - i && y >= i && y <= getHeight() - i) {
                this.s = false;
                if (this.M == 1) {
                    this.M = 2;
                } else {
                    this.M = 1;
                }
                this.C.sendEmptyMessage(0);
                return super.onTouchEvent(motionEvent);
            }
        } else if (x >= i && x <= getWidth() - i && y >= i && y <= getHeight() - i) {
            this.s = true;
            invalidate();
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAnimationListener(n50 n50Var) {
    }
}
