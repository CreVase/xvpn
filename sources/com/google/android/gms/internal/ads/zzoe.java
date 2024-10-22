package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzoe {
    final /* synthetic */ zzof zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zztw zze;
    private boolean zzf;
    private boolean zzg;

    public zzoe(zzof zzofVar, String str, int i, zztw zztwVar) {
        this.zza = zzofVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zztwVar == null ? -1L : zztwVar.zzd;
        if (zztwVar == null || !zztwVar.zzb()) {
            return;
        }
        this.zze = zztwVar;
    }

    public final void zzg(int i, zztw zztwVar) {
        if (this.zzd == -1 && i == this.zzc && zztwVar != null) {
            zzof zzofVar = this.zza;
            long j = zztwVar.zzd;
            if (j >= zzof.zza(zzofVar)) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zztw zztwVar) {
        if (zztwVar == null) {
            return i == this.zzc;
        }
        zztw zztwVar2 = this.zze;
        return zztwVar2 == null ? !zztwVar.zzb() && zztwVar.zzd == this.zzd : zztwVar.zzd == zztwVar2.zzd && zztwVar.zzb == zztwVar2.zzb && zztwVar.zzc == zztwVar2.zzc;
    }

    public final boolean zzk(zzmc zzmcVar) {
        zztw zztwVar = zzmcVar.zzd;
        if (zztwVar == null) {
            if (this.zzc != zzmcVar.zzc) {
                return true;
            }
            return false;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zztwVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcv zzcvVar = zzmcVar.zzb;
        int zza = zzcvVar.zza(zztwVar.zza);
        int zza2 = zzcvVar.zza(this.zze.zza);
        zztw zztwVar2 = zzmcVar.zzd;
        if (zztwVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zztwVar2.zzb()) {
            zztw zztwVar3 = zzmcVar.zzd;
            int i = zztwVar3.zzb;
            int i2 = zztwVar3.zzc;
            zztw zztwVar4 = this.zze;
            int i3 = zztwVar4.zzb;
            if (i > i3) {
                return true;
            }
            if (i == i3 && i2 > zztwVar4.zzc) {
                return true;
            }
            return false;
        }
        int i4 = zzmcVar.zzd.zze;
        if (i4 == -1 || i4 > this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:            if (r0 < r8.zzc()) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcv r7, com.google.android.gms.internal.ads.zzcv r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzof r1 = r6.zza
            com.google.android.gms.internal.ads.zzcu r1 = com.google.android.gms.internal.ads.zzof.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzof r0 = r6.zza
            com.google.android.gms.internal.ads.zzcu r0 = com.google.android.gms.internal.ads.zzof.zzc(r0)
            int r0 = r0.zzp
        L26:
            com.google.android.gms.internal.ads.zzof r1 = r6.zza
            com.google.android.gms.internal.ads.zzcu r1 = com.google.android.gms.internal.ads.zzof.zzc(r1)
            int r1 = r1.zzq
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzof r7 = r6.zza
            com.google.android.gms.internal.ads.zzcs r7 = com.google.android.gms.internal.ads.zzof.zzb(r7)
            com.google.android.gms.internal.ads.zzcs r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zztw r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoe.zzl(com.google.android.gms.internal.ads.zzcv, com.google.android.gms.internal.ads.zzcv):boolean");
    }
}
