package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzajg implements zzaje {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzacs zzc;
    private final zzakt zzd;
    private final zzfb zze;
    private final zzajt zzf;
    private final boolean[] zzg;
    private final zzajf zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzajg() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    @Override // com.google.android.gms.internal.ads.zzaje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzb = zzakqVar.zzb();
        this.zzc = zzabpVar.zzw(zzakqVar.zza(), 2);
        zzakt zzaktVar = this.zzd;
        if (zzaktVar != null) {
            zzaktVar.zzb(zzabpVar, zzakqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
        zzdx.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzt(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        zzfy.zzf(this.zzg);
        this.zzh.zzb();
        zzajt zzajtVar = this.zzf;
        if (zzajtVar != null) {
            zzajtVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzajg(zzakt zzaktVar) {
        zzfb zzfbVar;
        this.zzd = zzaktVar;
        this.zzg = new boolean[4];
        this.zzh = new zzajf(128);
        if (zzaktVar != null) {
            this.zzf = new zzajt(178, 128);
            zzfbVar = new zzfb();
        } else {
            zzfbVar = null;
            this.zzf = null;
        }
        this.zze = zzfbVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
