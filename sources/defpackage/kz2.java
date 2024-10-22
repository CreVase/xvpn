package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.p;

/* loaded from: classes2.dex */
public final class kz2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ p g;
    public final /* synthetic */ lz2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz2(p pVar, lz2 lz2Var, int i) {
        super(0);
        this.f = i;
        this.g = pVar;
        this.h = lz2Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m107invoke() {
        int i = this.f;
        lz2 lz2Var = this.h;
        p pVar = this.g;
        switch (i) {
            case 0:
                a k = hx2.k(pVar, pVar);
                tz2 tz2Var = lz2Var.e;
                if (tz2Var != null) {
                    k.k(tz2Var);
                }
                yo2 yo2Var = lz2Var.f;
                if (yo2Var != null) {
                    if (!yo2Var.isAdded()) {
                        k.d(lz2Var.d, yo2Var, "selectedAppsFragment", 1);
                    }
                    k.l(yo2Var);
                    k.c("selectedAppsFragment");
                    k.h();
                    return;
                }
                return;
            default:
                a k2 = hx2.k(pVar, pVar);
                yo2 yo2Var2 = lz2Var.f;
                if (yo2Var2 != null) {
                    k2.k(yo2Var2);
                }
                e8 e8Var = lz2Var.g;
                if (e8Var != null) {
                    if (!e8Var.isAdded()) {
                        k2.d(lz2Var.d, e8Var, "addAppsFragment", 1);
                    }
                    k2.l(e8Var);
                    k2.c("addAppsFragment");
                    k2.h();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m107invoke();
                return ch3Var;
            default:
                m107invoke();
                return ch3Var;
        }
    }
}
