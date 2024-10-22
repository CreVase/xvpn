package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class nb extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3428a;

    public nb(Drawable.ConstantState constantState) {
        this.f3428a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3428a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3428a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ob obVar = new ob(null);
        Drawable newDrawable = this.f3428a.newDrawable();
        obVar.f2957a = newDrawable;
        newDrawable.setCallback(obVar.f);
        return obVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ob obVar = new ob(null);
        Drawable newDrawable = this.f3428a.newDrawable(resources);
        obVar.f2957a = newDrawable;
        newDrawable.setCallback(obVar.f);
        return obVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ob obVar = new ob(null);
        Drawable newDrawable = this.f3428a.newDrawable(resources, theme);
        obVar.f2957a = newDrawable;
        newDrawable.setCallback(obVar.f);
        return obVar;
    }
}
