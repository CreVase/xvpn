package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ft3 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2153a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f2154b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public ft3(ft3 ft3Var) {
        this.c = null;
        this.d = dt3.g;
        if (ft3Var != null) {
            this.f2153a = ft3Var.f2153a;
            this.f2154b = ft3Var.f2154b;
            this.c = ft3Var.c;
            this.d = ft3Var.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i;
        int i2 = this.f2153a;
        Drawable.ConstantState constantState = this.f2154b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new et3(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new et3(this, resources);
    }
}
