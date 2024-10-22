package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzgx implements com.google.android.gms.internal.measurement.zzo {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzgp zzb;

    public zzgx(zzgp zzgpVar, String str) {
        this.zzb = zzgpVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.zzb.zzc;
        Map map2 = (Map) map.get(this.zza);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
