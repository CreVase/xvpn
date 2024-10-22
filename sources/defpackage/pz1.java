package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class pz1 extends c70 {
    static {
        bo1.e("NetworkMeteredCtrlr");
    }

    public pz1(Context context, g63 g63Var) {
        super((tz1) eb3.y(context, g63Var).c);
    }

    @Override // defpackage.c70
    public final boolean a(rs3 rs3Var) {
        if (rs3Var.j.f4633a == uz1.METERED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c70
    public final boolean b(Object obj) {
        rz1 rz1Var = (rz1) obj;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            bo1.c().a(new Throwable[0]);
            return !rz1Var.f4243a;
        }
        if (!rz1Var.f4243a || !rz1Var.c) {
            z = true;
        }
        return z;
    }
}
