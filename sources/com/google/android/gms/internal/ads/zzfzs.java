package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfzs {
    private final boolean zza;
    private final zzfvs zzb;

    public /* synthetic */ zzfzs(boolean z, zzfvs zzfvsVar, zzfzr zzfzrVar) {
        this.zza = z;
        this.zzb = zzfvsVar;
    }

    public final ml1 zza(Callable callable, Executor executor) {
        return new zzfzg(this.zzb, this.zza, executor, callable);
    }
}
