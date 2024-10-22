package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class zzbsl extends zzbhh {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbsl(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
