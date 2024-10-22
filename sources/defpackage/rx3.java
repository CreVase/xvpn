package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/* loaded from: classes.dex */
public final class rx3 extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f4233a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeListener f4234b;

    public rx3(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f4233a = abstractAdViewAdapter;
        this.f4234b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f4234b.onAdClicked(this.f4233a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f4234b.onAdClosed(this.f4233a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f4234b.onAdFailedToLoad(this.f4233a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f4234b.onAdImpression(this.f4233a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f4234b.onAdOpened(this.f4233a);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f4234b.zze(this.f4233a, nativeCustomTemplateAd, str);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f4234b.zzc(this.f4233a, nativeCustomTemplateAd);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f4234b.onAdLoaded(this.f4233a, new vw3(unifiedNativeAd));
    }
}
