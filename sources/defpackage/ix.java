package defpackage;

import android.text.TextUtils;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.google.ads.mediation.chartboost.ChartboostConstants;
import com.google.ads.mediation.chartboost.ChartboostInterstitialAd;
import com.google.ads.mediation.chartboost.ChartboostRewardedAd;
import com.google.ads.mediation.chartboost.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* loaded from: classes.dex */
public final class ix implements hx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2666b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ix(int i, Object obj, Object obj2) {
        this.f2665a = i;
        this.c = obj;
        this.f2666b = obj2;
    }

    @Override // defpackage.hx
    public final void a(AdError adError) {
        int i = this.f2665a;
        Object obj = this.c;
        switch (i) {
            case 0:
                adError.toString();
                ((ChartboostInterstitialAd) obj).c.onFailure(adError);
                return;
            case 1:
                adError.toString();
                ((ChartboostRewardedAd) obj).c.onFailure(adError);
                return;
            default:
                ((InitializationCompleteCallback) this.f2666b).onInitializationFailed(adError.toString());
                return;
        }
    }

    @Override // defpackage.hx
    public final void onInitializationSucceeded() {
        int i = this.f2665a;
        Object obj = this.c;
        Object obj2 = this.f2666b;
        switch (i) {
            case 0:
                ChartboostInterstitialAd chartboostInterstitialAd = (ChartboostInterstitialAd) obj;
                String str = (String) obj2;
                chartboostInterstitialAd.getClass();
                if (TextUtils.isEmpty(str)) {
                    AdError createAdapterError = ChartboostConstants.createAdapterError(103, "Missing or invalid location.");
                    createAdapterError.toString();
                    MediationAdLoadCallback mediationAdLoadCallback = chartboostInterstitialAd.c;
                    if (mediationAdLoadCallback != null) {
                        mediationAdLoadCallback.onFailure(createAdapterError);
                        return;
                    }
                    return;
                }
                Interstitial interstitial = new Interstitial(str, chartboostInterstitialAd, a.b());
                chartboostInterstitialAd.f1424a = interstitial;
                interstitial.cache();
                return;
            case 1:
                ChartboostRewardedAd chartboostRewardedAd = (ChartboostRewardedAd) obj;
                Rewarded rewarded = new Rewarded((String) obj2, chartboostRewardedAd, a.b());
                chartboostRewardedAd.f1428a = rewarded;
                rewarded.cache();
                return;
            default:
                ((InitializationCompleteCallback) obj2).onInitializationSucceeded();
                return;
        }
    }
}
