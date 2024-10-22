package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ng implements Collection, Set {
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3453a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3454b;
    public int c;
    public jg d;

    public ng(int i2) {
        if (i2 == 0) {
            this.f3453a = e;
            this.f3454b = f;
        } else {
            b(i2);
        }
        this.c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (ng.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ng.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int e2;
        if (obj == null) {
            e2 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            e2 = e(hashCode, obj);
        }
        if (e2 >= 0) {
            return false;
        }
        int i3 = ~e2;
        int i4 = this.c;
        int[] iArr = this.f3453a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f3454b;
            b(i5);
            int[] iArr2 = this.f3453a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3454b, 0, objArr.length);
            }
            c(iArr, objArr, this.c);
        }
        int i6 = this.c;
        if (i3 < i6) {
            int[] iArr3 = this.f3453a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3454b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.c - i3);
        }
        this.f3453a[i3] = i2;
        this.f3454b[i3] = obj;
        this.c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.c;
        int[] iArr = this.f3453a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3454b;
            b(size);
            int i2 = this.c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3453a, 0, i2);
                System.arraycopy(objArr, 0, this.f3454b, 0, this.c);
            }
            c(iArr, objArr, this.c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (ng.class) {
                Object[] objArr = i;
                if (objArr != null) {
                    this.f3454b = objArr;
                    i = (Object[]) objArr[0];
                    this.f3453a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (ng.class) {
                Object[] objArr2 = g;
                if (objArr2 != null) {
                    this.f3454b = objArr2;
                    g = (Object[]) objArr2[0];
                    this.f3453a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    h--;
                    return;
                }
            }
        }
        this.f3453a = new int[i2];
        this.f3454b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.c;
        if (i2 != 0) {
            c(this.f3453a, this.f3454b, i2);
            this.f3453a = e;
            this.f3454b = f;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int e(int i2, Object obj) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int e2 = fl.e(i3, i2, this.f3453a);
        if (e2 < 0) {
            return e2;
        }
        if (obj.equals(this.f3454b[e2])) {
            return e2;
        }
        int i4 = e2 + 1;
        while (i4 < i3 && this.f3453a[i4] == i2) {
            if (obj.equals(this.f3454b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = e2 - 1; i5 >= 0 && this.f3453a[i5] == i2; i5--) {
            if (obj.equals(this.f3454b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                try {
                    if (!set.contains(this.f3454b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int e2 = fl.e(i2, 0, this.f3453a);
        if (e2 < 0) {
            return e2;
        }
        if (this.f3454b[e2] == null) {
            return e2;
        }
        int i3 = e2 + 1;
        while (i3 < i2 && this.f3453a[i3] == 0) {
            if (this.f3454b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = e2 - 1; i4 >= 0 && this.f3453a[i4] == 0; i4--) {
            if (this.f3454b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void g(int i2) {
        Object[] objArr = this.f3454b;
        Object obj = objArr[i2];
        int i3 = this.c;
        if (i3 <= 1) {
            c(this.f3453a, objArr, i3);
            this.f3453a = e;
            this.f3454b = f;
            this.c = 0;
            return;
        }
        int[] iArr = this.f3453a;
        int i4 = 8;
        if (iArr.length > 8 && i3 < iArr.length / 3) {
            if (i3 > 8) {
                i4 = i3 + (i3 >> 1);
            }
            b(i4);
            this.c--;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3453a, 0, i2);
                System.arraycopy(objArr, 0, this.f3454b, 0, i2);
            }
            int i5 = this.c;
            if (i2 < i5) {
                int i6 = i2 + 1;
                System.arraycopy(iArr, i6, this.f3453a, i2, i5 - i2);
                System.arraycopy(objArr, i6, this.f3454b, i2, this.c - i2);
                return;
            }
            return;
        }
        int i7 = i3 - 1;
        this.c = i7;
        if (i2 < i7) {
            int i8 = i2 + 1;
            System.arraycopy(iArr, i8, iArr, i2, i7 - i2);
            Object[] objArr2 = this.f3454b;
            System.arraycopy(objArr2, i8, objArr2, i2, this.c - i2);
        }
        this.f3454b[this.c] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3453a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return f();
        }
        return e(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.d == null) {
            this.d = new jg(this, 1);
        }
        jg jgVar = this.d;
        if (((mp1) jgVar.f2288b) == null) {
            jgVar.f2288b = new mp1(jgVar, 1);
        }
        return ((mp1) jgVar.f2288b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3454b[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3454b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3454b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.c);
        }
        System.arraycopy(this.f3454b, 0, objArr, 0, this.c);
        int length = objArr.length;
        int i2 = this.c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
