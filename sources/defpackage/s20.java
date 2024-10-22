package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class s20 extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f4258a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f4259b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient o20 g;
    public transient o20 h;
    public transient r20 i;

    public s20() {
        this.e = cp3.r(3, 1);
    }

    public final Map a() {
        Object obj = this.f4258a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c(Object obj) {
        if (f()) {
            return -1;
        }
        int P = cp3.P(obj);
        int i = (1 << (this.e & 31)) - 1;
        Object obj2 = this.f4258a;
        Objects.requireNonNull(obj2);
        int j0 = zf3.j0(P & i, obj2);
        if (j0 == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = P & i2;
        do {
            int i4 = j0 - 1;
            int i5 = h()[i4];
            if ((i5 & i2) == i3 && zf3.p(obj, d(i4))) {
                return i4;
            }
            j0 = i5 & i;
        } while (j0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map a2 = a();
        if (a2 != null) {
            this.e = cp3.r(size(), 3);
            a2.clear();
            this.f4258a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f, (Object) null);
        Arrays.fill(j(), 0, this.f, (Object) null);
        Object obj = this.f4258a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsKey(obj);
        }
        if (c(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (zf3.p(obj, l(i))) {
                return true;
            }
        }
        return false;
    }

    public final Object d(int i) {
        return i()[i];
    }

    public final void e(int i, int i2) {
        Object obj = this.f4258a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i3 = i();
        Object[] j2 = j();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = i3[size];
            i3[i] = obj2;
            j2[i] = j2[size];
            i3[size] = null;
            j2[size] = null;
            h[i] = h[size];
            h[size] = 0;
            int P = cp3.P(obj2) & i2;
            int j0 = zf3.j0(P, obj);
            int i4 = size + 1;
            if (j0 == i4) {
                zf3.k0(P, i + 1, obj);
                return;
            }
            while (true) {
                int i5 = j0 - 1;
                int i6 = h[i5];
                int i7 = i6 & i2;
                if (i7 == i4) {
                    h[i5] = ((i + 1) & i2) | (i6 & (~i2));
                    return;
                }
                j0 = i7;
            }
        } else {
            i3[i] = null;
            j2[i] = null;
            h[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        o20 o20Var = this.h;
        if (o20Var == null) {
            o20 o20Var2 = new o20(this, 0);
            this.h = o20Var2;
            return o20Var2;
        }
        return o20Var;
    }

    public final boolean f() {
        if (this.f4258a == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        boolean f = f();
        Object obj2 = j;
        if (f) {
            return obj2;
        }
        int i = (1 << (this.e & 31)) - 1;
        Object obj3 = this.f4258a;
        Objects.requireNonNull(obj3);
        int b0 = zf3.b0(obj, null, i, obj3, h(), i(), null);
        if (b0 == -1) {
            return obj2;
        }
        Object l = l(b0);
        e(b0, i);
        this.f--;
        this.e += 32;
        return l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.get(obj);
        }
        int c = c(obj);
        if (c == -1) {
            return null;
        }
        return l(c);
    }

    public final int[] h() {
        int[] iArr = this.f4259b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object o = zf3.o(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zf3.k0(i3 & i5, i4 + 1, o);
        }
        Object obj = this.f4258a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int j0 = zf3.j0(i6, obj);
            while (j0 != 0) {
                int i7 = j0 - 1;
                int i8 = h[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int j02 = zf3.j0(i10, o);
                zf3.k0(i10, j0, o);
                h[i7] = ((~i5) & i9) | (j02 & i5);
                j0 = i8 & i;
            }
        }
        this.f4258a = o;
        this.e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        o20 o20Var = this.g;
        if (o20Var == null) {
            o20 o20Var2 = new o20(this, 1);
            this.g = o20Var2;
            return o20Var2;
        }
        return o20Var;
    }

    public final Object l(int i) {
        return j()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int min;
        int i2;
        if (f()) {
            cp3.n("Arrays already allocated", f());
            int i3 = this.e;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f4258a = zf3.o(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.f4259b = new int[i3];
            this.c = new Object[i3];
            this.d = new Object[i3];
        }
        Map a2 = a();
        if (a2 != null) {
            return a2.put(obj, obj2);
        }
        int[] h = h();
        Object[] i4 = i();
        Object[] j2 = j();
        int i5 = this.f;
        int i6 = i5 + 1;
        int P = cp3.P(obj);
        int i7 = (1 << (this.e & 31)) - 1;
        int i8 = P & i7;
        Object obj3 = this.f4258a;
        Objects.requireNonNull(obj3);
        int j0 = zf3.j0(i8, obj3);
        int i9 = 0;
        if (j0 == 0) {
            if (i6 > i7) {
                if (i7 < 32) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i7 = k(i7, (i7 + 1) * i2, P, i5);
            } else {
                Object obj4 = this.f4258a;
                Objects.requireNonNull(obj4);
                zf3.k0(i8, i6, obj4);
            }
        } else {
            int i10 = ~i7;
            int i11 = P & i10;
            int i12 = 0;
            while (true) {
                int i13 = j0 - 1;
                int i14 = h[i13];
                int i15 = i14 & i10;
                if (i15 == i11 && zf3.p(obj, i4[i13])) {
                    Object obj5 = j2[i13];
                    j2[i13] = obj2;
                    return obj5;
                }
                int i16 = i14 & i7;
                int i17 = i11;
                int i18 = i12 + 1;
                if (i16 == 0) {
                    if (i18 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.e & 31)) - 1) + 1, 1.0f);
                        if (isEmpty()) {
                            i9 = -1;
                        }
                        int i19 = i9;
                        while (i19 >= 0) {
                            linkedHashMap.put(d(i19), l(i19));
                            i19++;
                            if (i19 >= this.f) {
                                i19 = -1;
                            }
                        }
                        this.f4258a = linkedHashMap;
                        this.f4259b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i6 > i7) {
                        if (i7 < 32) {
                            i = 4;
                        } else {
                            i = 2;
                        }
                        i7 = k(i7, (i7 + 1) * i, P, i5);
                    } else {
                        h[i13] = (i6 & i7) | i15;
                    }
                } else {
                    j0 = i16;
                    i12 = i18;
                    i11 = i17;
                }
            }
        }
        int length = h().length;
        if (i6 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f4259b = Arrays.copyOf(h(), min);
            this.c = Arrays.copyOf(i(), min);
            this.d = Arrays.copyOf(j(), min);
        }
        h()[i5] = ((~i7) & P) | (i7 & 0);
        i()[i5] = obj;
        j()[i5] = obj2;
        this.f = i6;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g = g(obj);
        if (g == j) {
            return null;
        }
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a2 = a();
        if (a2 != null) {
            return a2.size();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        r20 r20Var = this.i;
        if (r20Var == null) {
            r20 r20Var2 = new r20(this);
            this.i = r20Var2;
            return r20Var2;
        }
        return r20Var;
    }

    public s20(int i) {
        if (i >= 0) {
            this.e = cp3.r(i, 1);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }
}
