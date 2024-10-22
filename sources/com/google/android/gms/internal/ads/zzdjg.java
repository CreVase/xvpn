package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdjg {
    private zzbfl zza;

    public zzdjg(zzdis zzdisVar) {
        this.zza = zzdisVar;
    }

    public final synchronized zzbfl zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbfl zzbflVar) {
        this.zza = zzbflVar;
    }
}
