package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnn implements zzcnl {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcnn(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        this.zza.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
