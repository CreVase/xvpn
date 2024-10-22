package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzacn {
    public static final zzacn zza = new zzacn(0, 0);
    public final long zzb;
    public final long zzc;

    public zzacn(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacn.class == obj.getClass()) {
            zzacn zzacnVar = (zzacn) obj;
            if (this.zzb == zzacnVar.zzb && this.zzc == zzacnVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
