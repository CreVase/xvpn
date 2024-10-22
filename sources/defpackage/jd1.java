package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class jd1 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2753b;
    public boolean c;
    public int d;

    public jd1(int i, int i2, int i3) {
        this.f2752a = i3;
        this.f2753b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(c());
    }

    public final int c() {
        int i = this.d;
        if (i == this.f2753b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.f2752a + i;
        }
        return i;
    }

    public final void d() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        d();
        throw null;
    }
}
