package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfif {
    public final String zza;
    public final String zzb;

    public zzfif(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfif)) {
            return false;
        }
        zzfif zzfifVar = (zzfif) obj;
        if (this.zza.equals(zzfifVar.zza) && this.zzb.equals(zzfifVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
