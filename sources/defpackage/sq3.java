package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class sq3 extends rq3 {
    public rc1 n;
    public rc1 o;
    public rc1 p;

    public sq3(wq3 wq3Var, WindowInsets windowInsets) {
        super(wq3Var, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.uq3
    public rc1 g() {
        Insets mandatorySystemGestureInsets;
        if (this.o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.o = rc1.c(mandatorySystemGestureInsets);
        }
        return this.o;
    }

    @Override // defpackage.uq3
    public rc1 i() {
        Insets systemGestureInsets;
        if (this.n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.n = rc1.c(systemGestureInsets);
        }
        return this.n;
    }

    @Override // defpackage.uq3
    public rc1 k() {
        Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.p = rc1.c(tappableElementInsets);
        }
        return this.p;
    }

    @Override // defpackage.oq3, defpackage.uq3
    public wq3 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return wq3.h(null, inset);
    }

    @Override // defpackage.pq3, defpackage.uq3
    public void q(rc1 rc1Var) {
    }
}
