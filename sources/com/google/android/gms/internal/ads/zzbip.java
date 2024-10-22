package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbip implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcgb zzcgbVar = (zzcgb) obj;
        zzbfb zzK = zzcgbVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzcgbVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzcgbVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
