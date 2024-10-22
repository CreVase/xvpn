package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class sp0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4390a = tf3.K(8);

    /* renamed from: b, reason: collision with root package name */
    public final float[] f4391b = new float[3];
    public final int c = 540;
    public final int d = 720;
    public final int e = tf3.K(10);
    public final float f = 1.0f / 720;
    public final int g;
    public final int h;
    public final Paint i;

    public sp0() {
        int K = tf3.K(21);
        this.g = K;
        this.h = 2000;
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-7829368);
        this.i = paint;
        setBounds(0, 0, getIntrinsicWidth(), K);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        long elapsedRealtime = (SystemClock.elapsedRealtime() - cz.H) % this.h;
        float[] fArr = this.f4391b;
        int length = fArr.length;
        int i2 = 0;
        while (true) {
            float f = 0.0f;
            i = this.f4390a;
            if (i2 >= length) {
                break;
            }
            float f2 = this.c * i2;
            float f3 = (float) elapsedRealtime;
            if (f3 >= f2) {
                if (f3 > this.d + f2) {
                    f = 1.0f;
                } else {
                    f = this.f * (f3 - f2);
                }
            }
            fArr[i2] = i * f;
            i2++;
        }
        canvas.translate(0.0f, (this.g / 2) - i);
        int length2 = fArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (i3 != 0) {
                canvas.translate((i * 2) + this.e, 0.0f);
            }
            canvas.drawCircle(i, i, fArr[i3], this.i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((r1.length - 1) * this.e) + (this.f4390a * 2 * this.f4391b.length);
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
