package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzln implements Runnable {
    private final /* synthetic */ zzfk zza;
    private final /* synthetic */ zzlm zzb;

    public zzln(zzlm zzlmVar, zzfk zzfkVar) {
        this.zzb = zzlmVar;
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzah()) {
                this.zzb.zza.zzj().zzc().zza("Connected to remote service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
