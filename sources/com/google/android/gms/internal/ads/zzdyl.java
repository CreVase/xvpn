package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdyl implements zzdyn {
    private final Map zza;
    private final zzgad zzb;
    private final zzdae zzc;

    public zzdyl(Map map, zzgad zzgadVar, zzdae zzdaeVar) {
        this.zza = map;
        this.zzb = zzgadVar;
        this.zzc = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final ml1 zzb(final zzbvg zzbvgVar) {
        this.zzc.zzbr(zzbvgVar);
        ml1 zzg = zzfzt.zzg(new zzdwm(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhX)).split(",")) {
            final zzhbp zzhbpVar = (zzhbp) this.zza.get(str.trim());
            if (zzhbpVar != null) {
                zzg = zzfzt.zzf(zzg, zzdwm.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdyj
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        return ((zzdyn) zzhbp.this.zzb()).zzb(zzbvgVar);
                    }
                }, this.zzb);
            }
        }
        zzfzt.zzr(zzg, new zzdyk(this), zzcbg.zzf);
        return zzg;
    }
}
