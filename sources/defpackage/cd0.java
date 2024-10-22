package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class cd0 extends er1 {
    public final RectF v;

    public cd0(fs2 fs2Var, RectF rectF) {
        super(fs2Var);
        this.v = rectF;
    }

    @Override // defpackage.er1, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dd0 dd0Var = new dd0(this);
        dd0Var.invalidateSelf();
        return dd0Var;
    }

    public cd0(cd0 cd0Var) {
        super(cd0Var);
        this.v = cd0Var.v;
    }
}
