package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgfo extends zzgcl {
    private final zzgfn zza;

    private zzgfo(zzgfn zzgfnVar) {
        this.zza = zzgfnVar;
    }

    public static zzgfo zzb(zzgfn zzgfnVar) {
        return new zzgfo(zzgfnVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfo) || ((zzgfo) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfo.class, this.zza});
    }

    public final String toString() {
        return hx2.q("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgfn zza() {
        return this.zza;
    }
}
