package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public final class l92 extends Drawable implements Animatable {
    public static final /* synthetic */ int u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f3086a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public float f3087b = 2.0f;
    public float c = 1.0f;
    public final int d = 1000069;
    public final Paint e;
    public final PathMeasure f;
    public final PathMeasure g;
    public final Path h;
    public final Path i;
    public final DecelerateInterpolator j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public long o;
    public float p;
    public float q;
    public float r;
    public final ValueAnimator s;
    public final Path t;

    public l92() {
        Paint paint = new Paint(5);
        paint.setStrokeWidth(this.f3087b);
        paint.setColor(-11153953);
        paint.setStyle(Paint.Style.STROKE);
        this.e = paint;
        this.f = new PathMeasure();
        this.g = new PathMeasure();
        this.h = new Path();
        this.i = new Path();
        this.j = new DecelerateInterpolator();
        this.k = 32000L;
        this.l = 400L;
        this.m = 800L;
        this.n = 2400L;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        ofFloat.addUpdateListener(new io0(this, 9));
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.s = ofFloat;
        this.t = new Path();
    }

    public final void a() {
        RectF rectF = new RectF(this.f3086a);
        Paint paint = this.e;
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
        Path path = this.t;
        path.reset();
        float f = this.c;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        PathMeasure pathMeasure = this.f;
        pathMeasure.setPath(path, true);
        this.g.setPath(path, true);
        this.r = pathMeasure.getLength() / 9.0f;
        this.s.setFloatValues(0.0f, pathMeasure.getLength());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.f3086a;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, tf3.E(v73.j(this.d)));
        Path path = this.h;
        path.reset();
        PathMeasure pathMeasure = this.f;
        pathMeasure.getSegment(this.p, Math.min(this.q, pathMeasure.getLength()), path, true);
        Paint paint = this.e;
        canvas.drawPath(path, paint);
        if (this.q > pathMeasure.getLength()) {
            Path path2 = this.i;
            path2.reset();
            this.g.getSegment(0.0f, this.q - pathMeasure.getLength(), path2, true);
            canvas.drawPath(path2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3086a.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.s;
        valueAnimator.cancel();
        this.o = System.currentTimeMillis();
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.s.cancel();
    }
}
