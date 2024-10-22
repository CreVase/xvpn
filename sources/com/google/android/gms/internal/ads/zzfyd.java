package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfyd extends zzfyf {
    public zzfyd(ml1 ml1Var, Class cls, zzfza zzfzaVar) {
        super(ml1Var, cls, zzfzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzfza zzfzaVar = (zzfza) obj;
        ml1 zza = zzfzaVar.zza(th);
        zzfsw.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfzaVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ml1) obj);
    }
}
