package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcce implements Runnable {
    final /* synthetic */ zzccg zza;

    public zzcce(zzccg zzccgVar) {
        this.zza = zzccgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        boolean z;
        zzcch zzcchVar2;
        zzcch zzcchVar3;
        zzccg zzccgVar = this.zza;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            z = zzccgVar.zzr;
            if (!z) {
                zzcchVar3 = zzccgVar.zzq;
                zzcchVar3.zzg();
                this.zza.zzr = true;
            }
            zzcchVar2 = this.zza.zzq;
            zzcchVar2.zze();
        }
    }
}
