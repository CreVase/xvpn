package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class cd {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bd, android.window.OnBackInvokedCallback] */
    public static OnBackInvokedCallback b(Object obj, final jd jdVar) {
        Objects.requireNonNull(jdVar);
        ?? r0 = new OnBackInvokedCallback() { // from class: bd
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                jd.this.M();
            }
        };
        w2.g(obj).registerOnBackInvokedCallback(1000000, r0);
        return r0;
    }

    public static void c(Object obj, Object obj2) {
        w2.g(obj).unregisterOnBackInvokedCallback(w2.d(obj2));
    }
}
