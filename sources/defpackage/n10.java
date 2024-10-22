package defpackage;

import com.google.protobuf.v;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n10 extends o10 {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public n10(FileInputStream fileInputStream) {
        Charset charset = yd1.f5317a;
        this.e = fileInputStream;
        this.f = new byte[v.DEFAULT_BUFFER_SIZE];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    public final ArrayList A(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, v.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.e.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.k += read;
                    i2 += read;
                } else {
                    throw ie1.f();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i = this.i;
        if (this.g - i < 4) {
            H(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long C() {
        int i = this.i;
        if (this.g - i < 8) {
            H(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:            if (r3[r2] < 0) goto L34;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.i = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r2
            goto L70
        L31:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.F()
            int r1 = (int) r0
            return r1
        L70:
            r5.i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n10.D():int");
    }

    public final long E() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.i = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b2 ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ j4;
                            if (j5 >= 0) {
                                j2 = j5 ^ 266354560;
                                i5 = i10;
                            } else {
                                int i11 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i11 + 1;
                                    long j7 = j6 ^ (bArr[i11] << 42);
                                    if (j7 >= 0) {
                                        j = j7 ^ 4363953127296L;
                                    } else {
                                        i11 = i7 + 1;
                                        j6 = j7 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i11 + 1;
                                            j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i11 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i11;
                            }
                            this.i = i5;
                            return j2;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return F();
    }

    public final long F() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i == this.g) {
                H(1);
            }
            int i2 = this.i;
            this.i = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f[i2] & 128) == 0) {
                return j;
            }
        }
        throw ie1.c();
    }

    public final void G() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
            return;
        }
        this.h = 0;
    }

    public final void H(int i) {
        if (!J(i)) {
            if (i > (this.c - this.k) - this.i) {
                throw new ie1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw ie1.f();
        }
    }

    public final void I(int i) {
        int i2 = this.g;
        int i3 = this.i;
        if (i <= i2 - i3 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        InputStream inputStream = this.e;
        if (i >= 0) {
            int i4 = this.k;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.l;
            if (i6 <= i7) {
                this.k = i5;
                int i8 = i2 - i3;
                this.g = 0;
                this.i = 0;
                while (i8 < i) {
                    long j = i - i8;
                    try {
                        long skip = inputStream.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            } else {
                                i8 += (int) skip;
                            }
                        } else {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.k += i8;
                        G();
                    }
                }
                if (i8 < i) {
                    int i9 = this.g;
                    int i10 = i9 - this.i;
                    this.i = i9;
                    H(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.g;
                        if (i11 > i12) {
                            i10 += i12;
                            this.i = i12;
                            H(1);
                        } else {
                            this.i = i11;
                            return;
                        }
                    }
                }
            } else {
                I((i7 - i4) - i3);
                throw ie1.f();
            }
        } else {
            throw ie1.d();
        }
    }

    public final boolean J(int i) {
        int i2 = this.i;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            int i5 = this.k;
            int i6 = this.c;
            if (i > (i6 - i5) - i2 || i5 + i2 + i > this.l) {
                return false;
            }
            byte[] bArr = this.f;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.k += i2;
                this.g -= i2;
                this.i = 0;
            }
            int i7 = this.g;
            int min = Math.min(bArr.length - i7, (i6 - this.k) - i7);
            InputStream inputStream = this.e;
            int read = inputStream.read(bArr, i7, min);
            if (read != 0 && read >= -1 && read <= bArr.length) {
                if (read <= 0) {
                    return false;
                }
                this.g += read;
                G();
                if (this.g >= i) {
                    return true;
                }
                return J(i);
            }
            throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(p71.k("refillBuffer() called when ", i, " bytes were already available in buffer"));
    }

    @Override // defpackage.o10
    public final void a(int i) {
        if (this.j == i) {
        } else {
            throw new ie1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.o10
    public final int b() {
        return this.k + this.i;
    }

    @Override // defpackage.o10
    public final boolean c() {
        if (this.i == this.g && !J(1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o10
    public final void d(int i) {
        this.l = i;
        G();
    }

    @Override // defpackage.o10
    public final int e(int i) {
        if (i >= 0) {
            int i2 = this.k + this.i + i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.l = i2;
                G();
                return i3;
            }
            throw ie1.f();
        }
        throw ie1.d();
    }

    @Override // defpackage.o10
    public final boolean f() {
        if (E() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o10
    public final xs g() {
        int D = D();
        int i = this.g;
        int i2 = this.i;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (D <= i3 && D > 0) {
            xs e = vs.e(i2, bArr, D);
            this.i += D;
            return e;
        }
        if (D == 0) {
            return vs.f4885b;
        }
        byte[] z = z(D);
        if (z != null) {
            return vs.e(0, z, z.length);
        }
        int i4 = this.i;
        int i5 = this.g;
        int i6 = i5 - i4;
        this.k += i5;
        this.i = 0;
        this.g = 0;
        ArrayList A = A(D - i6);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        xs xsVar = vs.f4885b;
        return new xs(bArr2);
    }

    @Override // defpackage.o10
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // defpackage.o10
    public final int i() {
        return D();
    }

    @Override // defpackage.o10
    public final int j() {
        return B();
    }

    @Override // defpackage.o10
    public final long k() {
        return C();
    }

    @Override // defpackage.o10
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // defpackage.o10
    public final int m() {
        return D();
    }

    @Override // defpackage.o10
    public final long n() {
        return E();
    }

    @Override // defpackage.o10
    public final int o() {
        return B();
    }

    @Override // defpackage.o10
    public final long p() {
        return C();
    }

    @Override // defpackage.o10
    public final int q() {
        int D = D();
        return (-(D & 1)) ^ (D >>> 1);
    }

    @Override // defpackage.o10
    public final long r() {
        long E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // defpackage.o10
    public final String s() {
        int D = D();
        byte[] bArr = this.f;
        if (D > 0) {
            int i = this.g;
            int i2 = this.i;
            if (D <= i - i2) {
                String str = new String(bArr, i2, D, yd1.f5317a);
                this.i += D;
                return str;
            }
        }
        if (D == 0) {
            return "";
        }
        if (D <= this.g) {
            H(D);
            String str2 = new String(bArr, this.i, D, yd1.f5317a);
            this.i += D;
            return str2;
        }
        return new String(y(D), yd1.f5317a);
    }

    @Override // defpackage.o10
    public final String t() {
        int D = D();
        int i = this.i;
        int i2 = this.g;
        int i3 = i2 - i;
        byte[] bArr = this.f;
        if (D <= i3 && D > 0) {
            this.i = i + D;
        } else {
            if (D == 0) {
                return "";
            }
            i = 0;
            if (D <= i2) {
                H(D);
                this.i = D + 0;
            } else {
                bArr = y(D);
            }
        }
        return ui3.f4677a.Y(bArr, i, D);
    }

    @Override // defpackage.o10
    public final int u() {
        if (c()) {
            this.j = 0;
            return 0;
        }
        int D = D();
        this.j = D;
        if ((D >>> 3) != 0) {
            return D;
        }
        throw new ie1("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.o10
    public final int v() {
        return D();
    }

    @Override // defpackage.o10
    public final long w() {
        return E();
    }

    @Override // defpackage.o10
    public final boolean x(int i) {
        int u;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            I(4);
                            return true;
                        }
                        int i4 = ie1.f2577a;
                        throw new ge1();
                    }
                    do {
                        u = u();
                        if (u == 0) {
                            break;
                        }
                    } while (x(u));
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                I(D());
                return true;
            }
            I(8);
            return true;
        }
        int i5 = this.g - this.i;
        byte[] bArr = this.f;
        if (i5 >= 10) {
            while (i3 < 10) {
                int i6 = this.i;
                this.i = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw ie1.c();
        }
        while (i3 < 10) {
            if (this.i == this.g) {
                H(1);
            }
            int i7 = this.i;
            this.i = i7 + 1;
            if (bArr[i7] < 0) {
                i3++;
            }
        }
        throw ie1.c();
        return true;
    }

    public final byte[] y(int i) {
        byte[] z = z(i);
        if (z != null) {
            return z;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        ArrayList A = A(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i) {
        if (i == 0) {
            return yd1.f5318b;
        }
        if (i >= 0) {
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c <= 0) {
                int i5 = this.l;
                if (i4 <= i5) {
                    int i6 = this.g - i3;
                    int i7 = i - i6;
                    InputStream inputStream = this.e;
                    if (i7 >= 4096 && i7 > inputStream.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f, this.i, bArr, 0, i6);
                    this.k += this.g;
                    this.i = 0;
                    this.g = 0;
                    while (i6 < i) {
                        int read = inputStream.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.k += read;
                            i6 += read;
                        } else {
                            throw ie1.f();
                        }
                    }
                    return bArr;
                }
                I((i5 - i2) - i3);
                throw ie1.f();
            }
            throw new ie1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw ie1.d();
    }
}
