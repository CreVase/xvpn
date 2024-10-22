package defpackage;

import a.du;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.DebugPageActivity;
import com.security.xvpn.z35kb.LanguageActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;

/* loaded from: classes2.dex */
public final class kn0 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ mn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn0(mn0 mn0Var, int i) {
        super(0);
        this.f = i;
        this.g = mn0Var;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m106invoke();
                return ch3Var;
            case 1:
                m106invoke();
                return ch3Var;
            case 2:
                m106invoke();
                return ch3Var;
            case 3:
                m106invoke();
                return ch3Var;
            case 4:
                m106invoke();
                return ch3Var;
            case 5:
                m106invoke();
                return ch3Var;
            case 6:
                m106invoke();
                return ch3Var;
            case 7:
                m106invoke();
                return ch3Var;
            default:
                m106invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m106invoke() {
        int i = this.f;
        mn0 mn0Var = this.g;
        switch (i) {
            case 0:
                ya0.H(mn0Var.getActivity(), DebugPageActivity.class);
                return;
            case 1:
                mn0Var.getActivity();
                md3 md3Var = md3.q;
                yc2.a();
                md3Var.invoke(GoogleIABHelper.g);
                return;
            case 2:
                bx3.a(mn0Var.getActivity());
                return;
            case 3:
                ya0.H(mn0Var.requireActivity(), OtherDevicesForPlayStationActivity.class);
                du.d(269, null);
                return;
            case 4:
                l activity = mn0Var.getActivity();
                if (activity != null) {
                    tf3.h0(activity, OtherDevicesListActivity.class, null, 0, 6);
                    return;
                }
                return;
            case 5:
                l activity2 = mn0Var.getActivity();
                if (activity2 != null) {
                    tf3.h0(activity2, LanguageActivity.class, null, 0, 6);
                    return;
                }
                return;
            case 6:
                m20.X0(mn0Var.getActivity());
                return;
            case 7:
                ew3.Z("sru", "evaluation");
                int i2 = lg2.g;
                v73.r(mn0Var.requireActivity());
                return;
            default:
                l activity3 = mn0Var.getActivity();
                if (activity3 != null) {
                    tf3.h0(activity3, AboutActivity.class, null, 0, 6);
                    return;
                }
                return;
        }
    }
}
