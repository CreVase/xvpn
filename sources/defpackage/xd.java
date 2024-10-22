package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class xd extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final vd f5148a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xd(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = defpackage.ie2.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.h83.a(r2, r1)
            vd r2 = new vd
            r2.<init>(r1)
            r1.f5148a = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f5148a.f4819b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
