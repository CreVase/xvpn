package defpackage;

import android.widget.CompoundButton;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;

/* loaded from: classes2.dex */
public final class a9 extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AdvancedFeaturesActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(AdvancedFeaturesActivity advancedFeaturesActivity, int i) {
        super(2);
        this.f = i;
        this.g = advancedFeaturesActivity;
    }

    public final void a(f43 f43Var, CompoundButton compoundButton) {
        int i = this.f;
        AdvancedFeaturesActivity advancedFeaturesActivity = this.g;
        switch (i) {
            case 1:
                int i2 = AdvancedFeaturesActivity.n;
                advancedFeaturesActivity.getClass();
                m20.C0(advancedFeaturesActivity, 35);
                return;
            case 2:
                t9.u0(advancedFeaturesActivity, new c9(f43Var, 0));
                return;
            case 3:
                int i3 = AdvancedFeaturesActivity.n;
                advancedFeaturesActivity.getClass();
                m20.C0(advancedFeaturesActivity, 35);
                return;
            case 4:
                t9.u0(advancedFeaturesActivity, new c9(f43Var, 1));
                return;
            default:
                t9.u0(advancedFeaturesActivity, new q90(2, f43Var, compoundButton));
                return;
        }
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                CompoundButton compoundButton = (CompoundButton) obj;
                if (((Boolean) obj2).booleanValue()) {
                    if (!ew3.X()) {
                        int i = AdvancedFeaturesActivity.n;
                        AdvancedFeaturesActivity advancedFeaturesActivity = this.g;
                        advancedFeaturesActivity.getClass();
                        m20.C0(advancedFeaturesActivity, 35);
                        compoundButton.setChecked(false);
                    } else {
                        ew3.g("z6pj2w3axy");
                        ew3.m(true);
                    }
                } else {
                    ew3.m(false);
                }
                return ch3Var;
            case 1:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 2:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 3:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            case 4:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
            default:
                a((f43) obj, (CompoundButton) obj2);
                return ch3Var;
        }
    }
}
