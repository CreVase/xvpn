package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kg3 implements Collection, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2941a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof jg3)) {
            return false;
        }
        long j = ((jg3) obj).f2763a;
        long[] jArr = this.f2941a;
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (j == jArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:4:0x0011->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r11) {
        /*
            r10 = this;
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L42
        Ld:
            java.util.Iterator r11 = r11.iterator()
        L11:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r11.next()
            boolean r2 = r0 instanceof defpackage.jg3
            r3 = 0
            if (r2 == 0) goto L3e
            jg3 r0 = (defpackage.jg3) r0
            long r4 = r0.f2763a
            long[] r0 = r10.f2941a
            int r2 = r0.length
            r6 = 0
        L28:
            if (r6 >= r2) goto L34
            r7 = r0[r6]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L31
            goto L35
        L31:
            int r6 = r6 + 1
            goto L28
        L34:
            r6 = -1
        L35:
            if (r6 < 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L11
            r1 = 0
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg3.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof kg3)) {
            return false;
        }
        if (!m20.L(this.f2941a, ((kg3) obj).f2941a)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f2941a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f2941a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new am3(this.f2941a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2941a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ew3.e1(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f2941a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ew3.f1(this, objArr);
    }
}
