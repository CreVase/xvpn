package defpackage;

/* loaded from: classes.dex */
public final class no3 implements mo3 {

    /* renamed from: a, reason: collision with root package name */
    public final fv0 f3505a;

    /* renamed from: b, reason: collision with root package name */
    public final xa3 f3506b;
    public final d2 c;
    public final y01 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public no3(fv0 fv0Var, xa3 xa3Var, d2 d2Var, String str, int i) {
        this.f3505a = fv0Var;
        this.f3506b = xa3Var;
        this.c = d2Var;
        int i2 = (d2Var.c * d2Var.g) / 8;
        if (d2Var.f == i2) {
            int i3 = d2Var.d * i2;
            int i4 = i3 * 8;
            int max = Math.max(i2, i3 / 10);
            this.e = max;
            x01 x01Var = new x01();
            x01Var.k = str;
            x01Var.f = i4;
            x01Var.g = i4;
            x01Var.l = max;
            x01Var.x = d2Var.c;
            x01Var.y = d2Var.d;
            x01Var.z = i;
            this.d = new y01(x01Var);
            return;
        }
        StringBuilder o = p71.o("Expected block size: ", i2, "; got: ");
        o.append(d2Var.f);
        throw u42.a(o.toString(), null);
    }

    @Override // defpackage.mo3
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.mo3
    public final boolean b(ev0 ev0Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int d = this.f3506b.d(ev0Var, (int) Math.min(i2 - i, j2), true);
            if (d == -1) {
                j2 = 0;
            } else {
                this.g += d;
                j2 -= d;
            }
        }
        int i3 = this.c.f;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long G = this.f + wi3.G(this.h, 1000000L, r1.d);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.f3506b.a(G, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        if (j2 <= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mo3
    public final void c(int i, long j) {
        this.f3505a.m(new qo3(this.c, 1, i, j));
        this.f3506b.e(this.d);
    }
}
