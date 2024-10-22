package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bz0 extends ln {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // defpackage.zh
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f3158b.c;
        int i4 = i;
        if (i3 != 536870912) {
            if (i3 == 805306368) {
                l = l(i2);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i4) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    l.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            l = l((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                l.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l.flip();
    }

    @Override // defpackage.ln
    public final xh h(xh xhVar) {
        boolean z;
        int i2 = xhVar.c;
        if (i2 != 536870912 && i2 != 805306368 && i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i2 != 4) {
                return new xh(xhVar.f5157a, xhVar.f5158b, 4);
            }
            return xh.e;
        }
        throw new yh(xhVar);
    }
}
