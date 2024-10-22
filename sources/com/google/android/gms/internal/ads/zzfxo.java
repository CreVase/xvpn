package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class zzfxo {
    public static int zza(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfsx zzfsxVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfxl) {
                zzfxl zzfxlVar = (zzfxl) sortedSet;
                return new zzfxm((SortedSet) zzfxlVar.zza, zzfta.zza(zzfxlVar.zzb, zzfsxVar));
            }
            sortedSet.getClass();
            return new zzfxm(sortedSet, zzfsxVar);
        }
        if (set instanceof zzfxl) {
            zzfxl zzfxlVar2 = (zzfxl) set;
            return new zzfxl(zzfxlVar2.zza, zzfta.zza(zzfxlVar2.zzb, zzfsxVar));
        }
        set.getClass();
        return new zzfxl(set, zzfsxVar);
    }

    public static boolean zzc(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfwy) {
            collection = ((zzfwy) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return zze(set, collection.iterator());
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
