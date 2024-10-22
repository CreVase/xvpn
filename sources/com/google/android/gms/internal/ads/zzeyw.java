package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzeyw implements zzemz {
    final /* synthetic */ zzeyx zza;

    public zzeyw(zzeyx zzeyxVar) {
        this.zza = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeyp zzeypVar;
        zzeyp zzeypVar2;
        zzdso zzdsoVar;
        zzcqp zzcqpVar = (zzcqp) obj;
        synchronized (this.zza) {
            zzcqp zzcqpVar2 = this.zza.zza;
            if (zzcqpVar2 != null) {
                zzcqpVar2.zzb();
            }
            zzeyx zzeyxVar = this.zza;
            zzeyxVar.zza = zzcqpVar;
            zzcqpVar.zzc(zzeyxVar);
            zzeyx zzeyxVar2 = this.zza;
            zzeypVar = zzeyxVar2.zzg;
            zzeypVar2 = zzeyxVar2.zzg;
            zzdsoVar = zzeyxVar2.zzi;
            zzeypVar.zzk(new zzcqq(zzcqpVar, zzeyxVar2, zzeypVar2, zzdsoVar));
            zzcqpVar.zzj();
        }
    }
}
