package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class bc1 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f443a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f444b;
    public int c;

    public bc1(Iterator it) {
        this.f444b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f443a;
        Iterator it = this.f444b;
        switch (i) {
            case 0:
                return it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f443a;
        Iterator it = this.f444b;
        switch (i) {
            case 0:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new zb1(i2, it.next());
                }
                tf3.y0();
                throw null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f443a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bc1(ho0 ho0Var) {
        this.f444b = ho0Var.f2456a.iterator();
        this.c = ho0Var.f2457b;
    }
}
