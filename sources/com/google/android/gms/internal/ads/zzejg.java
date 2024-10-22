package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public class zzejg extends zzekh {
    private final zzdfm zza;

    public zzejg(zzcxj zzcxjVar, zzdfb zzdfbVar, zzcyd zzcydVar, zzcys zzcysVar, zzcyx zzcyxVar, zzcxy zzcxyVar, zzdcf zzdcfVar, zzdft zzdftVar, zzczr zzczrVar, zzdfm zzdfmVar, zzdcb zzdcbVar) {
        super(zzcxjVar, zzdfbVar, zzcydVar, zzcysVar, zzcyxVar, zzdcfVar, zzczrVar, zzdftVar, zzdcbVar, zzcxyVar);
        this.zza = zzdfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekh, com.google.android.gms.internal.ads.zzbpd
    public final void zzs(zzbwi zzbwiVar) {
        this.zza.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekh, com.google.android.gms.internal.ads.zzbpd
    public final void zzt(zzbwm zzbwmVar) throws RemoteException {
        this.zza.zza(new zzbwi(zzbwmVar.zzf(), zzbwmVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzekh, com.google.android.gms.internal.ads.zzbpd
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekh, com.google.android.gms.internal.ads.zzbpd
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekh, com.google.android.gms.internal.ads.zzbpd
    public final void zzy() {
        this.zza.zzc();
    }
}
