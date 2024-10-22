package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ap1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp1 f312b;

    public /* synthetic */ ap1(dp1 dp1Var, int i) {
        this.f311a = i;
        this.f312b = dp1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f311a;
        dp1 dp1Var = this.f312b;
        switch (i) {
            case 0:
                int i2 = dp1.q;
                dp1Var.D();
                return;
            default:
                int i3 = dp1.q;
                if (dp1Var.isAdded()) {
                    bx3.Z((dn) dp1Var.requireActivity());
                    return;
                }
                return;
        }
    }
}
