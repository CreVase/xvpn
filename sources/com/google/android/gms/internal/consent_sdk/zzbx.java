package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* loaded from: classes.dex */
public final class zzbx implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzbx(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbw zzb() {
        zzby zzbyVar = (zzby) this.zza.zzb();
        Handler handler = zzct.zza;
        zzdq.zza(handler);
        return new zzbw(zzbyVar, handler, ((zzcd) this.zzc).zzb());
    }
}
