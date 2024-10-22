package defpackage;

/* loaded from: classes.dex */
public final class hh {

    /* renamed from: a, reason: collision with root package name */
    public final int f2421a;

    /* renamed from: b, reason: collision with root package name */
    public int f2422b;
    public int c;
    public long d;
    public final boolean e;
    public final r42 f;
    public final r42 g;
    public int h;
    public int i;

    public hh(r42 r42Var, r42 r42Var2, boolean z) {
        this.g = r42Var;
        this.f = r42Var2;
        this.e = z;
        r42Var2.G(12);
        this.f2421a = r42Var2.y();
        r42Var.G(12);
        this.i = r42Var.y();
        m20.S("first_chunk must be 1", r42Var.f() == 1);
        this.f2422b = -1;
    }

    public final boolean a() {
        long w;
        int i;
        int i2 = this.f2422b + 1;
        this.f2422b = i2;
        if (i2 == this.f2421a) {
            return false;
        }
        boolean z = this.e;
        r42 r42Var = this.f;
        if (z) {
            w = r42Var.z();
        } else {
            w = r42Var.w();
        }
        this.d = w;
        if (this.f2422b == this.h) {
            r42 r42Var2 = this.g;
            this.c = r42Var2.y();
            r42Var2.H(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = r42Var2.y() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
