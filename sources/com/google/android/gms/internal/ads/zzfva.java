package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfva extends AbstractCollection {
    final /* synthetic */ zzfvb zza;

    public zzfva(zzfvb zzfvbVar) {
        this.zza = zzfvbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfvb zzfvbVar = this.zza;
        Map zzj = zzfvbVar.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzfuu(zzfvbVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
