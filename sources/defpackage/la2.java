package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class la2 extends p1 implements RandomAccess {
    private static final la2 EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        la2 la2Var = new la2(new Object[0], 0);
        EMPTY_LIST = la2Var;
        la2Var.makeImmutable();
    }

    public la2() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> la2 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i >= 0 && i < this.size) {
        } else {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder o = p71.o("Index:", i, ", Size:");
        o.append(this.size);
        return o.toString();
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.size;
        Object[] objArr = this.array;
        if (i == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj = objArr[i];
        if (i < this.size - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private la2(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    @Override // defpackage.p1, defpackage.wd1, defpackage.pd1
    public la2 mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new la2(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            Object[] objArr = this.array;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] createArray = createArray(p71.f(i2, 3, 2, 1));
                System.arraycopy(this.array, 0, createArray, 0, i);
                System.arraycopy(this.array, i, createArray, i + 1, this.size - i);
                this.array = createArray;
            }
            this.array[i] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
