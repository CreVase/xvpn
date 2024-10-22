package defpackage;

import android.graphics.Rect;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.StartAppGuideToPurchaseActivity;

/* loaded from: classes2.dex */
public final class t03 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ StartAppGuideToPurchaseActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t03(StartAppGuideToPurchaseActivity startAppGuideToPurchaseActivity, int i) {
        super(1);
        this.f = i;
        this.g = startAppGuideToPurchaseActivity;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        int i;
        ch3 ch3Var = ch3.f636a;
        int i2 = this.f;
        StartAppGuideToPurchaseActivity startAppGuideToPurchaseActivity = this.g;
        switch (i2) {
            case 0:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj;
                if (startAppGuideToPurchaseActivity.b0().e.isSelected()) {
                    i = 33;
                } else {
                    i = 34;
                }
                baseIAPHelper.h(i);
                return ch3Var;
            default:
                Rect rect = (Rect) obj;
                startAppGuideToPurchaseActivity.b0().g.setPadding(0, rect.top, 0, rect.bottom);
                startAppGuideToPurchaseActivity.c0();
                return ch3Var;
        }
    }
}
