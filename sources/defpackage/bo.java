package defpackage;

import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class bo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIAPHelper f497b;
    public final /* synthetic */ ac2[] c;
    public final /* synthetic */ String d;

    public /* synthetic */ bo(BaseIAPHelper baseIAPHelper, ac2[] ac2VarArr, String str, int i) {
        this.f496a = i;
        this.f497b = baseIAPHelper;
        this.c = ac2VarArr;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f496a;
        String str = this.d;
        ac2[] ac2VarArr = this.c;
        BaseIAPHelper baseIAPHelper = this.f497b;
        switch (i) {
            case 0:
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.r(ac2VarArr, str);
                return;
            default:
                ArrayList arrayList2 = BaseIAPHelper.f;
                baseIAPHelper.r(ac2VarArr, str);
                return;
        }
    }
}
