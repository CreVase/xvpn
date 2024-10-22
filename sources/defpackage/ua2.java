package defpackage;

import androidx.fragment.app.l;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class ua2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xa2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua2(xa2 xa2Var, int i) {
        super(0);
        this.f = i;
        this.g = xa2Var;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m250invoke();
                return ch3Var;
            default:
                m250invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m250invoke() {
        int i = this.f;
        xa2 xa2Var = this.g;
        switch (i) {
            case 0:
                l requireActivity = xa2Var.requireActivity();
                HomeActivity homeActivity = requireActivity instanceof HomeActivity ? (HomeActivity) requireActivity : null;
                if (homeActivity != null) {
                    homeActivity.U();
                    return;
                }
                return;
            default:
                int i2 = xa2.o;
                cf3 cf3Var = xa2Var.g;
                if (cf3Var != null) {
                    cf3Var.requestFocus();
                    return;
                }
                return;
        }
    }
}
