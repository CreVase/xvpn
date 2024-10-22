package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class xn implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIAPHelper f5186b;

    public /* synthetic */ xn(int i, BaseIAPHelper baseIAPHelper) {
        this.f5185a = i;
        this.f5186b = baseIAPHelper;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f5185a;
        BaseIAPHelper baseIAPHelper = this.f5186b;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj;
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                p9Var.f3798a = pd0.y(R.string.RestoreFailed);
                p9Var.f3799b = pd0.y(R.string.SubscriptionNotFound);
                if (XApplication.c) {
                    p9Var.d = pd0.y(R.string.OK);
                } else {
                    p9Var.h = pd0.y(R.string.Cancel);
                    p9Var.d = pd0.y(R.string.ContactUs);
                    p9Var.f = new yn(0, baseIAPHelper);
                }
                return ch3Var;
            default:
                p9 p9Var2 = (p9) obj;
                ArrayList arrayList2 = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                p9Var2.f3798a = pd0.y(R.string.Success);
                p9Var2.f3799b = pd0.y(R.string.RestoreSuccess);
                p9Var2.d = pd0.y(R.string.Okay);
                p9Var2.f = new yn(5, baseIAPHelper);
                return ch3Var;
        }
    }
}
