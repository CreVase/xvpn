package com.google.android.gms.internal.ads;

import android.os.Binder;
import defpackage.ml1;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdwq {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzdxx zzc;
    private final zzhaw zzd;

    public zzdwq(zzgad zzgadVar, zzgad zzgadVar2, zzdxx zzdxxVar, zzhaw zzhawVar) {
        this.zza = zzgadVar;
        this.zzb = zzgadVar2;
        this.zzc = zzdxxVar;
        this.zzd = zzhawVar;
    }

    public final /* synthetic */ ml1 zza(zzbvg zzbvgVar, int i, zzdyo zzdyoVar) throws Exception {
        return ((zzeav) this.zzd.zzb()).zzc(zzbvgVar, i);
    }

    public final ml1 zzb(final zzbvg zzbvgVar) {
        ml1 zzf;
        String str = zzbvgVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzfzt.zzg(new zzdyo(1));
        } else {
            zzf = zzfzt.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdwq.this.zzc(zzbvgVar);
                }
            }), ExecutionException.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdwo
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzfzt.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfzt.zzf(zzf, zzdyo.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdwp
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdwq.this.zza(zzbvgVar, callingUid, (zzdyo) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbvg zzbvgVar) throws Exception {
        zzcbl zzcblVar;
        final zzdxx zzdxxVar = this.zzc;
        synchronized (zzdxxVar.zzb) {
            if (zzdxxVar.zzc) {
                zzcblVar = zzdxxVar.zza;
            } else {
                zzdxxVar.zzc = true;
                zzdxxVar.zze = zzbvgVar;
                zzdxxVar.zzf.checkAvailabilityAndConnect();
                zzdxxVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdxx.this.zza();
                    }
                }, zzcbg.zzf);
                zzcblVar = zzdxxVar.zza;
            }
        }
        return (InputStream) zzcblVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
    }
}
