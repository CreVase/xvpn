package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzekl implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcxj zzb;
    private final zzcyd zzc;
    private final zzdff zzd;
    private final zzdex zze;
    private final zzcpr zzf;

    public zzekl(zzcxj zzcxjVar, zzcyd zzcydVar, zzdff zzdffVar, zzdex zzdexVar, zzcpr zzcprVar) {
        this.zzb = zzcxjVar;
        this.zzc = zzcydVar;
        this.zzd = zzdffVar;
        this.zze = zzdexVar;
        this.zzf = zzcprVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (!this.zza.compareAndSet(false, true)) {
            return;
        }
        this.zzf.zzq();
        this.zze.zza(view);
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
