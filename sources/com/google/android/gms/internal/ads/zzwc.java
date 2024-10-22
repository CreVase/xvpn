package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzwc {
    public final long zza;
    public final long zzb;

    public zzwc(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwc)) {
            return false;
        }
        zzwc zzwcVar = (zzwc) obj;
        if (this.zza == zzwcVar.zza && this.zzb == zzwcVar.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
