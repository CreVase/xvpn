package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class uu2 {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f4741a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4742b;
    public int c;

    public uu2() {
        this.f4741a = fl.d;
        this.f4742b = fl.e;
        this.c = 0;
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (uu2.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f4742b = objArr;
                    f = (Object[]) objArr[0];
                    this.f4741a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (uu2.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.f4742b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.f4741a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.f4741a = new int[i];
        this.f4742b = new Object[i << 1];
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (uu2.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (uu2.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public final void c(int i) {
        int i2 = this.c;
        int[] iArr = this.f4741a;
        if (iArr.length < i) {
            Object[] objArr = this.f4742b;
            a(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.f4741a, 0, i2);
                System.arraycopy(objArr, 0, this.f4742b, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.c == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f4741a;
            Object[] objArr = this.f4742b;
            this.f4741a = fl.d;
            this.f4742b = fl.e;
            this.c = 0;
            d(iArr, objArr, i);
        }
        if (this.c <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int e(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int e2 = fl.e(i2, i, this.f4741a);
            if (e2 < 0) {
                return e2;
            }
            if (obj.equals(this.f4742b[e2 << 1])) {
                return e2;
            }
            int i3 = e2 + 1;
            while (i3 < i2 && this.f4741a[i3] == i) {
                if (obj.equals(this.f4742b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = e2 - 1; i4 >= 0 && this.f4741a[i4] == i; i4--) {
                if (obj.equals(this.f4742b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uu2) {
            uu2 uu2Var = (uu2) obj;
            if (this.c != uu2Var.c) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                try {
                    Object i2 = i(i);
                    Object k = k(i);
                    Object orDefault = uu2Var.getOrDefault(i2, null);
                    if (k == null) {
                        if (orDefault != null || !uu2Var.containsKey(i2)) {
                            return false;
                        }
                    } else if (!k.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.c; i3++) {
                try {
                    Object i4 = i(i3);
                    Object k2 = k(i3);
                    Object obj2 = map.get(i4);
                    if (k2 == null) {
                        if (obj2 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!k2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        if (obj == null) {
            return g();
        }
        return e(obj.hashCode(), obj);
    }

    public final int g() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        try {
            int e2 = fl.e(i, 0, this.f4741a);
            if (e2 < 0) {
                return e2;
            }
            if (this.f4742b[e2 << 1] == null) {
                return e2;
            }
            int i2 = e2 + 1;
            while (i2 < i && this.f4741a[i2] == 0) {
                if (this.f4742b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = e2 - 1; i3 >= 0 && this.f4741a[i3] == 0; i3--) {
                if (this.f4742b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return this.f4742b[(f2 << 1) + 1];
        }
        return obj2;
    }

    public final int h(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.f4742b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int hashCode;
        int[] iArr = this.f4741a;
        Object[] objArr = this.f4742b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        return this.f4742b[i << 1];
    }

    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        Object[] objArr = this.f4742b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.c;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f4741a, objArr, i3);
            this.f4741a = fl.d;
            this.f4742b = fl.e;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f4741a;
            int i6 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 == this.c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f4741a, 0, i);
                        System.arraycopy(objArr, 0, this.f4742b, 0, i2);
                    }
                    if (i < i5) {
                        int i7 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i7, this.f4741a, i, i8);
                        System.arraycopy(objArr, i7 << 1, this.f4742b, i2, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, iArr, i, i10);
                    Object[] objArr2 = this.f4742b;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i2, i10 << 1);
                }
                Object[] objArr3 = this.f4742b;
                int i11 = i5 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.c) {
            this.c = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object k(int i) {
        return this.f4742b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int e2;
        int i2 = this.c;
        if (obj == null) {
            e2 = g();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            e2 = e(hashCode, obj);
        }
        if (e2 >= 0) {
            int i3 = (e2 << 1) + 1;
            Object[] objArr = this.f4742b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~e2;
        int[] iArr = this.f4741a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f4742b;
            a(i5);
            if (i2 == this.c) {
                int[] iArr2 = this.f4741a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f4742b, 0, objArr2.length);
                }
                d(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f4741a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f4742b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.c - i4) << 1);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr4 = this.f4741a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f4742b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return j(f2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return null;
        }
        int i = (f2 << 1) + 1;
        Object[] objArr = this.f4742b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object k = k(f2);
        if (obj2 != k && (obj2 == null || !obj2.equals(k))) {
            return false;
        }
        j(f2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object k = k(f2);
        if (k != obj2 && (obj2 == null || !obj2.equals(k))) {
            return false;
        }
        int i = (f2 << 1) + 1;
        Object[] objArr = this.f4742b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }

    public uu2(int i) {
        if (i == 0) {
            this.f4741a = fl.d;
            this.f4742b = fl.e;
        } else {
            a(i);
        }
        this.c = 0;
    }

    public uu2(uu2 uu2Var) {
        this();
        if (uu2Var != null) {
            int i = uu2Var.c;
            c(this.c + i);
            if (this.c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(uu2Var.i(i2), uu2Var.k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(uu2Var.f4741a, 0, this.f4741a, 0, i);
                System.arraycopy(uu2Var.f4742b, 0, this.f4742b, 0, i << 1);
                this.c = i;
            }
        }
    }
}
