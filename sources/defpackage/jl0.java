package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class jl0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f2786a;

    /* renamed from: b, reason: collision with root package name */
    public float f2787b;
    public float c;
    public float d;
    public float e;
    public final Path f;
    public final RectF g;

    public jl0(Context context) {
        super(context);
        this.f = new Path();
        this.g = new RectF();
        Paint paint = new Paint(5);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a() {
        Path path = this.f;
        path.reset();
        RectF rectF = this.g;
        float f = this.f2787b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f2786a > 0.0f) {
            canvas.clipPath(this.f);
        }
        super.draw(canvas);
    }

    public final float getBottomLeftRadius() {
        return this.d;
    }

    public final float getBottomRightRadius() {
        return this.e;
    }

    public final float getCornerRadius() {
        return this.f2786a;
    }

    public final float getTopLeftRadius() {
        return this.f2787b;
    }

    public final float getTopRightRadius() {
        return this.c;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g.set(0.0f, 0.0f, i, i2);
        a();
    }

    public final void setBottomLeftRadius(float f) {
        this.d = f;
        a();
    }

    public final void setBottomRightRadius(float f) {
        this.e = f;
        a();
    }

    public final void setCornerRadius(float f) {
        this.f2786a = f;
        setTopLeftRadius(f);
        setTopRightRadius(f);
        setBottomLeftRadius(f);
        setBottomRightRadius(f);
        a();
    }

    public final void setTopLeftRadius(float f) {
        this.f2787b = f;
        a();
    }

    public final void setTopRightRadius(float f) {
        this.c = f;
        a();
    }
}
