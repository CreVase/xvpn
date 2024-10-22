package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.p71;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzalb {
    public static Pair zza(zzabn zzabnVar) throws IOException {
        zzabnVar.zzj();
        zzala zzd = zzd(1684108385, zzabnVar, new zzfb(8));
        ((zzabc) zzabnVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzabnVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzakz zzb(zzabn zzabnVar) throws IOException {
        boolean z;
        byte[] bArr;
        zzfb zzfbVar = new zzfb(16);
        zzala zzd = zzd(1718449184, zzabnVar, zzfbVar);
        if (zzd.zzb >= 16) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzm(zzfbVar.zzI(), 0, 16, false);
        zzfbVar.zzG(0);
        int zzj = zzfbVar.zzj();
        int zzj2 = zzfbVar.zzj();
        int zzi = zzfbVar.zzi();
        int zzi2 = zzfbVar.zzi();
        int zzj3 = zzfbVar.zzj();
        int zzj4 = zzfbVar.zzj();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzabcVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzfk.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzabc) zzabnVar).zzo((int) (zzabnVar.zze() - zzabnVar.zzf()), false);
        return new zzakz(zzj, zzj2, zzi, zzi2, zzj3, zzj4, bArr2);
    }

    public static boolean zzc(zzabn zzabnVar) throws IOException {
        zzfb zzfbVar = new zzfb(8);
        int i = zzala.zza(zzabnVar, zzfbVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzabc) zzabnVar).zzm(zzfbVar.zzI(), 0, 4, false);
        zzfbVar.zzG(0);
        int zzf = zzfbVar.zzf();
        if (zzf != 1463899717) {
            zzer.zzc("WavHeaderReader", "Unsupported form type: " + zzf);
            return false;
        }
        return true;
    }

    private static zzala zzd(int i, zzabn zzabnVar, zzfb zzfbVar) throws IOException {
        zzala zza = zzala.zza(zzabnVar, zzfbVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 != i) {
                p71.y("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
                long j = zza.zzb + 8;
                if (j <= 2147483647L) {
                    ((zzabc) zzabnVar).zzo((int) j, false);
                    zza = zzala.zza(zzabnVar, zzfbVar);
                } else {
                    throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
                }
            } else {
                return zza;
            }
        }
    }
}
