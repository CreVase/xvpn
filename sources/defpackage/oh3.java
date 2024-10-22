package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class oh3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f3665a;

    public oh3(qh3 qh3Var) {
        this.f3665a = qh3Var.f3998a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3665a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f3665a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
