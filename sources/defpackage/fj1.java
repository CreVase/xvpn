package defpackage;

import com.google.protobuf.g;
import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class fj1 extends AbstractList implements RandomAccess {
    private final gj1 list;

    public fj1(gj1 gj1Var) {
        this.list = gj1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, g gVar) {
        this.list.add(i, gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public g get(int i) {
        return this.list.getByteString(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public g remove(int i) {
        g asByteString;
        String remove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        asByteString = gj1.asByteString(remove);
        return asByteString;
    }

    @Override // java.util.AbstractList, java.util.List
    public g set(int i, g gVar) {
        Object andReturn;
        g asByteString;
        andReturn = this.list.setAndReturn(i, gVar);
        ((AbstractList) this).modCount++;
        asByteString = gj1.asByteString(andReturn);
        return asByteString;
    }
}
