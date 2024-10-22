package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e02 extends us {
    private final ByteBuffer buffer;

    public e02(ByteBuffer byteBuffer) {
        r0.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i, int i2) {
        if (i >= this.buffer.position() && i2 <= this.buffer.limit() && i <= i2) {
            ByteBuffer slice = this.buffer.slice();
            slice.position(i - this.buffer.position());
            slice.limit(i2 - this.buffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private Object writeReplace() {
        return g.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.g
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.g
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.g
    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.g
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.g
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.g
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (size() != gVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof e02) {
            return this.buffer.equals(((e02) obj).buffer);
        }
        if (obj instanceof ml2) {
            return obj.equals(this);
        }
        return this.buffer.equals(gVar.asReadOnlyByteBuffer());
    }

    @Override // defpackage.us
    public boolean equalsRange(g gVar, int i, int i2) {
        return substring(0, i2).equals(gVar.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.g
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // com.google.protobuf.g
    public boolean isValidUtf8() {
        return ti3.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.g
    public m newCodedInput() {
        return m.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.g
    public InputStream newInput() {
        return new d02(this);
    }

    @Override // com.google.protobuf.g
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.g
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return ti3.partialIsValidUtf8(i, this.buffer, i2, i3 + i2);
    }

    @Override // com.google.protobuf.g
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.g
    public g substring(int i, int i2) {
        try {
            return new e02(slice(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.g
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i = 0;
        }
        return new String(byteArray, i, length, charset);
    }

    @Override // com.google.protobuf.g
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.g
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i, i2);
            return;
        }
        es.write(slice(i, i2 + i), outputStream);
    }

    @Override // com.google.protobuf.g
    public void writeTo(fs fsVar) throws IOException {
        fsVar.writeLazy(this.buffer.slice());
    }
}
