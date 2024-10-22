package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzetz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfje zzd;
    private final zzdso zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetz(Context context, Executor executor, Set set, zzfje zzfjeVar, zzdso zzdsoVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfjeVar;
        this.zze = zzdsoVar;
    }

    public final ml1 zza(final Object obj) {
        zzfit zza = zzfis.zza(this.zza, 8);
        zza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbca zzbcaVar = zzbci.zzkL;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        for (final zzetw zzetwVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzetwVar.zza()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                ml1 zzb = zzetwVar.zzb();
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzetz.this.zzb(elapsedRealtime, zzetwVar);
                    }
                }, zzcbg.zzf);
                arrayList.add(zzb);
            }
        }
        ml1 zza2 = zzfzt.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (it.hasNext()) {
                        zzetv zzetvVar = (zzetv) ((ml1) it.next()).get();
                        if (zzetvVar != null) {
                            zzetvVar.zzj(obj2);
                        }
                    } else {
                        return obj2;
                    }
                }
            }
        }, this.zzc);
        if (zzfjh.zza()) {
            zzfjd.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzetw zzetwVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzftl.zzc(zzetwVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbY)).booleanValue()) {
            return;
        }
        zzdsn zza = this.zze.zza();
        zza.zzb("action", "lat_ms");
        zza.zzb("lat_grp", "sig_lat_grp");
        zza.zzb("lat_id", String.valueOf(zzetwVar.zza()));
        zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbZ)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzg().zzd());
            synchronized (this) {
                if (this.zzg == this.zzb.size() && this.zzf != 0) {
                    this.zzg = 0;
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzf);
                    if (zzetwVar.zza() > 39 && zzetwVar.zza() < 52) {
                        zza.zzb("lat_gmssg", valueOf);
                    } else {
                        zza.zzb("lat_clsg", valueOf);
                    }
                }
            }
        }
        zza.zzh();
    }
}
