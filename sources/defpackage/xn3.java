package defpackage;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InterstitialAd;

/* loaded from: classes.dex */
public final class xn3 implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5192b;
    public final /* synthetic */ AdConfig c;
    public final /* synthetic */ String d;
    public final /* synthetic */ VungleRtbInterstitialAd e;

    public xn3(VungleRtbInterstitialAd vungleRtbInterstitialAd, Context context, String str, AdConfig adConfig, String str2) {
        this.e = vungleRtbInterstitialAd;
        this.f5191a = context;
        this.f5192b = str;
        this.c = adConfig;
        this.d = str2;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.e.f1450b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        InterstitialAd interstitialAd = new InterstitialAd(this.f5191a, this.f5192b, this.c);
        VungleRtbInterstitialAd vungleRtbInterstitialAd = this.e;
        vungleRtbInterstitialAd.d = interstitialAd;
        vungleRtbInterstitialAd.d.setAdListener(vungleRtbInterstitialAd);
        vungleRtbInterstitialAd.d.load(this.d);
    }
}
