package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes.dex */
public final class zzmb extends AbstractList<String> implements zzjp, RandomAccess {
    private final zzjp zza;

    public zzmb(zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final zzjp h_() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzmd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzme(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final void zza(zzhm zzhmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final List<?> zzb() {
        return this.zza.zzb();
    }
}
