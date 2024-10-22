package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzq(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzn zzb() {
        return new zzn((Application) this.zza.zzb(), ((zzb) this.zzb).zzb(), (zzas) this.zzc.zzb());
    }
}
