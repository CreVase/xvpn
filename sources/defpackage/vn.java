package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class vn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIAPHelper f4863b;

    public /* synthetic */ vn(int i, BaseIAPHelper baseIAPHelper) {
        this.f4862a = i;
        this.f4863b = baseIAPHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4862a;
        BaseIAPHelper baseIAPHelper = this.f4863b;
        switch (i) {
            case 0:
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                bx bxVar = new bx();
                du.d(373, bxVar);
                boolean q = bxVar.q();
                bxVar.h();
                if (q) {
                    ew3.d0(new vn(1, baseIAPHelper));
                    return;
                }
                return;
            case 1:
                baseIAPHelper.k();
                return;
            default:
                ArrayList arrayList2 = BaseIAPHelper.f;
                baseIAPHelper.q("5tuw63ugf5");
                return;
        }
    }
}
