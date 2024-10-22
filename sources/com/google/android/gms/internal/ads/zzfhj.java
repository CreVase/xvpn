package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class zzfhj {
    private static final ml1 zza = zzfzt.zzh(null);
    private final zzgad zzb;
    private final ScheduledExecutorService zzc;
    private final zzfhk zzd;

    public zzfhj(zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, zzfhk zzfhkVar) {
        this.zzb = zzgadVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfhkVar;
    }

    public final zzfgz zza(Object obj, ml1... ml1VarArr) {
        return new zzfgz(this, obj, Arrays.asList(ml1VarArr), null);
    }

    public final zzfhi zzb(Object obj, ml1 ml1Var) {
        return new zzfhi(this, obj, ml1Var, Collections.singletonList(ml1Var), ml1Var);
    }

    public abstract String zzf(Object obj);
}
