package defpackage;

import android.graphics.Canvas;

/* loaded from: classes2.dex */
public final class am0 extends yu2 {
    public final int e;

    public am0(int i, float f) {
        super(i, false);
        this.e = (int) f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), tf3.E(a()));
    }

    @Override // defpackage.yu2, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e;
    }

    @Override // defpackage.yu2, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e;
    }
}
