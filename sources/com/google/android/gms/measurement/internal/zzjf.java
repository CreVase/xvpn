package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjf implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zziq zze;

    public zzjf(zziq zziqVar, String str, String str2, Object obj, long j) {
        this.zze = zziqVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
