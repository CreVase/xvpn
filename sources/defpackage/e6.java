package defpackage;

import a.du;

/* loaded from: classes2.dex */
public final class e6 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x31 g;
    public final /* synthetic */ zp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(x31 x31Var, zp2 zp2Var, int i) {
        super(0);
        this.f = i;
        this.g = x31Var;
        this.h = zp2Var;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m99invoke();
                return ch3Var;
            case 1:
                m99invoke();
                return ch3Var;
            case 2:
                m99invoke();
                return ch3Var;
            default:
                m99invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m99invoke() {
        int i = this.f;
        zp2 zp2Var = this.h;
        x31 x31Var = this.g;
        switch (i) {
            case 0:
                x31Var.invoke(zp2Var);
                return;
            case 1:
                du.d(138, null);
                x31Var.invoke(zp2Var);
                return;
            case 2:
                x31Var.invoke(zp2Var);
                return;
            default:
                du.d(138, null);
                x31Var.invoke(zp2Var);
                return;
        }
    }
}
