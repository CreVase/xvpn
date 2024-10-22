package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbz implements Runnable {
    final /* synthetic */ zzccg zza;

    public zzcbz(zzccg zzccgVar) {
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
            zzcchVar2.zza();
        }
    }
}
