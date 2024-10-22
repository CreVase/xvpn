package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzctj implements zzfzp {
    final /* synthetic */ zzfzp zza;
    final /* synthetic */ zzctl zzb;

    public zzctj(zzctl zzctlVar, zzfzp zzfzpVar) {
        this.zzb = zzctlVar;
        this.zza = zzfzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctf
            @Override // java.lang.Runnable
            public final void run() {
                zzctl.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctl.zzb(this.zzb, ((zzcte) obj).zza, this.zza);
    }
}
