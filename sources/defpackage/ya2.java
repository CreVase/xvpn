package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ya2 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5302b;
    public final boolean c;
    public final float d = 8 * tf3.F;

    public ya2(int i, int i2, boolean z) {
        this.f5301a = i;
        this.f5302b = i2;
        this.c = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF R = tf3.R();
        R.set(getBounds());
        Paint E = tf3.E(v73.j(this.f5301a));
        float f = this.d;
        canvas.drawRoundRect(R, f, f, E);
        if (this.c) {
            int j = v73.j(this.f5302b);
            Paint paint = tf3.y;
            if (paint == null) {
                Paint paint2 = new Paint(5);
                tf3.y = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                tf3.y.setStrokeWidth(2 * tf3.F);
                tf3.y.setColor(j);
                tf3.z = j;
            } else if (tf3.z != j) {
                paint.setColor(j);
                tf3.z = j;
            }
            Paint paint3 = tf3.y;
            R.inset(paint3.getStrokeWidth() / 2.0f, paint3.getStrokeWidth() / 2.0f);
            canvas.drawRoundRect(R, f, f, paint3);
        }
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
