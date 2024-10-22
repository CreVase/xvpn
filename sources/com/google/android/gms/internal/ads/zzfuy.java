package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfuy extends AbstractSet {
    final /* synthetic */ zzfvb zza;

    public zzfuy(zzfvb zzfvbVar) {
        this.zza = zzfvbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfvb zzfvbVar = this.zza;
        Map zzj = zzfvbVar.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new zzfus(zzfvbVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzs;
        Object obj2;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.keySet().remove(obj);
        }
        zzs = this.zza.zzs(obj);
        obj2 = zzfvb.zzd;
        if (zzs == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
