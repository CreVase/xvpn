package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzguq extends zzgsb implements RandomAccess, zzgur {

    @Deprecated
    public static final zzgur zza;
    private static final zzguq zzb;
    private final List zzc;

    static {
        zzguq zzguqVar = new zzguq(false);
        zzb = zzguqVar;
        zza = zzguqVar;
    }

    public zzguq() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgsr) {
            return ((zzgsr) obj).zzx(zzguj.zzb);
        }
        return zzguj.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzgur) {
            collection = ((zzgur) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final /* bridge */ /* synthetic */ zzgui zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzguq(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final zzgur zze() {
        if (zzc()) {
            return new zzgwy(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgsr) {
            zzgsr zzgsrVar = (zzgsr) obj;
            String zzx = zzgsrVar.zzx(zzguj.zzb);
            if (zzgsrVar.zzp()) {
                this.zzc.set(i, zzx);
            }
            return zzx;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzguj.zzd(bArr);
        if (zzgxi.zzi(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final void zzi(zzgsr zzgsrVar) {
        zzbM();
        this.zzc.add(zzgsrVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzguq(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.zzc = arrayList;
    }

    private zzguq(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzguq(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
