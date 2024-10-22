package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdqs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzdqs(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i;
        Context zza = ((zzcic) this.zza).zza();
        final String zzb = ((zzdxd) this.zzb).zzb();
        zzcaz zza2 = ((zzcio) this.zzc).zza();
        final zzayf zzayfVar = (zzayf) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzaxv zzaxvVar = new zzaxv(new zzayb(zza));
        zzbau zza3 = zzbav.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        if (true != zza2.zzd) {
            i = 2;
        } else {
            i = 0;
        }
        zza3.zzb(i);
        final zzbav zzbavVar = (zzbav) zza3.zzal();
        zzaxvVar.zzb(new zzaxu() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzaxu
            public final void zza(zzazk zzazkVar) {
                zzayg zzaygVar = (zzayg) zzazkVar.zza().zzaB();
                zzaygVar.zza(zzayf.this);
                zzazkVar.zze(zzaygVar);
                zzazc zzazcVar = (zzazc) zzazkVar.zzb().zzaB();
                zzazcVar.zza(zzb);
                zzazcVar.zzb(zzbavVar);
                zzazkVar.zzg(zzazcVar);
                zzazkVar.zzh(str);
            }
        });
        return zzaxvVar;
    }
}
