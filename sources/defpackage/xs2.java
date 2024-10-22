package defpackage;

/* loaded from: classes2.dex */
public final class xs2 extends a2 {

    /* renamed from: a, reason: collision with root package name */
    public long f5212a = -1;

    /* renamed from: b, reason: collision with root package name */
    public vu f5213b;

    @Override // defpackage.a2
    public final boolean a(z1 z1Var) {
        ws2 ws2Var = (ws2) z1Var;
        if (this.f5212a >= 0) {
            return false;
        }
        long j = ws2Var.h;
        if (j < ws2Var.i) {
            ws2Var.i = j;
        }
        this.f5212a = j;
        return true;
    }

    @Override // defpackage.a2
    public final c90[] b(z1 z1Var) {
        long j = this.f5212a;
        this.f5212a = -1L;
        this.f5213b = null;
        return ((ws2) z1Var).t(j);
    }
}
