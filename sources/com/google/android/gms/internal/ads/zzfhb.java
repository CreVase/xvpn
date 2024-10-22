package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfhb {
    public static final zzfhi zza(Callable callable, Object obj, zzfhj zzfhjVar) {
        zzgad zzgadVar;
        zzgadVar = zzfhjVar.zzb;
        return zzb(callable, zzgadVar, obj, zzfhjVar);
    }

    public static final zzfhi zzb(Callable callable, zzgad zzgadVar, Object obj, zzfhj zzfhjVar) {
        ml1 ml1Var;
        ml1Var = zzfhj.zza;
        return new zzfhi(zzfhjVar, obj, ml1Var, Collections.emptyList(), zzgadVar.zzb(callable));
    }

    public static final zzfhi zzc(ml1 ml1Var, Object obj, zzfhj zzfhjVar) {
        ml1 ml1Var2;
        ml1Var2 = zzfhj.zza;
        return new zzfhi(zzfhjVar, obj, ml1Var2, Collections.emptyList(), ml1Var);
    }

    public static final zzfhi zzd(final zzfgv zzfgvVar, zzgad zzgadVar, Object obj, zzfhj zzfhjVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfgv.this.zza();
                return null;
            }
        }, zzgadVar, obj, zzfhjVar);
    }
}
