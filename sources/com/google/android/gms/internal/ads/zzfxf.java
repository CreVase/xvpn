package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzfxf extends zzfvx {
    private final transient zzfvv zza;
    private final transient zzfvs zzb;

    public zzfxf(zzfvv zzfvvVar, zzfvs zzfvsVar) {
        this.zza = zzfvvVar;
        this.zzb = zzfvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, com.google.android.gms.internal.ads.zzfvn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, com.google.android.gms.internal.ads.zzfvn
    public final zzfvs zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, com.google.android.gms.internal.ads.zzfvn
    /* renamed from: zze */
    public final zzfxs iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final boolean zzf() {
        throw null;
    }
}
