package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class li2 extends ob1 {
    public final transient kb1 d;
    public final transient Object[] e;
    public final transient int f = 0;
    public final transient int g;

    public li2(kb1 kb1Var, Object[] objArr, int i) {
        this.d = kb1Var;
        this.e = objArr;
        this.g = i;
    }

    @Override // defpackage.ab1
    public final int c(Object[] objArr, int i) {
        return b().c(objArr, i);
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.d.get(key))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        return b().listIterator(0);
    }

    @Override // defpackage.ob1
    public final hb1 m() {
        return new ki2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
