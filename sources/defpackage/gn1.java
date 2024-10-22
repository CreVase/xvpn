package defpackage;

import androidx.fragment.app.l;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class gn1 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ in1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn1(in1 in1Var, int i) {
        super(0);
        this.f = i;
        this.g = in1Var;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m101invoke();
                return ch3Var;
            case 1:
                m101invoke();
                return ch3Var;
            default:
                m101invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m101invoke() {
        int i = this.f;
        in1 in1Var = this.g;
        switch (i) {
            case 0:
                l requireActivity = in1Var.requireActivity();
                HomeActivity homeActivity = requireActivity instanceof HomeActivity ? (HomeActivity) requireActivity : null;
                if (homeActivity != null) {
                    homeActivity.U();
                    return;
                }
                return;
            case 1:
                e eVar = e.H;
                int i2 = in1.t;
                in1Var.getClass();
                zf3.T(in1Var, null, new hn1(in1Var, eVar, null), 3);
                return;
            default:
                in1Var.E();
                return;
        }
    }
}
