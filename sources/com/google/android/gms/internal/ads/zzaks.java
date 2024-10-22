package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaks {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzfb zzfbVar, int i, int i2) {
        zzfbVar.zzG(i);
        if (zzfbVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zzf = zzfbVar.zzf();
        if ((8388608 & zzf) != 0 || ((zzf >> 8) & 8191) != i2 || (zzf & 32) == 0 || zzfbVar.zzl() < 7 || zzfbVar.zza() < 7 || (zzfbVar.zzl() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfbVar.zzC(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
