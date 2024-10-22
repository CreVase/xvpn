package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnp implements zzcnl {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcnp(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
