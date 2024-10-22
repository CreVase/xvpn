package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* loaded from: classes.dex */
public final class zzbke extends zzbkg {
    private final OnH5AdsEventListener zza;

    public zzbke(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
