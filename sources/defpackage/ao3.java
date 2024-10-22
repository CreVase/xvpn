package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.AdConfig;
import com.vungle.ads.RewardedAd;

/* loaded from: classes.dex */
public final class ao3 implements VungleInitializer.VungleInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f308b;
    public final /* synthetic */ AdConfig c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ VungleRtbRewardedAd f;

    public ao3(VungleRtbRewardedAd vungleRtbRewardedAd, Context context, String str, AdConfig adConfig, String str2, String str3) {
        this.f = vungleRtbRewardedAd;
        this.f307a = context;
        this.f308b = str;
        this.c = adConfig;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f.f1454b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        RewardedAd rewardedAd = new RewardedAd(this.f307a, this.f308b, this.c);
        VungleRtbRewardedAd vungleRtbRewardedAd = this.f;
        vungleRtbRewardedAd.d = rewardedAd;
        vungleRtbRewardedAd.d.setAdListener(vungleRtbRewardedAd);
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            vungleRtbRewardedAd.d.setUserId(str);
        }
        vungleRtbRewardedAd.d.load(this.e);
    }
}
