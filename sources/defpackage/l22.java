package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class l22 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x31 f3054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x31 f3055b;
    public final /* synthetic */ v31 c;
    public final /* synthetic */ v31 d;

    public l22(x31 x31Var, x31 x31Var2, v31 v31Var, v31 v31Var2) {
        this.f3054a = x31Var;
        this.f3055b = x31Var2;
        this.c = v31Var;
        this.d = v31Var2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        this.f3055b.invoke(new tm(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        this.f3054a.invoke(new tm(backEvent));
    }
}
