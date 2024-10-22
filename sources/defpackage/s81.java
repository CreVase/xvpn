package defpackage;

import a.bx;
import a.du;
import android.app.Activity;
import com.security.xvpn.z35kb.banner.HomeBannerManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class s81 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeBannerManager f4291b;

    public /* synthetic */ s81(HomeBannerManager homeBannerManager, int i) {
        this.f4290a = i;
        this.f4291b = homeBannerManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4290a;
        boolean z = false;
        HomeBannerManager homeBannerManager = this.f4291b;
        switch (i) {
            case 0:
                homeBannerManager.j();
                return;
            case 1:
                homeBannerManager.getClass();
                ew3.h("cnyvnhbgbe", true);
                Activity activity = homeBannerManager.f1594a;
                if (activity != null && !((lt3) activity).e) {
                    z = true;
                }
                String str = "yk98ww2b89";
                if (!ew3.X()) {
                    bx i2 = hx2.i(477);
                    boolean q = i2.q();
                    i2.h();
                    if (q) {
                        str = "rv4wtehzs9";
                    }
                    bx i3 = hx2.i(478);
                    boolean q2 = i3.q();
                    i3.h();
                    if (q2) {
                        str = "nvkr9v2urz";
                    }
                }
                if (z) {
                    ew3.f(str);
                    return;
                }
                bx bxVar = new bx();
                bxVar.z(str);
                bxVar.v(z);
                du.d(148, bxVar);
                bxVar.h();
                return;
            case 2:
                if (homeBannerManager.c instanceof y81) {
                    ew3.h("mjg7mtnbg7", true);
                    ew3.j();
                    return;
                } else {
                    ew3.h("cnyvnhbgbe", false);
                    ew3.j();
                    return;
                }
            default:
                homeBannerManager.getClass();
                ew3.f("v67beaug6k");
                return;
        }
    }
}
