package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class k22 {

    /* renamed from: a, reason: collision with root package name */
    public static final k22 f2875a = new k22();

    public final OnBackInvokedCallback a(v31 v31Var) {
        return new j22(v31Var, 0);
    }

    public final void b(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
