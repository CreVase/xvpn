package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzhas implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhat zzb;

    public zzhas(zzhat zzhatVar) {
        this.zzb = zzhatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhat zzhatVar = this.zzb;
            int i = this.zza;
            this.zza = i + 1;
            return zzhatVar.zza.get(i);
        }
        zzhat zzhatVar2 = this.zzb;
        zzhatVar2.zza.add(zzhatVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
