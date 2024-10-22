package com.google.android.gms.internal.ads;

import defpackage.p71;

/* loaded from: classes.dex */
final class zzakv implements zzakw {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzabp zzc;
    private final zzacs zzd;
    private final zzakz zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfb zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzakv(zzabp zzabpVar, zzacs zzacsVar, zzakz zzakzVar) throws zzcc {
        this.zzc = zzabpVar;
        this.zzd = zzacsVar;
        this.zze = zzakzVar;
        int max = Math.max(1, zzakzVar.zzc / 10);
        this.zzi = max;
        zzfb zzfbVar = new zzfb(zzakzVar.zzf);
        zzfbVar.zzj();
        int zzj = zzfbVar.zzj();
        this.zzf = zzj;
        int i = zzakzVar.zzb;
        int i2 = zzakzVar.zzd;
        int f = p71.f(i2 - (i * 4), 8, zzakzVar.zze * i, 1);
        if (zzj == f) {
            int i3 = zzfk.zza;
            int i4 = ((max + zzj) - 1) / zzj;
            this.zzg = new byte[i2 * i4];
            this.zzh = new zzfb((zzj + zzj) * i * i4);
            int i5 = ((zzakzVar.zzc * zzakzVar.zzd) * 8) / zzj;
            zzak zzakVar = new zzak();
            zzakVar.zzU("audio/raw");
            zzakVar.zzx(i5);
            zzakVar.zzQ(i5);
            zzakVar.zzN((max + max) * i);
            zzakVar.zzy(zzakzVar.zzb);
            zzakVar.zzV(zzakzVar.zzc);
            zzakVar.zzP(2);
            this.zzj = zzakVar.zzac();
            return;
        }
        throw zzcc.zza("Expected frames per block: " + f + "; got: " + zzj, null);
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzr = this.zzl + zzfk.zzr(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i);
        this.zzd.zzt(zzr, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzakw
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzalc(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzakw
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzakw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzabn r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzc(com.google.android.gms.internal.ads.zzabn, long):boolean");
    }
}
