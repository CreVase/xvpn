package defpackage;

/* loaded from: classes2.dex */
public final class dh1 extends j0 {
    public final rf1 e;
    public final int f;
    public int g;

    public dh1(qf1 qf1Var, rf1 rf1Var) {
        super(qf1Var);
        this.e = rf1Var;
        this.f = rf1Var.size();
        this.g = -1;
    }

    @Override // defpackage.qy1
    public final String P(mp2 mp2Var, int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.j0
    public final eg1 T(String str) {
        return (eg1) this.e.f4145a.get(Integer.parseInt(str));
    }

    @Override // defpackage.j0
    public final eg1 W() {
        return this.e;
    }

    @Override // defpackage.f40
    public final int j(mp2 mp2Var) {
        int i = this.g;
        if (i < this.f - 1) {
            int i2 = i + 1;
            this.g = i2;
            return i2;
        }
        return -1;
    }
}
