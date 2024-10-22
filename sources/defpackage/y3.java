package defpackage;

import androidx.fragment.app.l;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class y3 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ f4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(f4 f4Var, int i) {
        super(0);
        this.f = i;
        this.g = f4Var;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m254invoke();
                return ch3Var;
            case 1:
                m254invoke();
                return ch3Var;
            case 2:
                m254invoke();
                return ch3Var;
            case 3:
                m254invoke();
                return ch3Var;
            case 4:
                m254invoke();
                return ch3Var;
            case 5:
                m254invoke();
                return ch3Var;
            case 6:
                m254invoke();
                return ch3Var;
            case 7:
                m254invoke();
                return ch3Var;
            default:
                m254invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m254invoke() {
        int i = this.f;
        f4 f4Var = this.g;
        switch (i) {
            case 0:
                f4.D(f4Var);
                return;
            case 1:
                f4.D(f4Var);
                return;
            case 2:
                l requireActivity = f4Var.requireActivity();
                HomeActivity homeActivity = requireActivity instanceof HomeActivity ? (HomeActivity) requireActivity : null;
                if (homeActivity != null) {
                    homeActivity.U();
                    return;
                }
                return;
            case 3:
                int i2 = f4.q;
                f4Var.E(1);
                return;
            case 4:
                int i3 = f4.q;
                f4Var.E(2);
                return;
            case 5:
                f4.D(f4Var);
                return;
            case 6:
                f4.D(f4Var);
                return;
            case 7:
                int i4 = f4.q;
                f4Var.E(3);
                return;
            default:
                int i5 = f4.q;
                nd3.P((HomeActivity) f4Var.requireActivity());
                zf3.T(f4Var, null, new e4(f4Var, null), 3);
                return;
        }
    }
}
