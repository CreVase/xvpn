package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbcb {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb((zzbca) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcm.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb((zzbca) it.next());
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbcm.zzb());
        return zza;
    }

    public final void zzc(zzbca zzbcaVar) {
        this.zzb.add(zzbcaVar);
    }

    public final void zzd(zzbca zzbcaVar) {
        this.zza.add(zzbcaVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbca zzbcaVar : this.zza) {
            if (zzbcaVar.zze() == 1) {
                zzbcaVar.zzd(editor, zzbcaVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcat.zzg("Flag Json is null.");
        }
    }
}
