package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzccc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzccg zzc;

    public zzccc(zzccg zzccgVar, int i, int i2) {
        this.zzc = zzccgVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        zzcch zzcchVar2;
        zzccg zzccgVar = this.zzc;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            int i = this.zza;
            int i2 = this.zzb;
            zzcchVar2 = zzccgVar.zzq;
            zzcchVar2.zzj(i, i2);
        }
    }
}
