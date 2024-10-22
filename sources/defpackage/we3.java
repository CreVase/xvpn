package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class we3 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f4992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4993b;
    public final boolean c;
    public final Paint d;
    public final float e;
    public final float f;
    public final Path g;
    public final Path h;
    public final int i;

    public we3(Drawable drawable, boolean z, boolean z2) {
        int i;
        this.f4992a = drawable;
        this.f4993b = z;
        this.c = z2;
        Paint paint = new Paint(5);
        this.d = paint;
        float f = tf3.F;
        this.e = 13 * f;
        this.f = 1 * f;
        this.g = new Path();
        this.h = new Path();
        this.i = -15263977;
        if (z) {
            i = -13841976;
        } else {
            i = -13553359;
        }
        paint.setColor(i);
        paint.setStrokeWidth(tf3.F * 1.5f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.clipPath(this.g);
        Paint paint = this.d;
        paint.setStyle(Paint.Style.FILL);
        canvas.drawColor(this.i);
        if (this.f4993b) {
            paint.setStyle(Paint.Style.STROKE);
            float f = this.f;
            float f2 = 1;
            float f3 = this.e;
            canvas.drawRoundRect(f, f, getBounds().right - f2, getBounds().bottom - f2, f3, f3, paint);
        }
        if (this.c) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.h, paint);
            float f4 = getBounds().right;
            float f5 = tf3.F;
            float f6 = f4 - (22 * f5);
            float f7 = 7 * f5;
            int save = canvas.save();
            canvas.translate(f6, f7);
            try {
                this.f4992a.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Path path = this.g;
        path.reset();
        float f = rect.right;
        float f2 = rect.bottom;
        float f3 = this.e;
        path.addRoundRect(0.0f, 0.0f, f, f2, f3, f3, Path.Direction.CCW);
        Path path2 = this.h;
        path2.reset();
        path2.moveTo(rect.right - (43 * tf3.F), 0.0f);
        path2.lineTo(rect.right, 0.0f);
        path2.lineTo(rect.right, 37 * tf3.F);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
