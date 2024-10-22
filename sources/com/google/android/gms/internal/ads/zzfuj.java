package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class zzfuj extends zzfuh implements ListIterator {
    final /* synthetic */ zzfuk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuj(zzfuk zzfukVar) {
        super(zzfukVar);
        this.zzd = zzfukVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzful zzfulVar = this.zzd.zzf;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuj(zzfuk zzfukVar, int i) {
        super(zzfukVar, ((List) zzfukVar.zzb).listIterator(i));
        this.zzd = zzfukVar;
    }
}
