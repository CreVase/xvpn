package defpackage;

import com.google.protobuf.g;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ph3 extends AbstractList implements ij1, RandomAccess {
    private final ij1 list;

    public ph3(ij1 ij1Var) {
        this.list = ij1Var;
    }

    @Override // defpackage.ij1
    public void add(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ij1
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ij1
    public boolean addAllByteString(Collection<? extends g> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ij1
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // defpackage.ij1, defpackage.cb2
    public List<g> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // defpackage.ij1
    public byte[] getByteArray(int i) {
        return this.list.getByteArray(i);
    }

    @Override // defpackage.ij1
    public g getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // defpackage.ij1
    public Object getRaw(int i) {
        return this.list.getRaw(i);
    }

    @Override // defpackage.ij1
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // defpackage.ij1
    public ij1 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new nh3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new lh3(this, i);
    }

    @Override // defpackage.ij1
    public void mergeFrom(ij1 ij1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ij1
    public void set(int i, g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // defpackage.ij1
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.list.get(i);
    }

    @Override // defpackage.ij1
    public void set(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
