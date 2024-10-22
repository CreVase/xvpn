package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class v0 extends qr2 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f4766b;
    public final /* synthetic */ p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(p0 p0Var, Map map) {
        super(0);
        this.c = p0Var;
        map.getClass();
        this.f4766b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        return this.f4766b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.f4766b.isEmpty();
    }

    @Override // defpackage.qr2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        s0 s0Var = (s0) iterator();
        while (s0Var.hasNext()) {
            s0Var.next();
            s0Var.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4766b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f4766b.size();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f4766b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4766b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new s0(this, this.f4766b.entrySet().iterator());
    }

    @Override // defpackage.qr2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f4766b.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.c.e -= i;
        } else {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }
}
