package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzggn extends zzgcl {
    private final zzggm zza;

    private zzggn(zzggm zzggmVar) {
        this.zza = zzggmVar;
    }

    public static zzggn zzb(zzggm zzggmVar) {
        return new zzggn(zzggmVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggn) || ((zzggn) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzggn.class, this.zza});
    }

    public final String toString() {
        return hx2.q("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzggm zza() {
        return this.zza;
    }
}
