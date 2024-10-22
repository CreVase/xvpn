package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfje implements Runnable {
    private final zzfjh zzb;
    private String zzc;
    private String zzd;
    private zzfdd zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzfje(zzfjh zzfjhVar) {
        this.zzb = zzfjhVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfje zza(zzfit zzfitVar) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfitVar.zzi();
            list.add(zzfitVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcbg.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziy)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfje zzb(String str) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue() && zzfjd.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfje zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfje zzd(ArrayList arrayList) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfje zze(String str) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfje zzf(zzfdd zzfddVar) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zze = zzfddVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (!((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            return;
        }
        Future future = this.zzg;
        if (future != null) {
            future.cancel(false);
        }
        for (zzfit zzfitVar : this.zza) {
            int i = this.zzh;
            if (i != 2) {
                zzfitVar.zzm(i);
            }
            if (!TextUtils.isEmpty(this.zzc)) {
                zzfitVar.zze(this.zzc);
            }
            if (!TextUtils.isEmpty(this.zzd) && !zzfitVar.zzk()) {
                zzfitVar.zzd(this.zzd);
            }
            zzfdd zzfddVar = this.zze;
            if (zzfddVar != null) {
                zzfitVar.zzb(zzfddVar);
            } else {
                com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                if (zzeVar != null) {
                    zzfitVar.zza(zzeVar);
                }
            }
            this.zzb.zzb(zzfitVar.zzl());
        }
        this.zza.clear();
    }

    public final synchronized zzfje zzh(int i) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
