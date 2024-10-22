package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzfto implements zzftm {
    private static final zzftm zza = new zzftm() { // from class: com.google.android.gms.internal.ads.zzftn
        @Override // com.google.android.gms.internal.ads.zzftm
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzftm zzb;
    private Object zzc;

    public zzfto(zzftm zzftmVar) {
        this.zzb = zzftmVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = hx2.q("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return hx2.q("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Object zza() {
        zzftm zzftmVar = this.zzb;
        zzftm zzftmVar2 = zza;
        if (zzftmVar != zzftmVar2) {
            synchronized (this) {
                if (this.zzb != zzftmVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzftmVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
