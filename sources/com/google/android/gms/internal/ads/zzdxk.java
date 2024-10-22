package com.google.android.gms.internal.ads;

import android.os.Binder;
import defpackage.ml1;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdxk {
    private final ScheduledExecutorService zza;
    private final zzgad zzb;
    private final zzgad zzc;
    private final zzdyb zzd;
    private final zzhaw zze;

    public zzdxk(ScheduledExecutorService scheduledExecutorService, zzgad zzgadVar, zzgad zzgadVar2, zzdyb zzdybVar, zzhaw zzhawVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgadVar;
        this.zzc = zzgadVar2;
        this.zzd = zzdybVar;
        this.zze = zzhawVar;
    }

    public final /* synthetic */ ml1 zza(zzbvg zzbvgVar, int i, Throwable th) throws Exception {
        return ((zzeav) this.zze.zzb()).zzd(zzbvgVar, i);
    }

    public final ml1 zzb(final zzbvg zzbvgVar) {
        ml1 zzb;
        String str = zzbvgVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzb = zzfzt.zzg(new zzdyo(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhx)).booleanValue()) {
                zzb = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdxk.this.zzc(zzbvgVar);
                    }
                });
            } else {
                zzb = this.zzd.zzb(zzbvgVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfzt.zzf((zzfzk) zzfzt.zzo(zzfzk.zzu(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdxk.this.zza(zzbvgVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbvg zzbvgVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbvgVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
    }
}
