package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class ob1 extends ab1 implements Set {
    public static final /* synthetic */ int c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient hb1 f3636b;

    public static int j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static ob1 k(int i, Object... objArr) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                int j = j(i);
                Object[] objArr2 = new Object[j];
                int i2 = j - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int O = cp3.O(hashCode);
                        while (true) {
                            int i6 = O & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            O++;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i5);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new pb1(obj3);
                }
                if (j(i4) < j / 2) {
                    return k(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    z = true;
                }
                if (z) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new pi2(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new pb1(obj4);
        }
        return pi2.j;
    }

    public static ob1 l(Collection collection) {
        if ((collection instanceof ob1) && !(collection instanceof SortedSet)) {
            ob1 ob1Var = (ob1) collection;
            if (!ob1Var.h()) {
                return ob1Var;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    public static ob1 n(String str, String str2, String str3) {
        return k(3, str, str2, str3);
    }

    @Override // defpackage.ab1
    public hb1 b() {
        hb1 hb1Var = this.f3636b;
        if (hb1Var == null) {
            hb1 m = m();
            this.f3636b = m;
            return m;
        }
        return hb1Var;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ob1) && (this instanceof pi2)) {
            ob1 ob1Var = (ob1) obj;
            ob1Var.getClass();
            if ((ob1Var instanceof pi2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return cp3.t(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return cp3.z(this);
    }

    public hb1 m() {
        Object[] array = toArray();
        db1 db1Var = hb1.f2394b;
        return hb1.j(array.length, array);
    }
}
