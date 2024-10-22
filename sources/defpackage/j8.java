package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes2.dex */
public final class j8 extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8 f2719a;

    public j8(k8 k8Var) {
        this.f2719a = k8Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2719a.a(loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        k8 k8Var = this.f2719a;
        k8Var.e = appOpenAd;
        k8Var.b();
    }
}
