package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzguy extends zzgsb implements RandomAccess, zzguh, zzgvq {
    private static final zzguy zza = new zzguy(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzguy() {
        this(new long[10], 0, true);
    }

    public static zzguy zzf() {
        return zza;
    }

    private final String zzh(int i) {
        return hx2.n("Index:", i, ", Size:", this.zzc);
    }

    private final void zzi(int i) {
        if (i >= 0 && i < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbM();
        if (i >= 0 && i <= (i2 = this.zzc)) {
            int i3 = i + 1;
            long[] jArr = this.zzb;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[p71.f(i2, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
                this.zzb = jArr2;
            }
            this.zzb[i] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        byte[] bArr = zzguj.zzd;
        collection.getClass();
        if (!(collection instanceof zzguy)) {
            return super.addAll(collection);
        }
        zzguy zzguyVar = (zzguy) collection;
        int i = zzguyVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzb;
            if (i3 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzguyVar.zzb, 0, this.zzb, this.zzc, zzguyVar.zzc);
            this.zzc = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzguy)) {
            return super.equals(obj);
        }
        zzguy zzguyVar = (zzguy) obj;
        if (this.zzc != zzguyVar.zzc) {
            return false;
        }
        long[] jArr = zzguyVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long j = this.zzb[i2];
            byte[] bArr = zzguj.zzd;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbM();
        if (i2 >= i) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbM();
        zzi(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzguh zzd(int i) {
        if (i >= this.zzc) {
            return new zzguy(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzg(long j) {
        zzbM();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[p71.f(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = j;
    }

    private zzguy(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
