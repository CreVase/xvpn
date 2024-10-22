package androidx.activity;

import defpackage.bk1;
import defpackage.g22;
import defpackage.gg;
import defpackage.n22;
import defpackage.o22;
import defpackage.p22;
import defpackage.tj1;
import defpackage.tu;
import defpackage.vj1;
import defpackage.zj1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements zj1, tu {

    /* renamed from: a, reason: collision with root package name */
    public final vj1 f126a;

    /* renamed from: b, reason: collision with root package name */
    public final g22 f127b;
    public n22 c;
    public final /* synthetic */ b d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(b bVar, vj1 vj1Var, p22 p22Var) {
        this.d = bVar;
        this.f126a = vj1Var;
        this.f127b = p22Var;
        vj1Var.a(this);
    }

    @Override // defpackage.tu
    public final void cancel() {
        this.f126a.b(this);
        this.f127b.f2194b.remove(this);
        n22 n22Var = this.c;
        if (n22Var != null) {
            n22Var.cancel();
        }
        this.c = null;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        if (tj1Var == tj1.ON_START) {
            b bVar = this.d;
            gg ggVar = bVar.f131b;
            g22 g22Var = this.f127b;
            ggVar.c(g22Var);
            n22 n22Var = new n22(bVar, g22Var);
            g22Var.f2194b.add(n22Var);
            bVar.d();
            g22Var.c = new o22(bVar, 1);
            this.c = n22Var;
            return;
        }
        if (tj1Var == tj1.ON_STOP) {
            n22 n22Var2 = this.c;
            if (n22Var2 != null) {
                n22Var2.cancel();
                return;
            }
            return;
        }
        if (tj1Var == tj1.ON_DESTROY) {
            cancel();
        }
    }
}
