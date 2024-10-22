package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class lp1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3167a;

    /* renamed from: b, reason: collision with root package name */
    public int f3168b;
    public int c;
    public boolean d = false;
    public final /* synthetic */ go e;

    public lp1(go goVar, int i) {
        this.e = goVar;
        this.f3167a = i;
        this.f3168b = goVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.f3168b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object d = this.e.d(this.c, this.f3167a);
            this.c++;
            this.d = true;
            return d;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            this.f3168b--;
            this.d = false;
            this.e.j(i);
            return;
        }
        throw new IllegalStateException();
    }
}
