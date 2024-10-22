package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcvs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcvs(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzm;
        zzcuy zzcuyVar = (zzcuy) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfy)).booleanValue()) {
            zzm = zzfvx.zzn(new zzdev(zzcuyVar, zzgadVar));
        } else {
            zzm = zzfvx.zzm();
        }
        zzhbk.zzb(zzm);
        return zzm;
    }
}
