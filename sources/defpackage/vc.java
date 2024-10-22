package defpackage;

import android.view.Window;

/* loaded from: classes.dex */
public final class vc implements ly0, n4, iv1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jd f4812a;

    public /* synthetic */ vc(jd jdVar) {
        this.f4812a = jdVar;
    }

    @Override // defpackage.iv1
    public final void a(ju1 ju1Var, boolean z) {
        boolean z2;
        int i;
        id idVar;
        ju1 k = ju1Var.k();
        int i2 = 0;
        if (k != ju1Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ju1Var = k;
        }
        jd jdVar = this.f4812a;
        id[] idVarArr = jdVar.L;
        if (idVarArr != null) {
            i = idVarArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                idVar = idVarArr[i2];
                if (idVar != null && idVar.h == ju1Var) {
                    break;
                } else {
                    i2++;
                }
            } else {
                idVar = null;
                break;
            }
        }
        if (idVar != null) {
            if (z2) {
                jdVar.y(idVar.f2568a, idVar, k);
                jdVar.A(idVar, true);
            } else {
                jdVar.A(idVar, z);
            }
        }
    }

    @Override // defpackage.iv1
    public final boolean n(ju1 ju1Var) {
        Window.Callback J;
        if (ju1Var == ju1Var.k()) {
            jd jdVar = this.f4812a;
            if (jdVar.F && (J = jdVar.J()) != null && !jdVar.Q) {
                J.onMenuOpened(108, ju1Var);
                return true;
            }
            return true;
        }
        return true;
    }
}
