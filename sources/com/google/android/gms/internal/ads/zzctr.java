package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzctr implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcys zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzctr(zzcys zzcysVar) {
        this.zza = zzcysVar;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
