package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class r42 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final ob1 f = ob1.k(5, ex.f2014a, ex.c, ex.f, ex.d, ex.e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4098a;

    /* renamed from: b, reason: collision with root package name */
    public int f4099b;
    public int c;

    public r42() {
        this.f4098a = wi3.f;
    }

    public final int A() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f4099b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long B() {
        int i;
        int i2;
        long j = this.f4098a[this.f4099b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f4098a[this.f4099b + i] & 192) == 128) {
                    j = (j << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f4099b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public final Charset C() {
        int i = this.c;
        int i2 = this.f4099b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f4098a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f4099b = i2 + 3;
                return ex.c;
            }
        }
        if (i - i2 >= 2) {
            byte[] bArr2 = this.f4098a;
            byte b2 = bArr2[i2];
            if (b2 == -2 && bArr2[i2 + 1] == -1) {
                this.f4099b = i2 + 2;
                return ex.d;
            }
            if (b2 == -1 && bArr2[i2 + 1] == -2) {
                this.f4099b = i2 + 2;
                return ex.e;
            }
            return null;
        }
        return null;
    }

    public final void D(int i) {
        byte[] bArr = this.f4098a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        E(i, bArr);
    }

    public final void E(int i, byte[] bArr) {
        this.f4098a = bArr;
        this.c = i;
        this.f4099b = 0;
    }

    public final void F(int i) {
        boolean z;
        if (i >= 0 && i <= this.f4098a.length) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        this.c = i;
    }

    public final void G(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        this.f4099b = i;
    }

    public final void H(int i) {
        G(this.f4099b + i);
    }

    public final void a(int i) {
        byte[] bArr = this.f4098a;
        if (i > bArr.length) {
            this.f4098a = Arrays.copyOf(bArr, i);
        }
    }

    public final char b(Charset charset) {
        cp3.f(f.contains(charset), "Unsupported charset: " + charset);
        return (char) (c(charset) >> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = defpackage.ex.c
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.nio.charset.Charset r0 = defpackage.ex.f2014a
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L43
        L14:
            int r0 = r9.c
            int r4 = r9.f4099b
            int r0 = r0 - r4
            if (r0 < r3) goto L43
            byte[] r10 = r9.f4098a
            r10 = r10[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L31
            byte r10 = (byte) r10
            r4 = 1
            goto L84
        L31:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r0[r2] = r3
            java.lang.String r0 = defpackage.zf3.V(r1, r0)
            r10.<init>(r0)
            throw r10
        L43:
            java.nio.charset.Charset r0 = defpackage.ex.f
            boolean r0 = r10.equals(r0)
            r4 = 2
            if (r0 != 0) goto L54
            java.nio.charset.Charset r0 = defpackage.ex.d
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L69
        L54:
            int r0 = r9.c
            int r5 = r9.f4099b
            int r0 = r0 - r5
            if (r0 < r4) goto L69
            byte[] r10 = r9.f4098a
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L64:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            goto L83
        L69:
            java.nio.charset.Charset r0 = defpackage.ex.e
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto La7
            int r10 = r9.c
            int r0 = r9.f4099b
            int r10 = r10 - r0
            if (r10 < r4) goto La7
            byte[] r10 = r9.f4098a
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L64
        L83:
            byte r10 = (byte) r10
        L84:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L8e
            r0 = 1
            goto L8f
        L8e:
            r0 = 0
        L8f:
            if (r0 == 0) goto L95
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L95:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r2] = r3
            java.lang.String r0 = defpackage.zf3.V(r1, r0)
            r10.<init>(r0)
            throw r10
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r42.c(java.nio.charset.Charset):int");
    }

    public final void d(int i, byte[] bArr, int i2) {
        System.arraycopy(this.f4098a, this.f4099b, bArr, i, i2);
        this.f4099b += i2;
    }

    public final char e(Charset charset, char[] cArr) {
        boolean z;
        int c = c(charset);
        if (c != 0) {
            char c2 = (char) (c >> 16);
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (cArr[i] == c2) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f4099b += c & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                return c2;
            }
        }
        return (char) 0;
    }

    public final int f() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f4099b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public final String g() {
        return h(ex.c);
    }

    public final String h(Charset charset) {
        int i;
        boolean z;
        boolean z2;
        cp3.f(f.contains(charset), "Unsupported charset: " + charset);
        if (this.c - this.f4099b == 0) {
            return null;
        }
        Charset charset2 = ex.f2014a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(ex.c) && !charset.equals(charset2)) {
            if (!charset.equals(ex.f) && !charset.equals(ex.e) && !charset.equals(ex.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.f4099b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                boolean z3 = false;
                if (charset.equals(ex.c) || charset.equals(ex.f2014a)) {
                    byte b2 = this.f4098a[i2];
                    int i4 = wi3.f5017a;
                    if (b2 != 10 && b2 != 13) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
                if (charset.equals(ex.f) || charset.equals(ex.d)) {
                    byte[] bArr = this.f4098a;
                    if (bArr[i2] == 0) {
                        byte b3 = bArr[i2 + 1];
                        int i5 = wi3.f5017a;
                        if (b3 != 10 && b3 != 13) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
                if (charset.equals(ex.e)) {
                    byte[] bArr2 = this.f4098a;
                    if (bArr2[i2 + 1] == 0) {
                        byte b4 = bArr2[i2];
                        int i6 = wi3.f5017a;
                        if (b4 == 10 || b4 == 13) {
                            z3 = true;
                        }
                        if (z3) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String t = t(i2 - this.f4099b, charset);
        if (this.f4099b == this.c) {
            return t;
        }
        if (e(charset, d) == '\r') {
            e(charset, e);
        }
        return t;
    }

    public final int i() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f4099b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public final long j() {
        byte[] bArr = this.f4098a;
        long j = bArr[r1] & 255;
        int i = this.f4099b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j3 = j2 | ((bArr[i] & 255) << 24);
        long j4 = j3 | ((bArr[r3] & 255) << 32);
        long j5 = j4 | ((bArr[r4] & 255) << 40);
        long j6 = j5 | ((bArr[r3] & 255) << 48);
        this.f4099b = i + 1 + 1 + 1 + 1 + 1;
        return j6 | ((bArr[r4] & 255) << 56);
    }

    public final short k() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f4099b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long l() {
        byte[] bArr = this.f4098a;
        long j = bArr[r1] & 255;
        int i = this.f4099b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f4099b = i + 1;
        return j2 | ((bArr[i] & 255) << 24);
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(hx2.m("Top bit not zero: ", i));
    }

    public final int n() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f4099b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long o() {
        byte[] bArr = this.f4098a;
        long j = (bArr[r1] & 255) << 56;
        int i = this.f4099b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j3 = j2 | ((bArr[i] & 255) << 32);
        long j4 = j3 | ((bArr[r3] & 255) << 24);
        long j5 = j4 | ((bArr[r4] & 255) << 16);
        long j6 = j5 | ((bArr[r3] & 255) << 8);
        this.f4099b = i + 1 + 1 + 1 + 1 + 1;
        return j6 | (bArr[r4] & 255);
    }

    public final String p() {
        int i = this.c;
        int i2 = this.f4099b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.f4098a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f4098a;
        int i3 = this.f4099b;
        int i4 = wi3.f5017a;
        String str = new String(bArr, i3, i2 - i3, ex.c);
        this.f4099b = i2;
        if (i2 < this.c) {
            this.f4099b = i2 + 1;
        }
        return str;
    }

    public final String q(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.f4099b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.f4098a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.f4098a;
        int i5 = wi3.f5017a;
        String str = new String(bArr, i3, i2, ex.c);
        this.f4099b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f4099b = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String s(int i) {
        return t(i, ex.c);
    }

    public final String t(int i, Charset charset) {
        String str = new String(this.f4098a, this.f4099b, i, charset);
        this.f4099b += i;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        this.f4099b = i + 1;
        return bArr[i] & 255;
    }

    public final long w() {
        byte[] bArr = this.f4098a;
        long j = (bArr[r1] & 255) << 24;
        int i = this.f4099b + 1 + 1 + 1;
        long j2 = j | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f4099b = i + 1;
        return j2 | (bArr[i] & 255);
    }

    public final int x() {
        byte[] bArr = this.f4098a;
        int i = this.f4099b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f4099b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public final int y() {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException(hx2.m("Top bit not zero: ", f2));
    }

    public final long z() {
        long o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException("Top bit not zero: " + o);
    }

    public r42(int i) {
        this.f4098a = new byte[i];
        this.c = i;
    }

    public r42(byte[] bArr) {
        this.f4098a = bArr;
        this.c = bArr.length;
    }

    public r42(byte[] bArr, int i) {
        this.f4098a = bArr;
        this.c = i;
    }
}
