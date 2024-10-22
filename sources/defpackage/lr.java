package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public final class lr implements sr, rr, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public so2 f3175a;

    /* renamed from: b, reason: collision with root package name */
    public long f3176b;

    @Override // defpackage.sr
    public final boolean A(long j, at atVar) {
        int c = atVar.c();
        if (j < 0 || c < 0 || this.f3176b - j < c || atVar.c() - 0 < c) {
            return false;
        }
        if (c > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (x(i + j) != atVar.f(i + 0)) {
                    return false;
                }
                if (i2 >= c) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr B(int i, byte[] bArr, int i2) {
        T(i, bArr, i2);
        return this;
    }

    @Override // defpackage.sr
    public final int C(r32 r32Var) {
        int c = bu3.c(this, r32Var, false);
        if (c == -1) {
            return -1;
        }
        skip(r32Var.f4095a[c].c());
        return c;
    }

    @Override // defpackage.sr
    public final xg2 D() {
        return new xg2(new a52(this));
    }

    @Override // defpackage.sr
    public final long E(lr lrVar) {
        long j = this.f3176b;
        if (j > 0) {
            lrVar.write(this, j);
        }
        return j;
    }

    @Override // defpackage.sr
    public final void F(long j) {
        if (this.f3176b >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr G(long j) {
        W(j);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[EDGE_INSN: B:39:0x00a7->B:36:0x00a7 BREAK  A[LOOP:0: B:4:0x000e->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    @Override // defpackage.sr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long H() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f3176b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lae
            r1 = 0
            r6 = r3
            r2 = 0
            r5 = 0
        Le:
            so2 r8 = r0.f3175a
            byte[] r9 = r8.f4386a
            int r10 = r8.f4387b
            int r11 = r8.c
        L16:
            if (r10 >= r11) goto L93
            r12 = r9[r10]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L27
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L27
            int r13 = r12 - r13
            goto L40
        L27:
            r13 = 97
            byte r13 = (byte) r13
            if (r12 < r13) goto L32
            r14 = 102(0x66, float:1.43E-43)
            byte r14 = (byte) r14
            if (r12 > r14) goto L32
            goto L3c
        L32:
            r13 = 65
            byte r13 = (byte) r13
            if (r12 < r13) goto L6b
            r14 = 70
            byte r14 = (byte) r14
            if (r12 > r14) goto L6b
        L3c:
            int r13 = r12 - r13
            int r13 = r13 + 10
        L40:
            r14 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r14 = r14 & r6
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto L50
            r12 = 4
            long r6 = r6 << r12
            long r12 = (long) r13
            long r6 = r6 | r12
            int r10 = r10 + 1
            int r2 = r2 + 1
            goto L16
        L50:
            lr r1 = new lr
            r1.<init>()
            r1.X(r6)
            r1.V(r12)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.P()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = defpackage.m20.d1(r1, r3)
            r2.<init>(r1)
            throw r2
        L6b:
            r5 = 1
            if (r2 == 0) goto L6f
            goto L93
        L6f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r3 = 2
            char[] r3 = new char[r3]
            char[] r4 = defpackage.bx3.k
            int r6 = r12 >> 4
            r6 = r6 & 15
            char r6 = r4[r6]
            r3[r1] = r6
            r1 = r12 & 15
            char r1 = r4[r1]
            r3[r5] = r1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = defpackage.m20.d1(r1, r3)
            r2.<init>(r1)
            throw r2
        L93:
            if (r10 != r11) goto L9f
            so2 r9 = r8.a()
            r0.f3175a = r9
            defpackage.uo2.a(r8)
            goto La1
        L9f:
            r8.f4387b = r10
        La1:
            if (r5 != 0) goto La7
            so2 r8 = r0.f3175a
            if (r8 != 0) goto Le
        La7:
            long r3 = r0.f3176b
            long r1 = (long) r2
            long r3 = r3 - r1
            r0.f3176b = r3
            return r6
        Lae:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.H():long");
    }

    @Override // defpackage.sr
    public final kr I() {
        return new kr(this, 0);
    }

    @Override // defpackage.sr
    public final void J(lr lrVar, long j) {
        long j2 = this.f3176b;
        if (j2 >= j) {
            lrVar.write(this, j);
        } else {
            lrVar.write(this, j2);
            throw new EOFException();
        }
    }

    public final long K(byte b2, long j, long j2) {
        long j3;
        so2 so2Var;
        long j4 = j;
        boolean z = false;
        long j5 = 0;
        if (0 <= j4 && j4 <= j2) {
            z = true;
        }
        if (z) {
            long j6 = this.f3176b;
            if (j2 > j6) {
                j3 = j6;
            } else {
                j3 = j2;
            }
            if (j4 != j3 && (so2Var = this.f3175a) != null) {
                if (j6 - j4 < j4) {
                    while (j6 > j4) {
                        so2Var = so2Var.g;
                        j6 -= so2Var.c - so2Var.f4387b;
                    }
                    while (j6 < j3) {
                        byte[] bArr = so2Var.f4386a;
                        int min = (int) Math.min(so2Var.c, (so2Var.f4387b + j3) - j6);
                        for (int i = (int) ((so2Var.f4387b + j4) - j6); i < min; i++) {
                            if (bArr[i] == b2) {
                                return (i - so2Var.f4387b) + j6;
                            }
                        }
                        j6 += so2Var.c - so2Var.f4387b;
                        so2Var = so2Var.f;
                        j4 = j6;
                    }
                } else {
                    while (true) {
                        long j7 = (so2Var.c - so2Var.f4387b) + j5;
                        if (j7 > j4) {
                            break;
                        }
                        so2Var = so2Var.f;
                        j5 = j7;
                    }
                    while (j5 < j3) {
                        byte[] bArr2 = so2Var.f4386a;
                        int min2 = (int) Math.min(so2Var.c, (so2Var.f4387b + j3) - j5);
                        for (int i2 = (int) ((so2Var.f4387b + j4) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == b2) {
                                return (i2 - so2Var.f4387b) + j5;
                            }
                        }
                        j5 += so2Var.c - so2Var.f4387b;
                        so2Var = so2Var.f;
                        j4 = j5;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f3176b + " fromIndex=" + j4 + " toIndex=" + j2).toString());
    }

    public final long L(at atVar) {
        int i;
        int i2;
        so2 so2Var = this.f3175a;
        if (so2Var != null) {
            long j = this.f3176b;
            long j2 = 0;
            if (j - 0 < 0) {
                while (j > 0) {
                    so2Var = so2Var.g;
                    j -= so2Var.c - so2Var.f4387b;
                }
                if (atVar.c() == 2) {
                    byte f = atVar.f(0);
                    byte f2 = atVar.f(1);
                    while (j < this.f3176b) {
                        byte[] bArr = so2Var.f4386a;
                        i = (int) ((so2Var.f4387b + j2) - j);
                        int i3 = so2Var.c;
                        while (i < i3) {
                            byte b2 = bArr[i];
                            if (b2 != f && b2 != f2) {
                                i++;
                            }
                            i2 = so2Var.f4387b;
                        }
                        j2 = (so2Var.c - so2Var.f4387b) + j;
                        so2Var = so2Var.f;
                        j = j2;
                    }
                } else {
                    byte[] e = atVar.e();
                    while (j < this.f3176b) {
                        byte[] bArr2 = so2Var.f4386a;
                        i = (int) ((so2Var.f4387b + j2) - j);
                        int i4 = so2Var.c;
                        while (i < i4) {
                            byte b3 = bArr2[i];
                            int length = e.length;
                            int i5 = 0;
                            while (i5 < length) {
                                byte b4 = e[i5];
                                i5++;
                                if (b3 == b4) {
                                    i2 = so2Var.f4387b;
                                }
                            }
                            i++;
                        }
                        j2 = (so2Var.c - so2Var.f4387b) + j;
                        so2Var = so2Var.f;
                        j = j2;
                    }
                }
            } else {
                j = 0;
                while (true) {
                    long j3 = (so2Var.c - so2Var.f4387b) + j;
                    if (j3 > 0) {
                        break;
                    }
                    so2Var = so2Var.f;
                    j = j3;
                }
                if (atVar.c() == 2) {
                    byte f3 = atVar.f(0);
                    byte f4 = atVar.f(1);
                    while (j < this.f3176b) {
                        byte[] bArr3 = so2Var.f4386a;
                        i = (int) ((so2Var.f4387b + j2) - j);
                        int i6 = so2Var.c;
                        while (i < i6) {
                            byte b5 = bArr3[i];
                            if (b5 != f3 && b5 != f4) {
                                i++;
                            }
                            i2 = so2Var.f4387b;
                        }
                        j2 = (so2Var.c - so2Var.f4387b) + j;
                        so2Var = so2Var.f;
                        j = j2;
                    }
                } else {
                    byte[] e2 = atVar.e();
                    while (j < this.f3176b) {
                        byte[] bArr4 = so2Var.f4386a;
                        i = (int) ((so2Var.f4387b + j2) - j);
                        int i7 = so2Var.c;
                        while (i < i7) {
                            byte b6 = bArr4[i];
                            int length2 = e2.length;
                            int i8 = 0;
                            while (i8 < length2) {
                                byte b7 = e2[i8];
                                i8++;
                                if (b6 == b7) {
                                    i2 = so2Var.f4387b;
                                }
                            }
                            i++;
                        }
                        j2 = (so2Var.c - so2Var.f4387b) + j;
                        so2Var = so2Var.f;
                        j = j2;
                    }
                }
            }
            return (i - i2) + j;
        }
        return -1L;
    }

    public final jr M(jr jrVar) {
        boolean z;
        byte[] bArr = bu3.f532a;
        if (jrVar == t9.v) {
            jrVar = new jr();
        }
        if (jrVar.f2813a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jrVar.f2813a = this;
            jrVar.f2814b = true;
            return jrVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public final byte[] N(long j) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f3176b >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount: ").toString());
    }

    public final String O(long j, Charset charset) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f3176b >= j) {
                if (j == 0) {
                    return "";
                }
                so2 so2Var = this.f3175a;
                int i = so2Var.f4387b;
                if (i + j > so2Var.c) {
                    return new String(N(j), charset);
                }
                int i2 = (int) j;
                String str = new String(so2Var.f4386a, i, i2, charset);
                int i3 = so2Var.f4387b + i2;
                so2Var.f4387b = i3;
                this.f3176b -= j;
                if (i3 == so2Var.c) {
                    this.f3175a = so2Var.a();
                    uo2.a(so2Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount: ").toString());
    }

    public final String P() {
        return O(this.f3176b, dx.f1853a);
    }

    public final at Q() {
        boolean z;
        long j = this.f3176b;
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return R((int) j);
        }
        throw new IllegalStateException(m20.d1(Long.valueOf(j), "size > Int.MAX_VALUE: ").toString());
    }

    public final at R(int i) {
        if (i == 0) {
            return at.d;
        }
        t9.u(this.f3176b, 0L, i);
        so2 so2Var = this.f3175a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = so2Var.c;
            int i6 = so2Var.f4387b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                so2Var = so2Var.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        so2 so2Var2 = this.f3175a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = so2Var2.f4386a;
            i2 += so2Var2.c - so2Var2.f4387b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = so2Var2.f4387b;
            so2Var2.d = true;
            i7++;
            so2Var2 = so2Var2.f;
        }
        return new vo2(bArr, iArr);
    }

    public final so2 S(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            so2 so2Var = this.f3175a;
            if (so2Var == null) {
                so2 b2 = uo2.b();
                this.f3175a = b2;
                b2.g = b2;
                b2.f = b2;
                return b2;
            }
            so2 so2Var2 = so2Var.g;
            if (so2Var2.c + i <= 8192 && so2Var2.e) {
                return so2Var2;
            }
            so2 b3 = uo2.b();
            so2Var2.b(b3);
            return b3;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void T(int i, byte[] bArr, int i2) {
        long j = i2;
        t9.u(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            so2 S = S(1);
            int min = Math.min(i3 - i, 8192 - S.c);
            int i4 = i + min;
            System.arraycopy(bArr, i, S.f4386a, S.c, i4 - i);
            S.c += min;
            i = i4;
        }
        this.f3176b += j;
    }

    public final void U(at atVar) {
        atVar.k(this, atVar.c());
    }

    public final void V(int i) {
        so2 S = S(1);
        int i2 = S.c;
        S.c = i2 + 1;
        S.f4386a[i2] = (byte) i;
        this.f3176b++;
    }

    public final lr W(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            V(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    d0("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j < 100) {
                        if (j >= 10) {
                            i = 2;
                        }
                    } else if (j < 1000) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (j < 1000000) {
                    if (j < 100000) {
                        i = 5;
                    } else {
                        i = 6;
                    }
                } else if (j < 10000000) {
                    i = 7;
                } else {
                    i = 8;
                }
            } else if (j < 1000000000000L) {
                if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                    if (j < 1000000000) {
                        i = 9;
                    } else {
                        i = 10;
                    }
                } else if (j < 100000000000L) {
                    i = 11;
                } else {
                    i = 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i = 13;
                } else if (j < 100000000000000L) {
                    i = 14;
                } else {
                    i = 15;
                }
            } else if (j < 100000000000000000L) {
                if (j < 10000000000000000L) {
                    i = 16;
                } else {
                    i = 17;
                }
            } else if (j < 1000000000000000000L) {
                i = 18;
            } else {
                i = 19;
            }
            if (z) {
                i++;
            }
            so2 S = S(i);
            int i2 = S.c + i;
            while (true) {
                bArr = S.f4386a;
                if (j == 0) {
                    break;
                }
                long j2 = 10;
                i2--;
                bArr[i2] = bu3.f532a[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i2 - 1] = (byte) 45;
            }
            S.c += i;
            this.f3176b += i;
        }
        return this;
    }

    public final lr X(long j) {
        if (j == 0) {
            V(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            so2 S = S(i);
            int i2 = S.c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                S.f4386a[i3] = bu3.f532a[(int) (15 & j)];
                j >>>= 4;
            }
            S.c += i;
            this.f3176b += i;
        }
        return this;
    }

    public final void Y(int i) {
        so2 S = S(4);
        int i2 = S.c;
        int i3 = i2 + 1;
        byte[] bArr = S.f4386a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        S.c = i5 + 1;
        this.f3176b += 4;
    }

    public final void Z(long j) {
        so2 S = S(8);
        int i = S.c;
        int i2 = i + 1;
        byte[] bArr = S.f4386a;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        S.c = i8 + 1;
        this.f3176b += 8;
    }

    public final void a() {
        skip(this.f3176b);
    }

    public final void a0(int i) {
        so2 S = S(2);
        int i2 = S.c;
        int i3 = i2 + 1;
        byte[] bArr = S.f4386a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        S.c = i3 + 1;
        this.f3176b += 2;
    }

    @Override // defpackage.sr, defpackage.rr
    public final lr b() {
        return this;
    }

    public final lr b0(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (m20.L(charset, dx.f1853a)) {
                        c0(i, i2, str);
                        return this;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    T(0, bytes, bytes.length);
                    return this;
                }
                StringBuilder o = p71.o("endIndex > string.length: ", i2, " > ");
                o.append(str.length());
                throw new IllegalArgumentException(o.toString().toString());
            }
            throw new IllegalArgumentException(hx2.n("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "beginIndex < 0: ").toString());
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lr clone() {
        lr lrVar = new lr();
        if (this.f3176b != 0) {
            so2 so2Var = this.f3175a;
            so2 c = so2Var.c();
            lrVar.f3175a = c;
            c.g = c;
            c.f = c;
            for (so2 so2Var2 = so2Var.f; so2Var2 != so2Var; so2Var2 = so2Var2.f) {
                c.g.b(so2Var2.c());
            }
            lrVar.f3176b = this.f3176b;
        }
        return lrVar;
    }

    public final void c0(int i, int i2, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        char c;
        boolean z4;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            so2 S = S(1);
                            int i3 = S.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            byte[] bArr = S.f4386a;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = S.c;
                            int i6 = (i3 + i) - i5;
                            S.c = i5 + i6;
                            this.f3176b += i6;
                        } else {
                            if (charAt2 < 2048) {
                                so2 S2 = S(2);
                                int i7 = S2.c;
                                byte[] bArr2 = S2.f4386a;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                S2.c = i7 + 2;
                                this.f3176b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c <= 57343) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        so2 S3 = S(4);
                                        int i10 = S3.c;
                                        byte[] bArr3 = S3.f4386a;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        S3.c = i10 + 4;
                                        this.f3176b += 4;
                                        i += 2;
                                    }
                                }
                                V(63);
                                i = i8;
                            } else {
                                so2 S4 = S(3);
                                int i11 = S4.c;
                                byte[] bArr4 = S4.f4386a;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                S4.c = i11 + 3;
                                this.f3176b += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder o = p71.o("endIndex > string.length: ", i2, " > ");
                o.append(str.length());
                throw new IllegalArgumentException(o.toString().toString());
            }
            throw new IllegalArgumentException(hx2.n("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "beginIndex < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.dw2
    public final void close() {
    }

    public final long d() {
        long j = this.f3176b;
        if (j == 0) {
            return 0L;
        }
        so2 so2Var = this.f3175a.g;
        if (so2Var.c < 8192 && so2Var.e) {
            j -= r3 - so2Var.f4387b;
        }
        return j;
    }

    public final void d0(String str) {
        c0(0, str.length(), str);
    }

    @Override // defpackage.sr
    public final at e(long j) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f3176b >= j) {
                if (j >= 4096) {
                    at R = R((int) j);
                    skip(j);
                    return R;
                }
                return new at(N(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount: ").toString());
    }

    public final void e0(int i) {
        boolean z;
        String str;
        if (i < 128) {
            V(i);
            return;
        }
        if (i < 2048) {
            so2 S = S(2);
            int i2 = S.c;
            byte[] bArr = S.f4386a;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            S.c = i2 + 2;
            this.f3176b += 2;
            return;
        }
        int i3 = 0;
        if (55296 <= i && i <= 57343) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            V(63);
            return;
        }
        if (i < 65536) {
            so2 S2 = S(3);
            int i4 = S2.c;
            byte[] bArr2 = S2.f4386a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            S2.c = i4 + 3;
            this.f3176b += 3;
            return;
        }
        if (i <= 1114111) {
            so2 S3 = S(4);
            int i5 = S3.c;
            byte[] bArr3 = S3.f4386a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            S3.c = i5 + 4;
            this.f3176b += 4;
            return;
        }
        if (i != 0) {
            char[] cArr = bx3.k;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            if (i3 >= 0) {
                if (i3 <= 8) {
                    str = new String(cArr2, i3, 8 - i3);
                } else {
                    throw new IllegalArgumentException(p71.k("startIndex: ", i3, " > endIndex: 8"));
                }
            } else {
                throw new IndexOutOfBoundsException(p71.k("startIndex: ", i3, ", endIndex: 8, size: 8"));
            }
        } else {
            str = "0";
        }
        throw new IllegalArgumentException(m20.d1(str, "Unexpected code point: 0x"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lr) {
                long j = this.f3176b;
                lr lrVar = (lr) obj;
                if (j == lrVar.f3176b) {
                    if (j != 0) {
                        so2 so2Var = this.f3175a;
                        so2 so2Var2 = lrVar.f3175a;
                        int i = so2Var.f4387b;
                        int i2 = so2Var2.f4387b;
                        long j2 = 0;
                        while (j2 < this.f3176b) {
                            long min = Math.min(so2Var.c - i, so2Var2.c - i2);
                            if (0 < min) {
                                long j3 = 0;
                                do {
                                    j3++;
                                    int i3 = i + 1;
                                    byte b2 = so2Var.f4386a[i];
                                    int i4 = i2 + 1;
                                    if (b2 == so2Var2.f4386a[i2]) {
                                        i2 = i4;
                                        i = i3;
                                    }
                                } while (j3 < min);
                            }
                            if (i == so2Var.c) {
                                so2 so2Var3 = so2Var.f;
                                i = so2Var3.f4387b;
                                so2Var = so2Var3;
                            }
                            if (i2 == so2Var2.c) {
                                so2Var2 = so2Var2.f;
                                i2 = so2Var2.f4387b;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.rr
    public final rr f() {
        return this;
    }

    @Override // defpackage.rr, defpackage.dw2, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr g(int i) {
        a0(i);
        return this;
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr h(int i) {
        Y(i);
        return this;
    }

    public final int hashCode() {
        so2 so2Var = this.f3175a;
        if (so2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = so2Var.c;
            for (int i3 = so2Var.f4387b; i3 < i2; i3++) {
                i = (i * 31) + so2Var.f4386a[i3];
            }
            so2Var = so2Var.f;
        } while (so2Var != this.f3175a);
        return i;
    }

    @Override // defpackage.sr
    public final byte[] i() {
        return N(this.f3176b);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.sr
    public final boolean j() {
        if (this.f3176b == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr k(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.rr
    public final long l(mx2 mx2Var) {
        long j = 0;
        while (true) {
            long read = mx2Var.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // defpackage.rr
    public final rr m() {
        return this;
    }

    @Override // defpackage.sr
    public final long n() {
        int i;
        String str;
        long j = 0;
        if (this.f3176b != 0) {
            long j2 = -7;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            do {
                so2 so2Var = this.f3175a;
                byte[] bArr = so2Var.f4386a;
                int i3 = so2Var.f4387b;
                int i4 = so2Var.c;
                while (i3 < i4) {
                    byte b2 = bArr[i3];
                    byte b3 = (byte) 48;
                    if (b2 >= b3 && b2 <= ((byte) 57)) {
                        int i5 = b3 - b2;
                        if (j >= -922337203685477580L && (j != -922337203685477580L || i5 >= j2)) {
                            j = (j * 10) + i5;
                        } else {
                            lr lrVar = new lr();
                            lrVar.W(j);
                            lrVar.V(b2);
                            if (!z) {
                                lrVar.readByte();
                            }
                            throw new NumberFormatException(m20.d1(lrVar.P(), "Number too large: "));
                        }
                    } else if (b2 == ((byte) 45) && i2 == 0) {
                        j2--;
                        z = true;
                    } else {
                        z2 = true;
                        break;
                    }
                    i3++;
                    i2++;
                }
                if (i3 == i4) {
                    this.f3175a = so2Var.a();
                    uo2.a(so2Var);
                } else {
                    so2Var.f4387b = i3;
                }
                if (z2) {
                    break;
                }
            } while (this.f3175a != null);
            long j3 = this.f3176b - i2;
            this.f3176b = j3;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            if (i2 < i) {
                if (j3 != 0) {
                    if (z) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder p = p71.p(str, " but was 0x");
                    byte x = x(0L);
                    char[] cArr = bx3.k;
                    p.append(new String(new char[]{cArr[(x >> 4) & 15], cArr[x & 15]}));
                    throw new NumberFormatException(p.toString());
                }
                throw new EOFException();
            }
            if (!z) {
                return -j;
            }
            return j;
        }
        throw new EOFException();
    }

    @Override // defpackage.sr
    public final String o(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b2 = (byte) 10;
            long K = K(b2, 0L, j2);
            if (K != -1) {
                return bu3.b(this, K);
            }
            if (j2 < this.f3176b && x(j2 - 1) == ((byte) 13) && x(j2) == b2) {
                return bu3.b(this, j2);
            }
            lr lrVar = new lr();
            w(0L, lrVar, Math.min(32, this.f3176b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f3176b, j) + " content=" + lrVar.u().d() + (char) 8230);
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "limit < 0: ").toString());
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr p(String str) {
        d0(str);
        return this;
    }

    @Override // defpackage.rr
    public final rr r(at atVar) {
        atVar.k(this, atVar.c());
        return this;
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        if (j >= 0) {
            long j2 = this.f3176b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            lrVar.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // defpackage.sr
    public final byte readByte() {
        long j = this.f3176b;
        if (j != 0) {
            so2 so2Var = this.f3175a;
            int i = so2Var.f4387b;
            int i2 = so2Var.c;
            int i3 = i + 1;
            byte b2 = so2Var.f4386a[i];
            this.f3176b = j - 1;
            if (i3 == i2) {
                this.f3175a = so2Var.a();
                uo2.a(so2Var);
            } else {
                so2Var.f4387b = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // defpackage.sr
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.sr
    public final int readInt() {
        long j = this.f3176b;
        if (j >= 4) {
            so2 so2Var = this.f3175a;
            int i = so2Var.f4387b;
            int i2 = so2Var.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i3 = i + 1;
            byte[] bArr = so2Var.f4386a;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f3176b = j - 4;
            if (i8 == i2) {
                this.f3175a = so2Var.a();
                uo2.a(so2Var);
            } else {
                so2Var.f4387b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // defpackage.sr
    public final long readLong() {
        long j = this.f3176b;
        if (j >= 8) {
            so2 so2Var = this.f3175a;
            int i = so2Var.f4387b;
            int i2 = so2Var.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = so2Var.f4386a;
            long j2 = (bArr[i] & 255) << 56;
            long j3 = ((bArr[r8] & 255) << 48) | j2;
            long j4 = j3 | ((bArr[r6] & 255) << 40);
            long j5 = j4 | ((bArr[r8] & 255) << 32);
            long j6 = j5 | ((bArr[r6] & 255) << 24);
            long j7 = j6 | ((bArr[r8] & 255) << 16);
            long j8 = j7 | ((bArr[r6] & 255) << 8);
            int i3 = i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            long j9 = j8 | (bArr[r8] & 255);
            this.f3176b = j - 8;
            if (i3 == i2) {
                this.f3175a = so2Var.a();
                uo2.a(so2Var);
            } else {
                so2Var.f4387b = i3;
            }
            return j9;
        }
        throw new EOFException();
    }

    @Override // defpackage.sr
    public final short readShort() {
        long j = this.f3176b;
        if (j >= 2) {
            so2 so2Var = this.f3175a;
            int i = so2Var.f4387b;
            int i2 = so2Var.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i3 = i + 1;
            byte[] bArr = so2Var.f4386a;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f3176b = j - 2;
            if (i4 == i2) {
                this.f3175a = so2Var.a();
                uo2.a(so2Var);
            } else {
                so2Var.f4387b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // defpackage.sr
    public final String s(Charset charset) {
        return O(this.f3176b, charset);
    }

    @Override // defpackage.sr
    public final void skip(long j) {
        while (j > 0) {
            so2 so2Var = this.f3175a;
            if (so2Var != null) {
                int min = (int) Math.min(j, so2Var.c - so2Var.f4387b);
                long j2 = min;
                this.f3176b -= j2;
                j -= j2;
                int i = so2Var.f4387b + min;
                so2Var.f4387b = i;
                if (i == so2Var.c) {
                    this.f3175a = so2Var.a();
                    uo2.a(so2Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.rr
    public final /* bridge */ /* synthetic */ rr t(long j) {
        X(j);
        return this;
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        return d93.NONE;
    }

    public final String toString() {
        return Q().toString();
    }

    @Override // defpackage.sr
    public final at u() {
        return e(this.f3176b);
    }

    @Override // defpackage.sr
    public final boolean v(long j) {
        if (this.f3176b >= j) {
            return true;
        }
        return false;
    }

    public final void w(long j, lr lrVar, long j2) {
        t9.u(this.f3176b, j, j2);
        if (j2 != 0) {
            lrVar.f3176b += j2;
            so2 so2Var = this.f3175a;
            while (true) {
                long j3 = so2Var.c - so2Var.f4387b;
                if (j < j3) {
                    break;
                }
                j -= j3;
                so2Var = so2Var.f;
            }
            while (j2 > 0) {
                so2 c = so2Var.c();
                int i = c.f4387b + ((int) j);
                c.f4387b = i;
                c.c = Math.min(i + ((int) j2), c.c);
                so2 so2Var2 = lrVar.f3175a;
                if (so2Var2 == null) {
                    c.g = c;
                    c.f = c;
                    lrVar.f3175a = c;
                } else {
                    so2Var2.g.b(c);
                }
                j2 -= c.c - c.f4387b;
                so2Var = so2Var.f;
                j = 0;
            }
        }
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        so2 b2;
        if (lrVar != this) {
            t9.u(lrVar.f3176b, 0L, j);
            while (j > 0) {
                so2 so2Var = lrVar.f3175a;
                int i = so2Var.c;
                int i2 = so2Var.f4387b;
                if (j < i - i2) {
                    so2 so2Var2 = this.f3175a;
                    so2 so2Var3 = so2Var2 != null ? so2Var2.g : null;
                    if (so2Var3 != null && so2Var3.e) {
                        if ((so2Var3.c + j) - (so2Var3.d ? 0 : so2Var3.f4387b) <= 8192) {
                            so2Var.d(so2Var3, (int) j);
                            lrVar.f3176b -= j;
                            this.f3176b += j;
                            return;
                        }
                    }
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= i - i2) {
                        if (i3 >= 1024) {
                            b2 = so2Var.c();
                        } else {
                            b2 = uo2.b();
                            int i4 = so2Var.f4387b;
                            System.arraycopy(so2Var.f4386a, i4, b2.f4386a, 0, (i4 + i3) - i4);
                        }
                        b2.c = b2.f4387b + i3;
                        so2Var.f4387b += i3;
                        so2Var.g.b(b2);
                        lrVar.f3175a = b2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                so2 so2Var4 = lrVar.f3175a;
                long j2 = so2Var4.c - so2Var4.f4387b;
                lrVar.f3175a = so2Var4.a();
                so2 so2Var5 = this.f3175a;
                if (so2Var5 == null) {
                    this.f3175a = so2Var4;
                    so2Var4.g = so2Var4;
                    so2Var4.f = so2Var4;
                } else {
                    so2Var5.g.b(so2Var4);
                    so2 so2Var6 = so2Var4.g;
                    if (so2Var6 != so2Var4) {
                        if (so2Var6.e) {
                            int i5 = so2Var4.c - so2Var4.f4387b;
                            if (i5 <= (8192 - so2Var6.c) + (so2Var6.d ? 0 : so2Var6.f4387b)) {
                                so2Var4.d(so2Var6, i5);
                                so2Var4.a();
                                uo2.a(so2Var4);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                lrVar.f3176b -= j2;
                this.f3176b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final byte x(long j) {
        t9.u(this.f3176b, j, 1L);
        so2 so2Var = this.f3175a;
        so2Var.getClass();
        long j2 = this.f3176b;
        if (j2 - j < j) {
            while (j2 > j) {
                so2Var = so2Var.g;
                j2 -= so2Var.c - so2Var.f4387b;
            }
            return so2Var.f4386a[(int) ((so2Var.f4387b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = so2Var.c;
            int i2 = so2Var.f4387b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return so2Var.f4386a[(int) ((i2 + j) - j3)];
            }
            so2Var = so2Var.f;
            j3 = j4;
        }
    }

    @Override // defpackage.sr
    public final String y() {
        return o(Long.MAX_VALUE);
    }

    @Override // defpackage.rr
    public final rr z(byte[] bArr) {
        T(0, bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        so2 so2Var = this.f3175a;
        if (so2Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), so2Var.c - so2Var.f4387b);
        byteBuffer.put(so2Var.f4386a, so2Var.f4387b, min);
        int i = so2Var.f4387b + min;
        so2Var.f4387b = i;
        this.f3176b -= min;
        if (i == so2Var.c) {
            this.f3175a = so2Var.a();
            uo2.a(so2Var);
        }
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        t9.u(bArr.length, i, i2);
        so2 so2Var = this.f3175a;
        if (so2Var == null) {
            return -1;
        }
        int min = Math.min(i2, so2Var.c - so2Var.f4387b);
        int i3 = so2Var.f4387b;
        System.arraycopy(so2Var.f4386a, i3, bArr, i, (i3 + min) - i3);
        int i4 = so2Var.f4387b + min;
        so2Var.f4387b = i4;
        this.f3176b -= min;
        if (i4 == so2Var.c) {
            this.f3175a = so2Var.a();
            uo2.a(so2Var);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            so2 S = S(1);
            int min = Math.min(i, 8192 - S.c);
            byteBuffer.get(S.f4386a, S.c, min);
            i -= min;
            S.c += min;
        }
        this.f3176b += remaining;
        return remaining;
    }
}
