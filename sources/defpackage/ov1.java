package defpackage;

/* loaded from: classes.dex */
public final class ov1 implements mu0 {

    /* renamed from: a, reason: collision with root package name */
    public final mu0 f3735a;

    /* renamed from: b, reason: collision with root package name */
    public final ua3 f3736b;

    public ov1(mu0 mu0Var, ua3 ua3Var) {
        this.f3735a = mu0Var;
        this.f3736b = ua3Var;
    }

    @Override // defpackage.mu0
    public final ua3 a() {
        return this.f3736b;
    }

    @Override // defpackage.mu0
    public final void c(boolean z) {
        this.f3735a.c(z);
    }

    @Override // defpackage.mu0
    public final y01 d(int i) {
        return this.f3735a.d(i);
    }

    @Override // defpackage.mu0
    public final void e() {
        this.f3735a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov1)) {
            return false;
        }
        ov1 ov1Var = (ov1) obj;
        if (this.f3735a.equals(ov1Var.f3735a) && this.f3736b.equals(ov1Var.f3736b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mu0
    public final int f(int i) {
        return this.f3735a.f(i);
    }

    @Override // defpackage.mu0
    public final void g() {
        this.f3735a.g();
    }

    @Override // defpackage.mu0
    public final y01 h() {
        return this.f3735a.h();
    }

    public final int hashCode() {
        return this.f3735a.hashCode() + ((this.f3736b.hashCode() + 527) * 31);
    }

    @Override // defpackage.mu0
    public final void i(float f) {
        this.f3735a.i(f);
    }

    @Override // defpackage.mu0
    public final void j() {
        this.f3735a.j();
    }

    @Override // defpackage.mu0
    public final void k() {
        this.f3735a.k();
    }

    @Override // defpackage.mu0
    public final int l(int i) {
        return this.f3735a.l(i);
    }

    @Override // defpackage.mu0
    public final int length() {
        return this.f3735a.length();
    }
}
