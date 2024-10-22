package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgma {
    private HashMap zza = new HashMap();

    public final zzgmc zza() {
        if (this.zza != null) {
            zzgmc zzgmcVar = new zzgmc(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgmcVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
