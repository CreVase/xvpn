package androidx.lifecycle;

import defpackage.a22;
import defpackage.bk1;
import defpackage.ck1;
import defpackage.tj1;
import defpackage.uj1;
import defpackage.vl1;
import defpackage.zj1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends vl1 implements zj1 {
    public final bk1 e;
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(b bVar, bk1 bk1Var, a22 a22Var) {
        super(bVar, a22Var);
        this.f = bVar;
        this.e = bk1Var;
    }

    @Override // defpackage.vl1
    public final void d() {
        this.e.getLifecycle().b(this);
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        bk1 bk1Var2 = this.e;
        uj1 uj1Var = ((ck1) bk1Var2.getLifecycle()).d;
        if (uj1Var == uj1.DESTROYED) {
            this.f.h(this.f4856a);
            return;
        }
        uj1 uj1Var2 = null;
        while (uj1Var2 != uj1Var) {
            c(g());
            uj1Var2 = uj1Var;
            uj1Var = ((ck1) bk1Var2.getLifecycle()).d;
        }
    }

    @Override // defpackage.vl1
    public final boolean f(bk1 bk1Var) {
        if (this.e == bk1Var) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vl1
    public final boolean g() {
        return ((ck1) this.e.getLifecycle()).d.a(uj1.STARTED);
    }
}
