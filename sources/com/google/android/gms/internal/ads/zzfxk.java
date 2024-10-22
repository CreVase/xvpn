package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfxk extends zzfxb implements Serializable {
    final zzfxb zza;

    public zzfxk(zzfxb zzfxbVar) {
        this.zza = zzfxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxk) {
            return this.zza.equals(((zzfxk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final zzfxb zza() {
        return this.zza;
    }
}
