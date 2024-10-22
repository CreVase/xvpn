package com.google.android.gms.internal.ads;

import android.os.Binder;
import defpackage.ml1;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzdze {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzdzz zzc;
    private final zzhaw zzd;

    public zzdze(zzgad zzgadVar, zzgad zzgadVar2, zzdzz zzdzzVar, zzhaw zzhawVar) {
        this.zza = zzgadVar;
        this.zzb = zzgadVar2;
        this.zzc = zzdzzVar;
        this.zzd = zzhawVar;
    }

    public final /* synthetic */ ml1 zza(zzbuo zzbuoVar) throws Exception {
        return this.zzc.zza(zzbuoVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkB)).longValue());
    }

    public final /* synthetic */ ml1 zzb(zzbuo zzbuoVar, int i, zzdyo zzdyoVar) throws Exception {
        return ((zzebf) this.zzd.zzb()).zzb(zzbuoVar, i);
    }

    public final ml1 zzc(final zzbuo zzbuoVar) {
        ml1 zzf;
        String str = zzbuoVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzfzt.zzg(new zzdyo(1, "Ads service proxy force local"));
        } else {
            zzf = zzfzt.zzf(zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzdzb
                @Override // com.google.android.gms.internal.ads.zzfyz
                public final ml1 zza() {
                    return zzdze.this.zza(zzbuoVar);
                }
            }, this.zza), ExecutionException.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzc
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfzt.zzg(th);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfzt.zzf(zzf, zzdyo.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdze.this.zzb(zzbuoVar, callingUid, (zzdyo) obj);
            }
        }, this.zzb);
    }
}
