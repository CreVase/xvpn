package defpackage;

/* loaded from: classes.dex */
public final class v03 implements ev0 {

    /* renamed from: a, reason: collision with root package name */
    public final ev0 f4769a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4770b;

    public v03(ev0 ev0Var, long j) {
        boolean z;
        this.f4769a = ev0Var;
        if (ev0Var.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        this.f4770b = j;
    }

    @Override // defpackage.ev0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        return this.f4769a.a(bArr, i, i2, z);
    }

    @Override // defpackage.ev0
    public final void b(int i, byte[] bArr, int i2) {
        this.f4769a.b(i, bArr, i2);
    }

    @Override // defpackage.ev0
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        return this.f4769a.e(bArr, i, i2, z);
    }

    @Override // defpackage.ev0
    public final long f() {
        return this.f4769a.f() - this.f4770b;
    }

    @Override // defpackage.ev0
    public final void g(int i) {
        this.f4769a.g(i);
    }

    @Override // defpackage.ev0
    public final long getPosition() {
        return this.f4769a.getPosition() - this.f4770b;
    }

    @Override // defpackage.ev0
    public final int h(int i, byte[] bArr, int i2) {
        return this.f4769a.h(i, bArr, i2);
    }

    @Override // defpackage.ev0
    public final int i(int i) {
        return this.f4769a.i(i);
    }

    @Override // defpackage.ev0
    public final long j() {
        return this.f4769a.j() - this.f4770b;
    }

    @Override // defpackage.ev0
    public final void l() {
        this.f4769a.l();
    }

    @Override // defpackage.ev0
    public final void m(int i) {
        this.f4769a.m(i);
    }

    @Override // defpackage.ev0
    public final boolean n(int i, boolean z) {
        return this.f4769a.n(i, z);
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        return this.f4769a.read(bArr, i, i2);
    }

    @Override // defpackage.ev0
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f4769a.readFully(bArr, i, i2);
    }
}
