package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaiu implements zzaje {
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

    public zzaiu() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zza(zzfb zzfbVar) {
        boolean z;
        boolean z2;
        zzdx.zzb(this.zze);
        while (zzfbVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzfbVar.zza() <= 0) {
                        break;
                    }
                    if (!this.zzh) {
                        if (zzfbVar.zzl() == 11) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.zzh = z;
                    } else {
                        int zzl = zzfbVar.zzl();
                        if (zzl == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzfb zzfbVar2 = this.zzb;
                            zzfbVar2.zzI()[0] = 11;
                            zzfbVar2.zzI()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        if (zzl == 11) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.zzh = z2;
                    }
                }
            } else if (i != 1) {
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
                int min2 = Math.min(zzfbVar.zza(), 128 - this.zzg);
                zzfbVar.zzC(zzI, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzj(0);
                    zzaam zze = zzaan.zze(this.zza);
                    zzam zzamVar = this.zzj;
                    if (zzamVar == null || zze.zzc != zzamVar.zzz || zze.zzb != zzamVar.zzA || !zzfk.zzE(zze.zza, zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzJ(this.zzd);
                        zzakVar.zzU(zze.zza);
                        zzakVar.zzy(zze.zzc);
                        zzakVar.zzV(zze.zzb);
                        zzakVar.zzM(this.zzc);
                        zzakVar.zzQ(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzakVar.zzx(zze.zzf);
                        }
                        zzam zzac = zzakVar.zzac();
                        this.zzj = zzac;
                        this.zze.zzl(zzac);
                    }
                    this.zzk = zze.zzd;
                    this.zzi = (zze.zze * 1000000) / this.zzj.zzA;
                    this.zzb.zzG(0);
                    this.zze.zzr(this.zzb, 128);
                    this.zzf = 2;
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

    public zzaiu(String str) {
        zzfa zzfaVar = new zzfa(new byte[128], 128);
        this.zza = zzfaVar;
        this.zzb = new zzfb(zzfaVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
