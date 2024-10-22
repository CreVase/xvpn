package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzh implements zzdo {
    private final zzdr zza;

    public zzh(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzg(executor);
    }
}
