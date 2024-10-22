package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzakf {
    private final List zza;
    private final zzacs[] zzb;

    public zzakf(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    public final void zza(long j, zzfb zzfbVar) {
        zzaaz.zza(j, zzfbVar, this.zzb);
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
            String str2 = zzamVar.zzb;
            if (str2 == null) {
                str2 = zzakqVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzJ(str2);
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
