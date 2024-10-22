package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.d70;
import defpackage.f70;

/* loaded from: classes.dex */
public class Group extends d70 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.d70
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.d70
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
    }

    @Override // defpackage.d70
    public final void j() {
        f70 f70Var = (f70) getLayoutParams();
        f70Var.p0.O(0);
        f70Var.p0.L(0);
    }

    @Override // defpackage.d70, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
