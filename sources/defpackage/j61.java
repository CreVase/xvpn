package defpackage;

import android.view.View;
import android.widget.TextView;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;

/* loaded from: classes2.dex */
public final class j61 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GuideToPurchaseActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j61(GuideToPurchaseActivity guideToPurchaseActivity, int i) {
        super(1);
        this.f = i;
        this.g = guideToPurchaseActivity;
    }

    public final void a(View view) {
        int i = this.f;
        GuideToPurchaseActivity guideToPurchaseActivity = this.g;
        switch (i) {
            case 2:
                guideToPurchaseActivity.getClass();
                fl.n(guideToPurchaseActivity, (TextView) view, 1000013);
                return;
            default:
                guideToPurchaseActivity.getClass();
                fl.g(guideToPurchaseActivity, view, 1000099);
                ((BorderLinearLayout) view).setBorderColorId(1000100);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        int i;
        ch3 ch3Var = ch3.f636a;
        int i2 = this.f;
        GuideToPurchaseActivity guideToPurchaseActivity = this.g;
        switch (i2) {
            case 0:
                int i3 = GuideToPurchaseActivity.p;
                guideToPurchaseActivity.e0();
                return ch3Var;
            case 1:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj;
                if (guideToPurchaseActivity.Z().h.isSelected()) {
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
