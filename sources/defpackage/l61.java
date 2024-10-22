package defpackage;

import android.view.View;
import android.widget.TextView;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;

/* loaded from: classes2.dex */
public final class l61 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GuideToPurchaseNew1Activity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l61(GuideToPurchaseNew1Activity guideToPurchaseNew1Activity, int i) {
        super(1);
        this.f = i;
        this.g = guideToPurchaseNew1Activity;
    }

    public final void a(View view) {
        int i = this.f;
        GuideToPurchaseNew1Activity guideToPurchaseNew1Activity = this.g;
        switch (i) {
            case 2:
                guideToPurchaseNew1Activity.getClass();
                fl.n(guideToPurchaseNew1Activity, (TextView) view, 1000013);
                return;
            default:
                guideToPurchaseNew1Activity.getClass();
                fl.g(guideToPurchaseNew1Activity, view, 1000099);
                ((BorderLinearLayout) view).setBorderColorId(1000100);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        int i;
        ch3 ch3Var = ch3.f636a;
        int i2 = this.f;
        GuideToPurchaseNew1Activity guideToPurchaseNew1Activity = this.g;
        switch (i2) {
            case 0:
                int i3 = GuideToPurchaseNew1Activity.p;
                guideToPurchaseNew1Activity.e0();
                return ch3Var;
            case 1:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj;
                if (guideToPurchaseNew1Activity.Z().h.isSelected()) {
                    i = 33;
                } else {
                    i = 34;
                }
                baseIAPHelper.h(i);
                return ch3Var;
            case 2:
                a((View) obj);
                return ch3Var;
            default:
                a((View) obj);
                return ch3Var;
        }
    }
}
