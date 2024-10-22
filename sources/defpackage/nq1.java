package defpackage;

/* loaded from: classes.dex */
public final class nq1 extends a93 {
    public final dt1 e;

    public nq1(dt1 dt1Var) {
        this.e = dt1Var;
    }

    @Override // defpackage.a93
    public final int b(Object obj) {
        if (obj == mq1.h) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.a93
    public final y83 g(int i, y83 y83Var, boolean z) {
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = mq1.h;
        }
        y83Var.h(num, obj, 0, -9223372036854775807L, 0L, r7.g, true);
        return y83Var;
    }

    @Override // defpackage.a93
    public final int i() {
        return 1;
    }

    @Override // defpackage.a93
    public final Object m(int i) {
        return mq1.h;
    }

    @Override // defpackage.a93
    public final z83 o(int i, z83 z83Var, long j) {
        z83Var.b(z83.r, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        z83Var.l = true;
        return z83Var;
    }

    @Override // defpackage.a93
    public final int p() {
        return 1;
    }
}
