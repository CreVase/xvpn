package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfui extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfui zzc;
    final Collection zzd;
    final /* synthetic */ zzful zze;

    public zzfui(zzful zzfulVar, Object obj, Collection collection, zzfui zzfuiVar) {
        Collection collection2;
        this.zze = zzfulVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfuiVar;
        if (zzfuiVar == null) {
            collection2 = null;
        } else {
            collection2 = zzfuiVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzful zzfulVar = this.zze;
            i = zzfulVar.zzb;
            zzfulVar.zzb = i + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzful zzfulVar = this.zze;
            i = zzfulVar.zzb;
            zzfulVar.zzb = i + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzful zzfulVar = this.zze;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfuh(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzful zzfulVar = this.zze;
            i = zzfulVar.zzb;
            zzfulVar.zzb = i - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzful zzfulVar = this.zze;
            int i2 = size2 - size;
            i = zzfulVar.zzb;
            zzfulVar.zzb = i + i2;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzful zzfulVar = this.zze;
            int i2 = size2 - size;
            i = zzfulVar.zzb;
            zzfulVar.zzb = i + i2;
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfui zzfuiVar = this.zzc;
        if (zzfuiVar != null) {
            zzfuiVar.zza();
            return;
        }
        zzful zzfulVar = this.zze;
        Object obj = this.zza;
        map = zzfulVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfui zzfuiVar = this.zzc;
        if (zzfuiVar != null) {
            zzfuiVar.zzb();
            zzfui zzfuiVar2 = this.zzc;
            if (zzfuiVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzful zzfulVar = this.zze;
            Object obj = this.zza;
            map = zzfulVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfui zzfuiVar = this.zzc;
        if (zzfuiVar != null) {
            zzfuiVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzful zzfulVar = this.zze;
            Object obj = this.zza;
            map = zzfulVar.zza;
            map.remove(obj);
        }
    }
}
