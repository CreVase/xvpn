package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class nw extends ln {
    public int[] i;
    public int[] j;

    @Override // defpackage.zh
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.f3158b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f3158b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // defpackage.ln
    public final xh h(xh xhVar) {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return xh.e;
        }
        if (xhVar.c == 2) {
            int length = iArr.length;
            int i = xhVar.f5158b;
            if (i != length) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 < i) {
                    if (i3 != i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new yh(xhVar);
                }
            }
            if (z) {
                return new xh(xhVar.f5157a, iArr.length, 2);
            }
            return xh.e;
        }
        throw new yh(xhVar);
    }

    @Override // defpackage.ln
    public final void i() {
        this.j = this.i;
    }

    @Override // defpackage.ln
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
