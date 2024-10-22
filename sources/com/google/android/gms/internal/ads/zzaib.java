package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaib implements zzaii {
    private final zzaih zza;
    private final long zzb;
    private final long zzc;
    private final zzain zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaib(zzain zzainVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdx.zzd(z2);
        this.zzd = zzainVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 != j2 - j && !z) {
            this.zze = 0;
        } else {
            this.zzf = j4;
            this.zze = 4;
        }
        this.zza = new zzaih();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzaii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzabn r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaib.zzd(com.google.android.gms.internal.ads.zzabn):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final /* bridge */ /* synthetic */ zzacm zze() {
        zzahz zzahzVar = null;
        if (this.zzf != 0) {
            return new zzaia(this, zzahzVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
