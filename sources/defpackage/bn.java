package defpackage;

import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAd$adPlayCallback$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class bn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerAd f493b;

    public /* synthetic */ bn(BannerAd bannerAd, int i) {
        this.f492a = i;
        this.f493b = bannerAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f492a;
        BannerAd bannerAd = this.f493b;
        switch (i) {
            case 0:
                BannerAd$adPlayCallback$1.m14onAdClick$lambda3(bannerAd);
                return;
            case 1:
                BannerAd$adPlayCallback$1.m17onAdLeftApplication$lambda4(bannerAd);
                return;
            case 2:
                BannerAd$adPlayCallback$1.m15onAdEnd$lambda2(bannerAd);
                return;
            case 3:
                BannerAd$adPlayCallback$1.m16onAdImpression$lambda1(bannerAd);
                return;
            default:
                BannerAd$adPlayCallback$1.m18onAdStart$lambda0(bannerAd);
                return;
        }
    }
}
