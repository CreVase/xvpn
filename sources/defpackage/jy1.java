package defpackage;

/* loaded from: classes2.dex */
public final class jy1 implements uu, do3 {

    /* renamed from: a, reason: collision with root package name */
    public final vu f2855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2856b = null;
    public final /* synthetic */ ky1 c;

    public jy1(ky1 ky1Var, vu vuVar) {
        this.c = ky1Var;
        this.f2855a = vuVar;
    }

    @Override // defpackage.do3
    public final void a(to2 to2Var, int i) {
        this.f2855a.a(to2Var, i);
    }

    @Override // defpackage.uu
    public final void e(v90 v90Var) {
        this.f2855a.e(v90Var);
    }

    @Override // defpackage.uu
    public final pq0 f(Object obj, x31 x31Var) {
        ky1 ky1Var = this.c;
        iy1 iy1Var = new iy1(ky1Var, this, 1);
        pq0 f = this.f2855a.f((ch3) obj, iy1Var);
        if (f != null) {
            ky1.h.set(ky1Var, this.f2856b);
        }
        return f;
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return this.f2855a.e;
    }

    @Override // defpackage.uu
    public final boolean i(Throwable th) {
        return this.f2855a.i(th);
    }

    @Override // defpackage.uu
    public final void l(Object obj) {
        this.f2855a.l(obj);
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        this.f2855a.resumeWith(obj);
    }
}
