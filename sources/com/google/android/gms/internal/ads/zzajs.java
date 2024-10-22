package com.google.android.gms.internal.ads;

import com.google.protobuf.v;

/* loaded from: classes.dex */
public final class zzajs implements zzaje {
    private final zzfb zza;
    private final zzacg zzb;
    private final String zzc;
    private zzacs zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzajs() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zza(zzfb zzfbVar) {
        boolean z;
        boolean z2;
        zzdx.zzb(this.zzd);
        while (zzfbVar.zza() > 0) {
            int i = this.zzf;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(zzfbVar.zza(), this.zzk - this.zzg);
                    this.zzd.zzr(zzfbVar, min);
                    int i2 = this.zzg + min;
                    this.zzg = i2;
                    int i3 = this.zzk;
                    if (i2 >= i3) {
                        long j = this.zzl;
                        if (j != -9223372036854775807L) {
                            this.zzd.zzt(j, 1, i3, 0, null);
                            this.zzl += this.zzj;
                        }
                        this.zzg = 0;
                        this.zzf = 0;
                    }
                } else {
                    int min2 = Math.min(zzfbVar.zza(), 4 - this.zzg);
                    zzfbVar.zzC(this.zza.zzI(), this.zzg, min2);
                    int i4 = this.zzg + min2;
                    this.zzg = i4;
                    if (i4 >= 4) {
                        this.zza.zzG(0);
                        if (!this.zzb.zza(this.zza.zzf())) {
                            this.zzg = 0;
                            this.zzf = 1;
                        } else {
                            this.zzk = this.zzb.zzc;
                            if (!this.zzh) {
                                this.zzj = (r0.zzg * 1000000) / r0.zzd;
                                zzak zzakVar = new zzak();
                                zzakVar.zzJ(this.zze);
                                zzakVar.zzU(this.zzb.zzb);
                                zzakVar.zzN(v.DEFAULT_BUFFER_SIZE);
                                zzakVar.zzy(this.zzb.zze);
                                zzakVar.zzV(this.zzb.zzd);
                                zzakVar.zzM(this.zzc);
                                this.zzd.zzl(zzakVar.zzac());
                                this.zzh = true;
                            }
                            this.zza.zzG(0);
                            this.zzd.zzr(this.zza, 4);
                            this.zzf = 2;
                        }
                    }
                }
            } else {
                byte[] zzI = zzfbVar.zzI();
                int zzc = zzfbVar.zzc();
                int zzd = zzfbVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        int i5 = zzc + 1;
                        byte b2 = zzI[zzc];
                        if ((b2 & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.zzi && (b2 & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.zzi = z;
                        if (z2) {
                            zzfbVar.zzG(i5);
                            this.zzi = false;
                            this.zza.zzI()[1] = zzI[zzc];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzc = i5;
                    } else {
                        zzfbVar.zzG(zzd);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zze = zzakqVar.zzb();
        this.zzd = zzabpVar.zzw(zzakqVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzajs(String str) {
        this.zzf = 0;
        zzfb zzfbVar = new zzfb(4);
        this.zza = zzfbVar;
        zzfbVar.zzI()[0] = -1;
        this.zzb = new zzacg();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
