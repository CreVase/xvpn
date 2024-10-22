package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcpf implements zzfzp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpg zzb;

    public zzcpf(zzcpg zzcpgVar, String str) {
        this.zzb = zzcpgVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfdx zzfdxVar;
        zzfjt zzfjtVar;
        zzfde zzfdeVar;
        zzfcr zzfcrVar;
        zzfcr zzfcrVar2;
        zzcpg zzcpgVar = this.zzb;
        zzfdxVar = zzcpgVar.zzh;
        zzfjtVar = zzcpgVar.zzg;
        zzfdeVar = zzcpgVar.zze;
        zzfcrVar = zzcpgVar.zzf;
        zzfcrVar2 = zzcpgVar.zzf;
        zzfdxVar.zza(zzfjtVar.zzd(zzfdeVar, zzfcrVar, false, this.zza, null, zzfcrVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdx zzfdxVar;
        zzfjt zzfjtVar;
        zzfde zzfdeVar;
        zzfcr zzfcrVar;
        zzfcr zzfcrVar2;
        zzcpg zzcpgVar = this.zzb;
        String str = (String) obj;
        zzfdxVar = zzcpgVar.zzh;
        zzfjtVar = zzcpgVar.zzg;
        zzfdeVar = zzcpgVar.zze;
        zzfcrVar = zzcpgVar.zzf;
        zzfcrVar2 = zzcpgVar.zzf;
        zzfdxVar.zza(zzfjtVar.zzd(zzfdeVar, zzfcrVar, false, this.zza, str, zzfcrVar2.zzd));
    }
}
