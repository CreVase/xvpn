package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgdv extends zzgcl {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgdt zzd;

    public /* synthetic */ zzgdv(int i, int i2, int i3, zzgdt zzgdtVar, zzgdu zzgduVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgdtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdv)) {
            return false;
        }
        zzgdv zzgdvVar = (zzgdv) obj;
        if (zzgdvVar.zza != this.zza || zzgdvVar.zzb != this.zzb || zzgdvVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        StringBuilder u = hx2.u("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        u.append(this.zzb);
        u.append("-byte IV, 16-byte tag, and ");
        return hx2.r(u, this.zza, "-byte key)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgdt zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zzd != zzgdt.zzc;
    }
}
