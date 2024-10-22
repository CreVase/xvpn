package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzelp implements zzemz {
    final /* synthetic */ zzelq zza;

    public zzelp(zzelq zzelqVar) {
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqv zzcqvVar;
        zzcqv zzcqvVar2;
        zzcqv zzcqvVar3;
        zzcqv zzcqvVar4 = (zzcqv) obj;
        synchronized (this.zza) {
            zzelq zzelqVar = this.zza;
            zzcqvVar = zzelqVar.zzi;
            if (zzcqvVar != null) {
                zzcqvVar3 = zzelqVar.zzi;
                zzcqvVar3.zzb();
            }
            this.zza.zzi = zzcqvVar4;
            zzcqvVar2 = this.zza.zzi;
            zzcqvVar2.zzj();
        }
    }
}
