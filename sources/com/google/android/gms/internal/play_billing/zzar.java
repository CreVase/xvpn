package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzar extends zzat {
    final /* synthetic */ zzba zza;
    private int zzb = 0;
    private final int zzc;

    public zzar(zzba zzbaVar) {
        this.zza = zzbaVar;
        this.zzc = zzbaVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
