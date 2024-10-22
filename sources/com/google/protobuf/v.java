package com.google.protobuf;

import defpackage.bj1;
import defpackage.fs;
import defpackage.ln2;
import defpackage.r10;
import defpackage.ri3;
import defpackage.s10;
import defpackage.ti3;
import defpackage.yv1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class v extends fs {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    x wrapper;
    private static final Logger logger = Logger.getLogger(v.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = n1.hasUnsafeArrayOperations();

    public static int computeBoolSize(int i, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, g gVar) {
        return computeBytesSizeNoTag(gVar) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(g gVar) {
        return computeLengthDelimitedFieldSize(gVar.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeDoubleSizeNoTag(d) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeEnumSizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, yv1 yv1Var) {
        return yv1Var.getSerializedSize() + (computeTagSize(i) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(yv1 yv1Var) {
        return yv1Var.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeUInt32SizeNoTag(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, bj1 bj1Var) {
        return computeLazyFieldSize(3, bj1Var) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i, bj1 bj1Var) {
        return computeLazyFieldSizeNoTag(bj1Var) + computeTagSize(i);
    }

    public static int computeLazyFieldSizeNoTag(bj1 bj1Var) {
        return computeLengthDelimitedFieldSize(bj1Var.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public static int computeMessageSetExtensionSize(int i, yv1 yv1Var) {
        return computeMessageSize(3, yv1Var) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i, yv1 yv1Var) {
        return computeMessageSizeNoTag(yv1Var) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(yv1 yv1Var) {
        return computeLengthDelimitedFieldSize(yv1Var.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i) {
        return i > 4096 ? DEFAULT_BUFFER_SIZE : i;
    }

    public static int computeRawMessageSetExtensionSize(int i, g gVar) {
        return computeBytesSize(3, gVar) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeSFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeSFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeSInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = ti3.encodedLength(str);
        } catch (ri3 unused) {
            length = str.getBytes(r0.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(r1.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeUInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeUInt32SizeNoTag(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeUInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static v newInstance(OutputStream outputStream) {
        return newInstance(outputStream, DEFAULT_BUFFER_SIZE);
    }

    public static v newSafeInstance(ByteBuffer byteBuffer) {
        return new t(byteBuffer);
    }

    public static v newUnsafeInstance(ByteBuffer byteBuffer) {
        return new u(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, ri3 ri3Var) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ri3Var);
        byte[] bytes = str.getBytes(r0.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new s10(e);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // defpackage.fs
    public abstract void write(byte b2) throws IOException;

    @Override // defpackage.fs
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // defpackage.fs
    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i, g gVar) throws IOException;

    public abstract void writeBytesNoTag(g gVar) throws IOException;

    public final void writeDouble(int i, double d) throws IOException {
        writeFixed64(i, Double.doubleToRawLongBits(d));
    }

    public final void writeDoubleNoTag(double d) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2) throws IOException;

    public abstract void writeFixed32NoTag(int i) throws IOException;

    public abstract void writeFixed64(int i, long j) throws IOException;

    public abstract void writeFixed64NoTag(long j) throws IOException;

    public final void writeFloat(int i, float f) throws IOException {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int i, yv1 yv1Var) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(yv1Var);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(yv1 yv1Var) throws IOException {
        yv1Var.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2) throws IOException;

    public abstract void writeInt32NoTag(int i) throws IOException;

    public final void writeInt64(int i, long j) throws IOException {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    @Override // defpackage.fs
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // defpackage.fs
    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeMessage(int i, yv1 yv1Var) throws IOException;

    public abstract void writeMessage(int i, yv1 yv1Var, ln2 ln2Var) throws IOException;

    public abstract void writeMessageNoTag(yv1 yv1Var) throws IOException;

    public abstract void writeMessageNoTag(yv1 yv1Var, ln2 ln2Var) throws IOException;

    public abstract void writeMessageSetExtension(int i, yv1 yv1Var) throws IOException;

    public final void writeRawByte(byte b2) throws IOException {
        write(b2);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, g gVar) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i) throws IOException {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void writeUInt32(int i, int i2) throws IOException;

    public abstract void writeUInt32NoTag(int i) throws IOException;

    public abstract void writeUInt64(int i, long j) throws IOException;

    public abstract void writeUInt64NoTag(long j) throws IOException;

    private v() {
    }

    @Deprecated
    public static int computeGroupSize(int i, yv1 yv1Var, ln2 ln2Var) {
        return computeGroupSizeNoTag(yv1Var, ln2Var) + (computeTagSize(i) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(yv1 yv1Var, ln2 ln2Var) {
        return ((a) yv1Var).getSerializedSize(ln2Var);
    }

    public static int computeMessageSize(int i, yv1 yv1Var, ln2 ln2Var) {
        return computeMessageSizeNoTag(yv1Var, ln2Var) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(yv1 yv1Var, ln2 ln2Var) {
        return computeLengthDelimitedFieldSize(((a) yv1Var).getSerializedSize(ln2Var));
    }

    public static v newInstance(OutputStream outputStream, int i) {
        return new s(outputStream, i);
    }

    @Deprecated
    public final void writeGroupNoTag(yv1 yv1Var, ln2 ln2Var) throws IOException {
        ln2Var.writeTo(yv1Var, this.wrapper);
    }

    public final void writeRawByte(int i) throws IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public static v newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(g gVar) throws IOException {
        gVar.writeTo(this);
    }

    public static v newInstance(byte[] bArr, int i, int i2) {
        return new q(bArr, i, i2);
    }

    @Deprecated
    public final void writeGroup(int i, yv1 yv1Var, ln2 ln2Var) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(yv1Var, ln2Var);
        writeTag(i, 4);
    }

    public static v newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new r10(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (u.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static v newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    public static v newInstance(fs fsVar, int i) {
        if (i >= 0) {
            return new r(fsVar, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
