package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfxm extends zzfxl implements SortedSet {
    public zzfxm(SortedSet sortedSet, zzfsx zzfsxVar) {
        super(sortedSet, zzfsxVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfsx zzfsxVar = this.zzb;
        zzfsxVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfsxVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzfxm(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            zzfsx zzfsxVar = this.zzb;
            Object last = sortedSet.last();
            if (zzfsxVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfxm(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzfxm(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
