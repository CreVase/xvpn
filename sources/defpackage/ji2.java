package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ji2 extends hb1 {
    public static final ji2 e = new ji2(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public ji2(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.hb1, defpackage.ab1
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ab1
    public final Object[] e() {
        return this.c;
    }

    @Override // defpackage.ab1
    public final int f() {
        return this.d;
    }

    @Override // defpackage.ab1
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cp3.g(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
