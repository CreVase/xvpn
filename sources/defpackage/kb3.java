package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kb3 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb3 f2926b;

    public kb3(lb3 lb3Var) {
        this.f2926b = lb3Var;
        this.f2925a = lb3Var.f3098a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2925a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2926b.f3099b.invoke(this.f2925a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
