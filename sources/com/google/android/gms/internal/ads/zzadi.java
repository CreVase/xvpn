package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadi {
    protected final zzacs zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzadi(int i, int i2, long j, int i3, zzacs zzacsVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzacsVar;
        this.zzb = zzi(i, i2 == 2 ? 1667497984 : 1651965952);
        this.zzc = i2 == 2 ? zzi(i, 1650720768) : -1;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzj(int i) {
        return (this.zzd * i) / this.zze;
    }

    private final zzacn zzk(int i) {
        return new zzacn(this.zzl[i] * zzj(1), this.zzk[i]);
    }

    public final zzack zza(long j) {
        int zzj = (int) (j / zzj(1));
        int zzb = zzfk.zzb(this.zzl, zzj, true, true);
        if (this.zzl[zzb] == zzj) {
            zzacn zzk = zzk(zzb);
            return new zzack(zzk, zzk);
        }
        zzacn zzk2 = zzk(zzb);
        int i = zzb + 1;
        if (i < this.zzk.length) {
            return new zzack(zzk2, zzk(i));
        }
        return new zzack(zzk2, zzk2);
    }

    public final void zzb(long j) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i = this.zzj;
        jArr2[i] = j;
        this.zzl[i] = this.zzi;
        this.zzj = i + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zzf(long j) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzl[zzfk.zzc(this.zzk, j, true, true)];
        }
    }

    public final boolean zzg(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzh(zzabn zzabnVar) throws IOException {
        boolean z;
        int i;
        int i2 = this.zzg;
        int zzf = i2 - this.zza.zzf(zzabnVar, i2, false);
        this.zzg = zzf;
        if (zzf == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.zzf > 0) {
                zzacs zzacsVar = this.zza;
                long zzj = zzj(this.zzh);
                if (Arrays.binarySearch(this.zzl, this.zzh) >= 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                zzacsVar.zzt(zzj, i, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z;
    }
}
