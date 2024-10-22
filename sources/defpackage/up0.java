package defpackage;

import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public final class up0 extends m20 {
    public final /* synthetic */ vp0 k;

    public up0(vp0 vp0Var) {
        this.k = vp0Var;
    }

    @Override // defpackage.m20
    public final void H0(Throwable th) {
        ((aq0) this.k.f2735b).d(th);
    }

    @Override // defpackage.m20
    public final void I0(wq2 wq2Var) {
        Set<int[]> Q0;
        vp0 vp0Var = this.k;
        vp0Var.d = wq2Var;
        wq2 wq2Var2 = vp0Var.d;
        Object obj = vp0Var.f2735b;
        aq0 aq0Var = (aq0) obj;
        s71 s71Var = aq0Var.g;
        lh0 lh0Var = aq0Var.i;
        ((aq0) obj).getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            Q0 = iq0.a();
        } else {
            Q0 = ew3.Q0();
        }
        vp0Var.c = new et2(wq2Var2, s71Var, lh0Var, Q0);
        ((aq0) vp0Var.f2735b).e();
    }
}
