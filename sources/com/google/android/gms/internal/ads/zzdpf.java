package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdpf implements zzhbc {
    private final zzhbp zza;

    public zzdpf(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayf zzayfVar;
        if (((zzcxc) this.zza).zza().zzo.zza == 3) {
            zzayfVar = zzayf.REWARDED_INTERSTITIAL;
        } else {
            zzayfVar = zzayf.REWARD_BASED_VIDEO_AD;
        }
        zzhbk.zzb(zzayfVar);
        return zzayfVar;
    }
}
