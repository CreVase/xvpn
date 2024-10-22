package defpackage;

/* loaded from: classes.dex */
public final class gw3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2336a;

    /* renamed from: b, reason: collision with root package name */
    public long f2337b;
    public Object c;

    public gw3(int i) {
        this.f2336a = i;
        if (i == 1) {
            this.f2337b = 0L;
        } else {
            if (i != 2) {
                return;
            }
            this.f2337b = 0L;
            this.c = vn1.REASON_UNKNOWN;
        }
    }

    public final void a(int i) {
        if (i >= 64) {
            Object obj = this.c;
            if (((gw3) obj) != null) {
                ((gw3) obj).a(i - 64);
                return;
            }
            return;
        }
        this.f2337b &= ~(1 << i);
    }

    public final int b(int i) {
        Object obj = this.c;
        if (((gw3) obj) == null) {
            if (i >= 64) {
                return Long.bitCount(this.f2337b);
            }
            return Long.bitCount(this.f2337b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2337b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2337b) + ((gw3) obj).b(i - 64);
    }

    public final void c() {
        if (((gw3) this.c) == null) {
            this.c = new gw3(1);
        }
    }

    public final boolean d(int i) {
        if (i >= 64) {
            c();
            return ((gw3) this.c).d(i - 64);
        }
        if ((this.f2337b & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    public final void e(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            c();
            ((gw3) this.c).e(i - 64, z);
            return;
        }
        long j = this.f2337b;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.f2337b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || ((gw3) this.c) != null) {
            c();
            ((gw3) this.c).e(0, z2);
        }
    }

    public final boolean f(int i) {
        boolean z;
        if (i >= 64) {
            c();
            return ((gw3) this.c).f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f2337b;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.f2337b = j3;
        long j4 = j - 1;
        this.f2337b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        Object obj = this.c;
        if (((gw3) obj) != null) {
            if (((gw3) obj).d(0)) {
                h(63);
            }
            ((gw3) this.c).f(0);
        }
        return z;
    }

    public final void g() {
        this.f2337b = 0L;
        Object obj = this.c;
        if (((gw3) obj) != null) {
            ((gw3) obj).g();
        }
    }

    public final void h(int i) {
        if (i >= 64) {
            c();
            ((gw3) this.c).h(i - 64);
        } else {
            this.f2337b |= 1 << i;
        }
    }

    public final String toString() {
        switch (this.f2336a) {
            case 1:
                if (((gw3) this.c) == null) {
                    return Long.toBinaryString(this.f2337b);
                }
                return ((gw3) this.c).toString() + "xx" + Long.toBinaryString(this.f2337b);
            default:
                return super.toString();
        }
    }

    public gw3(long j, ji2 ji2Var) {
        this.f2336a = 3;
        this.f2337b = j;
        this.c = ji2Var;
    }
}
