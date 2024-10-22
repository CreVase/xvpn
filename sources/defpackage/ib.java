package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ib extends d13 {
    public static final /* synthetic */ int K = 0;
    public ko1 I;
    public rx2 J;

    public ib(ib ibVar, lb lbVar, Resources resources) {
        super(ibVar, lbVar, resources);
        if (ibVar != null) {
            this.I = ibVar.I;
            this.J = ibVar.J;
        } else {
            this.I = new ko1();
            this.J = new rx2();
        }
    }

    @Override // defpackage.en0
    public final void e() {
        this.I = this.I.clone();
        this.J = this.J.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new lb(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new lb(this, resources);
    }
}
