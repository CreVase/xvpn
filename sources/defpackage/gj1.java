package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.r0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class gj1 extends p1 implements ij1, RandomAccess {
    public static final ij1 EMPTY;
    private static final gj1 EMPTY_LIST;
    private final List<Object> list;

    static {
        gj1 gj1Var = new gj1();
        EMPTY_LIST = gj1Var;
        gj1Var.makeImmutable();
        EMPTY = gj1Var;
    }

    public gj1() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return r0.toByteArray((String) obj);
        }
        return ((g) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g asByteString(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof String) {
            return g.copyFromUtf8((String) obj);
        }
        return g.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            return ((g) obj).toStringUtf8();
        }
        return r0.toStringUtf8((byte[]) obj);
    }

    public static gj1 emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i, g gVar) {
        ensureIsMutable();
        return this.list.set(i, gVar);
    }

    @Override // defpackage.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.ij1
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.ij1
    public boolean addAllByteString(Collection<? extends g> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.ij1
    public List<byte[]> asByteArrayList() {
        return new ej1(this);
    }

    @Override // defpackage.ij1, defpackage.cb2
    public List<g> asByteStringList() {
        return new fj1(this);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij1
    public byte[] getByteArray(int i) {
        Object obj = this.list.get(i);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i, asByteArray);
        }
        return asByteArray;
    }

    @Override // defpackage.ij1
    public g getByteString(int i) {
        Object obj = this.list.get(i);
        g asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    @Override // defpackage.ij1
    public Object getRaw(int i) {
        return this.list.get(i);
    }

    @Override // defpackage.ij1
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // defpackage.ij1
    public ij1 getUnmodifiableView() {
        if (isModifiable()) {
            return new ph3(this);
        }
        return this;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.p1, defpackage.wd1
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // defpackage.ij1
    public void mergeFrom(ij1 ij1Var) {
        ensureIsMutable();
        for (Object obj : ij1Var.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // defpackage.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // defpackage.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public gj1(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof ij1) {
            collection = ((ij1) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String stringUtf8 = gVar.toStringUtf8();
            if (gVar.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = r0.toStringUtf8(bArr);
        if (r0.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // defpackage.p1, defpackage.wd1, defpackage.pd1
    public gj1 mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.list);
            return new gj1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        ensureIsMutable();
        return asString(this.list.set(i, str));
    }

    public gj1(ij1 ij1Var) {
        this.list = new ArrayList(ij1Var.size());
        addAll(ij1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i, bArr);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ensureIsMutable();
        this.list.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    @Override // defpackage.ij1
    public void set(int i, g gVar) {
        setAndReturn(i, gVar);
    }

    public gj1(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, g gVar) {
        ensureIsMutable();
        this.list.add(i, gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ij1
    public void set(int i, byte[] bArr) {
        setAndReturn(i, bArr);
    }

    private gj1(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ij1
    public void add(g gVar) {
        ensureIsMutable();
        this.list.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ij1
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
