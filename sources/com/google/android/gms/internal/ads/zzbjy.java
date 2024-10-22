package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.ml1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbjy implements zzbjj {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbjx zzbjxVar = (zzbjx) this.zzb.remove(str);
            if (zzbjxVar == null) {
                zzcat.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbjxVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbjxVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbjxVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbjxVar.zza(e.getMessage());
            }
        }
    }

    public final ml1 zzb(zzbmq zzbmqVar, String str, JSONObject jSONObject) {
        zzcbl zzcblVar = new zzcbl();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjw(this, zzcblVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbmqVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcblVar.zzd(e);
        }
        return zzcblVar;
    }

    public final void zzc(String str, zzbjx zzbjxVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjxVar);
        }
    }
}
