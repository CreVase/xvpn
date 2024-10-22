package defpackage;

/* loaded from: classes2.dex */
public final class xg1 extends j0 {
    public final wg1 e;

    public xg1(qf1 qf1Var, wg1 wg1Var) {
        super(qf1Var);
        this.e = wg1Var;
        this.f4074a.add("primitive");
    }

    @Override // defpackage.j0
    public final eg1 T(String str) {
        boolean z;
        if (str == "primitive") {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // defpackage.j0
    public final eg1 W() {
        return this.e;
    }

    @Override // defpackage.f40
    public final int j(mp2 mp2Var) {
        return 0;
    }
}
