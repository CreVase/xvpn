package defpackage;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class lh3 implements ListIterator {
    ListIterator<String> iter;
    final /* synthetic */ ph3 this$0;
    final /* synthetic */ int val$index;

    public lh3(ph3 ph3Var, int i) {
        ij1 ij1Var;
        this.this$0 = ph3Var;
        this.val$index = i;
        ij1Var = ph3Var.list;
        this.iter = ij1Var.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.iter.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iter.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iter.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        return this.iter.next();
    }

    @Override // java.util.ListIterator
    public String previous() {
        return this.iter.previous();
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException();
    }
}
