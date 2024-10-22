package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class tq3 extends sq3 {
    public static final wq3 q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        q = wq3.h(null, windowInsets);
    }

    public tq3(wq3 wq3Var, WindowInsets windowInsets) {
        super(wq3Var, windowInsets);
    }

    @Override // defpackage.oq3, defpackage.uq3
    public final void d(View view) {
    }

    @Override // defpackage.oq3, defpackage.uq3
    public rc1 f(int i) {
        Insets insets;
        insets = this.c.getInsets(vq3.a(i));
        return rc1.c(insets);
    }
}
