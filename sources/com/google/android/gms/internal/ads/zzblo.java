package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* loaded from: classes.dex */
public final class zzblo implements AdapterStatus {
    private final AdapterStatus.State zza;
    private final String zzb;
    private final int zzc;

    public zzblo(AdapterStatus.State state, String str, int i) {
        this.zza = state;
        this.zzb = str;
        this.zzc = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzc;
    }
}
