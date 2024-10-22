package androidx.lifecycle;

import defpackage.aa0;
import defpackage.bk1;
import defpackage.ck1;
import defpackage.t90;
import defpackage.tj1;
import defpackage.uj1;
import defpackage.vj1;
import defpackage.zf3;
import defpackage.zj1;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements zj1, aa0 {

    /* renamed from: a, reason: collision with root package name */
    public final vj1 f252a;

    /* renamed from: b, reason: collision with root package name */
    public final t90 f253b;

    public LifecycleCoroutineScopeImpl(vj1 vj1Var, t90 t90Var) {
        this.f252a = vj1Var;
        this.f253b = t90Var;
        if (((ck1) vj1Var).d == uj1.DESTROYED) {
            zf3.h(t90Var, null);
        }
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        vj1 vj1Var = this.f252a;
        if (((ck1) vj1Var).d.compareTo(uj1.DESTROYED) <= 0) {
            vj1Var.b(this);
            zf3.h(this.f253b, null);
        }
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.f253b;
    }
}
