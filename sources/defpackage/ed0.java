package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class ed0 extends fr1 {
    public static final /* synthetic */ int y = 0;
    public cd0 x;

    public ed0(cd0 cd0Var) {
        super(cd0Var);
        this.x = cd0Var;
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.x = new cd0(this.x);
        return this;
    }

    public final void n(float f, float f2, float f3, float f4) {
        RectF rectF = this.x.v;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
