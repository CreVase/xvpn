package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgem extends zzgcl {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgek zzd;

    public /* synthetic */ zzgem(int i, int i2, int i3, zzgek zzgekVar, zzgel zzgelVar) {
        this.zza = i;
        this.zzd = zzgekVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgem)) {
            return false;
        }
        zzgem zzgemVar = (zzgem) obj;
        if (zzgemVar.zza != this.zza || zzgemVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgem.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return hx2.r(hx2.u("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgek zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgek.zzc;
    }
}
