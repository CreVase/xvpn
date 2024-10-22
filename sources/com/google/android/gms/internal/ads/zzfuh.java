package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class zzfuh implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfui zzc;

    public zzfuh(zzfui zzfuiVar, Iterator it) {
        this.zzc = zzfuiVar;
        this.zzb = zzfuiVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzful zzfulVar = this.zzc.zze;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public zzfuh(zzfui zzfuiVar) {
        Iterator it;
        this.zzc = zzfuiVar;
        Collection collection = zzfuiVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
