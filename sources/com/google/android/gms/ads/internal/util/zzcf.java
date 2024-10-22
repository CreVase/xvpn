package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbci;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcf {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcf(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        SharedPreferences defaultSharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
                zzce zzceVar = new zzce(this, str);
                this.zza.put(str, zzceVar);
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzce zzceVar2 = new zzce(this, str);
            this.zza.put(str, zzceVar2);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar2);
        }
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjC)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        Map zzu = zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjG));
        Iterator it = zzu.keySet().iterator();
        while (it.hasNext()) {
            zzb((String) it.next());
        }
        zzd(new zzcd(zzu));
    }

    public final synchronized void zzd(zzcd zzcdVar) {
        this.zzb.add(zzcdVar);
    }
}
