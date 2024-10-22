package androidx.lifecycle;

import defpackage.bk1;
import defpackage.tj1;
import defpackage.tm2;
import defpackage.vj1;
import defpackage.zj1;
import defpackage.zm2;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f259a;

    /* renamed from: b, reason: collision with root package name */
    public final tm2 f260b;
    public boolean c;

    public SavedStateHandleController(String str, tm2 tm2Var) {
        this.f259a = str;
        this.f260b = tm2Var;
    }

    public final void c(vj1 vj1Var, zm2 zm2Var) {
        if (!this.c) {
            this.c = true;
            vj1Var.a(this);
            zm2Var.c(this.f259a, this.f260b.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        if (tj1Var == tj1.ON_DESTROY) {
            this.c = false;
            bk1Var.getLifecycle().b(this);
        }
    }
}
