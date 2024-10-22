package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzewj implements zzetw {
    final zzgad zza;
    final String zzb;
    final zzbzq zzc;

    public zzewj(zzbzq zzbzqVar, zzgad zzgadVar, String str) {
        this.zzc = zzbzqVar;
        this.zza = zzgadVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        final ml1 zzh = zzfzt.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfL)).booleanValue()) {
            zzh = zzfzt.zzh(null);
        }
        final ml1 zzh2 = zzfzt.zzh(null);
        return zzfzt.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewk((String) ml1.this.get(), (String) zzh2.get());
            }
        }, zzcbg.zza);
    }
}
