package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class y32 extends GradientDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5261a;

    public /* synthetic */ y32(int i) {
        this.f5261a = i;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2 = -1;
        switch (this.f5261a) {
            case 0:
                setCornerRadius((int) Math.ceil(2.5f * tf3.F));
                int D = tf3.D(1);
                if (v73.l()) {
                    i = -10658467;
                } else {
                    i = -3224115;
                }
                setStroke(D, i);
                if (v73.l()) {
                    i2 = -14013910;
                }
                setColor(i2);
                super.draw(canvas);
                return;
            default:
                setStroke(tf3.D(1), -11153696);
                if (v73.l()) {
                    i2 = -14013910;
                }
                setColor(i2);
                super.draw(canvas);
                return;
        }
    }
}
