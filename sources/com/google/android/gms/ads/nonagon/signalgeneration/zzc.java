package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzc {
    private final zzdst zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zzb(zzbci.zzgU)).intValue();
    private final long zzb = ((Long) zzba.zzc().zzb(zzbci.zzgV)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zzb(zzbci.zzha)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zzb(zzbci.zzgY)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdst zzdstVar) {
        this.zzh = zzdstVar;
    }

    private final synchronized void zzg(final zzdsj zzdsjVar) {
        if (!this.zzc) {
            return;
        }
        ArrayDeque arrayDeque = this.zzg;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.zzf;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                zzc.this.zze(zzdsjVar, clone, clone2);
            }
        });
    }

    private final void zzh(zzdsj zzdsjVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsjVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdsj zzdsjVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdsjVar.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdsjVar.zza().put("mhit", "true");
            return str2;
        }
        zzdsjVar.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdsj zzdsjVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdsjVar);
    }

    public final /* synthetic */ void zze(zzdsj zzdsjVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdsjVar, arrayDeque, "to");
        zzh(zzdsjVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
