package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class nl2 extends yu2 {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final Path j;

    public nl2(int i, float f, float f2, float f3, float f4) {
        super(i, false);
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = 0.0f;
        this.j = new Path();
        setAutoMirrored(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF R = tf3.R();
        float f = bounds.left;
        float f2 = this.i;
        R.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
        canvas.drawPath(this.j, tf3.E(a()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        boolean R = zf3.R();
        float f = this.g;
        float f2 = this.h;
        float f3 = this.f;
        float f4 = this.e;
        Path path = this.j;
        if (R) {
            path.addRoundRect(i3, i2, i, i4, new float[]{f3, f3, f4, f4, f, f, f2, f2}, Path.Direction.CCW);
        } else {
            path.addRoundRect(i, i2, i3, i4, new float[]{f4, f4, f3, f3, f2, f2, f, f}, Path.Direction.CCW);
        }
    }
}
