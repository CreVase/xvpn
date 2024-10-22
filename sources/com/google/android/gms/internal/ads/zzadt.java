package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzadt extends zzady {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzadt(zzacs zzacsVar) {
        super(zzacsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zza(zzfb zzfbVar) throws zzadx {
        String str;
        if (!this.zzc) {
            int zzl = zzfbVar.zzl();
            int i = zzl >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzl >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzU("audio/mpeg");
                zzakVar.zzy(1);
                zzakVar.zzV(i2);
                this.zza.zzl(zzakVar.zzac());
                this.zzd = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new zzadx(hx2.m("Audio format not supported: ", i));
                }
            } else {
                zzak zzakVar2 = new zzak();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzakVar2.zzU(str);
                zzakVar2.zzy(1);
                zzakVar2.zzV(8000);
                this.zza.zzl(zzakVar2.zzac());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzfbVar.zzH(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zzb(zzfb zzfbVar, long j) throws zzcc {
        if (this.zze == 2) {
            int zza = zzfbVar.zza();
            this.zza.zzr(zzfbVar, zza);
            this.zza.zzt(j, 1, zza, 0, null);
            return true;
        }
        int zzl = zzfbVar.zzl();
        if (zzl == 0 && !this.zzd) {
            int zza2 = zzfbVar.zza();
            byte[] bArr = new byte[zza2];
            zzfbVar.zzC(bArr, 0, zza2);
            zzaaj zza3 = zzaak.zza(bArr);
            zzak zzakVar = new zzak();
            zzakVar.zzU("audio/mp4a-latm");
            zzakVar.zzz(zza3.zzc);
            zzakVar.zzy(zza3.zzb);
            zzakVar.zzV(zza3.zza);
            zzakVar.zzK(Collections.singletonList(bArr));
            this.zza.zzl(zzakVar.zzac());
            this.zzd = true;
            return false;
        }
        if (this.zze == 10 && zzl != 1) {
            return false;
        }
        int zza4 = zzfbVar.zza();
        this.zza.zzr(zzfbVar, zza4);
        this.zza.zzt(j, 1, zza4, 0, null);
        return true;
    }
}
