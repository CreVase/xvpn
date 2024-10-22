package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbio implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcgb zzcgbVar = (zzcgb) obj;
        zzbfb zzK = zzcgbVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzcgbVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcgbVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
