package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzact {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzacs zzacsVar, zzacr zzacrVar) {
        if (this.zzc > 0) {
            zzacsVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzacrVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzacs zzacsVar, long j, int i, int i2, int i3, zzacr zzacrVar) {
        if (this.zzg <= i2 + i3) {
            if (!this.zzb) {
                return;
            }
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzacsVar, zzacrVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void zzd(zzabn zzabnVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzabnVar.zzh(this.zza, 0, 10);
        zzabnVar.zzj();
        byte[] bArr = this.zza;
        int i = zzaan.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
