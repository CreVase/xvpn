package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class br3 {

    /* renamed from: a, reason: collision with root package name */
    public final s71 f518a;

    public br3(WindowInsetsController windowInsetsController) {
        this.f518a = new ar3(windowInsetsController, new v51(windowInsetsController));
    }

    public br3(Window window, View view) {
        v51 v51Var = new v51(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f518a = new ar3(window, v51Var);
            return;
        }
        if (i >= 26) {
            this.f518a = new zq3(window, v51Var);
        } else if (i >= 23) {
            this.f518a = new yq3(window, v51Var);
        } else {
            this.f518a = new xq3(window, v51Var);
        }
    }
}
