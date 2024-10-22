package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes.dex */
public final class ex3 extends AdListener implements AppEventListener, zza {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f2017a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationBannerListener f2018b;

    public ex3(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f2017a = abstractAdViewAdapter;
        this.f2018b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f2018b.onAdClicked(this.f2017a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f2018b.onAdClosed(this.f2017a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2018b.onAdFailedToLoad(this.f2017a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f2018b.onAdLoaded(this.f2017a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f2018b.onAdOpened(this.f2017a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f2018b.zzd(this.f2017a, str, str2);
    }
}
