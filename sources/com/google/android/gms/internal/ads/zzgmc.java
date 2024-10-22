package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzgmc {
    public static final zzgmc zza = new zzgma().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmc)) {
            return false;
        }
        return this.zzb.equals(((zzgmc) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
