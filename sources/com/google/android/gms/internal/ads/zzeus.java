package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeus implements zzetv {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfpt zzc;

    public zzeus(AdvertisingIdClient.Info info, String str, zzfpt zzfptVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbw.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzf.put("rdid", this.zza.getId());
                zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzf.put("idtype", "adid");
                zzfpt zzfptVar = this.zzc;
                if (zzfptVar.zzc()) {
                    zzf.put("paidv1_id_android_3p", zzfptVar.zzb());
                    zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzf.put("pdid", str);
                zzf.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
