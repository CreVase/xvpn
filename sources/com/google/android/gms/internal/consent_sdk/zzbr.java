package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzbr implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzbr(zzdr zzdrVar, zzdr zzdrVar2) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final /* synthetic */ Object zzb() {
        zzdr zzdrVar = this.zza;
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzbq(zzdrVar, executor);
    }
}
