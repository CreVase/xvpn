package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes.dex */
public final class zzbhx extends zzbhh {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbhx(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhi
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbhi
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
