package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class xk1 implements mp2 {

    /* renamed from: a, reason: collision with root package name */
    public final mp2 f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5174b = 1;

    public xk1(mp2 mp2Var) {
        this.f5173a = mp2Var;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.f5174b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk1)) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        if (m20.L(this.f5173a, xk1Var.f5173a) && m20.L(a(), xk1Var.a())) {
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
        StringBuilder o = p71.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return cr0.f1659a;
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return o23.f3590b;
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
            return this.f5173a;
        }
        StringBuilder o = p71.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f5173a.hashCode() * 31);
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
        StringBuilder o = p71.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f5173a + ')';
    }
}
