package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhp extends zzhr {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzhm zzc;

    public zzhp(zzhm zzhmVar) {
        this.zzc = zzhmVar;
        this.zzb = zzhmVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    public final byte zza() {
        int i = this.zza;
        if (i < this.zzb) {
            this.zza = i + 1;
            return this.zzc.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
