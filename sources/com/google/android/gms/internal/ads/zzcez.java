package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcez implements zzko {
    private final zzxz zzb = new zzxz(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ void zze(zzcv zzcvVar, zztw zztwVar, zzlr[] zzlrVarArr, zzvx zzvxVar, zzxk[] zzxkVarArr) {
        int i;
        int i2 = 0;
        this.zzg = 0;
        while (true) {
            int length = zzlrVarArr.length;
            if (i2 < 2) {
                if (zzxkVarArr[i2] != null) {
                    int i3 = this.zzg;
                    if (zzlrVarArr[i2].zzb() != 1) {
                        i = 131072000;
                    } else {
                        i = 13107200;
                    }
                    this.zzg = i3 + i;
                }
                i2++;
            } else {
                this.zzb.zzf(this.zzg);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzd ? (char) 0 : j2 < this.zzc ? (char) 2 : (char) 1;
        int zza = this.zzb.zza();
        int i = this.zzg;
        if (c != 2 && (c != 1 || !this.zzh || zza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ boolean zzh(zzcv zzcvVar, zztw zztwVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzxz zzi() {
        return this.zzb;
    }

    public final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }
}
