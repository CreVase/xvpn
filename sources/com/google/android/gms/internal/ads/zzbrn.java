package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import defpackage.wc0;
import defpackage.x50;

/* loaded from: classes.dex */
public final class zzbrn implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcat.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcat.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcat.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzcat.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (context instanceof Activity) {
            if (!zzbdj.zzg(context)) {
                zzcat.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzcat.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            } else {
                this.zza = (Activity) context;
                this.zzc = Uri.parse(string);
                this.zzb.onAdLoaded(this);
                return;
            }
        }
        zzcat.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        x50 a2 = new wc0().a();
        ((Intent) a2.f5117b).setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzbrm(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc((Intent) a2.f5117b, null), null, new zzbrl(this), null, new zzcaz(0, 0, false, false, false), null, null)));
        com.google.android.gms.ads.internal.zzt.zzo().zzp();
    }
}
