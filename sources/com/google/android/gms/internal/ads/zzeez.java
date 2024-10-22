package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzeez {
    private final String zzc;
    private zzfcv zzd = null;
    private zzfcr zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeez(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfcr zzfcrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            return zzfcrVar.zzar;
        }
        return zzfcrVar.zzy;
    }

    private final synchronized void zzk(zzfcr zzfcrVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfcrVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfcrVar.zzx.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfcrVar.zzx.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgK)).booleanValue()) {
            str = zzfcrVar.zzH;
            str2 = zzfcrVar.zzI;
            str3 = zzfcrVar.zzJ;
            str4 = zzfcrVar.zzK;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfcrVar.zzG, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzuVar);
    }

    private final void zzl(zzfcr zzfcrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String zzj = zzj(zzfcrVar);
        if (!map.containsKey(zzj)) {
            return;
        }
        if (this.zze == null) {
            this.zze = zzfcrVar;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(zzj);
        zzuVar.zzb = j;
        zzuVar.zzc = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgL)).booleanValue() && z) {
            this.zzf = zzuVar;
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcxe zzb() {
        return new zzcxe(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfcr zzfcrVar) {
        zzk(zzfcrVar, this.zza.size());
    }

    public final void zze(zzfcr zzfcrVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfcrVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
                    zzuVar.zzb = 0L;
                    zzuVar.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfcr zzfcrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfcrVar, j, zzeVar, false);
    }

    public final void zzg(zzfcr zzfcrVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfcrVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (!this.zzb.containsKey(str)) {
            return;
        }
        int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
        try {
            this.zza.remove(indexOf);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
        }
        this.zzb.remove(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzk((zzfcr) it.next(), indexOf);
            indexOf++;
        }
    }

    public final void zzi(zzfcv zzfcvVar) {
        this.zzd = zzfcvVar;
    }
}
