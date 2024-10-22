package defpackage;

import com.security.xvpn.z35kb.purchase.GoogleIABHelper;

/* loaded from: classes2.dex */
public final class ld3 extends ji1 implements v31 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld3(nd3 nd3Var, int i) {
        super(0);
        this.f = i;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m108invoke();
                return ch3Var;
            default:
                m108invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m108invoke() {
        switch (this.f) {
            case 0:
                yc2.a();
                d42 d42Var = d42.H;
                yc2.a();
                d42Var.invoke(GoogleIABHelper.g);
                return;
            default:
                yc2.a();
                md3 md3Var = md3.g;
                yc2.a();
                md3Var.invoke(GoogleIABHelper.g);
                return;
        }
    }
}
