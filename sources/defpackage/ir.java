package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ir extends Drawable {
    public float c;
    public float d;
    public float e;
    public int f;
    public int o;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2635a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final Path f2636b = new Path();
    public final int g = 1;
    public final int h = 2;
    public final int i = 3;
    public float[] j = {0.0f, 0.0f, 0.0f, 0.0f};
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final RectF n = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Rect bounds = getBounds();
        RectF rectF = this.k;
        int i = this.f;
        float f4 = bounds.left;
        if (i == 3) {
            f4 += this.c;
        }
        rectF.left = f4;
        float f5 = bounds.top;
        if (i == 0) {
            f = f5 + this.d;
        } else {
            f = f5 + 0.0f;
        }
        rectF.top = f;
        float f6 = 2;
        float f7 = this.j[0] * f6;
        rectF.bottom = f7 + f;
        rectF.left = f4 + 0.0f;
        rectF.right = f7 + f4 + 0.0f;
        Rect bounds2 = getBounds();
        RectF rectF2 = this.l;
        int i2 = this.f;
        float f8 = bounds2.right;
        if (i2 == 1) {
            f8 -= this.c;
        }
        rectF2.right = f8;
        float f9 = bounds2.top;
        if (i2 == 0) {
            f2 = f9 + this.d;
        } else {
            f2 = f9 + 0.0f;
        }
        rectF2.top = f2;
        float[] fArr = this.j;
        int i3 = this.g;
        float f10 = fArr[i3] * f6;
        rectF2.bottom = f10 + f2;
        rectF2.left = (f8 - f10) - 0.0f;
        rectF2.right = f8 - 0.0f;
        Rect bounds3 = getBounds();
        RectF rectF3 = this.m;
        int i4 = this.f;
        float f11 = bounds3.right;
        if (i4 == 1) {
            f11 -= this.c;
        }
        rectF3.right = f11;
        float f12 = bounds3.bottom;
        if (i4 == 2) {
            f12 -= this.d;
        }
        float[] fArr2 = this.j;
        int i5 = this.h;
        float f13 = fArr2[i5] * f6;
        rectF3.left = (f11 - f13) - 0.0f;
        rectF3.right = f11 - 0.0f;
        rectF3.top = (f12 - f13) - 0.0f;
        rectF3.bottom = f12 - 0.0f;
        Rect bounds4 = getBounds();
        RectF rectF4 = this.n;
        int i6 = this.f;
        if (i6 == 3) {
            f3 = bounds4.left + this.c;
        } else {
            f3 = bounds4.left;
        }
        rectF4.left = f3;
        float f14 = bounds4.bottom;
        if (i6 == 2) {
            f14 -= this.d;
        }
        float[] fArr3 = this.j;
        int i7 = this.i;
        float f15 = fArr3[i7] * f6;
        rectF4.left = f3 + 0.0f;
        rectF4.right = f15 + f3 + 0.0f;
        rectF4.top = (f14 - f15) - 0.0f;
        rectF4.bottom = f14 - 0.0f;
        Path path = this.f2636b;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.j[0]);
        path.arcTo(rectF, 180.0f, 90.0f);
        if (this.f == 0) {
            path.lineTo(((getBounds().width() * this.e) + getBounds().left) - (this.c / f6), getBounds().top + this.d);
            path.lineTo((getBounds().width() * this.e) + getBounds().left, getBounds().top);
            path.lineTo((this.c / f6) + (getBounds().width() * this.e) + getBounds().left, getBounds().top + this.d);
        }
        path.lineTo(rectF2.left + this.j[i3], rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        if (this.f == 1) {
            path.lineTo(rectF2.right, ((getBounds().height() * this.e) + getBounds().top) - (this.d / f6));
            path.lineTo(getBounds().right - 0.0f, (getBounds().height() * this.e) + getBounds().top);
            path.lineTo(rectF3.right, (this.d / f6) + (getBounds().height() * this.e) + getBounds().top);
        }
        path.lineTo(rectF3.right, rectF3.top + this.j[i5]);
        path.arcTo(rectF3, 0.0f, 90.0f);
        if (this.f == 2) {
            path.lineTo((this.c / f6) + (getBounds().right - (getBounds().width() * this.e)), rectF3.bottom);
            path.lineTo(getBounds().right - (getBounds().width() * this.e), getBounds().bottom - 0.0f);
            path.lineTo((getBounds().right - (getBounds().width() * this.e)) - (this.c / f6), rectF3.bottom);
        }
        path.lineTo(rectF4.right - this.j[i7], rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        if (this.f == 3) {
            path.lineTo(rectF4.left, (this.d / f6) + (rectF4.bottom - (getBounds().height() * this.e)));
            path.lineTo(getBounds().left, rectF4.bottom - (getBounds().height() * this.e));
            path.lineTo(rectF.left, (rectF4.bottom - (getBounds().height() * this.e)) - (this.d / f6));
        }
        path.close();
        Paint paint = this.f2635a;
        paint.setColor(this.o);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2635a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2635a.setColorFilter(colorFilter);
    }
}
