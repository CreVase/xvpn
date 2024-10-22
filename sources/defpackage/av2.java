package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class av2 extends a93 {
    public static final Object j = new Object();
    public final long e;
    public final long f;
    public final boolean g;
    public final dt1 h;
    public final xs1 i;

    static {
        qs1 qs1Var = new qs1();
        qs1Var.f4047a = "SinglePeriodTimeline";
        qs1Var.f4048b = Uri.EMPTY;
        qs1Var.a();
    }

    public av2(long j2, boolean z, boolean z2, dt1 dt1Var) {
        xs1 xs1Var;
        if (z2) {
            xs1Var = dt1Var.c;
        } else {
            xs1Var = null;
        }
        this.e = j2;
        this.f = j2;
        this.g = z;
        dt1Var.getClass();
        this.h = dt1Var;
        this.i = xs1Var;
    }

    @Override // defpackage.a93
    public final int b(Object obj) {
        if (j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.a93
    public final y83 g(int i, y83 y83Var, boolean z) {
        Object obj;
        cp3.i(i, 1);
        if (z) {
            obj = j;
        } else {
            obj = null;
        }
        long j2 = this.e;
        y83Var.getClass();
        y83Var.h(null, obj, 0, j2, 0L, r7.g, false);
        return y83Var;
    }

    @Override // defpackage.a93
    public final int i() {
        return 1;
    }

    @Override // defpackage.a93
    public final Object m(int i) {
        cp3.i(i, 1);
        return j;
    }

    @Override // defpackage.a93
    public final z83 o(int i, z83 z83Var, long j2) {
        cp3.i(i, 1);
        z83Var.b(z83.r, this.h, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.g, false, this.i, 0L, this.f, 0, 0, 0L);
        return z83Var;
    }

    @Override // defpackage.a93
    public final int p() {
        return 1;
    }
}
