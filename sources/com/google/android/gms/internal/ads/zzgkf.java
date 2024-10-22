package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgkf extends zzglg {
    private final int zza;
    private final int zzb;
    private final zzgkd zzc;

    public /* synthetic */ zzgkf(int i, int i2, zzgkd zzgkdVar, zzgke zzgkeVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgkdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkf)) {
            return false;
        }
        zzgkf zzgkfVar = (zzgkf) obj;
        if (zzgkfVar.zza != this.zza || zzgkfVar.zzc() != zzc() || zzgkfVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgkf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        StringBuilder u = hx2.u("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        u.append(this.zzb);
        u.append("-byte tags, and ");
        return hx2.r(u, this.zza, "-byte key)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgkd zzgkdVar = this.zzc;
        if (zzgkdVar == zzgkd.zzd) {
            return this.zzb;
        }
        if (zzgkdVar == zzgkd.zza || zzgkdVar == zzgkd.zzb || zzgkdVar == zzgkd.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgkd zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc != zzgkd.zzd;
    }
}
