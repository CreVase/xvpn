package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ho1 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2459b;
    public boolean c;
    public long d;

    public ho1(long j, long j2, long j3) {
        this.f2458a = j3;
        this.f2459b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        long j = this.d;
        if (j == this.f2459b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.f2458a + j;
        }
        return Long.valueOf(j);
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
