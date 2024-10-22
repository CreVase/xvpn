package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Banner;
import com.google.ads.mediation.chartboost.ChartboostBannerAd;
import com.google.ads.mediation.chartboost.ChartboostConstants;
import com.google.ads.mediation.chartboost.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;

/* loaded from: classes.dex */
public final class fx implements hx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2169b;
    public final /* synthetic */ Banner.BannerSize c;
    public final /* synthetic */ ChartboostBannerAd d;

    public fx(ChartboostBannerAd chartboostBannerAd, Context context, String str, Banner.BannerSize bannerSize) {
        this.d = chartboostBannerAd;
        this.f2168a = context;
        this.f2169b = str;
        this.c = bannerSize;
    }

    @Override // defpackage.hx
    public final void a(AdError adError) {
        adError.toString();
        this.d.c.onFailure(adError);
    }

    @Override // defpackage.hx
    public final void onInitializationSucceeded() {
        Context context = this.f2168a;
        String str = this.f2169b;
        ChartboostBannerAd chartboostBannerAd = this.d;
        chartboostBannerAd.getClass();
        if (TextUtils.isEmpty(str)) {
            AdError createAdapterError = ChartboostConstants.createAdapterError(103, "Missing or invalid location.");
            createAdapterError.toString();
            chartboostBannerAd.c.onFailure(createAdapterError);
            return;
        }
        chartboostBannerAd.f1420a = new FrameLayout(context);
        Banner.BannerSize bannerSize = this.c;
        AdSize adSize = new AdSize(bannerSize.getWidth(), bannerSize.getHeight());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        Banner banner = new Banner(context, str, bannerSize, chartboostBannerAd, a.b());
        chartboostBannerAd.f1420a.addView(banner, layoutParams);
        banner.cache();
    }
}
