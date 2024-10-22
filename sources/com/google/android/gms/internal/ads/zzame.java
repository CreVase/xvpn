package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzame implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzamg zzc;

    public zzame(zzamg zzamgVar, String str, long j) {
        this.zzc = zzamgVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamr zzamrVar;
        zzamr zzamrVar2;
        zzamrVar = this.zzc.zza;
        zzamrVar.zza(this.zza, this.zzb);
        zzamg zzamgVar = this.zzc;
        zzamrVar2 = zzamgVar.zza;
        zzamrVar2.zzb(zzamgVar.toString());
    }
}
