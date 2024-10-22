package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaji {
    private final zzacs zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaji(zzacs zzacsVar) {
        this.zza = zzacsVar;
    }

    public final void zza(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.zzc) {
            int i3 = this.zzf;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.zzd = z;
                this.zzc = false;
                return;
            }
            this.zzf = (i2 - i) + i3;
        }
    }

    public final void zzb(long j, int i, boolean z) {
        if (this.zze == 182 && z && this.zzb) {
            long j2 = this.zzh;
            if (j2 != -9223372036854775807L) {
                long j3 = j - this.zzg;
                this.zza.zzt(j2, this.zzd ? 1 : 0, (int) j3, i, null);
            }
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(int r5, long r6) {
        /*
            r4 = this;
            r4.zze = r5
            r0 = 0
            r4.zzd = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto L13
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L11
            r5 = 179(0xb3, float:2.51E-43)
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            r4.zzb = r3
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            r4.zzc = r1
            r4.zzf = r0
            r4.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzc(int, long):void");
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
