package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzajn implements zzaje {
    private final zzakf zza;
    private long zze;
    private String zzg;
    private zzacs zzh;
    private zzajm zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajt zzb = new zzajt(7, 128);
    private final zzajt zzc = new zzajt(8, 128);
    private final zzajt zzd = new zzajt(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfb zzm = new zzfb();

    public zzajn(zzakf zzakfVar, boolean z, boolean z2) {
        this.zza = zzakfVar;
    }

    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajn.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzg = zzakqVar.zzb();
        zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzajm(zzw, false, false);
        this.zza.zzb(zzabpVar, zzakqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
        zzdx.zzb(this.zzh);
        int i = zzfk.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzajm zzajmVar = this.zzi;
        if (zzajmVar != null) {
            zzajmVar.zzd();
        }
    }
}
