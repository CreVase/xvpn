package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class at implements Serializable, Comparable {
    public static final at d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f329a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f330b;
    public transient String c;

    static {
        new v73();
        d = new at(new byte[0]);
    }

    public at(byte[] bArr) {
        this.f329a = bArr;
    }

    public String a() {
        byte[] bArr = au3.f343a;
        byte[] bArr2 = this.f329a;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b2 = bArr2[i];
            int i4 = i3 + 1;
            byte b3 = bArr2[i3];
            int i5 = i4 + 1;
            byte b4 = bArr2[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr[(b2 & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr[b4 & 63];
            i = i5;
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b5 = bArr2[i];
                byte b6 = bArr2[i9];
                int i10 = i2 + 1;
                bArr3[i2] = bArr[(b5 & 255) >> 2];
                int i11 = i10 + 1;
                bArr3[i10] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
                bArr3[i11] = bArr[(b6 & 15) << 2];
                bArr3[i11 + 1] = (byte) 61;
            }
        } else {
            byte b7 = bArr2[i];
            int i12 = i2 + 1;
            bArr3[i2] = bArr[(b7 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr[(b7 & 3) << 4];
            byte b8 = (byte) 61;
            bArr3[i13] = b8;
            bArr3[i13 + 1] = b8;
        }
        return new String(bArr3, dx.f1853a);
    }

    public at b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f329a, 0, c());
        return new at(messageDigest.digest());
    }

    public int c() {
        return this.f329a.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            at r8 = (defpackage.at) r8
            int r0 = r7.c()
            int r1 = r8.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L26
            byte r5 = r7.f(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L23
            int r4 = r4 + 1
            goto L10
        L23:
            if (r5 >= r6) goto L2d
            goto L2b
        L26:
            if (r0 != r1) goto L29
            goto L2e
        L29:
            if (r0 >= r1) goto L2d
        L2b:
            r3 = -1
            goto L2e
        L2d:
            r3 = 1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f329a;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            int i3 = i2 + 1;
            char[] cArr2 = bx3.k;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f329a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof at) {
            at atVar = (at) obj;
            int c = atVar.c();
            byte[] bArr = this.f329a;
            if (c == bArr.length && atVar.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.f329a[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r7, int r8, int r9, byte[] r10) {
        /*
            r6 = this;
            r0 = 0
            if (r7 < 0) goto L29
            byte[] r1 = r6.f329a
            int r2 = r1.length
            int r2 = r2 - r9
            if (r7 > r2) goto L29
            if (r8 < 0) goto L29
            int r2 = r10.length
            int r2 = r2 - r9
            if (r8 > r2) goto L29
            r2 = 1
            if (r9 <= 0) goto L25
            r3 = 0
        L13:
            int r4 = r3 + 1
            int r5 = r3 + r7
            r5 = r1[r5]
            int r3 = r3 + r8
            r3 = r10[r3]
            if (r5 == r3) goto L20
            r7 = 0
            goto L26
        L20:
            if (r4 < r9) goto L23
            goto L25
        L23:
            r3 = r4
            goto L13
        L25:
            r7 = 1
        L26:
            if (r7 == 0) goto L29
            r0 = 1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at.g(int, int, int, byte[]):boolean");
    }

    public boolean h(at atVar, int i) {
        return atVar.g(0, 0, i, this.f329a);
    }

    public int hashCode() {
        int i = this.f330b;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f329a);
            this.f330b = hashCode;
            return hashCode;
        }
        return i;
    }

    public at i() {
        byte b2;
        int i = 0;
        while (true) {
            byte[] bArr = this.f329a;
            if (i < bArr.length) {
                byte b3 = bArr[i];
                byte b4 = (byte) 65;
                if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b3 + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b5 = copyOf[i2];
                        if (b5 >= b4 && b5 <= b2) {
                            copyOf[i2] = (byte) (b5 + 32);
                        }
                    }
                    return new at(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String j() {
        String str = this.c;
        if (str == null) {
            String str2 = new String(e(), dx.f1853a);
            this.c = str2;
            return str2;
        }
        return str;
    }

    public void k(lr lrVar, int i) {
        lrVar.T(0, this.f329a, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x013d, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0130, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x011e, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x010f, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00fe, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01df, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01d8, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01cb, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01b5, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01a6, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0195, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0184, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x021e, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0221, code lost:            r7 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00b7, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ac, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009d, code lost:            if (r6 == 64) goto L246;     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0221 A[EDGE_INSN: B:120:0x0221->B:38:0x0221 BREAK  A[LOOP:0: B:8:0x0014->B:75:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0221 A[EDGE_INSN: B:187:0x0221->B:38:0x0221 BREAK  A[LOOP:0: B:8:0x0014->B:75:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0221 A[EDGE_INSN: B:234:0x0221->B:38:0x0221 BREAK  A[LOOP:0: B:8:0x0014->B:75:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0221 A[EDGE_INSN: B:260:0x0221->B:38:0x0221 BREAK  A[LOOP:0: B:8:0x0014->B:75:0x0014, LOOP_LABEL: LOOP:0: B:8:0x0014->B:75:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0221 A[EDGE_INSN: B:37:0x0221->B:38:0x0221 BREAK  A[LOOP:0: B:8:0x0014->B:75:0x0014], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at.toString():java.lang.String");
    }
}
