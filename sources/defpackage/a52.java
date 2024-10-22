package defpackage;

/* loaded from: classes2.dex */
public final class a52 implements mx2 {

    /* renamed from: a, reason: collision with root package name */
    public final sr f25a;

    /* renamed from: b, reason: collision with root package name */
    public final lr f26b;
    public so2 c;
    public int d;
    public boolean e;
    public long f;

    public a52(sr srVar) {
        int i;
        this.f25a = srVar;
        lr b2 = srVar.b();
        this.f26b = b2;
        so2 so2Var = b2.f3175a;
        this.c = so2Var;
        if (so2Var == null) {
            i = -1;
        } else {
            i = so2Var.f4387b;
        }
        this.d = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        boolean z;
        so2 so2Var;
        so2 so2Var2;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.e) {
                so2 so2Var3 = this.c;
                lr lrVar2 = this.f26b;
                if (so2Var3 == null || (so2Var3 == (so2Var2 = lrVar2.f3175a) && this.d == so2Var2.f4387b)) {
                    z2 = true;
                }
                if (z2) {
                    if (j == 0) {
                        return 0L;
                    }
                    if (!this.f25a.v(this.f + 1)) {
                        return -1L;
                    }
                    if (this.c == null && (so2Var = lrVar2.f3175a) != null) {
                        this.c = so2Var;
                        this.d = so2Var.f4387b;
                    }
                    long min = Math.min(j, lrVar2.f3176b - this.f);
                    this.f26b.w(this.f, lrVar, min);
                    this.f += min;
                    return min;
                }
                throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        return this.f25a.timeout();
    }
}
