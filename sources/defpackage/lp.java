package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class lp extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3165a = new Paint();

    /* renamed from: b, reason: collision with root package name */
    public LinearGradient f3166b;
    public LinearGradient c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(-16316665);
        float f = (-getBounds().width()) * 0.0619f;
        float height = getBounds().height() * 0.499f;
        Paint paint = this.f3165a;
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(this.f3166b);
        canvas.drawOval(f, height, (getBounds().width() * 1.248f) + f, (getBounds().height() * 0.873f) + height, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) (1.35d * tf3.F));
        paint.setShader(this.c);
        canvas.drawOval(f, height, (getBounds().width() * 1.248f) + f, (getBounds().height() * 0.873f) + height, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = i4;
        float f2 = f / 2.0f;
        float f3 = i3;
        this.f3166b = new LinearGradient(0.0f, f2, f3, f2, -16773618, 0, Shader.TileMode.REPEAT);
        this.c = new LinearGradient(0.0f, 0.0f, f3, f * 0.873f, 321165978, 806477, Shader.TileMode.REPEAT);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
