package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzjq extends zzhg<String> implements zzjp, RandomAccess {
    private static final zzjq zza;

    @Deprecated
    private static final zzjp zzb;
    private final List<Object> zzc;

    static {
        zzjq zzjqVar = new zzjq(false);
        zza = zzjqVar;
        zzb = zzjqVar;
    }

    public zzjq() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhm) {
            zzhm zzhmVar = (zzhm) obj;
            String zzc = zzhmVar.zzc();
            if (zzhmVar.zzd()) {
                this.zzc.set(i, zzc);
            }
            return zzc;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zziz.zzb(bArr);
        if (zziz.zzc(bArr)) {
            this.zzc.set(i, zzb2);
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final zzjp h_() {
        if (zzc()) {
            return new zzmb(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zza(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zza(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf zza(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzjq((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzjf
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    public zzjq(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzjp) {
            collection = ((zzjp) collection).zzb();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final List<?> zzb() {
        return Collections.unmodifiableList(this.zzc);
    }

    private zzjq(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzjq(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhm) {
            return ((zzhm) obj).zzc();
        }
        return zziz.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final void zza(zzhm zzhmVar) {
        zza();
        this.zzc.add(zzhmVar);
        ((AbstractList) this).modCount++;
    }
}
