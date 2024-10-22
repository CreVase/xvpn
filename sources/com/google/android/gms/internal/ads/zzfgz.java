package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfgz {
    final /* synthetic */ zzfhj zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfgz(zzfhj zzfhjVar, Object obj, List list, zzfgy zzfgyVar) {
        this.zza = zzfhjVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfhi zza(Callable callable) {
        zzgad zzgadVar;
        zzfzs zzb = zzfzt.zzb(this.zzc);
        ml1 zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcbg.zzf);
        zzgadVar = this.zza.zzb;
        ml1 zza2 = zzb.zza(callable, zzgadVar);
        return new zzfhi(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
