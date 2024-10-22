package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class gp2 implements Iterator, c90, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2298a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2299b;
    public Iterator c;
    public c90 d;

    public final RuntimeException a() {
        int i = this.f2298a;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f2298a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final Object c(yl3 yl3Var, c90 c90Var) {
        Object obj;
        Iterator it = yl3Var.iterator();
        boolean hasNext = it.hasNext();
        ch3 ch3Var = ch3.f636a;
        if (!hasNext) {
            obj = ch3Var;
        } else {
            this.c = it;
            this.f2298a = 2;
            this.d = c90Var;
            obj = ba0.f430a;
        }
        if (obj == ba0.f430a) {
            return obj;
        }
        return ch3Var;
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return zq0.f5530a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f2298a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                if (this.c.hasNext()) {
                    this.f2298a = 2;
                    return true;
                }
                this.c = null;
            }
            this.f2298a = 5;
            c90 c90Var = this.d;
            this.d = null;
            c90Var.resumeWith(ch3.f636a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2298a;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f2298a = 0;
                    Object obj = this.f2299b;
                    this.f2299b = null;
                    return obj;
                }
                throw a();
            }
            this.f2298a = 1;
            return this.c.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        fl.a0(obj);
        this.f2298a = 4;
    }
}
