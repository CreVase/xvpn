package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class nh3 implements Iterator {
    Iterator<String> iter;
    final /* synthetic */ ph3 this$0;

    public nh3(ph3 ph3Var) {
        ij1 ij1Var;
        this.this$0 = ph3Var;
        ij1Var = ph3Var.list;
        this.iter = ij1Var.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public String next() {
        return this.iter.next();
    }
}
