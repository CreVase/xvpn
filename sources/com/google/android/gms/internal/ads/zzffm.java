package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzffm implements zzffk {
    private final String zza;

    public zzffm(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzffm)) {
            return false;
        }
        return this.zza.equals(((zzffm) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
