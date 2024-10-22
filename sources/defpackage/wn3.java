package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdSize;

/* loaded from: classes.dex */
public final class wn3 implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5045b;
    public final /* synthetic */ AdSize c;
    public final /* synthetic */ BannerAdSize d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ VungleRtbBannerAd g;

    public wn3(VungleRtbBannerAd vungleRtbBannerAd, Context context, String str, AdSize adSize, BannerAdSize bannerAdSize, String str2, String str3) {
        this.g = vungleRtbBannerAd;
        this.f5044a = context;
        this.f5045b = str;
        this.c = adSize;
        this.d = bannerAdSize;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.g.f1448b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleRtbBannerAd vungleRtbBannerAd = this.g;
        vungleRtbBannerAd.getClass();
        Context context = this.f5044a;
        vungleRtbBannerAd.e = new RelativeLayout(context);
        AdSize adSize = this.c;
        int heightInPixels = adSize.getHeightInPixels(context);
        BannerAdSize bannerAdSize = this.d;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(bannerAdSize.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        vungleRtbBannerAd.e.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        BannerAd bannerAd = new BannerAd(context, this.f5045b, bannerAdSize);
        vungleRtbBannerAd.d = bannerAd;
        bannerAd.setAdListener(vungleRtbBannerAd);
        String str = this.f;
        if (!TextUtils.isEmpty(str)) {
            vungleRtbBannerAd.d.getAdConfig().setWatermark(str);
        }
        vungleRtbBannerAd.d.load(this.e);
    }
}
