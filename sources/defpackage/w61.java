package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class w61 implements mx2 {

    /* renamed from: a, reason: collision with root package name */
    public byte f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final xg2 f4949b;
    public final Inflater c;
    public final fc1 d;
    public final CRC32 e;

    public w61(mx2 mx2Var) {
        xg2 xg2Var = new xg2(mx2Var);
        this.f4949b = xg2Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new fc1(xg2Var, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) {
        if (i2 == i) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void c(long j, lr lrVar, long j2) {
        so2 so2Var = lrVar.f3175a;
        while (true) {
            int i = so2Var.c;
            int i2 = so2Var.f4387b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            so2Var = so2Var.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(so2Var.c - r6, j2);
            this.e.update(so2Var.f4386a, (int) (so2Var.f4387b + j), min);
            j2 -= min;
            so2Var = so2Var.f;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        boolean z;
        xg2 xg2Var;
        boolean z2;
        xg2 xg2Var2;
        lr lrVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == 0) {
                return 0L;
            }
            byte b2 = this.f4948a;
            CRC32 crc32 = this.e;
            xg2 xg2Var3 = this.f4949b;
            if (b2 == 0) {
                xg2Var3.F(10L);
                lr lrVar3 = xg2Var3.f5155b;
                byte x = lrVar3.x(3L);
                if (((x >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    xg2Var2 = xg2Var3;
                    lrVar2 = lrVar3;
                    c(0L, xg2Var3.f5155b, 10L);
                } else {
                    xg2Var2 = xg2Var3;
                    lrVar2 = lrVar3;
                }
                a(8075, xg2Var2.readShort(), "ID1ID2");
                xg2 xg2Var4 = xg2Var2;
                xg2Var4.skip(8L);
                if (((x >> 2) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    xg2Var4.F(2L);
                    if (z2) {
                        xg2Var = xg2Var4;
                        c(0L, xg2Var4.f5155b, 2L);
                    } else {
                        xg2Var = xg2Var4;
                    }
                    int readShort = lrVar2.readShort() & 65535;
                    long j3 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    xg2Var.F(j3);
                    if (z2) {
                        c(0L, xg2Var.f5155b, j3);
                        j2 = j3;
                    } else {
                        j2 = j3;
                    }
                    xg2Var.skip(j2);
                } else {
                    xg2Var = xg2Var4;
                }
                if (((x >> 3) & 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    long a2 = xg2Var.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z2) {
                            c(0L, xg2Var.f5155b, a2 + 1);
                        }
                        xg2Var.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((x >> 4) & 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    long a3 = xg2Var.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a3 != -1) {
                        if (z2) {
                            c(0L, xg2Var.f5155b, a3 + 1);
                        }
                        xg2Var.skip(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    xg2Var.F(2L);
                    int readShort2 = lrVar2.readShort() & 65535;
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f4948a = (byte) 1;
            } else {
                xg2Var = xg2Var3;
            }
            if (this.f4948a == 1) {
                long j4 = lrVar.f3176b;
                long read = this.d.read(lrVar, j);
                if (read != -1) {
                    c(j4, lrVar, read);
                    return read;
                }
                this.f4948a = (byte) 2;
            }
            if (this.f4948a == 2) {
                xg2Var.F(4L);
                int readInt = xg2Var.f5155b.readInt();
                a(((readInt & 255) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) crc32.getValue(), "CRC");
                xg2Var.F(4L);
                int readInt2 = xg2Var.f5155b.readInt();
                a(((readInt2 & 255) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & 65280) << 8), (int) this.c.getBytesWritten(), "ISIZE");
                this.f4948a = (byte) 3;
                if (!xg2Var.j()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        return this.f4949b.timeout();
    }
}
