package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class xg2 implements sr {

    /* renamed from: a, reason: collision with root package name */
    public final mx2 f5154a;

    /* renamed from: b, reason: collision with root package name */
    public final lr f5155b = new lr();
    public boolean c;

    public xg2(mx2 mx2Var) {
        this.f5154a = mx2Var;
    }

    @Override // defpackage.sr
    public final boolean A(long j, at atVar) {
        int c = atVar.c();
        if (!this.c) {
            if (c >= 0 && atVar.c() - 0 >= c) {
                if (c <= 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    long j2 = i + 0;
                    if (!v(1 + j2) || this.f5155b.x(j2) != atVar.f(i + 0)) {
                        break;
                    }
                    if (i2 >= c) {
                        return true;
                    }
                    i = i2;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:            return -1;     */
    @Override // defpackage.sr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(defpackage.r32 r8) {
        /*
            r7 = this;
            boolean r0 = r7.c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L31
        L6:
            lr r0 = r7.f5155b
            int r2 = defpackage.bu3.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L21
            if (r2 == r4) goto L1f
            at[] r8 = r8.f4095a
            r8 = r8[r2]
            int r8 = r8.c()
            long r3 = (long) r8
            r0.skip(r3)
            goto L30
        L1f:
            r2 = -1
            goto L30
        L21:
            mx2 r2 = r7.f5154a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            goto L1f
        L30:
            return r2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg2.C(r32):int");
    }

    @Override // defpackage.sr
    public final xg2 D() {
        return new xg2(new a52(this));
    }

    @Override // defpackage.sr
    public final long E(lr lrVar) {
        lr lrVar2;
        long j = 0;
        while (true) {
            mx2 mx2Var = this.f5154a;
            lrVar2 = this.f5155b;
            if (mx2Var.read(lrVar2, 8192L) == -1) {
                break;
            }
            long d = lrVar2.d();
            if (d > 0) {
                j += d;
                lrVar.write(lrVar2, d);
            }
        }
        long j2 = lrVar2.f3176b;
        if (j2 > 0) {
            long j3 = j + j2;
            lrVar.write(lrVar2, j2);
            return j3;
        }
        return j;
    }

    @Override // defpackage.sr
    public final void F(long j) {
        if (v(j)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.sr
    public final long H() {
        lr lrVar;
        byte x;
        F(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean v = v(i2);
            lrVar = this.f5155b;
            if (!v) {
                break;
            }
            x = lrVar.x(i);
            if ((x < ((byte) 48) || x > ((byte) 57)) && ((x < ((byte) 97) || x > ((byte) 102)) && (x < ((byte) 65) || x > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            fl.p(16);
            fl.p(16);
            throw new NumberFormatException(m20.d1(Integer.toString(x, 16), "Expected leading [0-9a-fA-F] character but was 0x"));
        }
        return lrVar.H();
    }

    @Override // defpackage.sr
    public final kr I() {
        return new kr(this, 1);
    }

    @Override // defpackage.sr
    public final void J(lr lrVar, long j) {
        lr lrVar2 = this.f5155b;
        try {
            F(j);
            lrVar2.J(lrVar, j);
        } catch (EOFException e) {
            lrVar.l(lrVar2);
            throw e;
        }
    }

    public final long a(byte b2, long j, long j2) {
        boolean z = true;
        if (!this.c) {
            long j3 = 0;
            if (0 > j2) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long K = this.f5155b.K(b2, j3, j2);
                    if (K != -1) {
                        return K;
                    }
                    lr lrVar = this.f5155b;
                    long j4 = lrVar.f3176b;
                    if (j4 >= j2 || this.f5154a.read(lrVar, 8192L) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.sr, defpackage.rr
    public final lr b() {
        return this.f5155b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.f5154a.close();
            this.f5155b.a();
        }
    }

    @Override // defpackage.sr
    public final at e(long j) {
        F(j);
        return this.f5155b.e(j);
    }

    @Override // defpackage.sr
    public final byte[] i() {
        mx2 mx2Var = this.f5154a;
        lr lrVar = this.f5155b;
        lrVar.l(mx2Var);
        return lrVar.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.sr
    public final boolean j() {
        if (!this.c) {
            lr lrVar = this.f5155b;
            if (lrVar.j() && this.f5154a.read(lrVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:            if (r4 == 0) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:            defpackage.fl.p(16);        defpackage.fl.p(16);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:            throw new java.lang.NumberFormatException(defpackage.m20.d1(java.lang.Integer.toString(r8, 16), "Expected a digit or '-' but was 0x"));     */
    @Override // defpackage.sr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n() {
        /*
            r11 = this;
            r0 = 1
            r11.F(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.v(r6)
            lr r9 = r11.f5155b
            if (r8 == 0) goto L47
            byte r8 = r9.x(r4)
            r10 = 48
            byte r10 = (byte) r10
            if (r8 < r10) goto L20
            r10 = 57
            byte r10 = (byte) r10
            if (r8 <= r10) goto L2a
        L20:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L2c
            r4 = 45
            byte r4 = (byte) r4
            if (r8 == r4) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r10 == 0) goto L2f
            goto L47
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            defpackage.fl.p(r1)
            defpackage.fl.p(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = defpackage.m20.d1(r1, r2)
            r0.<init>(r1)
            throw r0
        L47:
            long r0 = r9.n()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg2.n():long");
    }

    @Override // defpackage.sr
    public final String o(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b2 = (byte) 10;
            long a2 = a(b2, 0L, j2);
            lr lrVar = this.f5155b;
            if (a2 != -1) {
                return bu3.b(lrVar, a2);
            }
            if (j2 < Long.MAX_VALUE && v(j2) && lrVar.x(j2 - 1) == ((byte) 13) && v(1 + j2) && lrVar.x(j2) == b2) {
                return bu3.b(lrVar, j2);
            }
            lr lrVar2 = new lr();
            lrVar.w(0L, lrVar2, Math.min(32, lrVar.f3176b));
            throw new EOFException("\\n not found: limit=" + Math.min(lrVar.f3176b, j) + " content=" + lrVar2.u().d() + (char) 8230);
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "limit < 0: ").toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        lr lrVar = this.f5155b;
        if (lrVar.f3176b == 0 && this.f5154a.read(lrVar, 8192L) == -1) {
            return -1;
        }
        return lrVar.read(byteBuffer);
    }

    @Override // defpackage.sr
    public final byte readByte() {
        F(1L);
        return this.f5155b.readByte();
    }

    @Override // defpackage.sr
    public final void readFully(byte[] bArr) {
        lr lrVar = this.f5155b;
        try {
            F(bArr.length);
            lrVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = lrVar.f3176b;
                if (j > 0) {
                    int read = lrVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.sr
    public final int readInt() {
        F(4L);
        return this.f5155b.readInt();
    }

    @Override // defpackage.sr
    public final long readLong() {
        F(8L);
        return this.f5155b.readLong();
    }

    @Override // defpackage.sr
    public final short readShort() {
        F(2L);
        return this.f5155b.readShort();
    }

    @Override // defpackage.sr
    public final String s(Charset charset) {
        mx2 mx2Var = this.f5154a;
        lr lrVar = this.f5155b;
        lrVar.l(mx2Var);
        return lrVar.s(charset);
    }

    @Override // defpackage.sr
    public final void skip(long j) {
        if (!this.c) {
            while (j > 0) {
                lr lrVar = this.f5155b;
                if (lrVar.f3176b == 0 && this.f5154a.read(lrVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, lrVar.f3176b);
                lrVar.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        return this.f5154a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f5154a + ')';
    }

    @Override // defpackage.sr
    public final at u() {
        mx2 mx2Var = this.f5154a;
        lr lrVar = this.f5155b;
        lrVar.l(mx2Var);
        return lrVar.u();
    }

    @Override // defpackage.sr
    public final boolean v(long j) {
        boolean z;
        lr lrVar;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(!this.c)) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                lrVar = this.f5155b;
                if (lrVar.f3176b >= j) {
                    return true;
                }
            } while (this.f5154a.read(lrVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // defpackage.sr
    public final String y() {
        return o(Long.MAX_VALUE);
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        if (j >= 0) {
            if (true ^ this.c) {
                lr lrVar2 = this.f5155b;
                if (lrVar2.f3176b == 0 && this.f5154a.read(lrVar2, 8192L) == -1) {
                    return -1L;
                }
                return lrVar2.read(lrVar, Math.min(j, lrVar2.f3176b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }
}
