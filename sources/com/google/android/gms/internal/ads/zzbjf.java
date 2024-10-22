package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbjf implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcgbVar.zzbj();
        } else if ("resume".equals(str)) {
            zzcgbVar.zzbk();
        }
    }
}
