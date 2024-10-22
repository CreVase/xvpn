package defpackage;

import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public final class zk2 implements xk2 {

    /* renamed from: a, reason: collision with root package name */
    public l f5498a;

    /* renamed from: b, reason: collision with root package name */
    public final k43 f5499b = new k43(e.t);

    @Override // defpackage.xk2
    public final void a(l lVar) {
        this.f5498a = lVar;
    }

    @Override // defpackage.xk2
    public final xk2 b(String str) {
        lg2 lg2Var = (lg2) this.f5499b.getValue();
        l lVar = this.f5498a;
        if (lVar == null) {
            lVar = null;
        }
        lg2Var.d = lVar;
        lg2Var.e = str;
        return this;
    }

    @Override // defpackage.xk2
    public final void c() {
        ((lg2) this.f5499b.getValue()).dismissAllowingStateLoss();
    }

    @Override // defpackage.xk2
    public final void show() {
        lg2 lg2Var = (lg2) this.f5499b.getValue();
        l lVar = this.f5498a;
        if (lVar == null) {
            lVar = null;
        }
        lg2Var.show(lVar.getSupportFragmentManager(), "RatingDialog");
    }
}
