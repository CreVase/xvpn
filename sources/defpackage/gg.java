package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class gg extends l1 {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f2246a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2247b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
        }
        if (i == i2) {
            c(obj);
            return;
        }
        if (i == 0) {
            f(i2 + 1);
            int i3 = this.f2246a;
            if (i3 == 0) {
                i3 = this.f2247b.length;
            }
            int i4 = i3 - 1;
            this.f2246a = i4;
            this.f2247b[i4] = obj;
            this.c++;
            return;
        }
        f(i2 + 1);
        int g = g(this.f2246a + i);
        int i5 = this.c;
        if (i < ((i5 + 1) >> 1)) {
            int length = g == 0 ? this.f2247b.length - 1 : g - 1;
            int i6 = this.f2246a;
            int length2 = i6 == 0 ? this.f2247b.length - 1 : i6 - 1;
            if (length >= i6) {
                Object[] objArr = this.f2247b;
                objArr[length2] = objArr[i6];
                int i7 = i6 + 1;
                System.arraycopy(objArr, i7, objArr, i6, (length + 1) - i7);
            } else {
                Object[] objArr2 = this.f2247b;
                System.arraycopy(objArr2, i6, objArr2, i6 - 1, objArr2.length - i6);
                Object[] objArr3 = this.f2247b;
                objArr3[objArr3.length - 1] = objArr3[0];
                System.arraycopy(objArr3, 1, objArr3, 0, (length + 1) - 1);
            }
            this.f2247b[length] = obj;
            this.f2246a = length2;
        } else {
            int g2 = g(this.f2246a + i5);
            if (g < g2) {
                Object[] objArr4 = this.f2247b;
                System.arraycopy(objArr4, g, objArr4, g + 1, g2 - g);
            } else {
                Object[] objArr5 = this.f2247b;
                System.arraycopy(objArr5, 0, objArr5, 1, g2 - 0);
                Object[] objArr6 = this.f2247b;
                objArr6[0] = objArr6[objArr6.length - 1];
                System.arraycopy(objArr6, g, objArr6, g + 1, (objArr6.length - 1) - g);
            }
            this.f2247b[g] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            int i3 = this.c;
            if (i == i3) {
                return addAll(collection);
            }
            f(collection.size() + i3);
            int g = g(this.f2246a + this.c);
            int g2 = g(this.f2246a + i);
            int size = collection.size();
            if (i < ((this.c + 1) >> 1)) {
                int i4 = this.f2246a;
                int i5 = i4 - size;
                if (g2 < i4) {
                    Object[] objArr = this.f2247b;
                    System.arraycopy(objArr, i4, objArr, i5, objArr.length - i4);
                    if (size >= g2) {
                        Object[] objArr2 = this.f2247b;
                        System.arraycopy(objArr2, 0, objArr2, objArr2.length - size, g2 + 0);
                    } else {
                        Object[] objArr3 = this.f2247b;
                        System.arraycopy(objArr3, 0, objArr3, objArr3.length - size, size + 0);
                        Object[] objArr4 = this.f2247b;
                        System.arraycopy(objArr4, size, objArr4, 0, g2 - size);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr5 = this.f2247b;
                    System.arraycopy(objArr5, i4, objArr5, i5, g2 - i4);
                } else {
                    Object[] objArr6 = this.f2247b;
                    i5 += objArr6.length;
                    int i6 = g2 - i4;
                    int length = objArr6.length - i5;
                    if (length >= i6) {
                        System.arraycopy(objArr6, i4, objArr6, i5, i6);
                    } else {
                        System.arraycopy(objArr6, i4, objArr6, i5, (i4 + length) - i4);
                        Object[] objArr7 = this.f2247b;
                        int i7 = this.f2246a + length;
                        System.arraycopy(objArr7, i7, objArr7, 0, g2 - i7);
                    }
                }
                this.f2246a = i5;
                int i8 = g2 - size;
                if (i8 < 0) {
                    i8 += this.f2247b.length;
                }
                e(i8, collection);
            } else {
                int i9 = g2 + size;
                if (g2 < g) {
                    int i10 = size + g;
                    Object[] objArr8 = this.f2247b;
                    if (i10 <= objArr8.length) {
                        System.arraycopy(objArr8, g2, objArr8, i9, g - g2);
                    } else if (i9 >= objArr8.length) {
                        System.arraycopy(objArr8, g2, objArr8, i9 - objArr8.length, g - g2);
                    } else {
                        int length2 = g - (i10 - objArr8.length);
                        System.arraycopy(objArr8, length2, objArr8, 0, g - length2);
                        Object[] objArr9 = this.f2247b;
                        System.arraycopy(objArr9, g2, objArr9, i9, length2 - g2);
                    }
                } else {
                    Object[] objArr10 = this.f2247b;
                    System.arraycopy(objArr10, 0, objArr10, size, g - 0);
                    Object[] objArr11 = this.f2247b;
                    if (i9 >= objArr11.length) {
                        System.arraycopy(objArr11, g2, objArr11, i9 - objArr11.length, objArr11.length - g2);
                    } else {
                        int length3 = objArr11.length - size;
                        System.arraycopy(objArr11, length3, objArr11, 0, objArr11.length - length3);
                        Object[] objArr12 = this.f2247b;
                        System.arraycopy(objArr12, g2, objArr12, i9, (objArr12.length - size) - g2);
                    }
                }
                e(g2, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
    }

    public final void c(Object obj) {
        f(this.c + 1);
        this.f2247b[g(this.f2246a + this.c)] = obj;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int g = g(this.f2246a + this.c);
        int i = this.f2246a;
        if (i < g) {
            Arrays.fill(this.f2247b, i, g, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f2247b;
            Arrays.fill(objArr, this.f2246a, objArr.length, (Object) null);
            Arrays.fill(this.f2247b, 0, g, (Object) null);
        }
        this.f2246a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2247b.length;
        while (i < length && it.hasNext()) {
            this.f2247b[i] = it.next();
            i++;
        }
        int i2 = this.f2246a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f2247b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void f(int i) {
        if (i >= 0) {
            Object[] objArr = this.f2247b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i < 10) {
                    i = 10;
                }
                this.f2247b = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            int i3 = this.f2246a;
            System.arraycopy(objArr, i3, objArr2, 0, objArr.length - i3);
            Object[] objArr3 = this.f2247b;
            int length2 = objArr3.length;
            int i4 = this.f2246a;
            System.arraycopy(objArr3, 0, objArr2, length2 - i4, i4 - 0);
            this.f2246a = 0;
            this.f2247b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int g(int i) {
        Object[] objArr = this.f2247b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.f2247b[g(this.f2246a + i)];
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
    }

    public final Object h() {
        int i;
        if (!isEmpty()) {
            Object[] objArr = this.f2247b;
            int i2 = this.f2246a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            if (i2 == objArr.length - 1) {
                i = 0;
            } else {
                i = i2 + 1;
            }
            this.f2246a = i;
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object i() {
        if (!isEmpty()) {
            int g = g(tf3.N(this) + this.f2246a);
            Object[] objArr = this.f2247b;
            Object obj = objArr[g];
            objArr[g] = null;
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int g = g(this.f2246a + this.c);
        int i2 = this.f2246a;
        if (i2 < g) {
            while (i2 < g) {
                if (m20.L(obj, this.f2247b[i2])) {
                    i = this.f2246a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 >= g) {
            int length = this.f2247b.length;
            while (true) {
                if (i2 < length) {
                    if (m20.L(obj, this.f2247b[i2])) {
                        i = this.f2246a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < g; i3++) {
                        if (m20.L(obj, this.f2247b[i3])) {
                            i2 = i3 + this.f2247b.length;
                            i = this.f2246a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int g = g(this.f2246a + this.c);
        int i2 = this.f2246a;
        if (i2 < g) {
            length = g - 1;
            if (i2 <= length) {
                while (!m20.L(obj, this.f2247b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f2246a;
                return length - i;
            }
            return -1;
        }
        if (i2 > g) {
            int i3 = g - 1;
            while (true) {
                if (-1 < i3) {
                    if (m20.L(obj, this.f2247b[i3])) {
                        length = i3 + this.f2247b.length;
                        i = this.f2246a;
                        break;
                    }
                    i3--;
                } else {
                    length = this.f2247b.length - 1;
                    int i4 = this.f2246a;
                    if (i4 <= length) {
                        while (!m20.L(obj, this.f2247b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f2246a;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        boolean z;
        int g;
        boolean z2 = false;
        if (!isEmpty()) {
            if (this.f2247b.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int g2 = g(this.f2246a + this.c);
                int i = this.f2246a;
                if (i < g2) {
                    g = i;
                    while (i < g2) {
                        Object obj = this.f2247b[i];
                        if (!collection.contains(obj)) {
                            this.f2247b[g] = obj;
                            g++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.f2247b, g, g2, (Object) null);
                } else {
                    int length = this.f2247b.length;
                    int i2 = i;
                    boolean z3 = false;
                    while (i < length) {
                        Object[] objArr = this.f2247b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.f2247b[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    g = g(i2);
                    for (int i3 = 0; i3 < g2; i3++) {
                        Object[] objArr2 = this.f2247b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.f2247b[g] = obj3;
                            if (g == r6.length - 1) {
                                g = 0;
                            } else {
                                g++;
                            }
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int i4 = g - this.f2246a;
                    if (i4 < 0) {
                        i4 += this.f2247b.length;
                    }
                    this.c = i4;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        boolean z;
        int g;
        boolean z2 = false;
        if (!isEmpty()) {
            if (this.f2247b.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int g2 = g(this.f2246a + this.c);
                int i = this.f2246a;
                if (i < g2) {
                    g = i;
                    while (i < g2) {
                        Object obj = this.f2247b[i];
                        if (collection.contains(obj)) {
                            this.f2247b[g] = obj;
                            g++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.f2247b, g, g2, (Object) null);
                } else {
                    int length = this.f2247b.length;
                    int i2 = i;
                    boolean z3 = false;
                    while (i < length) {
                        Object[] objArr = this.f2247b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.f2247b[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    g = g(i2);
                    for (int i3 = 0; i3 < g2; i3++) {
                        Object[] objArr2 = this.f2247b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f2247b[g] = obj3;
                            if (g == r6.length - 1) {
                                g = 0;
                            } else {
                                g++;
                            }
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int i4 = g - this.f2246a;
                    if (i4 < 0) {
                        i4 += this.f2247b.length;
                    }
                    this.c = i4;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            int g = g(this.f2246a + i);
            Object[] objArr = this.f2247b;
            Object obj2 = objArr[g];
            objArr[g] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int g = g(this.f2246a + this.c);
        int i2 = this.f2246a;
        if (i2 < g) {
            System.arraycopy(this.f2247b, i2, objArr, 0, g - i2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2247b;
            int i3 = this.f2246a;
            System.arraycopy(objArr2, i3, objArr, 0, objArr2.length - i3);
            Object[] objArr3 = this.f2247b;
            System.arraycopy(objArr3, 0, objArr, objArr3.length - this.f2246a, g - 0);
        }
        int i4 = this.c;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        f(collection.size() + this.c);
        e(g(this.f2246a + this.c), collection);
        return true;
    }
}
