package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.2h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00672h<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC00722m A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2h != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C00672h(AbstractC00722m abstractC00722m, int i) {
        this.A04 = abstractC00722m;
        this.A03 = i;
        this.A01 = abstractC00722m.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2h != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2h != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t = (T) this.A04.A0B(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2h != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            int i = this.A00 - 1;
            this.A00 = i;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(i);
            return;
        }
        throw new IllegalStateException();
    }
}
