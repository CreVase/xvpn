package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgwx implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgwy zzb;

    public zzgwx(zzgwy zzgwyVar) {
        zzgur zzgurVar;
        this.zzb = zzgwyVar;
        zzgurVar = zzgwyVar.zza;
        this.zza = zzgurVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
