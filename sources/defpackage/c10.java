package defpackage;

/* loaded from: classes.dex */
public final class c10 extends e11 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public c10(a93 a93Var, long j, long j2) {
        super(a93Var);
        long max;
        long j3;
        boolean z = false;
        if (a93Var.i() == 1) {
            z83 n = a93Var.n(0, new z83());
            long max2 = Math.max(0L, j);
            if (!n.l && max2 != 0 && !n.h) {
                throw new d10(1);
            }
            if (j2 == Long.MIN_VALUE) {
                max = n.n;
            } else {
                max = Math.max(0L, j2);
            }
            long j4 = n.n;
            if (j4 != -9223372036854775807L) {
                max = max > j4 ? j4 : max;
                if (max2 > max) {
                    throw new d10(2);
                }
            }
            this.f = max2;
            this.g = max;
            if (max == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = max - max2;
            }
            this.h = j3;
            if (n.i && (max == -9223372036854775807L || (j4 != -9223372036854775807L && max == j4))) {
                z = true;
            }
            this.i = z;
            return;
        }
        throw new d10(0);
    }

    @Override // defpackage.e11, defpackage.a93
    public final y83 g(int i, y83 y83Var, boolean z) {
        long j;
        this.e.g(0, y83Var, z);
        long j2 = y83Var.e - this.f;
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = j3 - j2;
        }
        y83Var.h(y83Var.f5293a, y83Var.f5294b, 0, j, j2, r7.g, false);
        return y83Var;
    }

    @Override // defpackage.e11, defpackage.a93
    public final z83 o(int i, z83 z83Var, long j) {
        this.e.o(0, z83Var, 0L);
        long j2 = z83Var.q;
        long j3 = this.f;
        z83Var.q = j2 + j3;
        z83Var.n = this.h;
        z83Var.i = this.i;
        long j4 = z83Var.m;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            z83Var.m = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            z83Var.m = max - j3;
        }
        long K = wi3.K(j3);
        long j6 = z83Var.e;
        if (j6 != -9223372036854775807L) {
            z83Var.e = j6 + K;
        }
        long j7 = z83Var.f;
        if (j7 != -9223372036854775807L) {
            z83Var.f = j7 + K;
        }
        return z83Var;
    }
}
