package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class wg2 implements rr {

    /* renamed from: a, reason: collision with root package name */
    public final dw2 f5003a;

    /* renamed from: b, reason: collision with root package name */
    public final lr f5004b = new lr();
    public boolean c;

    public wg2(dw2 dw2Var) {
        this.f5003a = dw2Var;
    }

    @Override // defpackage.rr
    public final rr B(int i, byte[] bArr, int i2) {
        if (!this.c) {
            this.f5004b.T(i, bArr, i2);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr G(long j) {
        if (!this.c) {
            this.f5004b.W(j);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void a(int i) {
        if (!this.c) {
            this.f5004b.Y(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            m();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final lr b() {
        return this.f5004b;
    }

    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dw2 dw2Var = this.f5003a;
        if (!this.c) {
            try {
                lr lrVar = this.f5004b;
                long j = lrVar.f3176b;
                if (j > 0) {
                    dw2Var.write(lrVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                dw2Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.c = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    @Override // defpackage.rr
    public final rr f() {
        if (!this.c) {
            lr lrVar = this.f5004b;
            long j = lrVar.f3176b;
            if (j > 0) {
                this.f5003a.write(lrVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr, defpackage.dw2, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            lr lrVar = this.f5004b;
            long j = lrVar.f3176b;
            dw2 dw2Var = this.f5003a;
            if (j > 0) {
                dw2Var.write(lrVar, j);
            }
            dw2Var.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr g(int i) {
        if (!this.c) {
            this.f5004b.a0(i);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr h(int i) {
        if (!this.c) {
            this.f5004b.Y(i);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.rr
    public final rr k(int i) {
        if (!this.c) {
            this.f5004b.V(i);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final long l(mx2 mx2Var) {
        long j = 0;
        while (true) {
            long read = ((wg) mx2Var).read(this.f5004b, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            m();
        }
    }

    @Override // defpackage.rr
    public final rr m() {
        if (!this.c) {
            lr lrVar = this.f5004b;
            long d = lrVar.d();
            if (d > 0) {
                this.f5003a.write(lrVar, d);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr p(String str) {
        if (!this.c) {
            this.f5004b.d0(str);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr r(at atVar) {
        if (!this.c) {
            lr lrVar = this.f5004b;
            lrVar.getClass();
            atVar.k(lrVar, atVar.c());
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr t(long j) {
        if (!this.c) {
            this.f5004b.X(j);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.dw2
    public final d93 timeout() {
        return this.f5003a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f5003a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.c) {
            int write = this.f5004b.write(byteBuffer);
            m();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.rr
    public final rr z(byte[] bArr) {
        if (!this.c) {
            lr lrVar = this.f5004b;
            lrVar.getClass();
            lrVar.T(0, bArr, bArr.length);
            m();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        if (!this.c) {
            this.f5004b.write(lrVar, j);
            m();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
