package defpackage;

/* loaded from: classes2.dex */
public final class us2 implements yl0 {

    /* renamed from: a, reason: collision with root package name */
    public final ws2 f4727a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4728b;
    public final Object c;
    public final c90 d;

    public us2(ws2 ws2Var, long j, Object obj, vu vuVar) {
        this.f4727a = ws2Var;
        this.f4728b = j;
        this.c = obj;
        this.d = vuVar;
    }

    @Override // defpackage.yl0
    public final void d() {
        ws2 ws2Var = this.f4727a;
        synchronized (ws2Var) {
            if (this.f4728b >= ws2Var.m()) {
                Object[] objArr = ws2Var.g;
                long j = this.f4728b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    objArr[(objArr.length - 1) & ((int) j)] = bx3.i;
                    ws2Var.h();
                }
            }
        }
    }
}
