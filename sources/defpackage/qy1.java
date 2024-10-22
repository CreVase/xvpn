package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class qy1 implements qe0, f40 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4074a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4075b;

    @Override // defpackage.f40
    public final /* bridge */ /* synthetic */ void A() {
    }

    @Override // defpackage.f40
    public final Object B(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        String Q = Q(mp2Var, i);
        e63 e63Var = new e63(this, uh1Var, obj, 0);
        this.f4074a.add(Q);
        Object invoke = e63Var.invoke();
        if (!this.f4075b) {
            R();
        }
        this.f4075b = false;
        return invoke;
    }

    @Override // defpackage.f40
    public final boolean C(mp2 mp2Var, int i) {
        return y(Q(mp2Var, i));
    }

    @Override // defpackage.qe0
    public final byte D() {
        return E(R());
    }

    public abstract byte E(Object obj);

    @Override // defpackage.qe0
    public final short F() {
        return N(R());
    }

    @Override // defpackage.qe0
    public final float G() {
        return L(R());
    }

    @Override // defpackage.f40
    public final long H(mp2 mp2Var, int i) {
        String Q = Q(mp2Var, i);
        j0 j0Var = (j0) this;
        try {
            return Long.parseLong(j0Var.V(Q).c());
        } catch (IllegalArgumentException unused) {
            j0Var.X("long");
            throw null;
        }
    }

    @Override // defpackage.qe0
    public final double I() {
        return K(R());
    }

    public abstract char J(Object obj);

    public abstract double K(Object obj);

    public abstract float L(Object obj);

    public abstract qe0 M(Object obj, mp2 mp2Var);

    public abstract short N(Object obj);

    public abstract String O(Object obj);

    public String P(mp2 mp2Var, int i) {
        return mp2Var.f(i);
    }

    public final String Q(mp2 mp2Var, int i) {
        Object obj;
        String P = P(mp2Var, i);
        ArrayList arrayList = this.f4074a;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        return P;
    }

    public final Object R() {
        ArrayList arrayList = this.f4074a;
        Object remove = arrayList.remove(tf3.N(arrayList));
        this.f4075b = true;
        return remove;
    }

    @Override // defpackage.f40
    public final qe0 e(q72 q72Var, int i) {
        return M(Q(q72Var, i), q72Var.h(i));
    }

    @Override // defpackage.qe0
    public final boolean f() {
        return y(R());
    }

    @Override // defpackage.qe0
    public final char g() {
        return J(R());
    }

    @Override // defpackage.f40
    public final float i(mp2 mp2Var, int i) {
        return L(Q(mp2Var, i));
    }

    @Override // defpackage.f40
    public final double k(q72 q72Var, int i) {
        return K(Q(q72Var, i));
    }

    @Override // defpackage.f40
    public final char l(q72 q72Var, int i) {
        return J(Q(q72Var, i));
    }

    @Override // defpackage.f40
    public final byte n(q72 q72Var, int i) {
        return E(Q(q72Var, i));
    }

    @Override // defpackage.f40
    public final String o(mp2 mp2Var, int i) {
        return O(Q(mp2Var, i));
    }

    @Override // defpackage.qe0
    public final int p() {
        j0 j0Var = (j0) this;
        try {
            return Integer.parseInt(j0Var.V((String) R()).c());
        } catch (IllegalArgumentException unused) {
            j0Var.X("int");
            throw null;
        }
    }

    @Override // defpackage.f40
    public final short q(q72 q72Var, int i) {
        return N(Q(q72Var, i));
    }

    @Override // defpackage.qe0
    public final /* bridge */ /* synthetic */ void r() {
    }

    @Override // defpackage.qe0
    public final qe0 s(mp2 mp2Var) {
        return M(R(), mp2Var);
    }

    @Override // defpackage.f40
    public final Object t(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        String Q = Q(mp2Var, i);
        e63 e63Var = new e63(this, uh1Var, obj, 1);
        this.f4074a.add(Q);
        Object invoke = e63Var.invoke();
        if (!this.f4075b) {
            R();
        }
        this.f4075b = false;
        return invoke;
    }

    @Override // defpackage.f40
    public final int u(mp2 mp2Var, int i) {
        String Q = Q(mp2Var, i);
        j0 j0Var = (j0) this;
        try {
            return Integer.parseInt(j0Var.V(Q).c());
        } catch (IllegalArgumentException unused) {
            j0Var.X("int");
            throw null;
        }
    }

    @Override // defpackage.qe0
    public final String v() {
        return O(R());
    }

    @Override // defpackage.qe0
    public final int w(mp2 mp2Var) {
        j0 j0Var = (j0) this;
        return pg1.f(mp2Var, j0Var.c, j0Var.V((String) R()).c(), "");
    }

    @Override // defpackage.qe0
    public final long x() {
        j0 j0Var = (j0) this;
        try {
            return Long.parseLong(j0Var.V((String) R()).c());
        } catch (IllegalArgumentException unused) {
            j0Var.X("long");
            throw null;
        }
    }

    public abstract boolean y(Object obj);

    @Override // defpackage.qe0
    public abstract boolean z();
}
