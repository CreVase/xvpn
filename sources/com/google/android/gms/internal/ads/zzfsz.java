package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
final class zzfsz implements Serializable, zzfsx {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfsz) {
            return this.zza.equals(((zzfsz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfsx) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
