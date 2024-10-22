package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzakg implements zzaax {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();
    private final int zzc;

    public zzakg(int i, zzfi zzfiVar, int i2) {
        this.zzc = i;
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaaw zza(zzabn zzabnVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzf = zzabnVar.zzf();
        int min = (int) Math.min(112800L, zzabnVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabc) zzabnVar).zzm(this.zzb.zzI(), 0, min, false);
        zzfb zzfbVar = this.zzb;
        int zzd = zzfbVar.zzd();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzfbVar.zza() >= 188 && (zza2 = (zza = zzaks.zza(zzfbVar.zzI(), zzfbVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaks.zzb(zzfbVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j3 == -9223372036854775807L) {
                        return zzaaw.zzd(zzb2, zzf);
                    }
                } else {
                    j4 = zza;
                    if (100000 + zzb2 <= j) {
                        j3 = zzb2;
                    }
                }
                return zzaaw.zze(zzf + j4);
            }
            zzfbVar.zzG(zza2);
            j2 = zza2;
        }
        if (j3 != -9223372036854775807L) {
            return zzaaw.zzf(j3, zzf + j2);
        }
        return zzaaw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzb() {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
