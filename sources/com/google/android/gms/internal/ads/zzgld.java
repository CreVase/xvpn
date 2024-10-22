package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgld extends zzglg {
    private final int zza;
    private final int zzb;
    private final zzglb zzc;
    private final zzgla zzd;

    public /* synthetic */ zzgld(int i, int i2, zzglb zzglbVar, zzgla zzglaVar, zzglc zzglcVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzglbVar;
        this.zzd = zzglaVar;
    }

    public static zzgkz zzd() {
        return new zzgkz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgld)) {
            return false;
        }
        zzgld zzgldVar = (zzgld) obj;
        if (zzgldVar.zza != this.zza || zzgldVar.zzc() != zzc() || zzgldVar.zzc != this.zzc || zzgldVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgld.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        StringBuilder q = p71.q("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        q.append(this.zzb);
        q.append("-byte tags, and ");
        return hx2.r(q, this.zza, "-byte key)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzglb zzglbVar = this.zzc;
        if (zzglbVar == zzglb.zzd) {
            return this.zzb;
        }
        if (zzglbVar == zzglb.zza || zzglbVar == zzglb.zzb || zzglbVar == zzglb.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgla zze() {
        return this.zzd;
    }

    public final zzglb zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzc != zzglb.zzd;
    }
}
