package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class hj1 extends q1 implements jj1, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2435b;

    static {
        new hj1(10).f3948a = false;
    }

    public hj1(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.f2435b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f2435b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.jj1
    public final void d(vs vsVar) {
        b();
        this.f2435b.add(vsVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f2435b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        boolean z = true;
        if (obj instanceof vs) {
            vs vsVar = (vs) obj;
            str = vsVar.i();
            xs xsVar = (xs) vsVar;
            int j = xsVar.j();
            if (ui3.f4677a.a0(xsVar.d, j, xsVar.size() + j) != 0) {
                z = false;
            }
            if (z) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, yd1.f5317a);
            if (ui3.f4677a.a0(bArr, 0, bArr.length) != 0) {
                z = false;
            }
            if (z) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.jj1
    public final Object getRaw(int i) {
        return this.f2435b.get(i);
    }

    @Override // defpackage.jj1
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f2435b);
    }

    @Override // defpackage.jj1
    public final jj1 getUnmodifiableView() {
        if (this.f3948a) {
            return new qh3(this);
        }
        return this;
    }

    @Override // defpackage.xd1
    public final xd1 mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f2435b);
            return new hj1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object remove = this.f2435b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof vs) {
            return ((vs) remove).i();
        }
        return new String((byte[]) remove, yd1.f5317a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.f2435b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof vs) {
            return ((vs) obj2).i();
        }
        return new String((byte[]) obj2, yd1.f5317a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2435b.size();
    }

    public hj1(ArrayList arrayList) {
        this.f2435b = arrayList;
    }

    @Override // defpackage.q1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof jj1) {
            collection = ((jj1) collection).getUnderlyingElements();
        }
        boolean addAll = this.f2435b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
