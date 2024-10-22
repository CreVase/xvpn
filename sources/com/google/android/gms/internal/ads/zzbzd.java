package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbzd {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbya zzd;

    public zzbzd(Context context, zzbya zzbyaVar) {
        this.zzc = context;
        this.zzd = zzbyaVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (!map.containsKey(str) || !((Set) map.get(str)).contains(str2)) {
            return;
        }
        this.zzd.zze();
    }

    public final synchronized void zzc(String str) {
        SharedPreferences defaultSharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
                zzbzc zzbzcVar = new zzbzc(this, str);
                this.zza.put(str, zzbzcVar);
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbzcVar);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzbzc zzbzcVar2 = new zzbzc(this, str);
            this.zza.put(str, zzbzcVar2);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbzcVar2);
        }
    }

    public final synchronized void zzd(zzbzb zzbzbVar) {
        this.zzb.add(zzbzbVar);
    }
}
