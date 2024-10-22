package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzdvh {
    private final zzdur zza;
    private final zzdqg zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdvh(zzdur zzdurVar, zzdqg zzdqgVar) {
        this.zza = zzdurVar;
        this.zzb = zzdqgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdqf zza;
        zzbrj zzbrjVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblg zzblgVar = (zzblg) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjb)).booleanValue()) {
                    zzdqf zza2 = this.zzb.zza(zzblgVar.zza);
                    if (zza2 != null && (zzbrjVar = zza2.zzc) != null) {
                        str = zzbrjVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjc)).booleanValue() && (zza = this.zzb.zza(zzblgVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzblgVar.zza;
                    list2.add(new zzdvg(str3, str2, this.zzb.zzc(str3), zzblgVar.zzb ? 1 : 0, zzblgVar.zzd, zzblgVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzblgVar.zza;
                list22.add(new zzdvg(str32, str2, this.zzb.zzc(str32), zzblgVar.zzb ? 1 : 0, zzblgVar.zzd, zzblgVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdvg) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdvf(this));
    }
}
