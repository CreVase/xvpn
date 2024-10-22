package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ic1 extends f62 {
    public final boolean l;

    public ic1(String str, jc1 jc1Var) {
        super(str, jc1Var, 1);
        this.l = true;
    }

    @Override // defpackage.f62
    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic1) {
            mp2 mp2Var = (mp2) obj;
            if (m20.L(this.f2048a, mp2Var.a())) {
                ic1 ic1Var = (ic1) obj;
                if (ic1Var.l && Arrays.equals((mp2[]) this.j.getValue(), (mp2[]) ic1Var.j.getValue())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int e = mp2Var.e();
                    int i = this.c;
                    if (i == e) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (m20.L(h(i2).a(), mp2Var.h(i2).a()) && m20.L(h(i2).getKind(), mp2Var.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.f62
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.f62, defpackage.mp2
    public final boolean isInline() {
        return this.l;
    }
}
