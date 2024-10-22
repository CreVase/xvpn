package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbzc implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbzd zza;
    private final String zzb;

    public zzbzc(zzbzd zzbzdVar, String str) {
        this.zza = zzbzdVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbzb> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbzb zzbzbVar : list) {
                zzbzbVar.zza.zzb(zzbzbVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
