package com.google.protobuf;

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
public final class t extends v {
    private final ByteBuffer buffer;
    private final int initialPosition;
    private final ByteBuffer originalBuffer;

    public t(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.initialPosition = byteBuffer.position();
    }

    private void encode(String str) throws IOException {
        try {
            ti3.encodeUtf8(str, this.buffer);
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        }
    }

    @Override // com.google.protobuf.v
    public void flush() {
    }

    @Override // com.google.protobuf.v
    public int getTotalBytesWritten() {
        return this.buffer.position() - this.initialPosition;
    }

    @Override // com.google.protobuf.v
    public int spaceLeft() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(byte b2) throws IOException {
        try {
            this.buffer.put(b2);
        } catch (BufferOverflowException e) {
            throw new s10(e);
        }
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
        try {
            this.buffer.putInt(i);
        } catch (BufferOverflowException e) {
            throw new s10(e);
        }
    }

    @Override // com.google.protobuf.v
    public void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeFixed64NoTag(long j) throws IOException {
        try {
            this.buffer.putLong(j);
        } catch (BufferOverflowException e) {
            throw new s10(e);
        }
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
        int position = this.buffer.position();
        try {
            int computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = v.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                encode(str);
                int position3 = this.buffer.position();
                writeUInt32NoTag(position3 - position2);
            } else {
                writeUInt32NoTag(ti3.encodedLength(str));
                encode(str);
            }
        } catch (ri3 e) {
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new s10(e2);
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
        while ((i & (-128)) != 0) {
            try {
                this.buffer.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new s10(e);
            }
        }
        this.buffer.put((byte) i);
    }

    @Override // com.google.protobuf.v
    public void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeUInt64NoTag(long j) throws IOException {
        while (((-128) & j) != 0) {
            try {
                this.buffer.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new s10(e);
            }
        }
        this.buffer.put((byte) j);
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

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.buffer.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        } catch (BufferOverflowException e2) {
            throw new s10(e2);
        }
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
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.buffer.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new s10(e);
        }
    }
}
