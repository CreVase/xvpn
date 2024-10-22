package defpackage;

/* loaded from: classes2.dex */
public final class oz0 implements gz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gz0 f3755b;
    public final /* synthetic */ l41 c;

    public /* synthetic */ oz0(gz0 gz0Var, l41 l41Var, int i) {
        this.f3754a = i;
        this.f3755b = gz0Var;
        this.c = l41Var;
    }

    @Override // defpackage.gz0
    public final Object a(iz0 iz0Var, c90 c90Var) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f3754a;
        gz0 gz0Var = this.f3755b;
        l41 l41Var = this.c;
        switch (i) {
            case 0:
                Object a2 = gz0Var.a(new qz0(new ci2(), iz0Var, l41Var), c90Var);
                if (a2 == ba0.f430a) {
                    return a2;
                }
                return ch3Var;
            default:
                Object a3 = gz0Var.a(new g(1, iz0Var, l41Var), c90Var);
                if (a3 == ba0.f430a) {
                    return a3;
                }
                return ch3Var;
        }
    }
}
