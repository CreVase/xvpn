package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzfvy {
    public static boolean zza(Iterable iterable, zzfsx zzfsxVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfsxVar.getClass();
            return zzc((List) iterable, zzfsxVar);
        }
        Iterator it = iterable.iterator();
        zzfsxVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfsxVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzfsx zzfsxVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfsxVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzc(List list, zzfsx zzfsxVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfsxVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfsxVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfsxVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i == i2) {
            return false;
        }
        return true;
    }
}
