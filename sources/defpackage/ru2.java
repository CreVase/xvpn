package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ru2 extends ln {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public ru2() {
        byte[] bArr = wi3.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // defpackage.ln, defpackage.zh
    public final boolean a() {
        return this.m;
    }

    @Override // defpackage.zh
    public final void c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int limit = byteBuffer.limit();
                        int m = m(byteBuffer);
                        byteBuffer.limit(m);
                        this.t += byteBuffer.remaining() / this.l;
                        o(byteBuffer, this.o, this.r);
                        if (m < limit) {
                            n(this.r, this.o);
                            this.p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m2 = m(byteBuffer);
                    int position2 = m2 - byteBuffer.position();
                    byte[] bArr = this.n;
                    int length = bArr.length;
                    int i2 = this.q;
                    int i3 = length - i2;
                    if (m2 < limit2 && position2 < i3) {
                        n(i2, bArr);
                        this.q = 0;
                        this.p = 0;
                    } else {
                        int min = Math.min(position2, i3);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.n, this.q, min);
                        int i4 = this.q + min;
                        this.q = i4;
                        byte[] bArr2 = this.n;
                        if (i4 == bArr2.length) {
                            if (this.s) {
                                n(this.r, bArr2);
                                this.t += (this.q - (this.r * 2)) / this.l;
                            } else {
                                this.t += (i4 - this.r) / this.l;
                            }
                            o(byteBuffer, this.n, this.q);
                            this.q = 0;
                            this.p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.k) {
                            int i5 = this.l;
                            position = ((limit4 / i5) * i5) + i5;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // defpackage.ln
    public final xh h(xh xhVar) {
        if (xhVar.c == 2) {
            if (!this.m) {
                return xh.e;
            }
            return xhVar;
        }
        throw new yh(xhVar);
    }

    @Override // defpackage.ln
    public final void i() {
        if (this.m) {
            xh xhVar = this.f3158b;
            int i = xhVar.d;
            this.l = i;
            int i2 = xhVar.f5157a;
            int i3 = ((int) ((this.i * i2) / 1000000)) * i;
            if (this.n.length != i3) {
                this.n = new byte[i3];
            }
            int i4 = ((int) ((this.j * i2) / 1000000)) * i;
            this.r = i4;
            if (this.o.length != i4) {
                this.o = new byte[i4];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // defpackage.ln
    public final void j() {
        int i = this.q;
        if (i > 0) {
            n(i, this.n);
        }
        if (!this.s) {
            this.t += this.r / this.l;
        }
    }

    @Override // defpackage.ln
    public final void k() {
        this.m = false;
        this.r = 0;
        byte[] bArr = wi3.f;
        this.n = bArr;
        this.o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i = this.l;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(int i, byte[] bArr) {
        l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - min;
        System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i2, min);
    }
}
