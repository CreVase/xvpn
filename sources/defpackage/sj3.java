package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class sj3 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f4356a;

    public sj3(Drawable.ConstantState constantState) {
        this.f4356a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4356a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4356a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        tj3 tj3Var = new tj3();
        tj3Var.f2957a = (VectorDrawable) this.f4356a.newDrawable();
        return tj3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        tj3 tj3Var = new tj3();
        tj3Var.f2957a = (VectorDrawable) this.f4356a.newDrawable(resources);
        return tj3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        tj3 tj3Var = new tj3();
        tj3Var.f2957a = (VectorDrawable) this.f4356a.newDrawable(resources, theme);
        return tj3Var;
    }
}
