package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ry2 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vy2 f4238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u93 f4239b;

    public ry2(vy2 vy2Var, u93 u93Var) {
        this.f4238a = vy2Var;
        this.f4239b = u93Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        view.removeOnLayoutChangeListener(this);
        vy2 vy2Var = this.f4238a;
        vy2Var.c.getClass();
        wy2 wy2Var = vy2Var.d;
        if (wy2Var != null) {
            vy2Var.d = null;
            u93 u93Var = this.f4239b;
            u93Var.f().postOnAnimation(new lf(2, u93Var, wy2Var));
        }
    }
}
