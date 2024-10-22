package defpackage;

/* loaded from: classes2.dex */
public final class e63 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qy1 g;
    public final /* synthetic */ sk0 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e63(qy1 qy1Var, uh1 uh1Var, Object obj, int i) {
        super(0);
        this.f = i;
        this.g = qy1Var;
        this.h = uh1Var;
        this.i = obj;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        int i = this.f;
        sk0 sk0Var = this.h;
        qy1 qy1Var = this.g;
        switch (i) {
            case 0:
                if (qy1Var.z()) {
                    return pd0.t((j0) qy1Var, sk0Var);
                }
                return null;
            default:
                qy1Var.getClass();
                return pd0.t((j0) qy1Var, sk0Var);
        }
    }
}
