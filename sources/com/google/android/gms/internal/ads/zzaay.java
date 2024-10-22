package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzaay {
    protected final zzaas zza;
    protected final zzaax zzb;
    protected zzaau zzc;
    private final int zzd;

    public zzaay(zzaav zzaavVar, zzaax zzaaxVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaaxVar;
        this.zzd = i;
        this.zza = new zzaas(zzaavVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzabn zzabnVar, long j, zzacj zzacjVar) {
        if (j == zzabnVar.zzf()) {
            return 0;
        }
        zzacjVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzabn zzabnVar, long j) throws IOException {
        long zzf = j - zzabnVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzabc) zzabnVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzaau zzaauVar = this.zzc;
            zzdx.zzb(zzaauVar);
            j = zzaauVar.zzf;
            j2 = zzaauVar.zzg;
            long j12 = j2 - j;
            int i2 = this.zzd;
            j3 = zzaauVar.zzh;
            if (j12 <= i2) {
                zzc(false, j);
                return zzf(zzabnVar, j, zzacjVar);
            }
            if (!zzg(zzabnVar, j3)) {
                return zzf(zzabnVar, j3, zzacjVar);
            }
            zzabnVar.zzj();
            zzaax zzaaxVar = this.zzb;
            j4 = zzaauVar.zzb;
            zzaaw zza = zzaaxVar.zza(zzabnVar, j4);
            i = zza.zzb;
            if (i != -3) {
                if (i != -2) {
                    if (i != -1) {
                        j5 = zza.zzd;
                        zzg(zzabnVar, j5);
                        j6 = zza.zzd;
                        zzc(true, j6);
                        j7 = zza.zzd;
                        return zzf(zzabnVar, j7, zzacjVar);
                    }
                    j8 = zza.zzc;
                    j9 = zza.zzd;
                    zzaau.zzg(zzaauVar, j8, j9);
                } else {
                    j10 = zza.zzc;
                    j11 = zza.zzd;
                    zzaau.zzh(zzaauVar, j10, j11);
                }
            } else {
                zzc(false, j3);
                return zzf(zzabnVar, j3, zzacjVar);
            }
        }
    }

    public final zzacm zzb() {
        return this.zza;
    }

    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzaau zzaauVar = this.zzc;
        if (zzaauVar != null) {
            j6 = zzaauVar.zza;
            if (j6 == j) {
                return;
            }
        }
        zzaas zzaasVar = this.zza;
        long zzf = zzaasVar.zzf(j);
        j2 = zzaasVar.zzc;
        j3 = zzaasVar.zzd;
        j4 = zzaasVar.zze;
        j5 = zzaasVar.zzf;
        this.zzc = new zzaau(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
