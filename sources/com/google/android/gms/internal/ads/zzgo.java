package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgo implements zzgh {
    private final Context zza;
    private final zzgh zzb;

    public zzgo(Context context) {
        zzgq zzgqVar = new zzgq();
        this.zza = context.getApplicationContext();
        this.zzb = zzgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final /* bridge */ /* synthetic */ zzgi zza() {
        return new zzgp(this.zza, ((zzgq) this.zzb).zza());
    }
}
