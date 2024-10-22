package defpackage;

/* loaded from: classes2.dex */
public final class mi2 extends ob1 {
    public final transient kb1 d;
    public final transient hb1 e;

    public mi2(kb1 kb1Var, ni2 ni2Var) {
        this.d = kb1Var;
        this.e = ni2Var;
    }

    @Override // defpackage.ob1, defpackage.ab1
    public final hb1 b() {
        return this.e;
    }

    @Override // defpackage.ab1
    public final int c(Object[] objArr, int i) {
        return this.e.c(objArr, i);
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((oi2) this.d).f;
    }
}
