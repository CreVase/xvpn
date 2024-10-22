package com.google.protobuf;

import defpackage.he1;
import defpackage.hx2;
import defpackage.s42;
import defpackage.ue1;
import defpackage.xu0;
import defpackage.xv1;
import defpackage.yv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class m {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    o wrapper;

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static m newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw he1.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw he1.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw he1.malformedVarint();
    }

    public abstract void checkLastTagWas(int i) throws he1;

    public void checkRecursionLimit() throws he1 {
        if (this.recursionDepth < this.recursionLimit) {
        } else {
            throw he1.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws he1;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract g readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends yv1> T readGroup(int i, s42 s42Var, xu0 xu0Var) throws IOException;

    public abstract void readGroup(int i, xv1 xv1Var, xu0 xu0Var) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends yv1> T readMessage(s42 s42Var, xu0 xu0Var) throws IOException;

    public abstract void readMessage(xv1 xv1Var, xu0 xu0Var) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, xv1 xv1Var) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.recursionLimit;
            this.recursionLimit = i;
            return i2;
        }
        throw new IllegalArgumentException(hx2.m("Recursion limit cannot be negative: ", i));
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException(hx2.m("Size limit cannot be negative: ", i));
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, v vVar) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(v vVar) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private m() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static m newInstance(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(r0.EMPTY_BYTE_ARRAY);
        }
        return new k(inputStream, i);
    }

    public static m newInstance(Iterable<ByteBuffer> iterable) {
        if (!l.isSupported()) {
            return newInstance(new ue1(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw he1.truncatedMessage();
    }

    public static m newInstance(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new j(iterable, i2, z);
        }
        return newInstance(new ue1(iterable));
    }

    public static m newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static m newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    public static m newInstance(byte[] bArr, int i, int i2, boolean z) {
        i iVar = new i(bArr, i, i2, z);
        try {
            iVar.pushLimit(i2);
            return iVar;
        } catch (he1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static m newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static m newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && l.isSupported()) {
            return new l(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
