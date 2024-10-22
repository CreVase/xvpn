package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzehx implements zzfzp {
    final /* synthetic */ zzfcr zza;
    final /* synthetic */ zzehy zzb;

    public zzehx(zzehy zzehyVar, zzfcr zzfcrVar) {
        this.zzb = zzehyVar;
        this.zza = zzfcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzehz zzehzVar;
        zzehz zzehzVar2;
        zzehz zzehzVar3;
        synchronized (this.zzb) {
            zzehzVar = this.zzb.zzh;
            zzehzVar.zzb(th, this.zza);
            zzehzVar2 = this.zzb.zzh;
            if (zzehzVar2.zze()) {
                zzehy zzehyVar = this.zzb;
                zzehzVar3 = zzehyVar.zzh;
                zzehyVar.zze(zzehzVar3.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzb(Object obj) {
        zzehz zzehzVar;
        zzehz zzehzVar2;
        zzehz zzehzVar3;
        synchronized (this.zzb) {
            zzehzVar = this.zzb.zzh;
            zzehzVar.zzc(obj, this.zza);
            zzehzVar2 = this.zzb.zzh;
            if (zzehzVar2.zze()) {
                zzehy zzehyVar = this.zzb;
                zzehzVar3 = zzehyVar.zzh;
                zzehyVar.zze(zzehzVar3.zza());
            }
        }
    }
}
