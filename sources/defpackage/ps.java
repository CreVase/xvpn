package defpackage;

import com.google.protobuf.g;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class ps extends ws {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public ps(byte[] bArr, int i, int i2) {
        super(bArr);
        g.checkRange(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ws, com.google.protobuf.g
    public byte byteAt(int i) {
        g.checkIndex(i, size());
        return this.bytes[this.bytesOffset + i];
    }

    @Override // defpackage.ws, com.google.protobuf.g
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // defpackage.ws
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // defpackage.ws, com.google.protobuf.g
    public byte internalByteAt(int i) {
        return this.bytes[this.bytesOffset + i];
    }

    @Override // defpackage.ws, com.google.protobuf.g
    public int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        return g.wrap(toByteArray());
    }
}
