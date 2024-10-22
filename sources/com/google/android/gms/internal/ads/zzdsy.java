package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdsy {
    private final String zze;
    private final zzdst zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdsy(String str, zzdst zzdstVar) {
        this.zze = str;
        this.zzf = zzdstVar;
    }

    private final Map zzg() {
        String str;
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        if (this.zza.zzQ()) {
            str = "";
        } else {
            str = this.zze;
        }
        zza.put("tid", str);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "aaia");
                zzg.put("aair", "MalformedJson");
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                zzg.put("rqe", str2);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_started");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                if (!this.zzd) {
                    Map zzg = zzg();
                    zzg.put("action", "init_finished");
                    this.zzb.add(zzg);
                    Iterator it = this.zzb.iterator();
                    while (it.hasNext()) {
                        this.zzf.zzf((Map) it.next());
                    }
                    this.zzd = true;
                }
            }
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                if (!this.zzc) {
                    Map zzg = zzg();
                    zzg.put("action", "init_started");
                    this.zzb.add(zzg);
                    this.zzc = true;
                }
            }
        }
    }
}
