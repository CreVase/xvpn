package defpackage;

import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BaseFullscreenAd$play$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class tn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFullscreenAd f4541b;

    public /* synthetic */ tn(BaseFullscreenAd baseFullscreenAd, int i) {
        this.f4540a = i;
        this.f4541b = baseFullscreenAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4540a;
        BaseFullscreenAd baseFullscreenAd = this.f4541b;
        switch (i) {
            case 0:
                BaseFullscreenAd$play$1.m31onAdStart$lambda0(baseFullscreenAd);
                return;
            case 1:
                BaseFullscreenAd$play$1.m29onAdLeftApplication$lambda5(baseFullscreenAd);
                return;
            case 2:
                BaseFullscreenAd$play$1.m26onAdClick$lambda3(baseFullscreenAd);
                return;
            case 3:
                BaseFullscreenAd$play$1.m28onAdImpression$lambda1(baseFullscreenAd);
                return;
            case 4:
                BaseFullscreenAd$play$1.m27onAdEnd$lambda2(baseFullscreenAd);
                return;
            default:
                BaseFullscreenAd$play$1.m30onAdRewarded$lambda4(baseFullscreenAd);
                return;
        }
    }
}
