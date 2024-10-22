package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzmd implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzmb zzb;

    public zzmd(zzmb zzmbVar) {
        zzjp zzjpVar;
        this.zzb = zzmbVar;
        zzjpVar = zzmbVar.zza;
        this.zza = zzjpVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
