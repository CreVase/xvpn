package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class eh1 extends ch1 {
    public final tg1 j;
    public final List k;
    public final int l;
    public int m;

    public eh1(qf1 qf1Var, tg1 tg1Var) {
        super(qf1Var, tg1Var, null, null);
        this.j = tg1Var;
        List Q0 = d20.Q0(tg1Var.keySet());
        this.k = Q0;
        this.l = Q0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.ch1, defpackage.qy1
    public final String P(mp2 mp2Var, int i) {
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.ch1, defpackage.j0
    public final eg1 T(String str) {
        if (this.m % 2 == 0) {
            return zf3.c(str);
        }
        return (eg1) jq1.l0(this.j, str);
    }

    @Override // defpackage.ch1, defpackage.j0
    public final eg1 W() {
        return this.j;
    }

    @Override // defpackage.ch1
    /* renamed from: Y */
    public final tg1 W() {
        return this.j;
    }

    @Override // defpackage.ch1, defpackage.j0, defpackage.f40
    public final void a(mp2 mp2Var) {
    }

    @Override // defpackage.ch1, defpackage.f40
    public final int j(mp2 mp2Var) {
        int i = this.m;
        if (i < this.l - 1) {
            int i2 = i + 1;
            this.m = i2;
            return i2;
        }
        return -1;
    }
}
