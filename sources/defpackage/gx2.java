package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gx2 extends ex2 {
    public final View k;
    public final WindowInsetsController l;

    public gx2(View view) {
        super(view);
        this.k = view;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [fx2] */
    @Override // defpackage.ex2, defpackage.mp0
    public final void n() {
        int ime;
        View view = this.k;
        WindowInsetsController windowInsetsController = this.l;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: fx2
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    boolean z;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    atomicBoolean2.set(z);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.n();
    }

    @Override // defpackage.ex2, defpackage.mp0
    public final void q() {
        int ime;
        View view = this.k;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.l;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        } else {
            super.q();
        }
    }

    public gx2(WindowInsetsController windowInsetsController) {
        super(null);
        this.l = windowInsetsController;
    }
}
