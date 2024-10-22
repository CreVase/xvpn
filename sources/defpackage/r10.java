package defpackage;

import com.google.protobuf.q;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class r10 extends q {
    private final ByteBuffer byteBuffer;
    private int initialPosition;

    public r10(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.byteBuffer = byteBuffer;
        this.initialPosition = byteBuffer.position();
    }

    @Override // com.google.protobuf.q, com.google.protobuf.v
    public void flush() {
    }
}
