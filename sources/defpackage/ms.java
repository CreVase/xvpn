package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ms implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        js jsVar = (js) this;
        int i = jsVar.f2818a;
        if (i < jsVar.f2819b) {
            jsVar.f2818a = i + 1;
            return Byte.valueOf(jsVar.c.g(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
