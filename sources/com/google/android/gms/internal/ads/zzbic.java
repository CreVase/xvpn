package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbic implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcat.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzcat.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcgbVar.zzm().zzc(str2, str3, parseLong);
                return;
            } catch (NumberFormatException e) {
                zzcat.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zzcat.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcgbVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zzcat.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcat.zzj("No name given for CSI extra.");
            } else {
                zzcgbVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
