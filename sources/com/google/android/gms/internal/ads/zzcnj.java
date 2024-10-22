package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnj {
    private final Map zza;
    private final Map zzb;

    public zzcnj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfde zzfdeVar) throws Exception {
        for (zzfdc zzfdcVar : zzfdeVar.zzb.zzc) {
            if (this.zza.containsKey(zzfdcVar.zza)) {
                ((zzcnm) this.zza.get(zzfdcVar.zza)).zza(zzfdcVar.zzb);
            } else if (this.zzb.containsKey(zzfdcVar.zza)) {
                zzcnl zzcnlVar = (zzcnl) this.zzb.get(zzfdcVar.zza);
                JSONObject jSONObject = zzfdcVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcnlVar.zza(hashMap);
            }
        }
    }
}
