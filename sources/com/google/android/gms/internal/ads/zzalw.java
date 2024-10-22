package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzalw implements Runnable {
    private final zzamg zza;
    private final zzamm zzb;
    private final Runnable zzc;

    public zzalw(zzamg zzamgVar, zzamm zzammVar, Runnable runnable) {
        this.zza = zzamgVar;
        this.zzb = zzammVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzamm zzammVar = this.zzb;
        if (zzammVar.zzc()) {
            this.zza.zzo(zzammVar.zza);
        } else {
            this.zza.zzn(zzammVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
