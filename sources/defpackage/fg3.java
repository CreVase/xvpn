package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fg3 implements Collection, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2090a;

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
        if (!(obj instanceof eg3)) {
            return false;
        }
        int i = ((eg3) obj).f1931a;
        int[] iArr = this.f2090a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:4:0x0011->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L40
        Ld:
            java.util.Iterator r8 = r8.iterator()
        L11:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r8.next()
            boolean r2 = r0 instanceof defpackage.eg3
            r3 = 0
            if (r2 == 0) goto L3c
            eg3 r0 = (defpackage.eg3) r0
            int r0 = r0.f1931a
            int[] r2 = r7.f2090a
            int r4 = r2.length
            r5 = 0
        L28:
            if (r5 >= r4) goto L32
            r6 = r2[r5]
            if (r0 != r6) goto L2f
            goto L33
        L2f:
            int r5 = r5 + 1
            goto L28
        L32:
            r5 = -1
        L33:
            if (r5 < 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L11
            r1 = 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg3.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof fg3)) {
            return false;
        }
        if (!m20.L(this.f2090a, ((fg3) obj).f2090a)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f2090a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f2090a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new am3(this.f2090a);
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
        return this.f2090a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ew3.e1(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f2090a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ew3.f1(this, objArr);
    }
}
