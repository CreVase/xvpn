package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzdg {
    private final zzfvs zzd;
    public static final zzdg zza = new zzdg(zzfvs.zzl());
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdd
    };

    public zzdg(List list) {
        this.zzd = zzfvs.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdg.class == obj.getClass()) {
            return this.zzd.equals(((zzdg) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfvs zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            zzdf zzdfVar = (zzdf) this.zzd.get(i2);
            if (zzdfVar.zzc() && zzdfVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
