package com.google.protobuf;

import defpackage.ln2;
import defpackage.ri3;
import defpackage.s10;
import defpackage.ti3;
import defpackage.yv1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class q extends v {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public q(byte[] bArr, int i, int i2) {
        super();
        if (bArr != null) {
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.buffer = bArr;
                this.offset = i;
                this.position = i;
                this.limit = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.protobuf.v
    public void flush() {
    }

    @Override // com.google.protobuf.v
    public final int getTotalBytesWritten() {
        return this.position - this.offset;
    }

    @Override // com.google.protobuf.v
    public final int spaceLeft() {
        return this.limit - this.position;
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public final void write(byte b2) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.v
    public final void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.v
    public final void writeByteArray(int i, byte[] bArr) throws IOException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.v
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.v
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.v
    public final void writeBytes(int i, g gVar) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(gVar);
    }

    @Override // com.google.protobuf.v
    public final void writeBytesNoTag(g gVar) throws IOException {
        writeUInt32NoTag(gVar.size());
        gVar.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public final void writeFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public final void writeFixed32NoTag(int i) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.position = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.v
    public final void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public final void writeFixed64NoTag(long j) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.position = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.v
    public final void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public final void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public final void writeLazy(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.v
    public final void writeMessage(int i, yv1 yv1Var) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(yv1Var);
    }

    @Override // com.google.protobuf.v
    public final void writeMessageNoTag(yv1 yv1Var) throws IOException {
        writeUInt32NoTag(yv1Var.getSerializedSize());
        yv1Var.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public final void writeMessageSetExtension(int i, yv1 yv1Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, yv1Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.v
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.v
    public final void writeRawMessageSetExtension(int i, g gVar) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, gVar);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.v
    public final void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.v
    public final void writeStringNoTag(String str) throws IOException {
        int i = this.position;
        try {
            int computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = v.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i2 = i + computeUInt32SizeNoTag2;
                this.position = i2;
                int encode = ti3.encode(str, this.buffer, i2, spaceLeft());
                this.position = i;
                writeUInt32NoTag((encode - i) - computeUInt32SizeNoTag2);
                this.position = encode;
            } else {
                writeUInt32NoTag(ti3.encodedLength(str));
                this.position = ti3.encode(str, this.buffer, this.position, spaceLeft());
            }
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        } catch (ri3 e2) {
            this.position = i;
            inefficientWriteStringNoTag(str, e2);
        }
    }

    @Override // com.google.protobuf.v
    public final void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(r1.makeTag(i, i2));
    }

    @Override // com.google.protobuf.v
    public final void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.v
    public final void writeUInt32NoTag(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }
        byte[] bArr2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.protobuf.v
    public final void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.v
    public final void writeUInt64NoTag(long j) throws IOException {
        boolean z;
        z = v.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z && spaceLeft() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                n1.putByte(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            n1.putByte(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }
        byte[] bArr4 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // com.google.protobuf.v
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.v
    public final void writeMessage(int i, yv1 yv1Var, ln2 ln2Var) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(((a) yv1Var).getSerializedSize(ln2Var));
        ln2Var.writeTo(yv1Var, this.wrapper);
    }

    @Override // com.google.protobuf.v
    public final void writeMessageNoTag(yv1 yv1Var, ln2 ln2Var) throws IOException {
        writeUInt32NoTag(((a) yv1Var).getSerializedSize(ln2Var));
        ln2Var.writeTo(yv1Var, this.wrapper);
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.protobuf.v, defpackage.fs
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.buffer, this.position, remaining);
            this.position += remaining;
        } catch (IndexOutOfBoundsException e) {
            throw new s10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e);
        }
    }
}
