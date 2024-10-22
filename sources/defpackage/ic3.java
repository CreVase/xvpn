package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ic3 extends ln {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = wi3.f;
    public int n;
    public long o;

    @Override // defpackage.ln, defpackage.zh
    public final ByteBuffer b() {
        int i;
        if (super.f() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // defpackage.zh
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.f3158b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer l = l(length);
        int i3 = wi3.i(length, 0, this.n);
        l.put(this.m, 0, i3);
        int i4 = wi3.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        l.flip();
    }

    @Override // defpackage.ln, defpackage.zh
    public final boolean f() {
        if (super.f() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ln
    public final xh h(xh xhVar) {
        if (xhVar.c == 2) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return xh.e;
            }
            return xhVar;
        }
        throw new yh(xhVar);
    }

    @Override // defpackage.ln
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.f3158b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.ln
    public final void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.f3158b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.ln
    public final void k() {
        this.m = wi3.f;
    }
}
