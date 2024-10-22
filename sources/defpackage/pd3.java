package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class pd3 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3832b;
    public final Paint c;
    public LinearGradient d;
    public final float e;

    public pd3(int i, int i2, boolean z) {
        this.f3831a = i2;
        this.f3832b = z;
        Paint paint = new Paint(5);
        this.c = paint;
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP);
        this.e = 4 * tf3.F;
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.c;
        paint.setShader(this.d);
        canvas.drawPaint(paint);
        paint.setShader(null);
        canvas.drawRect(0.0f, 0.0f, this.e, getBounds().bottom, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.f3832b) {
            this.d = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, new int[]{this.f3831a, 604178442, 469959943}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f3831a, -16776959, Shader.TileMode.CLAMP);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
