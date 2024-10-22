package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ve0 extends mr {
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final fc0 c = new fc0();
    public final int i = 0;

    static {
        iu0.a("goog.exo.decoder");
    }

    public ve0(int i) {
        this.h = i;
    }

    public void i() {
        this.f3342b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer j(int i) {
        int capacity;
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new ue0(capacity, i);
    }

    public final void k(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = j(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer j = j(i3);
        j.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j.put(byteBuffer);
        }
        this.d = j;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
