package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class nr2 extends qr2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f3524b;
    public final /* synthetic */ Set c;

    public nr2(ob1 ob1Var, ob1 ob1Var2) {
        this.f3524b = ob1Var;
        this.c = ob1Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f3524b.contains(obj) && this.c.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.f3524b.containsAll(collection) && this.c.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.c, this.f3524b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ve1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f3524b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
