package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdpg implements zzhbc {
    private final zzhbp zza;

    public zzdpg(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        if (((zzcxc) this.zza).zza().zzo.zza == 3) {
            return "rewarded_interstitial";
        }
        return "rewarded";
    }
}
