package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzar implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzar(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaq zzb() {
        Application application = (Application) this.zza.zzb();
        zzas zzasVar = (zzas) this.zzb.zzb();
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzaq(application, zzasVar, executor);
    }
}
