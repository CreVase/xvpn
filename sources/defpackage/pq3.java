package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class pq3 extends oq3 {
    public rc1 m;

    public pq3(wq3 wq3Var, WindowInsets windowInsets) {
        super(wq3Var, windowInsets);
        this.m = null;
    }

    @Override // defpackage.uq3
    public wq3 b() {
        return wq3.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.uq3
    public wq3 c() {
        return wq3.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.uq3
    public final rc1 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = rc1.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.uq3
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.uq3
    public void q(rc1 rc1Var) {
        this.m = rc1Var;
    }
}
