package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class sq extends yu2 {
    public final int e;
    public final float f;
    public final float g;
    public final float h;

    public sq(int i, int i2, float f, float f2, float f3) {
        super(i, false);
        this.e = i2;
        this.f = f;
        this.g = f2;
        this.h = f3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        RectF R = tf3.R();
        float f = bounds.left;
        float f2 = this.h;
        R.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
        Paint E = tf3.E(a());
        float f3 = this.f;
        canvas.drawRoundRect(R, f3, f3, E);
        float f4 = this.g;
        R.inset(f4 / 2.0f, f4 / 2.0f);
        int j = v73.j(this.e);
        Paint paint = tf3.A;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            tf3.A = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            tf3.A.setStrokeWidth(f4);
            tf3.A.setColor(j);
            tf3.B = j;
            tf3.C = f4;
        } else {
            if (tf3.B != j) {
                paint.setColor(j);
                tf3.B = j;
            }
            if (tf3.C == f4) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                tf3.A.setStrokeWidth(f4);
                tf3.C = f4;
            }
        }
        canvas.drawRoundRect(R, f3, f3, tf3.A);
    }
}
