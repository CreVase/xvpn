package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ma2 extends q1 implements RandomAccess {
    public static final ma2 d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3262b;
    public int c;

    static {
        ma2 ma2Var = new ma2(new Object[0], 0);
        d = ma2Var;
        ma2Var.f3948a = false;
    }

    public ma2(Object[] objArr, int i) {
        this.f3262b = objArr;
        this.c = i;
    }

    @Override // defpackage.q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.c;
        Object[] objArr = this.f3262b;
        if (i == objArr.length) {
            this.f3262b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3262b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        StringBuilder o = p71.o("Index:", i, ", Size:");
        o.append(this.c);
        throw new IndexOutOfBoundsException(o.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f3262b[i];
    }

    @Override // defpackage.xd1
    public final xd1 mutableCopyWithCapacity(int i) {
        if (i >= this.c) {
            return new ma2(Arrays.copyOf(this.f3262b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.f3262b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.f3262b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.c)) {
            Object[] objArr = this.f3262b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[p71.f(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f3262b, i, objArr2, i + 1, this.c - i);
                this.f3262b = objArr2;
            }
            this.f3262b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder o = p71.o("Index:", i, ", Size:");
        o.append(this.c);
        throw new IndexOutOfBoundsException(o.toString());
    }
}
