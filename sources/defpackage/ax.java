package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ax implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356b;
    public boolean c;
    public int d;

    public ax(char c, char c2, int i) {
        this.f355a = i;
        this.f356b = c2;
        boolean z = true;
        if (i <= 0 ? m20.W(c, c2) < 0 : m20.W(c, c2) > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i = this.d;
        if (i == this.f356b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.f355a + i;
        }
        return Character.valueOf((char) i);
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
