package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbiw implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfsc.zzc("true", str) && !zzfsc.zzc("false", str)) {
                return;
            }
            zzfpx.zzi(zzcgbVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
