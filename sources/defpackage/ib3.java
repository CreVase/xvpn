package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ib3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2564a;

    public ib3(Iterator it) {
        it.getClass();
        this.f2564a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2564a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f2564a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2564a.remove();
    }
}
