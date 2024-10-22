package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class tn3 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4546a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4547b;
    public final boolean c;
    public final boolean d;
    public final float e = 7 * tf3.F;
    public final float[] f = new float[8];
    public final Path g = new Path();
    public final Path h = new Path();
    public final Paint i = new Paint(5);

    public tn3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4546a = z;
        this.f4547b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static int a(boolean z, boolean z2) {
        if (v73.l()) {
            if (z2) {
                return -13814219;
            }
            if (z) {
                return -12434878;
            }
            return -14013910;
        }
        if (z2) {
            return -3411990;
        }
        if (z) {
            return -1842205;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF R = tf3.R();
        R.set(getBounds());
        Path path = this.h;
        Path path2 = this.g;
        Paint paint = this.i;
        boolean z = this.c;
        boolean z2 = this.f4546a;
        boolean z3 = this.f4547b;
        if (z) {
            canvas.drawPath(path2, tf3.E(a(z2, z3)));
            if (z3) {
                float f = tf3.F * 0.5f;
                R.inset(f, f);
                paint.setColor(-16725347);
                paint.setStrokeWidth(1 * tf3.F);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        if (this.d) {
            canvas.drawPath(path2, tf3.E(a(z2, z3)));
            if (z3) {
                float f2 = tf3.F * 0.5f;
                R.inset(f2, f2);
                paint.setColor(-16725347);
                paint.setStrokeWidth(1 * tf3.F);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        canvas.drawRect(R, tf3.E(a(z2, z3)));
        if (z3) {
            float f3 = tf3.F * 0.5f;
            R.inset(f3, f3);
            paint.setColor(-16725347);
            paint.setStrokeWidth(1 * tf3.F);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(R, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF R = tf3.R();
        R.set(rect);
        boolean z = this.c;
        boolean z2 = this.f4547b;
        float f = this.e;
        Path path = this.h;
        Path path2 = this.g;
        float[] fArr = this.f;
        if (z) {
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            path2.reset();
            path2.addRoundRect(R, fArr, Path.Direction.CW);
            if (z2) {
                float f2 = tf3.F;
                R.inset(0.5f * f2, f2 * 0.5f);
                path.reset();
                path.addRoundRect(R, fArr, Path.Direction.CW);
                return;
            }
            return;
        }
        if (this.d) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            fArr[5] = f;
            fArr[6] = f;
            fArr[7] = f;
            path2.reset();
            path2.addRoundRect(R, fArr, Path.Direction.CW);
            if (z2) {
                float f3 = tf3.F;
                R.inset(0.5f * f3, f3 * 0.5f);
                path.reset();
                path.addRoundRect(R, fArr, Path.Direction.CW);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
