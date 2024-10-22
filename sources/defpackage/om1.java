package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class om1 extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f3692a;

    /* renamed from: b, reason: collision with root package name */
    public int f3693b;
    public final Paint c;

    public om1(Context context) {
        super(context);
        this.f3692a = tf3.K(5);
        Paint paint = new Paint(1);
        this.c = paint;
        setLayoutParams(new ViewGroup.LayoutParams(tf3.K(44), tf3.K(44)));
        paint.setColor(-6710887);
        postDelayed(new qw3(this, 22), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f3693b % 8;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            int i4 = this.f3692a;
            float f = (i4 * i3) / 8.0f;
            int save = canvas.save();
            canvas.rotate(((i2 + i) % 8) * 45.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            try {
                canvas.drawCircle(canvas.getWidth() / 2.0f, i4, f, this.c);
                canvas.restoreToCount(save);
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }
}
