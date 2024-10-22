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
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i extends m {
    private final byte[] buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private int limit;
    private int pos;
    private int startPos;

    private void recomputeBufferSizeAfterLimit() {
        int i = this.limit + this.bufferSizeAfterLimit;
        this.limit = i;
        int i2 = i - this.startPos;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.bufferSizeAfterLimit = i4;
            this.limit = i - i4;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void skipRawVarint() throws IOException {
        if (this.limit - this.pos >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 + 1;
            if (bArr[i2] >= 0) {
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
        return this.pos - this.startPos;
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
            if (totalBytesRead >= 0) {
                int i2 = this.currentLimit;
                if (totalBytesRead <= i2) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i2;
                }
                throw he1.truncatedMessage();
            }
            throw he1.parseFailure();
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
        ByteBuffer wrap;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2) {
                if (!this.immutable && this.enableAliasing) {
                    wrap = ByteBuffer.wrap(this.buffer, i2, readRawVarint32).slice();
                } else {
                    wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32));
                }
                this.pos += readRawVarint32;
                return wrap;
            }
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
        g copyFrom;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2) {
                if (this.immutable && this.enableAliasing) {
                    copyFrom = g.wrap(this.buffer, i2, readRawVarint32);
                } else {
                    copyFrom = g.copyFrom(this.buffer, i2, readRawVarint32);
                }
                this.pos += readRawVarint32;
                return copyFrom;
            }
        }
        if (readRawVarint32 == 0) {
            return g.EMPTY;
        }
        return g.wrap(readRawBytes(readRawVarint32));
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
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public byte[] readRawBytes(int i) throws IOException {
        if (i > 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.pos = i4;
                return Arrays.copyOfRange(this.buffer, i3, i4);
            }
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
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw he1.truncatedMessage();
    }

    @Override // com.google.protobuf.m
    public long readRawLittleEndian64() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw he1.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:            if (r2[r3] < 0) goto L34;     */
    @Override // com.google.protobuf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 != r0) goto L7
            goto L6a
        L7:
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.pos = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r3
            goto L70
        L31:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L70:
            r5.pos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.readRawVarint32():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:            if (r2[r0] < 0) goto L40;     */
    @Override // com.google.protobuf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.readRawVarint64():long");
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
        if (readRawVarint32 > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2) {
                String str = new String(this.buffer, i2, readRawVarint32, r0.UTF_8);
                this.pos += readRawVarint32;
                return str;
            }
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
        if (readRawVarint32 > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2) {
                String decodeUtf8 = ti3.decodeUtf8(this.buffer, i2, readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
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
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw he1.negativeSize();
        }
        throw he1.truncatedMessage();
    }

    private i(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.startPos = i;
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
