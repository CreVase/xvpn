package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzaih {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfb zzg = new zzfb(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzabn zzabnVar, boolean z) throws IOException {
        zza();
        this.zzg.zzD(27);
        if (zzabq.zzc(zzabnVar, this.zzg.zzI(), 0, 27, z) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzl() != 0) {
                if (z) {
                    return false;
                }
                throw zzcc.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzl();
            this.zzb = this.zzg.zzq();
            this.zzg.zzr();
            this.zzg.zzr();
            this.zzg.zzr();
            int zzl = this.zzg.zzl();
            this.zzc = zzl;
            this.zzd = zzl + 27;
            this.zzg.zzD(zzl);
            if (zzabq.zzc(zzabnVar, this.zzg.zzI(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzl();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzabn zzabnVar, long j) throws IOException {
        boolean z;
        if (zzabnVar.zzf() == zzabnVar.zze()) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        this.zzg.zzD(4);
        while (true) {
            if ((j == -1 || zzabnVar.zzf() + 4 < j) && zzabq.zzc(zzabnVar, this.zzg.zzI(), 0, 4, true)) {
                this.zzg.zzG(0);
                if (this.zzg.zzt() != 1332176723) {
                    ((zzabc) zzabnVar).zzo(1, false);
                } else {
                    zzabnVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (j != -1 && zzabnVar.zzf() >= j) {
                break;
            }
        } while (zzabnVar.zzc(1) != -1);
        return false;
    }
}
