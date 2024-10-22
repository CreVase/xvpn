package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nu2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu2 f3545b;

    public /* synthetic */ nu2(qu2 qu2Var, int i) {
        this.f3544a = i;
        this.f3545b = qu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3544a;
        qu2 qu2Var = this.f3545b;
        switch (i) {
            case 0:
                String str = qu2.h;
                if (!qu2Var.isHidden()) {
                    qu2Var.d.p.requestFocus();
                    return;
                }
                return;
            default:
                qu2Var.d.p.requestFocus();
                m20.J0(qu2Var.d.p);
                return;
        }
    }
}
