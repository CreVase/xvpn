package defpackage;

import android.view.View;
import android.widget.TextView;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;

/* loaded from: classes2.dex */
public final class o61 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GuideToPurchaseNew2Activity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o61(GuideToPurchaseNew2Activity guideToPurchaseNew2Activity, int i) {
        super(1);
        this.f = i;
        this.g = guideToPurchaseNew2Activity;
    }

    public final void a(View view) {
        int i = this.f;
        GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.g;
        switch (i) {
            case 1:
                guideToPurchaseNew2Activity.getClass();
                fl.n(guideToPurchaseNew2Activity, (TextView) view, 1000013);
                return;
            default:
                guideToPurchaseNew2Activity.getClass();
                fl.g(guideToPurchaseNew2Activity, view, 1000099);
                ((BorderLinearLayout) view).setBorderColorId(1000100);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        int i;
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj;
                if (this.g.Z().f.isSelected()) {
                    i = 33;
                } else {
                    i = 34;
                }
                baseIAPHelper.h(i);
                return ch3Var;
            case 1:
                a((View) obj);
                return ch3Var;
            default:
                a((View) obj);
                return ch3Var;
        }
    }
}
