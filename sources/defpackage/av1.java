package defpackage;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class av1 implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cv1 f344a;

    public av1(cv1 cv1Var) {
        this.f344a = cv1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f344a.c();
    }
}
