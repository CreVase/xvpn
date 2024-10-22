package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeji implements zzeew {
    private final Map zza = new HashMap();
    private final zzdqj zzb;

    public zzeji(zzdqj zzdqjVar) {
        this.zzb = zzdqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final zzeex zza(String str, JSONObject jSONObject) throws zzfds {
        zzeex zzeexVar;
        synchronized (this) {
            zzeexVar = (zzeex) this.zza.get(str);
            if (zzeexVar == null) {
                zzeexVar = new zzeex(this.zzb.zzc(str, jSONObject), new zzegr(), str);
                this.zza.put(str, zzeexVar);
            }
        }
        return zzeexVar;
    }
}
