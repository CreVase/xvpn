package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class v3 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4773a = 1000008;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f4774b;
    public final RectF c;
    public final Path d;

    public v3() {
        float f = 18 * tf3.F;
        this.f4774b = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.c = new RectF();
        this.d = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.d, tf3.E(v73.j(this.f4773a)));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        this.d.addRoundRect(new RectF(rect), this.f4774b, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
