package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class tv extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f4582a;

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable;
        WeakReference weakReference = this.f4582a;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = getDrawable();
            this.f4582a = new WeakReference(drawable);
        }
        canvas.save();
        canvas.translate(f, (((i5 - i3) / 2) + i3) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return tf3.K(14) + super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
