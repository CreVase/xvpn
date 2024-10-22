package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class p92 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u92 f3802b;

    public /* synthetic */ p92(u92 u92Var, int i) {
        this.f3801a = i;
        this.f3802b = u92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3801a;
        u92 u92Var = this.f3802b;
        switch (i) {
            case 0:
                u92Var.w();
                return;
            case 1:
                if (!u92Var.L) {
                    kt1 kt1Var = u92Var.q;
                    kt1Var.getClass();
                    kt1Var.c(u92Var);
                    return;
                }
                return;
            default:
                u92Var.F = true;
                return;
        }
    }
}
