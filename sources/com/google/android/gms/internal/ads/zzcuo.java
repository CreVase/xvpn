package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcuo implements zzhbc {
    private final zzhbp zza;

    public zzcuo(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzm;
        zzcva zzcvaVar = (zzcva) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfy)).booleanValue()) {
            zzm = zzfvx.zzn(new zzdev(zzcvaVar, zzcbg.zzf));
        } else {
            zzm = zzfvx.zzm();
        }
        zzhbk.zzb(zzm);
        return zzm;
    }
}
