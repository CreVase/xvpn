package defpackage;

/* loaded from: classes2.dex */
public final class xr0 extends f62 {
    public final sp2 l;
    public final k43 m;

    public xr0(String str, int i) {
        super(str, null, i);
        this.l = sp2.f4395b;
        this.m = new k43(new wr0(i, str, this));
    }

    @Override // defpackage.f62
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mp2)) {
            return false;
        }
        mp2 mp2Var = (mp2) obj;
        if (mp2Var.getKind() != sp2.f4395b) {
            return false;
        }
        if (m20.L(this.f2048a, mp2Var.a()) && m20.L(zf3.g(this), zf3.g(mp2Var))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f62, defpackage.mp2
    public final tp2 getKind() {
        return this.l;
    }

    @Override // defpackage.f62, defpackage.mp2
    public final mp2 h(int i) {
        return ((mp2[]) this.m.getValue())[i];
    }

    @Override // defpackage.f62
    public final int hashCode() {
        int i;
        int hashCode = this.f2048a.hashCode();
        int i2 = 1;
        pp2 pp2Var = new pp2(this, 1);
        while (pp2Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) pp2Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.f62
    public final String toString() {
        return d20.K0(new qp2(this, 1), ", ", this.f2048a + '(', ")", null, 56);
    }
}
