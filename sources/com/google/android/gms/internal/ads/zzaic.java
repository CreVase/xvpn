package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaic implements zzaii {
    private final zzabz zza;
    private final zzaby zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaic(zzabz zzabzVar, zzaby zzabyVar) {
        this.zza = zzabzVar;
        this.zzb = zzabyVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd(zzabn zzabnVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final zzacm zze() {
        boolean z;
        if (this.zzc != -1) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        return new zzabx(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfk.zzc(jArr, j, true, true)];
    }
}
