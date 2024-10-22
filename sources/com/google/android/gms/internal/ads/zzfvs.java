package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzfvs<E> extends zzfvn<E> implements List<E>, RandomAccess {
    private static final zzfxt zza = new zzfvq(zzfxc.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfvs zzi(Object[] objArr, int i) {
        if (i == 0) {
            return zzfxc.zza;
        }
        return new zzfxc(objArr, i);
    }

    public static zzfvs zzj(Collection collection) {
        if (collection instanceof zzfvn) {
            zzfvs zzd2 = ((zzfvn) collection).zzd();
            if (zzd2.zzf()) {
                Object[] array = zzd2.toArray();
                return zzi(array, array.length);
            }
            return zzd2;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfxa.zzb(array2, length);
        return zzi(array2, length);
    }

    public static zzfvs zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfxc.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfxa.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzfvs zzl() {
        return zzfxc.zza;
    }

    public static zzfvs zzm(Object obj) {
        Object[] objArr = {obj};
        zzfxa.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzfvs zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfxa.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzfvs zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfxa.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzfvs zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfxa.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzfvs zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfxa.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfsr.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfsr.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    @Deprecated
    public final zzfvs zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    /* renamed from: zze */
    public final zzfxs iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfvs subList(int i, int i2) {
        zzfsw.zzh(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfxc.zza;
        }
        return new zzfvr(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzfxt listIterator(int i) {
        zzfsw.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfvq(this, i);
    }
}
