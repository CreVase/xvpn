package defpackage;

/* loaded from: classes.dex */
public final class rs3 {

    /* renamed from: a, reason: collision with root package name */
    public String f4206a;

    /* renamed from: b, reason: collision with root package name */
    public fs3 f4207b;
    public String c;
    public String d;
    public jd0 e;
    public jd0 f;
    public long g;
    public long h;
    public long i;
    public u70 j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    static {
        bo1.e("WorkSpec");
    }

    public rs3(String str, String str2) {
        this.f4207b = fs3.ENQUEUED;
        jd0 jd0Var = jd0.c;
        this.e = jd0Var;
        this.f = jd0Var;
        this.j = u70.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.f4206a = str;
        this.c = str2;
    }

    public final long a() {
        boolean z;
        long j;
        long j2;
        long scalb;
        boolean z2 = false;
        if (this.f4207b == fs3.ENQUEUED && this.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.l == 2) {
                z2 = true;
            }
            if (z2) {
                scalb = this.m * this.k;
            } else {
                scalb = Math.scalb((float) this.m, this.k - 1);
            }
            j2 = this.n;
            j = Math.min(18000000L, scalb);
        } else {
            long j3 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.n;
                if (j4 == 0) {
                    j4 = this.g + currentTimeMillis;
                }
                long j5 = this.i;
                long j6 = this.h;
                if (j5 != j6) {
                    z2 = true;
                }
                if (z2) {
                    if (j4 == 0) {
                        j3 = j5 * (-1);
                    }
                    return j4 + j6 + j3;
                }
                if (j4 != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j = this.n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.g;
        }
        return j + j2;
    }

    public final boolean b() {
        return !u70.i.equals(this.j);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rs3.class != obj.getClass()) {
            return false;
        }
        rs3 rs3Var = (rs3) obj;
        if (this.g != rs3Var.g || this.h != rs3Var.h || this.i != rs3Var.i || this.k != rs3Var.k || this.m != rs3Var.m || this.n != rs3Var.n || this.o != rs3Var.o || this.p != rs3Var.p || this.q != rs3Var.q || !this.f4206a.equals(rs3Var.f4206a) || this.f4207b != rs3Var.f4207b || !this.c.equals(rs3Var.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? rs3Var.d != null : !str.equals(rs3Var.d)) {
            return false;
        }
        if (this.e.equals(rs3Var.e) && this.f.equals(rs3Var.f) && this.j.equals(rs3Var.j) && this.l == rs3Var.l && this.r == rs3Var.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h = p71.h(this.c, (this.f4207b.hashCode() + (this.f4206a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((h + i) * 31)) * 31)) * 31;
        long j = this.g;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int x = (hx2.x(this.l) + ((((this.j.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i4 = (x + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return hx2.x(this.r) + ((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return hx2.s(new StringBuilder("{WorkSpec: "), this.f4206a, "}");
    }

    public rs3(rs3 rs3Var) {
        this.f4207b = fs3.ENQUEUED;
        jd0 jd0Var = jd0.c;
        this.e = jd0Var;
        this.f = jd0Var;
        this.j = u70.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.f4206a = rs3Var.f4206a;
        this.c = rs3Var.c;
        this.f4207b = rs3Var.f4207b;
        this.d = rs3Var.d;
        this.e = new jd0(rs3Var.e);
        this.f = new jd0(rs3Var.f);
        this.g = rs3Var.g;
        this.h = rs3Var.h;
        this.i = rs3Var.i;
        this.j = new u70(rs3Var.j);
        this.k = rs3Var.k;
        this.l = rs3Var.l;
        this.m = rs3Var.m;
        this.n = rs3Var.n;
        this.o = rs3Var.o;
        this.p = rs3Var.p;
        this.q = rs3Var.q;
        this.r = rs3Var.r;
    }
}
