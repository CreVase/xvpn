package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.r0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ws extends us {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public ws(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.google.protobuf.g
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.g
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.g
    public byte byteAt(int i) {
        return this.bytes[i];
    }

    @Override // com.google.protobuf.g
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.g
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.g
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof ws) {
            ws wsVar = (ws) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = wsVar.peekCachedHashCode();
            if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
                return false;
            }
            return equalsRange(wsVar, 0, size());
        }
        return obj.equals(this);
    }

    @Override // defpackage.us
    public final boolean equalsRange(g gVar, int i, int i2) {
        if (i2 <= gVar.size()) {
            int i3 = i + i2;
            if (i3 <= gVar.size()) {
                if (gVar instanceof ws) {
                    ws wsVar = (ws) gVar;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = wsVar.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i2;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = wsVar.getOffsetIntoBytes() + i;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
                return gVar.substring(i, i3).equals(substring(0, i2));
            }
            StringBuilder t = hx2.t("Ran off end of other: ", i, ", ", i2, ", ");
            t.append(gVar.size());
            throw new IllegalArgumentException(t.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + size());
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    @Override // com.google.protobuf.g
    public byte internalByteAt(int i) {
        return this.bytes[i];
    }

    @Override // com.google.protobuf.g
    public final boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return ti3.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    @Override // com.google.protobuf.g
    public final m newCodedInput() {
        return m.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
    }

    @Override // com.google.protobuf.g
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.g
    public final int partialHash(int i, int i2, int i3) {
        return r0.partialHash(i, this.bytes, getOffsetIntoBytes() + i2, i3);
    }

    @Override // com.google.protobuf.g
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        return ti3.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
    }

    @Override // com.google.protobuf.g
    public int size() {
        return this.bytes.length;
    }

    @Override // com.google.protobuf.g
    public final g substring(int i, int i2) {
        int checkRange = g.checkRange(i, i2, size());
        if (checkRange == 0) {
            return g.EMPTY;
        }
        return new ps(this.bytes, getOffsetIntoBytes() + i, checkRange);
    }

    @Override // com.google.protobuf.g
    public final String toStringInternal(Charset charset) {
        return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
    }

    @Override // com.google.protobuf.g
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.g
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
    }

    @Override // com.google.protobuf.g
    public final void writeTo(fs fsVar) throws IOException {
        fsVar.writeLazy(this.bytes, getOffsetIntoBytes(), size());
    }
}
