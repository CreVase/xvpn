package defpackage;

/* loaded from: classes2.dex */
public final class iy1 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ky1 g;
    public final /* synthetic */ jy1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy1(ky1 ky1Var, jy1 jy1Var, int i) {
        super(1);
        this.f = i;
        this.g = ky1Var;
        this.h = jy1Var;
    }

    public final void a(Throwable th) {
        int i = this.f;
        ky1 ky1Var = this.g;
        jy1 jy1Var = this.h;
        switch (i) {
            case 0:
                ky1Var.e(jy1Var.f2856b);
                return;
            default:
                ky1.h.set(ky1Var, jy1Var.f2856b);
                ky1Var.e(jy1Var.f2856b);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((Throwable) obj);
                return ch3Var;
            default:
                a((Throwable) obj);
                return ch3Var;
        }
    }
}
