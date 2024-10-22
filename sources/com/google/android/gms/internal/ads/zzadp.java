package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzadp implements zzaax {
    private final zzabz zza;
    private final int zzb;
    private final zzabu zzc = new zzabu();

    public /* synthetic */ zzadp(zzabz zzabzVar, int i, zzado zzadoVar) {
        this.zza = zzabzVar;
        this.zzb = i;
    }

    private final long zzc(zzabn zzabnVar) throws IOException {
        while (zzabnVar.zze() < zzabnVar.zzd() - 6) {
            zzabz zzabzVar = this.zza;
            int i = this.zzb;
            zzabu zzabuVar = this.zzc;
            long zze = zzabnVar.zze();
            byte[] bArr = new byte[2];
            zzabc zzabcVar = (zzabc) zzabnVar;
            zzabcVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzabnVar.zzj();
                zzabcVar.zzl((int) (zze - zzabnVar.zzf()), false);
            } else {
                zzfb zzfbVar = new zzfb(16);
                System.arraycopy(bArr, 0, zzfbVar.zzI(), 0, 2);
                zzfbVar.zzF(zzabq.zza(zzabnVar, zzfbVar.zzI(), 2, 14));
                zzabnVar.zzj();
                zzabcVar.zzl((int) (zze - zzabnVar.zzf()), false);
                if (zzabv.zzc(zzfbVar, zzabzVar, i, zzabuVar)) {
                    break;
                }
            }
            zzabcVar.zzl(1, false);
        }
        if (zzabnVar.zze() >= zzabnVar.zzd() - 6) {
            ((zzabc) zzabnVar).zzl((int) (zzabnVar.zzd() - zzabnVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaaw zza(zzabn zzabnVar, long j) throws IOException {
        int i = this.zza.zzc;
        long zzf = zzabnVar.zzf();
        long zzc = zzc(zzabnVar);
        long zze = zzabnVar.zze();
        ((zzabc) zzabnVar).zzl(Math.max(6, i), false);
        long zzc2 = zzc(zzabnVar);
        long zze2 = zzabnVar.zze();
        if (zzc <= j && zzc2 > j) {
            return zzaaw.zze(zze);
        }
        if (zzc2 <= j) {
            return zzaaw.zzf(zzc2, zze2);
        }
        return zzaaw.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* synthetic */ void zzb() {
    }
}
