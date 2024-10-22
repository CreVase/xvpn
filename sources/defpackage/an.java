package defpackage;

import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAd$adPlayCallback$1;
import com.vungle.ads.VungleError;

/* loaded from: classes2.dex */
public final /* synthetic */ class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerAd f115b;
    public final /* synthetic */ VungleError c;

    public /* synthetic */ an(BannerAd bannerAd, VungleError vungleError, int i) {
        this.f114a = i;
        this.f115b = bannerAd;
        this.c = vungleError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f114a;
        VungleError vungleError = this.c;
        BannerAd bannerAd = this.f115b;
        switch (i) {
            case 0:
                BannerAd.d(bannerAd, vungleError);
                return;
            default:
                BannerAd$adPlayCallback$1.b(bannerAd, vungleError);
                return;
        }
    }
}
