package com.google.protobuf;

import defpackage.fs;
import defpackage.ln2;
import defpackage.ri3;
import defpackage.s10;
import defpackage.ti3;
import defpackage.yv1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class r extends p {
    private final fs out;

    public r(fs fsVar, int i) {
        super(i);
        if (fsVar != null) {
            this.out = fsVar;
            return;
        }
        throw new NullPointerException("out");
    }

    private void doFlush() throws IOException {
        this.out.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    private void flushIfNotAvailable(int i) throws IOException {
        if (this.limit - this.position < i) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.v
    public void flush() throws IOException {
        if (this.position > 0) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(byte b2) throws IOException {
        if (this.position == this.limit) {
            doFlush();
        }
        buffer(b2);
    }

    @Override // com.google.protobuf.v
    public void writeBool(int i, boolean z) throws IOException {
        flushIfNotAvailable(11);
        bufferTag(i, 0);
        buffer(z ? (byte) 1 : (byte) 0);
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
        flushIfNotAvailable(14);
        bufferTag(i, 5);
        bufferFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public void writeFixed32NoTag(int i) throws IOException {
        flushIfNotAvailable(4);
        bufferFixed32NoTag(i);
    }

    @Override // com.google.protobuf.v
    public void writeFixed64(int i, long j) throws IOException {
        flushIfNotAvailable(18);
        bufferTag(i, 1);
        bufferFixed64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeFixed64NoTag(long j) throws IOException {
        flushIfNotAvailable(8);
        bufferFixed64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeInt32(int i, int i2) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferInt32NoTag(i2);
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
        flush();
        this.out.writeLazy(bArr, i, i2);
        this.totalBytesWritten += i2;
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
        int length = str.length() * 3;
        int computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(length);
        int i = computeUInt32SizeNoTag + length;
        int i2 = this.limit;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int encode = ti3.encode(str, bArr, 0, length);
            writeUInt32NoTag(encode);
            writeLazy(bArr, 0, encode);
            return;
        }
        if (i > i2 - this.position) {
            doFlush();
        }
        int i3 = this.position;
        try {
            int computeUInt32SizeNoTag2 = v.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i4 = i3 + computeUInt32SizeNoTag2;
                this.position = i4;
                int encode2 = ti3.encode(str, this.buffer, i4, this.limit - i4);
                this.position = i3;
                int i5 = (encode2 - i3) - computeUInt32SizeNoTag2;
                bufferUInt32NoTag(i5);
                this.position = encode2;
                this.totalBytesWritten += i5;
            } else {
                int encodedLength = ti3.encodedLength(str);
                bufferUInt32NoTag(encodedLength);
                this.position = ti3.encode(str, this.buffer, this.position, encodedLength);
                this.totalBytesWritten += encodedLength;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        } catch (ri3 e2) {
            this.totalBytesWritten -= this.position - i3;
            this.position = i3;
            inefficientWriteStringNoTag(str, e2);
        }
    }

    @Override // com.google.protobuf.v
    public void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(r1.makeTag(i, i2));
    }

    @Override // com.google.protobuf.v
    public void writeUInt32(int i, int i2) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public void writeUInt32NoTag(int i) throws IOException {
        flushIfNotAvailable(5);
        bufferUInt32NoTag(i);
    }

    @Override // com.google.protobuf.v
    public void writeUInt64(int i, long j) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeUInt64NoTag(long j) throws IOException {
        flushIfNotAvailable(10);
        bufferUInt64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
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
        flush();
        this.out.write(bArr, i, i2);
        this.totalBytesWritten += i2;
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        flush();
        int remaining = byteBuffer.remaining();
        this.out.writeLazy(byteBuffer);
        this.totalBytesWritten += remaining;
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public void write(ByteBuffer byteBuffer) throws IOException {
        flush();
        int remaining = byteBuffer.remaining();
        this.out.write(byteBuffer);
        this.totalBytesWritten += remaining;
    }
}
