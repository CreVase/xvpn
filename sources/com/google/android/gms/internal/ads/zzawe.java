package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawe {
    final long zza;
    final String zzb;
    final int zzc;

    public zzawe(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzawe)) {
            zzawe zzaweVar = (zzawe) obj;
            if (zzaweVar.zza == this.zza && zzaweVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
