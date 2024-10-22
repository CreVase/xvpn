package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbne implements zzcbp {
    final /* synthetic */ zzbng zza;

    public zzbne(zzbng zzbngVar) {
        this.zza = zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnl zzbnlVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbnlVar = this.zza.zzb;
        zzbnlVar.zzd();
    }
}
