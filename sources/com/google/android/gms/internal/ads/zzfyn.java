package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfyn extends zzfyp {
    public zzfyn(ml1 ml1Var, zzfza zzfzaVar) {
        super(ml1Var, zzfzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzfza zzfzaVar = (zzfza) obj;
        ml1 zza = zzfzaVar.zza(obj2);
        zzfsw.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfzaVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ml1) obj);
    }
}
