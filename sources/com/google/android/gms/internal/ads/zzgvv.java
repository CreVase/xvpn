package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzgvv extends zzgsj {
    final zzgvz zza;
    zzgsl zzb = zzb();
    final /* synthetic */ zzgwb zzc;

    public zzgvv(zzgwb zzgwbVar) {
        this.zzc = zzgwbVar;
        this.zza = new zzgvz(zzgwbVar, null);
    }

    private final zzgsl zzb() {
        zzgvz zzgvzVar = this.zza;
        if (zzgvzVar.hasNext()) {
            return zzgvzVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsl
    public final byte zza() {
        zzgsl zzgslVar = this.zzb;
        if (zzgslVar != null) {
            byte zza = zzgslVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
