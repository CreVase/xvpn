package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcca implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzccg zzc;

    public zzcca(zzccg zzccgVar, String str, String str2) {
        this.zzc = zzccgVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        zzcch zzcchVar2;
        zzccg zzccgVar = this.zzc;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcchVar2 = zzccgVar.zzq;
            zzcchVar2.zzb(str, str2);
        }
    }
}
