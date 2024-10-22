package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class zzbda {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbda(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcx zzf() {
        return new zzbcx(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), null, null);
    }

    public final zzbcz zza() {
        zzbcz zzbczVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbcx zzbcxVar : this.zza) {
                long zza = zzbcxVar.zza();
                String zzc = zzbcxVar.zzc();
                zzbcx zzb = zzbcxVar.zzb();
                if (zzb != null && zza > 0) {
                    long zza2 = zza - zzb.zza();
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza2);
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbczVar = new zzbcz(sb.toString(), str);
        }
        return zzbczVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbda zzbdaVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcq zzf;
        if (TextUtils.isEmpty(str2) || (zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbcw zza = zzf.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbcx zzbcxVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbcx(j, strArr[i], zzbcxVar));
            }
        }
        return true;
    }
}
