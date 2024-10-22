package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzceo implements zzbjj {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcat.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcen zzcenVar;
        zzcdc zzcdcVar = (zzcdc) obj;
        if (zzcat.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcat.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzceg zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (!zzy.zzd(zzcdcVar)) {
                zzcat.zzj("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcdb zzcdbVar = new zzcdb((String) map.get("flags"));
        boolean z = zzcdbVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcef zzcefVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcat.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzcef zzcefVar2 = (zzcef) it.next();
                    if (zzcefVar2.zza == zzcdcVar && str.equals(zzcefVar2.zze())) {
                        zzcefVar = zzcefVar2;
                        break;
                    }
                }
            } else {
                zzcefVar = zzy.zza(zzcdcVar);
            }
            if (zzcefVar != null) {
                zzcat.zzj("Precache task is already running.");
                return;
            }
            if (zzcdcVar.zzj() == null) {
                zzcat.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzcdcVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcdcVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcdcVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcdz zzcdzVar = zzcdcVar.zzj().zzb;
            if (intValue > 0) {
                int i2 = zzcdbVar.zzh;
                int zzu = zzcct.zzu();
                if (zzu < i2) {
                    zzcenVar = new zzcew(zzcdcVar, zzcdbVar);
                } else if (zzu < zzcdbVar.zzb) {
                    zzcenVar = new zzcet(zzcdcVar, zzcdbVar);
                } else {
                    zzcenVar = new zzcer(zzcdcVar);
                }
            } else {
                zzcenVar = new zzceq(zzcdcVar);
            }
            new zzcef(zzcdcVar, zzcenVar, str, strArr).zzb();
        } else {
            zzcef zza = zzy.zza(zzcdcVar);
            if (zza != null) {
                zzcenVar = zza.zzb;
            } else {
                zzcat.zzj("Precache must specify a source.");
                return;
            }
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcenVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcenVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcenVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcenVar.zzq(zzb8.intValue());
        }
    }
}
