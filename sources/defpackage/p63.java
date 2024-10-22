package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class p63 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3790a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3791b;

    public p63() {
        Paint paint = new Paint(5);
        paint.setStrokeWidth(1 * tf3.F);
        paint.setColor(-3947581);
        paint.setStyle(Paint.Style.STROKE);
        this.f3790a = paint;
        Paint paint2 = new Paint(5);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(e83.q.t(1000003));
        this.f3791b = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        RectF R = tf3.R();
        R.set(getBounds());
        if (v73.l()) {
            paint = this.f3791b;
        } else {
            paint = this.f3790a;
            R.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
        }
        float f = 2;
        float f2 = tf3.F;
        canvas.drawRoundRect(R, f * f2, f * f2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
