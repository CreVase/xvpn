package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcsz implements zzcta {
    private final Map zza;

    public zzcsz(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcta
    public final zzeeu zza(int i, String str) {
        return (zzeeu) this.zza.get(str);
    }
}
