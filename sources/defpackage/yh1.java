package defpackage;

import android.content.Context;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class yh1 extends du3 {

    /* renamed from: b, reason: collision with root package name */
    public x31 f5335b;

    public yh1(Context context) {
        super(context, null, 4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        x31 x31Var = this.f5335b;
        if (x31Var != null) {
            z = ((Boolean) x31Var.invoke(keyEvent)).booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final x31 getOnKeyAction() {
        return this.f5335b;
    }

    public final void setOnKeyAction(x31 x31Var) {
        this.f5335b = x31Var;
    }
}
