package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzlv {
    public static final zzlv zza;
    public static final zzlv zzb;
    public static final zzlv zzc;
    public static final zzlv zzd;
    public static final zzlv zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlv zzlvVar = new zzlv(0L, 0L);
        zza = zzlvVar;
        zzb = new zzlv(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzlv(Long.MAX_VALUE, 0L);
        zzd = new zzlv(0L, Long.MAX_VALUE);
        zze = zzlvVar;
    }

    public zzlv(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        zzdx.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlv.class == obj.getClass()) {
            zzlv zzlvVar = (zzlv) obj;
            if (this.zzf == zzlvVar.zzf && this.zzg == zzlvVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
