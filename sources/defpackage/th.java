package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class th {
    public static final th c = new th(new int[]{2}, 8);
    public static final th d = new th(new int[]{2, 5, 6}, 8);
    public static final oi2 e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4501b;

    static {
        jb1 jb1Var = new jb1(4);
        jb1Var.b(5, 6);
        jb1Var.b(17, 6);
        jb1Var.b(7, 6);
        jb1Var.b(18, 6);
        jb1Var.b(6, 8);
        jb1Var.b(8, 8);
        jb1Var.b(14, 8);
        e = jb1Var.a();
    }

    public th(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f4500a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f4500a = new int[0];
        }
        this.f4501b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(defpackage.y01 r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.l
            r0.getClass()
            java.lang.String r1 = r12.i
            int r0 = defpackage.vw1.b(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            oi2 r2 = defpackage.th.e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            r1 = 8
            r4 = 6
            r5 = 7
            int[] r6 = r11.f4500a
            r7 = 1
            r8 = 0
            r9 = 18
            if (r0 != r9) goto L32
            int r10 = java.util.Arrays.binarySearch(r6, r9)
            if (r10 < 0) goto L2d
            r10 = 1
            goto L2e
        L2d:
            r10 = 0
        L2e:
            if (r10 != 0) goto L32
            r0 = 6
            goto L40
        L32:
            if (r0 != r1) goto L40
            int r10 = java.util.Arrays.binarySearch(r6, r1)
            if (r10 < 0) goto L3c
            r10 = 1
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 != 0) goto L40
            r0 = 7
        L40:
            int r6 = java.util.Arrays.binarySearch(r6, r0)
            if (r6 < 0) goto L48
            r6 = 1
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 != 0) goto L4c
            return r3
        L4c:
            r6 = -1
            int r10 = r12.y
            if (r10 == r6) goto L59
            if (r0 != r9) goto L54
            goto L59
        L54:
            int r12 = r11.f4501b
            if (r10 <= r12) goto L82
            return r3
        L59:
            int r12 = r12.z
            if (r12 == r6) goto L5e
            goto L61
        L5e:
            r12 = 48000(0xbb80, float:6.7262E-41)
        L61:
            int r6 = defpackage.wi3.f5017a
            r9 = 29
            if (r6 < r9) goto L6c
            int r12 = defpackage.sh.b(r0, r12)
            goto L81
        L6c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r2.getOrDefault(r12, r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r12 = r12.intValue()
        L81:
            r10 = r12
        L82:
            int r12 = defpackage.wi3.f5017a
            r2 = 28
            if (r12 > r2) goto L96
            if (r10 != r5) goto L8b
            goto L97
        L8b:
            r1 = 3
            if (r10 == r1) goto L94
            r1 = 4
            if (r10 == r1) goto L94
            r1 = 5
            if (r10 != r1) goto L96
        L94:
            r1 = 6
            goto L97
        L96:
            r1 = r10
        L97:
            r2 = 26
            if (r12 > r2) goto La8
            java.lang.String r12 = "fugu"
            java.lang.String r2 = defpackage.wi3.f5018b
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto La8
            if (r1 != r7) goto La8
            r1 = 2
        La8:
            int r12 = defpackage.wi3.n(r1)
            if (r12 != 0) goto Laf
            return r3
        Laf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th.a(y01):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        th thVar = (th) obj;
        if (Arrays.equals(this.f4500a, thVar.f4500a) && this.f4501b == thVar.f4501b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4500a) * 31) + this.f4501b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4501b + ", supportedEncodings=" + Arrays.toString(this.f4500a) + "]";
    }
}
