package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdsn {
    final /* synthetic */ zzdso zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdsn(zzdso zzdsoVar) {
        this.zza = zzdsoVar;
    }

    public static /* bridge */ /* synthetic */ zzdsn zza(zzdsn zzdsnVar) {
        Map map;
        zzdso zzdsoVar = zzdsnVar.zza;
        Map map2 = zzdsnVar.zzb;
        map = zzdsoVar.zzc;
        map2.putAll(map);
        return zzdsnVar;
    }

    public final zzdsn zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdsn zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsn zzd(zzfcr zzfcrVar) {
        this.zzb.put("aai", zzfcrVar.zzy);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            zzc("rid", zzfcrVar.zzap);
        }
        return this;
    }

    public final zzdsn zze(zzfcv zzfcvVar) {
        this.zzb.put("gqi", zzfcvVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdst zzdstVar;
        zzdstVar = this.zza.zza;
        return zzdstVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // java.lang.Runnable
            public final void run() {
                zzdsn.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsm
            @Override // java.lang.Runnable
            public final void run() {
                zzdsn.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdst zzdstVar;
        zzdstVar = this.zza.zza;
        zzdstVar.zzf(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdst zzdstVar;
        zzdstVar = this.zza.zza;
        zzdstVar.zze(this.zzb);
    }
}
