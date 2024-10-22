package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ln2;
import defpackage.ri3;
import defpackage.s10;
import defpackage.ti3;
import defpackage.yv1;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class u extends v {
    private final long address;
    private final ByteBuffer buffer;
    private final long initialPosition;
    private final long limit;
    private final long oneVarintLimit;
    private final ByteBuffer originalBuffer;
    private long position;

    public u(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long addressOffset = n1.addressOffset(byteBuffer);
        this.address = addressOffset;
        long position = byteBuffer.position() + addressOffset;
        this.initialPosition = position;
        long limit = addressOffset + byteBuffer.limit();
        this.limit = limit;
        this.oneVarintLimit = limit - 10;
        this.position = position;
    }

    private int bufferPos(long j) {
        return (int) (j - this.address);
    }

    public static boolean isSupported() {
        return n1.hasUnsafeByteBufferOperations();
    }

    private void repositionBuffer(long j) {
    }

    @Override // com.google.protobuf.v
    public void flush() {
    }

    @Override // com.google.protobuf.v
    public int getTotalBytesWritten() {
        return (int) (this.position - this.initialPosition);
    }

    @Override // com.google.protobuf.v
    public int spaceLeft() {
        return (int) (this.limit - this.position);
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(byte b2) throws IOException {
        long j = this.position;
        if (j < this.limit) {
            this.position = 1 + j;
            n1.putByte(j, b2);
            return;
        }
        throw new s10(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
    }

    @Override // com.google.protobuf.v
    public void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.v
    public void writeByteArray(int i, byte[] bArr) throws IOException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.v
    public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.v
    public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.v
    public void writeBytes(int i, g gVar) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(gVar);
    }

    @Override // com.google.protobuf.v
    public void writeBytesNoTag(g gVar) throws IOException {
        writeUInt32NoTag(gVar.size());
        gVar.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public void writeFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public void writeFixed32NoTag(int i) throws IOException {
        this.buffer.putInt(bufferPos(this.position), i);
        this.position += 4;
    }

    @Override // com.google.protobuf.v
    public void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeFixed64NoTag(long j) throws IOException {
        this.buffer.putLong(bufferPos(this.position), j);
        this.position += 8;
    }

    @Override // com.google.protobuf.v
    public void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.v
    public void writeMessage(int i, yv1 yv1Var) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(yv1Var);
    }

    @Override // com.google.protobuf.v
    public void writeMessageNoTag(yv1 yv1Var) throws IOException {
        writeUInt32NoTag(yv1Var.getSerializedSize());
        yv1Var.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public void writeMessageSetExtension(int i, yv1 yv1Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, yv1Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.v
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.v
    public void writeRawMessageSetExtension(int i, g gVar) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, gVar);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.v
    public void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.v
    public void writeStringNoTag(String str) throws IOException {
        long j = this.position;
        try {
            int computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = v.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                ti3.encodeUtf8(str, this.buffer);
                int position = this.buffer.position() - bufferPos;
                writeUInt32NoTag(position);
                this.position += position;
            } else {
                int encodedLength = ti3.encodedLength(str);
                writeUInt32NoTag(encodedLength);
                repositionBuffer(this.position);
                ti3.encodeUtf8(str, this.buffer);
                this.position += encodedLength;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        } catch (ri3 e2) {
            this.position = j;
            repositionBuffer(j);
            inefficientWriteStringNoTag(str, e2);
        } catch (IllegalArgumentException e3) {
            throw new s10(e3);
        }
    }

    @Override // com.google.protobuf.v
    public void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(r1.makeTag(i, i2));
    }

    @Override // com.google.protobuf.v
    public void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public void writeUInt32NoTag(int i) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((i & (-128)) != 0) {
                long j = this.position;
                this.position = j + 1;
                n1.putByte(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            long j2 = this.position;
            this.position = 1 + j2;
            n1.putByte(j2, (byte) i);
            return;
        }
        while (true) {
            long j3 = this.position;
            if (j3 < this.limit) {
                if ((i & (-128)) == 0) {
                    this.position = 1 + j3;
                    n1.putByte(j3, (byte) i);
                    return;
                } else {
                    this.position = j3 + 1;
                    n1.putByte(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                throw new s10(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.v
    public void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeUInt64NoTag(long j) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((j & (-128)) != 0) {
                long j2 = this.position;
                this.position = j2 + 1;
                n1.putByte(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.position;
            this.position = 1 + j3;
            n1.putByte(j3, (byte) j);
            return;
        }
        while (true) {
            long j4 = this.position;
            if (j4 < this.limit) {
                if ((j & (-128)) == 0) {
                    this.position = 1 + j4;
                    n1.putByte(j4, (byte) j);
                    return;
                } else {
                    this.position = j4 + 1;
                    n1.putByte(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                throw new s10(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.v
    public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.v
    public void writeMessage(int i, yv1 yv1Var, ln2 ln2Var) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(yv1Var, ln2Var);
    }

    @Override // com.google.protobuf.v
    public void writeMessageNoTag(yv1 yv1Var, ln2 ln2Var) throws IOException {
        writeUInt32NoTag(((a) yv1Var).getSerializedSize(ln2Var));
        ln2Var.writeTo(yv1Var, this.wrapper);
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = i2;
            long j2 = this.limit - j;
            long j3 = this.position;
            if (j2 >= j3) {
                n1.copyMemory(bArr, i, j3, j);
                this.position += j;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        throw new s10(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            int remaining = byteBuffer.remaining();
            repositionBuffer(this.position);
            this.buffer.put(byteBuffer);
            this.position += remaining;
        } catch (BufferOverflowException e) {
            throw new s10(e);
        }
    }
}
