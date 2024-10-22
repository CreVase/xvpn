package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes2.dex */
public final class dd0 extends ed0 {
    @Override // defpackage.fr1
    public final void f(Canvas canvas) {
        if (this.x.v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.x.v);
        } else {
            canvas.clipRect(this.x.v, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
