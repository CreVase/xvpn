package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzav implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    public zzav(zzas zzasVar) {
        this.zzb = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.zza;
        str = this.zzb.zza;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        String str;
        int i = this.zza;
        str = this.zzb.zza;
        if (i < str.length()) {
            int i2 = this.zza;
            this.zza = i2 + 1;
            return new zzas(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
