package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class af3 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f76a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f77b;
    public LinearGradient c;
    public final float d;

    public af3(int i, int i2) {
        this.f76a = i2;
        Paint paint = new Paint(5);
        this.f77b = paint;
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP);
        this.d = 3 * tf3.F;
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f77b;
        paint.setShader(this.c);
        canvas.drawPaint(paint);
        paint.setShader(null);
        canvas.drawRect(0.0f, 0.0f, this.d, getBounds().bottom, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.c = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f76a, -16776959, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
