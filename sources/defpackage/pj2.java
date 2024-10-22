package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pj2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qj2 f3855b;

    public /* synthetic */ pj2(qj2 qj2Var, int i) {
        this.f3854a = i;
        this.f3855b = qj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3854a;
        qj2 qj2Var = this.f3855b;
        switch (i) {
            case 0:
                rj2 rj2Var = qj2Var.c;
                if (rj2Var.g != null && (rj2Var.f & 3) != 0) {
                    rj2Var.a();
                    return;
                }
                return;
            default:
                rj2 rj2Var2 = qj2Var.c;
                if (rj2Var2.g != null) {
                    rj2Var2.a();
                    return;
                }
                return;
        }
    }
}
