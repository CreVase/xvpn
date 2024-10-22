package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzajm {
    private final zzacs zza;
    private final zzfz zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzajl zzi = new zzajl(null);
    private final zzajl zzj = new zzajl(null);
    private boolean zzk = false;

    public zzajm(zzacs zzacsVar, boolean z, boolean z2) {
        this.zza = zzacsVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzfz(bArr, 0, 0);
    }

    private final void zzg(int i) {
        long j = this.zzm;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.zzn;
        long j2 = this.zzg - this.zzl;
        this.zza.zzt(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void zza(long j) {
        this.zzg = j;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzfw zzfwVar) {
        this.zzc.append(zzfwVar.zza, zzfwVar);
    }

    public final void zzc(zzfx zzfxVar) {
        this.zzb.append(zzfxVar.zzd, zzfxVar);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j, int i, long j2) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
    }

    public final boolean zzf(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                zzg(i + ((int) (j - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z4 = this.zzn;
        int i2 = this.zzf;
        if (i2 == 5 || (z2 && i2 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.zzn = z5;
        return z5;
    }
}
