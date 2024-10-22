package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaix implements zzaje {
    private final zzfa zza;
    private final zzfb zzb;
    private final String zzc;
    private String zzd;
    private zzacs zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzaix() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zza(zzfb zzfbVar) {
        boolean z;
        boolean z2;
        zzdx.zzb(this.zze);
        while (zzfbVar.zza() > 0) {
            int i = this.zzf;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(zzfbVar.zza(), this.zzk - this.zzg);
                    this.zze.zzr(zzfbVar, min);
                    int i2 = this.zzg + min;
                    this.zzg = i2;
                    int i3 = this.zzk;
                    if (i2 == i3) {
                        long j = this.zzl;
                        if (j != -9223372036854775807L) {
                            this.zze.zzt(j, 1, i3, 0, null);
                            this.zzl += this.zzi;
                        }
                        this.zzf = 0;
                    }
                } else {
                    byte[] zzI = this.zzb.zzI();
                    int min2 = Math.min(zzfbVar.zza(), 16 - this.zzg);
                    zzfbVar.zzC(zzI, this.zzg, min2);
                    int i4 = this.zzg + min2;
                    this.zzg = i4;
                    if (i4 == 16) {
                        this.zza.zzj(0);
                        zzaap zza = zzaaq.zza(this.zza);
                        zzam zzamVar = this.zzj;
                        if (zzamVar == null || zzamVar.zzz != 2 || zza.zza != zzamVar.zzA || !"audio/ac4".equals(zzamVar.zzm)) {
                            zzak zzakVar = new zzak();
                            zzakVar.zzJ(this.zzd);
                            zzakVar.zzU("audio/ac4");
                            zzakVar.zzy(2);
                            zzakVar.zzV(zza.zza);
                            zzakVar.zzM(this.zzc);
                            zzam zzac = zzakVar.zzac();
                            this.zzj = zzac;
                            this.zze.zzl(zzac);
                        }
                        this.zzk = zza.zzb;
                        this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                        this.zzb.zzG(0);
                        this.zze.zzr(this.zzb, 16);
                        this.zzf = 2;
                    }
                }
            } else {
                while (zzfbVar.zza() > 0) {
                    if (!this.zzh) {
                        if (zzfbVar.zzl() == 172) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.zzh = z;
                    } else {
                        int zzl = zzfbVar.zzl();
                        if (zzl == 172) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.zzh = z2;
                        byte b2 = 64;
                        if (zzl != 64) {
                            if (zzl == 65) {
                                zzl = 65;
                            }
                        }
                        this.zzf = 1;
                        zzfb zzfbVar2 = this.zzb;
                        zzfbVar2.zzI()[0] = -84;
                        if (zzl == 65) {
                            b2 = 65;
                        }
                        zzfbVar2.zzI()[1] = b2;
                        this.zzg = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzd = zzakqVar.zzb();
        this.zze = zzabpVar.zzw(zzakqVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaix(String str) {
        zzfa zzfaVar = new zzfa(new byte[16], 16);
        this.zza = zzfaVar;
        this.zzb = new zzfb(zzfaVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
