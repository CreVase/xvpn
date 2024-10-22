package defpackage;

/* loaded from: classes2.dex */
public final class pi2 extends ob1 {
    public static final Object[] i;
    public static final pi2 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new pi2(objArr, 0, objArr, 0, 0);
    }

    public pi2(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.ab1
    public final int c(Object[] objArr, int i2) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int P = cp3.P(obj);
                while (true) {
                    int i2 = P & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    P = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ab1
    public final Object[] e() {
        return this.d;
    }

    @Override // defpackage.ab1
    public final int f() {
        return this.h;
    }

    @Override // defpackage.ab1
    public final int g() {
        return 0;
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ob1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        return b().listIterator(0);
    }

    @Override // defpackage.ob1
    public final hb1 m() {
        return hb1.j(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
