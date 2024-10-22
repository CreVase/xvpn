package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdmr {
    private final Executor zza;
    private final zzdmm zzb;

    public zzdmr(Executor executor, zzdmm zzdmmVar) {
        this.zza = executor;
        this.zzb = zzdmmVar;
    }

    public final ml1 zza(JSONObject jSONObject, String str) {
        ml1 zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfzt.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzh = zzfzt.zzh(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzh = zzfzt.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzfzt.zzh(new zzdmq(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzfzt.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdmo
                            @Override // com.google.android.gms.internal.ads.zzfsk
                            public final Object apply(Object obj) {
                                return new zzdmq(optString, (zzbfa) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzfzt.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzfzt.zzm(zzfzt.zzd(arrayList), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdmq zzdmqVar : (List) obj) {
                    if (zzdmqVar != null) {
                        arrayList2.add(zzdmqVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
