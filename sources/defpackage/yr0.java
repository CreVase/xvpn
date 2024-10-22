package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class yr0 extends o0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f5378a;

    public yr0(Enum[] enumArr) {
        this.f5378a = enumArr;
    }

    @Override // defpackage.t
    public final int c() {
        return this.f5378a.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.t, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L18
            java.lang.Enum[] r2 = r4.f5378a
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 > r3) goto L18
            r0 = r2[r0]
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != r5) goto L1c
            r1 = 1
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr0.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f5378a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", length));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.o0, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L17
            java.lang.Enum[] r2 = r4.f5378a
            int r3 = r2.length
            int r3 = r3 + r1
            if (r0 > r3) goto L17
            r2 = r2[r0]
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != r5) goto L1b
            r1 = r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr0.indexOf(java.lang.Object):int");
    }

    @Override // defpackage.o0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
