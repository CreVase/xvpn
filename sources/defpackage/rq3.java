package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class rq3 extends pq3 {
    public rq3(wq3 wq3Var, WindowInsets windowInsets) {
        super(wq3Var, windowInsets);
    }

    @Override // defpackage.uq3
    public wq3 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return wq3.h(null, consumeDisplayCutout);
    }

    @Override // defpackage.uq3
    public xl0 e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new xl0(displayCutout);
    }

    @Override // defpackage.oq3, defpackage.uq3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq3)) {
            return false;
        }
        rq3 rq3Var = (rq3) obj;
        if (Objects.equals(this.c, rq3Var.c) && Objects.equals(this.g, rq3Var.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.uq3
    public int hashCode() {
        return this.c.hashCode();
    }
}
