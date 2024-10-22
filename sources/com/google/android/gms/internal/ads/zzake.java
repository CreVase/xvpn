package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzake implements zzakr {
    private final zzakd zza;
    private final zzfb zzb = new zzfb(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzake(zzakd zzakdVar) {
        this.zza = zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(zzfb zzfbVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 1;
        if (i3 != 0) {
            i2 = zzfbVar.zzc() + zzfbVar.zzl();
        } else {
            i2 = -1;
        }
        if (this.zzf) {
            if (i3 == 0) {
                return;
            }
            this.zzf = false;
            zzfbVar.zzG(i2);
            this.zzd = 0;
        }
        while (zzfbVar.zza() > 0) {
            int i4 = this.zzd;
            if (i4 < 3) {
                if (i4 == 0) {
                    int zzl = zzfbVar.zzl();
                    zzfbVar.zzG(zzfbVar.zzc() - 1);
                    if (zzl == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfbVar.zza(), 3 - this.zzd);
                zzfbVar.zzC(this.zzb.zzI(), this.zzd, min);
                int i5 = this.zzd + min;
                this.zzd = i5;
                if (i5 == 3) {
                    this.zzb.zzG(0);
                    this.zzb.zzF(3);
                    this.zzb.zzH(1);
                    zzfb zzfbVar2 = this.zzb;
                    int zzl2 = zzfbVar2.zzl();
                    if ((zzl2 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int zzl3 = zzfbVar2.zzl();
                    this.zze = z;
                    this.zzc = (zzl3 | ((zzl2 & 15) << 8)) + 3;
                    int zzb = this.zzb.zzb();
                    int i6 = this.zzc;
                    if (zzb < i6) {
                        int zzb2 = this.zzb.zzb();
                        this.zzb.zzA(Math.min(4098, Math.max(i6, zzb2 + zzb2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfbVar.zza(), this.zzc - i4);
                zzfbVar.zzC(this.zzb.zzI(), this.zzd, min2);
                int i7 = this.zzd + min2;
                this.zzd = i7;
                int i8 = this.zzc;
                if (i7 != i8) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzfk.zzd(this.zzb.zzI(), 0, i8, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzF(this.zzc - 4);
                    } else {
                        this.zzb.zzF(i8);
                    }
                    this.zzb.zzG(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zzb(zzfi zzfiVar, zzabp zzabpVar, zzakq zzakqVar) {
        this.zza.zzb(zzfiVar, zzabpVar, zzakqVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zzc() {
        this.zzf = true;
    }
}
