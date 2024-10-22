package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdhm implements zzcta {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhbp zzd;
    private final zzdju zze;

    public zzdhm(Map map, Map map2, Map map3, zzhbp zzhbpVar, zzdju zzdjuVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhbpVar;
        this.zze = zzdjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcta
    public final zzeeu zza(int i, String str) {
        zzeeu zza;
        zzeeu zzeeuVar = (zzeeu) this.zza.get(str);
        if (zzeeuVar != null) {
            return zzeeuVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzehi zzehiVar = (zzehi) this.zzc.get(str);
            if (zzehiVar != null) {
                return new zzeev(zzehiVar, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzctc
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        return new zzcte((List) obj);
                    }
                });
            }
            zzeeu zzeeuVar2 = (zzeeu) this.zzb.get(str);
            if (zzeeuVar2 == null) {
                return null;
            }
            return zzcte.zza(zzeeuVar2);
        }
        if (this.zze.zze() == null || (zza = ((zzcta) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcte.zza(zza);
    }
}
