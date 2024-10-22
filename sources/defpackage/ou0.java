package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ou0 implements v23 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final hb1 f3730b;

    public ou0(long j, ji2 ji2Var) {
        this.f3729a = j;
        this.f3730b = ji2Var;
    }

    @Override // defpackage.v23
    public final int a(long j) {
        if (this.f3729a > j) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.v23
    public final long b(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        return this.f3729a;
    }

    @Override // defpackage.v23
    public final List c(long j) {
        if (j >= this.f3729a) {
            return this.f3730b;
        }
        db1 db1Var = hb1.f2394b;
        return ji2.e;
    }

    @Override // defpackage.v23
    public final int d() {
        return 1;
    }
}
