package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.s42;
import defpackage.ti3;
import defpackage.xu0;
import defpackage.xv1;
import defpackage.yv1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class l extends m {
    private final long address;
    private final ByteBuffer buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private long limit;
    private long pos;
    private long startPos;

    private int bufferPos(long j) {
        return (int) (j - this.address);
    }

    public static boolean isSupported() {
        return n1.hasUnsafeByteBufferOperations();
    }

    private void recomputeBufferSizeAfterLimit() {
        long j = this.limit + this.bufferSizeAfterLimit;
        this.limit = j;
        int i = (int) (j - this.startPos);
        int i2 = this.currentLimit;
        if (i > i2) {
            int i3 = i - i2;
            this.bufferSizeAfterLimit = i3;
            this.limit = j - i3;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private int remaining() {
        return (int) (this.limit - this.pos);
    }

    private void skipRawVarint() throws IOException {
        if (remaining() >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            long j = this.pos;
            this.pos = 1 + j;
            if (n1.getByte(j) >= 0) {
                return;
            }
        }
        throw he1.malformedVarint();
    }

    private void skipRawVarintSlowPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw he1.malformedVarint();
    }

    private ByteBuffer slice(long j, long j2) throws IOException {
        int position = this.buffer.position();
        int limit = this.buffer.limit();
        ByteBuffer byteBuffer = this.buffer;
        try {
            try {
                byteBuffer.position(bufferPos(j));
                byteBuffer.limit(bufferPos(j2));
                return this.buffer.slice();
            } catch (IllegalArgumentException e) {
                he1 truncatedMessage = he1.truncatedMessage();
                truncatedMessage.initCause(e);
                throw truncatedMessage;
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    @Override // com.google.protobuf.m
    public void checkLastTagWas(int i) throws he1 {
        if (this.lastTag == i) {
        } else {
            throw he1.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.m
    public void enableAliasing(boolean z) {
        this.enableAliasing = z;
    }

    @Override // com.google.protobuf.m
    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.m
    public int getLastTag() {
        return this.lastTag;
    }

    @Override // com.google.protobuf.m
    public int getTotalBytesRead() {
        return (int) (this.pos - this.startPos);
    }

    @Override // com.google.protobuf.m
    public boolean isAtEnd() throws IOException {
        if (this.pos == this.limit) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.m
    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    @Override // com.google.protobuf.m
    public int pushLimit(int i) throws he1 {
        if (i >= 0) {
            int totalBytesRead = getTotalBytesRead() + i;
            int i2 = this.currentLimit;
            if (totalBytesRead <= i2) {
                this.currentLimit = totalBytesRead;
                recomputeBufferSizeAfterLimit();
                return i2;
            }
            throw he1.truncatedMessage();
        }
        throw he1.negativeSize();
    }

    @Override // com.google.protobuf.m
    public boolean readBool() throws IOException {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.m
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.m
    public ByteBuffer readByteBuffer() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (!this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = readRawVarint32;
                ByteBuffer slice = slice(j, j + j2);
                this.pos += j2;
                return slice;
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            n1.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return ByteBuffer.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return r0.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 < 0) {
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public g readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = readRawVarint32;
                ByteBuffer slice = slice(j, j + j2);
                this.pos += j2;
                return g.wrap(slice);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            n1.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return g.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return g.EMPTY;
        }
        if (readRawVarint32 < 0) {
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.m
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.m
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.m
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.m
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.m
    public void readGroup(int i, xv1 xv1Var, xu0 xu0Var) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        xv1Var.mergeFrom(this, xu0Var);
        checkLastTagWas(r1.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.m
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.m
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.m
    public void readMessage(xv1 xv1Var, xu0 xu0Var) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        xv1Var.mergeFrom(this, xu0Var);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public byte readRawByte() throws IOException {
        long j = this.pos;
        if (j != this.limit) {
            this.pos = 1 + j;
            return n1.getByte(j);
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public byte[] readRawBytes(int i) throws IOException {
        if (i >= 0 && i <= remaining()) {
            byte[] bArr = new byte[i];
            long j = this.pos;
            long j2 = i;
            slice(j, j + j2).get(bArr);
            this.pos += j2;
            return bArr;
        }
        if (i <= 0) {
            if (i == 0) {
                return r0.EMPTY_BYTE_ARRAY;
            }
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public int readRawLittleEndian32() throws IOException {
        long j = this.pos;
        if (this.limit - j >= 4) {
            this.pos = 4 + j;
            return ((n1.getByte(j + 3) & 255) << 24) | (n1.getByte(j) & 255) | ((n1.getByte(1 + j) & 255) << 8) | ((n1.getByte(2 + j) & 255) << 16);
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public long readRawLittleEndian64() throws IOException {
        long j = this.pos;
        if (this.limit - j >= 8) {
            this.pos = 8 + j;
            return ((n1.getByte(j + 7) & 255) << 56) | (n1.getByte(j) & 255) | ((n1.getByte(1 + j) & 255) << 8) | ((n1.getByte(2 + j) & 255) << 16) | ((n1.getByte(3 + j) & 255) << 24) | ((n1.getByte(4 + j) & 255) << 32) | ((n1.getByte(5 + j) & 255) << 40) | ((n1.getByte(6 + j) & 255) << 48);
        }
        throw he1.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:            if (com.google.protobuf.n1.getByte(r4) < 0) goto L34;     */
    @Override // com.google.protobuf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.pos
            long r2 = r10.limit
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L85
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.protobuf.n1.getByte(r0)
            if (r0 < 0) goto L17
            r10.pos = r4
            return r0
        L17:
            long r6 = r10.limit
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L21
            goto L85
        L21:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.n1.getByte(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2f
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L2f:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.n1.getByte(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3e
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r6 = r4
            goto L8b
        L3e:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.n1.getByte(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4e
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L4e:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.n1.getByte(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.n1.getByte(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.n1.getByte(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.n1.getByte(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.n1.getByte(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.n1.getByte(r4)
            if (r1 >= 0) goto L8b
        L85:
            long r0 = r10.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L8b:
            r10.pos = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.readRawVarint32():int");
    }

    @Override // com.google.protobuf.m
    public long readRawVarint64() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.pos;
        if (this.limit != j4) {
            long j5 = j4 + 1;
            byte b2 = n1.getByte(j4);
            if (b2 >= 0) {
                this.pos = j5;
                return b2;
            }
            if (this.limit - j5 >= 9) {
                long j6 = j5 + 1;
                int i2 = b2 ^ (n1.getByte(j5) << 7);
                if (i2 < 0) {
                    i = i2 ^ (-128);
                } else {
                    long j7 = j6 + 1;
                    int i3 = i2 ^ (n1.getByte(j6) << 14);
                    if (i3 >= 0) {
                        j = i3 ^ 16256;
                    } else {
                        j6 = j7 + 1;
                        int i4 = i3 ^ (n1.getByte(j7) << 21);
                        if (i4 < 0) {
                            i = i4 ^ (-2080896);
                        } else {
                            j7 = j6 + 1;
                            long j8 = i4 ^ (n1.getByte(j6) << 28);
                            if (j8 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = j7 + 1;
                                long j10 = j8 ^ (n1.getByte(j7) << 35);
                                if (j10 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j9 + 1;
                                    j8 = j10 ^ (n1.getByte(j9) << 42);
                                    if (j8 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = j7 + 1;
                                        j10 = j8 ^ (n1.getByte(j7) << 49);
                                        if (j10 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j9 + 1;
                                            j = (j10 ^ (n1.getByte(j9) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j11 = 1 + j7;
                                                if (n1.getByte(j7) >= 0) {
                                                    j6 = j11;
                                                    this.pos = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j10 ^ j2;
                                j6 = j9;
                                this.pos = j6;
                                return j;
                            }
                            j = j8 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.pos = j6;
                    return j;
                }
                j = i;
                this.pos = j6;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.m
    public long readRawVarint64SlowPath() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw he1.malformedVarint();
    }

    @Override // com.google.protobuf.m
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.m
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.m
    public int readSInt32() throws IOException {
        return m.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.m
    public long readSInt64() throws IOException {
        return m.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.m
    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            n1.copyMemory(this.pos, bArr, 0L, j);
            String str = new String(bArr, r0.UTF_8);
            this.pos += j;
            return str;
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 < 0) {
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public String readStringRequireUtf8() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            String decodeUtf8 = ti3.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
            this.pos += readRawVarint32;
            return decodeUtf8;
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 <= 0) {
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (r1.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw he1.invalidTag();
    }

    @Override // com.google.protobuf.m
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.m
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.m
    @Deprecated
    public void readUnknownGroup(int i, xv1 xv1Var) throws IOException {
        readGroup(i, xv1Var, xu0.getEmptyRegistry());
    }

    @Override // com.google.protobuf.m
    public void resetSizeCounter() {
        this.startPos = this.pos;
    }

    @Override // com.google.protobuf.m
    public boolean skipField(int i) throws IOException {
        int tagWireType = r1.getTagWireType(i);
        if (tagWireType == 0) {
            skipRawVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(r1.makeTag(r1.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            skipRawBytes(4);
            return true;
        }
        throw he1.invalidWireType();
    }

    @Override // com.google.protobuf.m
    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    @Override // com.google.protobuf.m
    public void skipRawBytes(int i) throws IOException {
        if (i >= 0 && i <= remaining()) {
            this.pos += i;
        } else {
            if (i < 0) {
                throw he1.negativeSize();
            }
            throw he1.truncatedMessage();
        }
    }

    private l(ByteBuffer byteBuffer, boolean z) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = byteBuffer;
        long addressOffset = n1.addressOffset(byteBuffer);
        this.address = addressOffset;
        this.limit = byteBuffer.limit() + addressOffset;
        long position = addressOffset + byteBuffer.position();
        this.pos = position;
        this.startPos = position;
        this.immutable = z;
    }

    @Override // com.google.protobuf.m
    public void skipMessage(v vVar) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, vVar));
    }

    @Override // com.google.protobuf.m
    public <T extends yv1> T readGroup(int i, s42 s42Var, xu0 xu0Var) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        T t = (T) ((h51) s42Var).parsePartialFrom((m) this, xu0Var);
        checkLastTagWas(r1.makeTag(i, 4));
        this.recursionDepth--;
        return t;
    }

    @Override // com.google.protobuf.m
    public boolean skipField(int i, v vVar) throws IOException {
        int tagWireType = r1.getTagWireType(i);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            vVar.writeUInt32NoTag(i);
            vVar.writeUInt64NoTag(readInt64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            vVar.writeUInt32NoTag(i);
            vVar.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            g readBytes = readBytes();
            vVar.writeUInt32NoTag(i);
            vVar.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            vVar.writeUInt32NoTag(i);
            skipMessage(vVar);
            int makeTag = r1.makeTag(r1.getTagFieldNumber(i), 4);
            checkLastTagWas(makeTag);
            vVar.writeUInt32NoTag(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            vVar.writeUInt32NoTag(i);
            vVar.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw he1.invalidWireType();
    }

    @Override // com.google.protobuf.m
    public <T extends yv1> T readMessage(s42 s42Var, xu0 xu0Var) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        T t = (T) ((h51) s42Var).parsePartialFrom((m) this, xu0Var);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return t;
        }
        throw he1.truncatedMessage();
    }
}
