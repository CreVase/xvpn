package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzajp implements zzaje {
    private final zzakf zza;
    private String zzb;
    private zzacs zzc;
    private zzajo zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajt zzg = new zzajt(32, 128);
    private final zzajt zzh = new zzajt(33, 128);
    private final zzajt zzi = new zzajt(34, 128);
    private final zzajt zzj = new zzajt(39, 128);
    private final zzajt zzk = new zzajt(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfb zzn = new zzfb();

    public zzajp(zzakf zzakfVar) {
        this.zza = zzakfVar;
    }

    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0181  */
    @Override // com.google.android.gms.internal.ads.zzaje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r32) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzb = zzakqVar.zzb();
        zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzajo(zzw);
        this.zza.zzb(zzabpVar, zzakqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
        zzdx.zzb(this.zzc);
        int i = zzfk.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzajo zzajoVar = this.zzd;
        if (zzajoVar != null) {
            zzajoVar.zzd();
        }
    }
}
