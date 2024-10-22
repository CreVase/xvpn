package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzuy {
    public final int zza;
    public final boolean zzb;

    public zzuy(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzuy.class == obj.getClass()) {
            zzuy zzuyVar = (zzuy) obj;
            if (this.zza == zzuyVar.zza && this.zzb == zzuyVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
