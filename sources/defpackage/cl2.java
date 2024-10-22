package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class cl2 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final fr1 f663a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f664b;

    public cl2(fr1 fr1Var) {
        this.f663a = fr1Var;
        this.f664b = false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new dl2(new cl2(this));
    }

    public cl2(cl2 cl2Var) {
        this.f663a = (fr1) cl2Var.f663a.f2139a.newDrawable();
        this.f664b = cl2Var.f664b;
    }
}
