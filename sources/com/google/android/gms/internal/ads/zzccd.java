package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzccd implements Runnable {
    final /* synthetic */ zzccg zza;

    public zzccd(zzccg zzccgVar) {
        this.zza = zzccgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        zzcch zzcchVar2;
        zzcch zzcchVar3;
        zzccg zzccgVar = this.zza;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            zzcchVar2 = zzccgVar.zzq;
            zzcchVar2.zzd();
            zzcchVar3 = this.zza.zzq;
            zzcchVar3.zzi();
        }
    }
}
