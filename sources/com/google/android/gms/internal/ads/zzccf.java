package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzccf implements Runnable {
    final /* synthetic */ zzccg zza;

    public zzccf(zzccg zzccgVar) {
        this.zza = zzccgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        zzcch zzcchVar2;
        zzccg zzccgVar = this.zza;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            zzcchVar2 = zzccgVar.zzq;
            zzcchVar2.zzd();
        }
    }
}
