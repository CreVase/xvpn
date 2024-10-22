package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfua implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfub zzc;

    public zzfua(zzfub zzfubVar, Iterator it) {
        this.zzc = zzfubVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzj(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzful zzfulVar = this.zzc.zza;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }
}
