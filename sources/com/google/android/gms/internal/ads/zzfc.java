package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfc {
    public static final zzfc zza = new zzfc(-1, -1);
    public static final zzfc zzb = new zzfc(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfc(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzdx.zzd(z);
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfc) {
            zzfc zzfcVar = (zzfc) obj;
            if (this.zzc == zzfcVar.zzc && this.zzd == zzfcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        return ((i >>> 16) | (i << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
