package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class wn implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIAPHelper f5041b;
    public final /* synthetic */ String c;

    public /* synthetic */ wn(BaseIAPHelper baseIAPHelper, String str, int i) {
        this.f5040a = i;
        this.f5041b = baseIAPHelper;
        this.c = str;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f5040a;
        String str = this.c;
        BaseIAPHelper baseIAPHelper = this.f5041b;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj;
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                p9Var.f3798a = pd0.y(R.string.RestoreFailed);
                p9Var.f3799b = str;
                if (XApplication.c) {
                    p9Var.d = pd0.y(R.string.OK);
                } else {
                    p9Var.h = pd0.y(R.string.Cancel);
                    p9Var.j = new yn(1, baseIAPHelper);
                    p9Var.d = pd0.y(R.string.ContactUs);
                    p9Var.f = new yn(2, baseIAPHelper);
                }
                return ch3Var;
            default:
                p9 p9Var2 = (p9) obj;
                ArrayList arrayList2 = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                p9Var2.f3798a = pd0.y(R.string.Sorry);
                p9Var2.f3799b = pd0.y(R.string.PremiumAddFailedtips) + "\nError code: " + str;
                p9Var2.h = pd0.y(R.string.Cancel);
                p9Var2.d = pd0.y(R.string.RestorePurchase);
                p9Var2.j = new yn(3, baseIAPHelper);
                p9Var2.f = new yn(4, baseIAPHelper);
                return ch3Var;
        }
    }
}
