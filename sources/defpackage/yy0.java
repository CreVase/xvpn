package defpackage;

import com.google.protobuf.r0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class yy0 extends p1 implements td1, RandomAccess, u72 {
    private static final yy0 EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        yy0 yy0Var = new yy0(new float[0], 0);
        EMPTY_LIST = yy0Var;
        yy0Var.makeImmutable();
    }

    public yy0() {
        this(new float[10], 0);
    }

    public static yy0 emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        r0.checkNotNull(collection);
        if (!(collection instanceof yy0)) {
            return super.addAll(collection);
        }
        yy0 yy0Var = (yy0) collection;
        int i = yy0Var.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.array;
            if (i3 > fArr.length) {
                this.array = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(yy0Var.array, 0, this.array, this.size, yy0Var.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // defpackage.td1
    public void addFloat(float f) {
        ensureIsMutable();
        int i = this.size;
        float[] fArr = this.array;
        if (i == fArr.length) {
            float[] fArr2 = new float[p71.f(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof yy0)) {
            return super.equals(obj);
        }
        yy0 yy0Var = (yy0) obj;
        if (this.size != yy0Var.size) {
            return false;
        }
        float[] fArr = yy0Var.array;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.array[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.td1
    public float getFloat(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.array[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            float[] fArr = this.array;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.td1
    public float setFloat(int i, float f) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private yy0(float[] fArr, int i) {
        this.array = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // defpackage.p1, defpackage.wd1, defpackage.pd1
    public td1 mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new yy0(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Float remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f = fArr[i];
        if (i < this.size - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    @Override // defpackage.p1, java.util.AbstractList, java.util.List
    public void add(int i, Float f) {
        addFloat(i, f.floatValue());
    }

    private void addFloat(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            float[] fArr = this.array;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[p71.f(i2, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.array, i, fArr2, i + 1, this.size - i);
                this.array = fArr2;
            }
            this.array[i] = f;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
