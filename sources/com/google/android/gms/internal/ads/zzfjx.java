package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfjx {
    private final Context zza;
    private final Executor zzb;
    private final zzcay zzc;
    private final zzfjh zzd;

    public zzfjx(Context context, Executor executor, zzcay zzcayVar, zzfjh zzfjhVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcayVar;
        this.zzd = zzfjhVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfje zzfjeVar) {
        zzfit zza = zzfis.zza(this.zza, 14);
        zza.zzh();
        zza.zzf(this.zzc.zza(str));
        if (zzfjeVar == null) {
            this.zzd.zzb(zza.zzl());
        } else {
            zzfjeVar.zza(zza);
            zzfjeVar.zzg();
        }
    }

    public final void zzc(final String str, final zzfje zzfjeVar) {
        if (zzfjh.zza() && ((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzfjx.this.zzb(str, zzfjeVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfjx.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
