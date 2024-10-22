package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class s0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4246a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f4247b;
    public Object c;
    public final /* synthetic */ Object d;

    public s0(b1 b1Var) {
        Iterator it;
        this.d = b1Var;
        Collection collection = b1Var.f383b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f4247b = it;
    }

    public final void a() {
        Object obj = this.d;
        ((b1) obj).c();
        if (((b1) obj).f383b == ((Collection) this.c)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4246a;
        Iterator it = this.f4247b;
        switch (i) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                a();
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4246a;
        Iterator it = this.f4247b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((t0) this.d).d(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z = false;
        int i = this.f4246a;
        Object obj = this.d;
        Iterator it = this.f4247b;
        switch (i) {
            case 0:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                cp3.n("no calls to next() since the last call to remove()", z);
                it.remove();
                ((t0) obj).d.e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                cp3.n("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((v0) obj).c.e -= collection.size();
                collection.clear();
                this.c = null;
                return;
            default:
                it.remove();
                b1 b1Var = (b1) obj;
                p0 p0Var = b1Var.e;
                p0Var.e--;
                b1Var.e();
                return;
        }
    }

    public s0(b1 b1Var, ListIterator listIterator) {
        this.d = b1Var;
        this.c = b1Var.f383b;
        this.f4247b = listIterator;
    }

    public s0(v0 v0Var, Iterator it) {
        this.d = v0Var;
        this.f4247b = it;
    }

    public s0(t0 t0Var) {
        this.d = t0Var;
        this.f4247b = t0Var.c.entrySet().iterator();
    }
}
