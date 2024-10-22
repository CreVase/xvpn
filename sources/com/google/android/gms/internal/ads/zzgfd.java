package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgfd extends zzgcl {
    private final int zza;
    private final zzgfb zzb;

    public /* synthetic */ zzgfd(int i, zzgfb zzgfbVar, zzgfc zzgfcVar) {
        this.zza = i;
        this.zzb = zzgfbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfd)) {
            return false;
        }
        zzgfd zzgfdVar = (zzgfd) obj;
        if (zzgfdVar.zza != this.zza || zzgfdVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfd.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return hx2.r(hx2.u("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgfb zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgfb.zzc;
    }
}
