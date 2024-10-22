package defpackage;

/* loaded from: classes.dex */
public final class w92 implements qt1 {

    /* renamed from: a, reason: collision with root package name */
    public final yd0 f4964a;

    /* renamed from: b, reason: collision with root package name */
    public final z5 f4965b;
    public bh0 c;
    public d5 d;
    public final int e;

    public w92(yd0 yd0Var, gv0 gv0Var) {
        z5 z5Var = new z5(gv0Var, 23);
        bh0 bh0Var = new bh0();
        d5 d5Var = new d5();
        this.f4964a = yd0Var;
        this.f4965b = z5Var;
        this.c = bh0Var;
        this.d = d5Var;
        this.e = 1048576;
    }

    @Override // defpackage.qt1
    public final qt1 a(d5 d5Var) {
        if (d5Var != null) {
            this.d = d5Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // defpackage.qt1
    public final qt1 b(bh0 bh0Var) {
        if (bh0Var != null) {
            this.c = bh0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // defpackage.qt1
    public final fo c(dt1 dt1Var) {
        xn0 xn0Var;
        dt1Var.f1834b.getClass();
        Object obj = dt1Var.f1834b.g;
        yd0 yd0Var = this.f4964a;
        z5 z5Var = this.f4965b;
        bh0 bh0Var = this.c;
        bh0Var.getClass();
        dt1Var.f1834b.getClass();
        vs1 vs1Var = dt1Var.f1834b.c;
        if (vs1Var != null && wi3.f5017a >= 18) {
            synchronized (bh0Var.f464a) {
                if (!wi3.a(vs1Var, bh0Var.f465b)) {
                    bh0Var.f465b = vs1Var;
                    bh0Var.c = bh0.a(vs1Var);
                }
                xn0Var = bh0Var.c;
                xn0Var.getClass();
            }
        } else {
            xn0Var = xn0.W;
        }
        return new x92(dt1Var, yd0Var, z5Var, xn0Var, this.d, this.e);
    }
}
