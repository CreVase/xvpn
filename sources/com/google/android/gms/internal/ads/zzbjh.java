package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbjh implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        if (map.keySet().contains("start")) {
            zzcgbVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcgbVar.zzas(false);
        }
    }
}
