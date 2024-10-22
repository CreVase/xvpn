package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class zh1 extends eu3 {

    /* renamed from: b, reason: collision with root package name */
    public x31 f5479b;

    public zh1(Context context) {
        super(context, null, 4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        x31 x31Var = this.f5479b;
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
        return this.f5479b;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    public final void setOnKeyAction(x31 x31Var) {
        this.f5479b = x31Var;
    }
}
