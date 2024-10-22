package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjk implements zzbjj {
    private final zzbjl zza;

    public zzbjk(zzbjl zzbjlVar) {
        this.zza = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzcat.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcgbVar.zzat(equals);
    }
}
