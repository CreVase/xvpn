package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdjc implements zzfzp {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdje zzb;

    public zzdjc(zzdje zzdjeVar, String str, boolean z) {
        this.zzb = zzdjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjj zzdjjVar;
        zzdjj zzdjjVar2;
        zzdjjVar = this.zzb.zze;
        zzdjjVar.zzT((zzcgb) obj);
        zzdje zzdjeVar = this.zzb;
        zzdjjVar2 = zzdjeVar.zze;
        zzcbl zzp = zzdjjVar2.zzp();
        zzfkc zzf = zzdjeVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
