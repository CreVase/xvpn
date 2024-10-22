package defpackage;

/* loaded from: classes.dex */
public final class a10 implements rm2 {

    /* renamed from: a, reason: collision with root package name */
    public final rm2 f12a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13b;
    public final /* synthetic */ b10 c;

    public a10(b10 b10Var, rm2 rm2Var) {
        this.c = b10Var;
        this.f12a = rm2Var;
    }

    @Override // defpackage.rm2
    public final void g() {
        this.f12a.g();
    }

    @Override // defpackage.rm2
    public final int h(long j) {
        if (this.c.j()) {
            return -3;
        }
        return this.f12a.h(j);
    }

    @Override // defpackage.rm2
    public final int i(x50 x50Var, ve0 ve0Var, int i) {
        b10 b10Var = this.c;
        if (b10Var.j()) {
            return -3;
        }
        if (this.f13b) {
            ve0Var.f3342b = 4;
            return -4;
        }
        int i2 = this.f12a.i(x50Var, ve0Var, i);
        if (i2 == -5) {
            y01 y01Var = (y01) x50Var.c;
            y01Var.getClass();
            int i3 = y01Var.B;
            int i4 = y01Var.C;
            if (i3 != 0 || i4 != 0) {
                if (b10Var.e != 0) {
                    i3 = 0;
                }
                if (b10Var.f != Long.MIN_VALUE) {
                    i4 = 0;
                }
                x01 a2 = y01Var.a();
                a2.A = i3;
                a2.B = i4;
                x50Var.c = a2.a();
            }
            return -5;
        }
        long j = b10Var.f;
        if (j != Long.MIN_VALUE && ((i2 == -4 && ve0Var.f >= j) || (i2 == -3 && b10Var.t() == Long.MIN_VALUE && !ve0Var.e))) {
            ve0Var.i();
            ve0Var.f3342b = 4;
            this.f13b = true;
            return -4;
        }
        return i2;
    }

    @Override // defpackage.rm2
    public final boolean isReady() {
        if (!this.c.j() && this.f12a.isReady()) {
            return true;
        }
        return false;
    }
}
