package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfhg implements zzfzp {
    final /* synthetic */ zzfgw zza;
    final /* synthetic */ zzfhi zzb;

    public zzfhg(zzfhi zzfhiVar, zzfgw zzfgwVar) {
        this.zzb = zzfhiVar;
        this.zza = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfhk zzfhkVar;
        zzfhkVar = this.zzb.zza.zzd;
        zzfhkVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzb(Object obj) {
        zzfhk zzfhkVar;
        zzfhkVar = this.zzb.zza.zzd;
        zzfhkVar.zzd(this.zza);
    }
}
