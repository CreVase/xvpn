package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class zg2 extends yu2 {
    public final float e;
    public final float f;

    public /* synthetic */ zg2(int i, float f) {
        this(i, f, 0.0f, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF R = tf3.R();
        float f = bounds.left;
        float f2 = this.f;
        R.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
        Paint E = tf3.E(a());
        float f3 = this.e;
        canvas.drawRoundRect(R, f3, f3, E);
    }

    public zg2(int i, float f, float f2, boolean z) {
        super(i, z);
        this.e = f;
        this.f = f2;
    }
}
