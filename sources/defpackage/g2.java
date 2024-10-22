package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class g2 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f83 f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x30 f2191b;

    public g2(x30 x30Var, dn dnVar) {
        this.f2190a = dnVar;
        this.f2191b = x30Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x30 x30Var = this.f2191b;
        XTextViewNew xTextViewNew = (XTextViewNew) x30Var.e;
        f83 f83Var = this.f2190a;
        f83Var.j(xTextViewNew, 1000144);
        f83Var.x(x30Var.b());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
