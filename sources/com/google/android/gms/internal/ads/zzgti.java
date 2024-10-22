package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgti extends zzgsb implements RandomAccess, zzgvq {
    private static final zzgti zza = new zzgti(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzgti() {
        this(new double[10], 0, true);
    }

    private final String zzf(int i) {
        return hx2.n("Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i >= 0 && i < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        if (i >= 0 && i <= (i2 = this.zzc)) {
            int i3 = i + 1;
            double[] dArr = this.zzb;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                double[] dArr2 = new double[p71.f(i2, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
                this.zzb = dArr2;
            }
            this.zzb[i] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        byte[] bArr = zzguj.zzd;
        collection.getClass();
        if (!(collection instanceof zzgti)) {
            return super.addAll(collection);
        }
        zzgti zzgtiVar = (zzgti) collection;
        int i = zzgtiVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzb;
            if (i3 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzgtiVar.zzb, 0, this.zzb, this.zzc, zzgtiVar.zzc);
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
        if (!(obj instanceof zzgti)) {
            return super.equals(obj);
        }
        zzgti zzgtiVar = (zzgti) obj;
        if (this.zzc != zzgtiVar.zzc) {
            return false;
        }
        double[] dArr = zzgtiVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i2]);
            byte[] bArr = zzguj.zzd;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbM();
        if (i2 >= i) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final /* bridge */ /* synthetic */ zzgui zzd(int i) {
        if (i >= this.zzc) {
            return new zzgti(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d) {
        zzbM();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[p71.f(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr3[i2] = d;
    }

    private zzgti(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
