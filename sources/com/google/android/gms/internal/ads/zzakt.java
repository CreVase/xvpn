package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzakt {
    private final List zza;
    private final zzacs[] zzb;

    public zzakt(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    public final void zza(long j, zzfb zzfbVar) {
        if (zzfbVar.zza() < 9) {
            return;
        }
        int zzf = zzfbVar.zzf();
        int zzf2 = zzfbVar.zzf();
        int zzl = zzfbVar.zzl();
        if (zzf == 434 && zzf2 == 1195456820 && zzl == 3) {
            zzaaz.zzb(j, zzfbVar, this.zzb);
        }
    }

    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzakqVar.zzc();
            zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i);
            String str = zzamVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdx.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzJ(zzakqVar.zzb());
            zzakVar.zzU(str);
            zzakVar.zzW(zzamVar.zze);
            zzakVar.zzM(zzamVar.zzd);
            zzakVar.zzw(zzamVar.zzE);
            zzakVar.zzK(zzamVar.zzo);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzw;
        }
    }
}
