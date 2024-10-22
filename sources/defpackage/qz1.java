package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class qz1 extends c70 {
    static {
        bo1.e("NetworkNotRoamingCtrlr");
    }

    public qz1(Context context, g63 g63Var) {
        super((tz1) eb3.y(context, g63Var).c);
    }

    @Override // defpackage.c70
    public final boolean a(rs3 rs3Var) {
        if (rs3Var.j.f4633a == uz1.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c70
    public final boolean b(Object obj) {
        rz1 rz1Var = (rz1) obj;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 24) {
            bo1.c().a(new Throwable[0]);
            return !rz1Var.f4243a;
        }
        if (!rz1Var.f4243a || !rz1Var.d) {
            z = true;
        }
        return z;
    }
}
