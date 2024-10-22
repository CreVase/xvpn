package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class dq1 implements mp2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1819a;

    /* renamed from: b, reason: collision with root package name */
    public final mp2 f1820b;
    public final mp2 c;
    public final int d = 2;

    public dq1(String str, mp2 mp2Var, mp2 mp2Var2) {
        this.f1819a = str;
        this.f1820b = mp2Var;
        this.c = mp2Var2;
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.f1819a;
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        Integer P0 = g23.P0(str);
        if (P0 != null) {
            return P0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq1)) {
            return false;
        }
        dq1 dq1Var = (dq1) obj;
        if (m20.L(this.f1819a, dq1Var.f1819a) && m20.L(this.f1820b, dq1Var.f1820b) && m20.L(this.c, dq1Var.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return cr0.f1659a;
        }
        throw new IllegalArgumentException(hx2.s(p71.o("Illegal index ", i, ", "), this.f1819a, " expects only non-negative indices").toString());
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return cr0.f1659a;
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return o23.c;
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f1820b;
        }
        throw new IllegalArgumentException(hx2.s(p71.o("Illegal index ", i, ", "), this.f1819a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f1820b.hashCode() + (this.f1819a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        throw new IllegalArgumentException(hx2.s(p71.o("Illegal index ", i, ", "), this.f1819a, " expects only non-negative indices").toString());
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f1819a + '(' + this.f1820b + ", " + this.c + ')';
    }
}
