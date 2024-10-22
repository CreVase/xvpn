package defpackage;

import com.google.protobuf.r0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class cm0 extends p1 implements pd1, RandomAccess, u72 {
    private static final cm0 EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        cm0 cm0Var = new cm0(new double[0], 0);
        EMPTY_LIST = cm0Var;
        cm0Var.makeImmutable();
    }

    public cm0() {
        this(new double[10], 0);
    }

    public static cm0 emptyList() {
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

    @Override // defpackage.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        r0.checkNotNull(collection);
        if (!(collection instanceof cm0)) {
            return super.addAll(collection);
        }
        cm0 cm0Var = (cm0) collection;
        int i = cm0Var.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.array;
            if (i3 > dArr.length) {
                this.array = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(cm0Var.array, 0, this.array, this.size, cm0Var.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // defpackage.pd1
    public void addDouble(double d) {
        ensureIsMutable();
        int i = this.size;
        double[] dArr = this.array;
        if (i == dArr.length) {
            double[] dArr2 = new double[p71.f(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm0)) {
            return super.equals(obj);
        }
        cm0 cm0Var = (cm0) obj;
        if (this.size != cm0Var.size) {
            return false;
        }
        double[] dArr = cm0Var.array;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.array[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pd1
    public double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + r0.hashLong(Double.doubleToLongBits(this.array[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            double[] dArr = this.array;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.pd1
    public double setDouble(int i, double d) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private cm0(double[] dArr, int i) {
        this.array = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // defpackage.p1, defpackage.wd1, defpackage.pd1
    public pd1 mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new cm0(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public void add(int i, Double d) {
        addDouble(i, d.doubleValue());
    }

    private void addDouble(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            double[] dArr = this.array;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[p71.f(i2, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.array, i, dArr2, i + 1, this.size - i);
                this.array = dArr2;
            }
            this.array[i] = d;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
