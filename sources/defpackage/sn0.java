package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sn0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ un0 f4378b;
    public final /* synthetic */ vn0 c;

    public /* synthetic */ sn0(un0 un0Var, vn0 vn0Var, int i) {
        this.f4377a = i;
        this.f4378b = un0Var;
        this.c = vn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4377a;
        vn0 vn0Var = this.c;
        un0 un0Var = this.f4378b;
        switch (i) {
            case 0:
                vn0Var.q(un0Var.f4702a, un0Var.f4703b);
                return;
            case 1:
                vn0Var.m(un0Var.f4702a, un0Var.f4703b);
                return;
            case 2:
                vn0Var.p(un0Var.f4702a, un0Var.f4703b);
                return;
            default:
                vn0Var.k(un0Var.f4702a, un0Var.f4703b);
                return;
        }
    }
}
