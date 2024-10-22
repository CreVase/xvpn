package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzftb extends zzfss {
    private final Object zza;

    public zzftb(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzftb) {
            return this.zza.equals(((zzftb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return hx2.q("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfss
    public final zzfss zza(zzfsk zzfskVar) {
        Object apply = zzfskVar.apply(this.zza);
        zzfsw.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzftb(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfss
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
