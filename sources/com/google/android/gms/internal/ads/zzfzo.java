package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class zzfzo extends zzfzm implements ml1 {
    @Override // defpackage.ml1
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfzm
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract ml1 zzc();
}
