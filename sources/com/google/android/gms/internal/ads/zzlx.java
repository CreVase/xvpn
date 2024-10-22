package com.google.android.gms.internal.ads;

import android.view.Surface;

@Deprecated
/* loaded from: classes.dex */
public final class zzlx extends zzm implements zziw {
    private final zzkb zzb;
    private final zzea zzc;

    public zzlx(zziv zzivVar) {
        zzea zzeaVar = new zzea(zzdy.zza);
        this.zzc = zzeaVar;
        try {
            this.zzb = new zzkb(zzivVar, this);
            zzeaVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA(zzme zzmeVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzB(zzty zztyVar) {
        this.zzc.zzb();
        this.zzb.zzB(zztyVar);
    }

    public final zzil zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        this.zzc.zzb();
        this.zzb.zza(i, j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcv zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdg zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        this.zzc.zzb();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z) {
        this.zzc.zzb();
        this.zzb.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        this.zzc.zzb();
        this.zzb.zzs(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f) {
        this.zzc.zzb();
        this.zzb.zzt(f);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        this.zzc.zzb();
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        this.zzc.zzb();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        this.zzc.zzb();
        this.zzb.zzw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        this.zzc.zzb();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final int zzy() {
        this.zzc.zzb();
        this.zzb.zzy();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzz(zzme zzmeVar) {
        this.zzc.zzb();
        this.zzb.zzz(zzmeVar);
    }
}
