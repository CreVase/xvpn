package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class zzdsw {
    protected final Context zzc;
    protected final Executor zzd;
    protected final zzcay zze;
    private final zzfil zzg;
    protected final String zza = (String) zzbdv.zzb.zze();
    protected final Map zzb = new HashMap();
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference(new Bundle());
    protected final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbV)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbY)).booleanValue();
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgX)).booleanValue();

    public zzdsw(Executor executor, zzcay zzcayVar, zzfil zzfilVar, Context context) {
        this.zzd = executor;
        this.zze = zzcayVar;
        this.zzg = zzfilVar;
        this.zzc = context;
    }

    private final void zza(Map map, boolean z) {
        if (!map.isEmpty()) {
            if (map.isEmpty()) {
                zzcat.zze("Empty or null paramMap.");
            } else {
                if (!this.zzj.getAndSet(true)) {
                    final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjH);
                    this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zza(this.zzc, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsv
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            zzdsw.this.zzd(str, sharedPreferences, str2);
                        }
                    }));
                }
                Bundle bundle = (Bundle) this.zzk.get();
                for (String str2 : bundle.keySet()) {
                    map.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
            final String zza = this.zzg.zza(map);
            com.google.android.gms.ads.internal.util.zze.zza(zza);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zzf) {
                if (!z || this.zzh) {
                    if (!parseBoolean || this.zzi) {
                        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsu
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdsw.this.zze.zza(zza);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        zzcat.zze("Empty paramMap.");
    }

    public final String zzb(Map map) {
        return this.zzg.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzc, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
