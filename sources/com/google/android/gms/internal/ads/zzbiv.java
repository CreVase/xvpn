package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbiv implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        try {
            zzfpw.zzj(zzcgbVar.getContext()).zzk();
            zzfpx.zzi(zzcgbVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
