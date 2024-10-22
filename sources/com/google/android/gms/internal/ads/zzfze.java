package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzfze extends zzfzf {
    final /* synthetic */ zzfzg zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfze(zzfzg zzfzgVar, Callable callable, Executor executor) {
        super(zzfzgVar, executor);
        this.zza = zzfzgVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
