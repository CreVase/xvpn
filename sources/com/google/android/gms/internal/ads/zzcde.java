package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcde implements Runnable {
    private final zzccq zza;
    private boolean zzb = false;

    public zzcde(zzccq zzccqVar) {
        this.zza = zzccqVar;
    }

    private final void zzc() {
        zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
        zzfpsVar.removeCallbacks(this);
        zzfpsVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
