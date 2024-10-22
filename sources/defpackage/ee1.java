package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ee1 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1924b;
    public final int c;

    public ee1(int i, int i2, int[] iArr) {
        this.f1923a = iArr;
        this.f1924b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f1924b;
            while (true) {
                if (i < this.c) {
                    if (this.f1923a[i] == intValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ee1) {
            ee1 ee1Var = (ee1) obj;
            int i = this.c;
            int i2 = this.f1924b;
            int i3 = i - i2;
            if (ee1Var.c - ee1Var.f1924b != i3) {
                return false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f1923a[i2 + i4] != ee1Var.f1923a[ee1Var.f1924b + i4]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        int i3 = this.f1924b;
        cp3.g(i, i2 - i3);
        return Integer.valueOf(this.f1923a[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f1924b; i2 < this.c; i2++) {
            i = (i * 31) + this.f1923a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f1924b;
            int i2 = i;
            while (true) {
                if (i2 < this.c) {
                    if (this.f1923a[i2] == intValue) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.c - 1;
            while (true) {
                i = this.f1924b;
                if (i2 >= i) {
                    if (this.f1923a[i2] == intValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        int i2 = this.c;
        int i3 = this.f1924b;
        cp3.g(i, i2 - i3);
        int i4 = i3 + i;
        int[] iArr = this.f1923a;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.f1924b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.c;
        int i4 = this.f1924b;
        cp3.l(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.emptyList();
        }
        return new ee1(i + i4, i4 + i2, this.f1923a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.c;
        int i2 = this.f1924b;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.f1923a;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 < i) {
                sb.append(", ");
                sb.append(iArr[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
