package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzghi {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzghi() {
    }

    public final zzghi zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzghk zzb() {
        return new zzghk(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzghi(zzghh zzghhVar) {
    }
}
