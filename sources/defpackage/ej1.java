package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ej1 extends AbstractList implements RandomAccess {
    private final gj1 list;

    public ej1(gj1 gj1Var) {
        this.list = gj1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, byte[] bArr) {
        this.list.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] get(int i) {
        return this.list.getByteArray(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] remove(int i) {
        byte[] asByteArray;
        String remove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        asByteArray = gj1.asByteArray(remove);
        return asByteArray;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] set(int i, byte[] bArr) {
        Object andReturn;
        byte[] asByteArray;
        andReturn = this.list.setAndReturn(i, bArr);
        ((AbstractList) this).modCount++;
        asByteArray = gj1.asByteArray(andReturn);
        return asByteArray;
    }
}
