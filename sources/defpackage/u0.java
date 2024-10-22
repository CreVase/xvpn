package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class u0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f4601a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4602b = null;
    public Collection c = null;
    public Iterator d = ye1.f5322a;
    public final /* synthetic */ p0 e;

    public u0(p0 p0Var) {
        this.e = p0Var;
        this.f4601a = p0Var.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f4601a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4601a.next();
            this.f4602b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f4602b;
        Object next = this.d.next();
        switch (((q0) this).f) {
            case 0:
                return next;
            default:
                return new bb1(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f4601a.remove();
        }
        p0 p0Var = this.e;
        p0Var.e--;
    }
}
