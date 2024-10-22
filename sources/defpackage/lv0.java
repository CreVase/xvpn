package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lv0 implements AdListener, NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeAdBase f3195b;
    public final /* synthetic */ FacebookRtbNativeAd c;

    public lv0(FacebookRtbNativeAd facebookRtbNativeAd, Context context, NativeAdBase nativeAdBase) {
        this.c = facebookRtbNativeAd;
        this.f3195b = nativeAdBase;
        this.f3194a = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        FacebookRtbNativeAd facebookRtbNativeAd = this.c;
        facebookRtbNativeAd.d.reportAdClicked();
        facebookRtbNativeAd.d.onAdOpened();
        facebookRtbNativeAd.d.onAdLeftApplication();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeAdBase nativeAdBase = this.f3195b;
        FacebookRtbNativeAd facebookRtbNativeAd = this.c;
        if (ad != nativeAdBase) {
            AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            facebookRtbNativeAd.f1439b.onFailure(adError);
            return;
        }
        Context context = (Context) this.f3194a.get();
        if (context == null) {
            AdError adError2 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            facebookRtbNativeAd.f1439b.onFailure(adError2);
            return;
        }
        facebookRtbNativeAd.mapNativeAd(context, new ja1(this, 17));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        this.c.f1439b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
        String str = FacebookMediationAdapter.TAG;
    }
}
