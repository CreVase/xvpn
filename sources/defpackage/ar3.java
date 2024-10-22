package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class ar3 extends s71 {
    public final WindowInsetsController g;
    public final v51 h;
    public final Window i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ar3(android.view.Window r2, defpackage.v51 r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = defpackage.eq3.j(r2)
            r1.<init>(r0, r3)
            r1.i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar3.<init>(android.view.Window, v51):void");
    }

    @Override // defpackage.s71
    public final void l() {
        this.g.hide(7);
    }

    @Override // defpackage.s71
    public final void m(boolean z) {
        WindowInsetsController windowInsetsController = this.g;
        Window window = this.i;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.s71
    public final void n(boolean z) {
        WindowInsetsController windowInsetsController = this.g;
        Window window = this.i;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.s71
    public final void p() {
        this.g.setSystemBarsBehavior(2);
    }

    @Override // defpackage.s71
    public final void r(int i) {
        if ((i & 8) != 0) {
            ((mp0) this.h.f4780b).q();
        }
        this.g.show(i & (-9));
    }

    public ar3(WindowInsetsController windowInsetsController, v51 v51Var) {
        super(3);
        this.g = windowInsetsController;
        this.h = v51Var;
    }
}
