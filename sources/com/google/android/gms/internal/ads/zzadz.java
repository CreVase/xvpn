package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzadz extends zzady {
    private final zzfb zzb;
    private final zzfb zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadz(zzacs zzacsVar) {
        super(zzacsVar);
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zza(zzfb zzfbVar) throws zzadx {
        int zzl = zzfbVar.zzl();
        int i = zzl >> 4;
        int i2 = zzl & 15;
        if (i2 == 7) {
            this.zzg = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new zzadx(hx2.m("Video format not supported: ", i2));
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zzb(zzfb zzfbVar, long j) throws zzcc {
        int i;
        int zzl = zzfbVar.zzl();
        long zzg = zzfbVar.zzg();
        if (zzl == 0) {
            if (!this.zze) {
                zzfb zzfbVar2 = new zzfb(new byte[zzfbVar.zza()]);
                zzfbVar.zzC(zzfbVar2.zzI(), 0, zzfbVar.zza());
                zzaar zza = zzaar.zza(zzfbVar2);
                this.zzd = zza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzU("video/avc");
                zzakVar.zzz(zza.zzi);
                zzakVar.zzab(zza.zzc);
                zzakVar.zzH(zza.zzd);
                zzakVar.zzR(zza.zzh);
                zzakVar.zzK(zza.zza);
                this.zza.zzl(zzakVar.zzac());
                this.zze = true;
                return false;
            }
        } else if (zzl == 1 && this.zze) {
            if (this.zzg == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] zzI = this.zzc.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzfbVar.zza() > 0) {
                zzfbVar.zzC(this.zzc.zzI(), i2, this.zzd);
                this.zzc.zzG(0);
                zzfb zzfbVar3 = this.zzc;
                zzfb zzfbVar4 = this.zzb;
                int zzo = zzfbVar3.zzo();
                zzfbVar4.zzG(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzfbVar, zzo);
                i3 = i3 + 4 + zzo;
            }
            this.zza.zzt((zzg * 1000) + j, i, i3, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
