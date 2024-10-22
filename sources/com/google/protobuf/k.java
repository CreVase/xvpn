package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.m10;
import defpackage.p71;
import defpackage.s42;
import defpackage.ti3;
import defpackage.xu0;
import defpackage.xv1;
import defpackage.yv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends m {
    private final byte[] buffer;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private final InputStream input;
    private int lastTag;
    private int pos;
    private m10 refillCallback;
    private int totalBytesRetired;

    private static int available(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (he1 e) {
            e.setThrownFromInputStream();
            throw e;
        }
    }

    private static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (he1 e) {
            e.setThrownFromInputStream();
            throw e;
        }
    }

    private g readBytesSlowPath(int i) throws IOException {
        byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
        if (readRawBytesSlowPathOneChunk != null) {
            return g.copyFrom(readRawBytesSlowPathOneChunk);
        }
        int i2 = this.pos;
        int i3 = this.bufferSize;
        int i4 = i3 - i2;
        this.totalBytesRetired += i3;
        this.pos = 0;
        this.bufferSize = 0;
        List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return g.wrap(bArr);
    }

    private byte[] readRawBytesSlowPath(int i, boolean z) throws IOException {
        byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
        if (readRawBytesSlowPathOneChunk != null) {
            if (z) {
                return (byte[]) readRawBytesSlowPathOneChunk.clone();
            }
            return readRawBytesSlowPathOneChunk;
        }
        int i2 = this.pos;
        int i3 = this.bufferSize;
        int i4 = i3 - i2;
        this.totalBytesRetired += i3;
        this.pos = 0;
        this.bufferSize = 0;
        List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private byte[] readRawBytesSlowPathOneChunk(int i) throws IOException {
        if (i == 0) {
            return r0.EMPTY_BYTE_ARRAY;
        }
        if (i >= 0) {
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            int i4 = i2 + i3 + i;
            if (i4 - this.sizeLimit <= 0) {
                int i5 = this.currentLimit;
                if (i4 <= i5) {
                    int i6 = this.bufferSize - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096 && i7 > available(this.input)) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.buffer, this.pos, bArr, 0, i6);
                    this.totalBytesRetired += this.bufferSize;
                    this.pos = 0;
                    this.bufferSize = 0;
                    while (i6 < i) {
                        int read = read(this.input, bArr, i6, i - i6);
                        if (read != -1) {
                            this.totalBytesRetired += read;
                            i6 += read;
                        } else {
                            throw he1.truncatedMessage();
                        }
                    }
                    return bArr;
                }
                skipRawBytes((i5 - i2) - i3);
                throw he1.truncatedMessage();
            }
            throw he1.sizeLimitExceeded();
        }
        throw he1.negativeSize();
    }

    private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, v.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.input.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.totalBytesRetired += read;
                    i2 += read;
                } else {
                    throw he1.truncatedMessage();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.totalBytesRetired + i;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.bufferSizeAfterLimit = i4;
            this.bufferSize = i - i4;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void refillBuffer(int i) throws IOException {
        if (!tryRefillBuffer(i)) {
            if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw he1.sizeLimitExceeded();
            }
            throw he1.truncatedMessage();
        }
    }

    private static long skip(InputStream inputStream, long j) throws IOException {
        try {
            return inputStream.skip(j);
        } catch (he1 e) {
            e.setThrownFromInputStream();
            throw e;
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            int i4 = i2 + i3 + i;
            int i5 = this.currentLimit;
            if (i4 <= i5) {
                this.totalBytesRetired = i2 + i3;
                int i6 = this.bufferSize - i3;
                this.bufferSize = 0;
                this.pos = 0;
                while (i6 < i) {
                    try {
                        long j = i - i6;
                        long skip = skip(this.input, j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            } else {
                                i6 += (int) skip;
                            }
                        } else {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.totalBytesRetired += i6;
                        recomputeBufferSizeAfterLimit();
                    }
                }
                if (i6 < i) {
                    int i7 = this.bufferSize;
                    int i8 = i7 - this.pos;
                    this.pos = i7;
                    refillBuffer(1);
                    while (true) {
                        int i9 = i - i8;
                        int i10 = this.bufferSize;
                        if (i9 > i10) {
                            i8 += i10;
                            this.pos = i10;
                            refillBuffer(1);
                        } else {
                            this.pos = i9;
                            return;
                        }
                    }
                }
            } else {
                skipRawBytes((i5 - i2) - i3);
                throw he1.truncatedMessage();
            }
        } else {
            throw he1.negativeSize();
        }
    }

    private void skipRawVarint() throws IOException {
        if (this.bufferSize - this.pos >= 10) {
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

    private boolean tryRefillBuffer(int i) throws IOException {
        int i2 = this.pos;
        int i3 = i2 + i;
        int i4 = this.bufferSize;
        if (i3 > i4) {
            int i5 = this.sizeLimit;
            int i6 = this.totalBytesRetired;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.currentLimit) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.totalBytesRetired += i2;
                this.bufferSize -= i2;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i7 = this.bufferSize;
            int read = read(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.sizeLimit - this.totalBytesRetired) - i7));
            if (read != 0 && read >= -1 && read <= this.buffer.length) {
                if (read <= 0) {
                    return false;
                }
                this.bufferSize += read;
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
                return tryRefillBuffer(i);
            }
            throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(p71.k("refillBuffer() called when ", i, " bytes were already available in buffer"));
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
    }

    @Override // com.google.protobuf.m
    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.pos);
    }

    @Override // com.google.protobuf.m
    public int getLastTag() {
        return this.lastTag;
    }

    @Override // com.google.protobuf.m
    public int getTotalBytesRead() {
        return this.totalBytesRetired + this.pos;
    }

    @Override // com.google.protobuf.m
    public boolean isAtEnd() throws IOException {
        if (this.pos == this.bufferSize && !tryRefillBuffer(1)) {
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
            int i2 = this.totalBytesRetired + this.pos + i;
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.currentLimit = i2;
                recomputeBufferSizeAfterLimit();
                return i3;
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
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.pos;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32);
            this.pos += readRawVarint32;
            return copyOfRange;
        }
        return readRawBytesSlowPath(readRawVarint32, false);
    }

    @Override // com.google.protobuf.m
    public ByteBuffer readByteBuffer() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.pos;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32));
            this.pos += readRawVarint32;
            return wrap;
        }
        if (readRawVarint32 == 0) {
            return r0.EMPTY_BYTE_BUFFER;
        }
        return ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32, true));
    }

    @Override // com.google.protobuf.m
    public g readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.pos;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            g copyFrom = g.copyFrom(this.buffer, i2, readRawVarint32);
            this.pos += readRawVarint32;
            return copyFrom;
        }
        if (readRawVarint32 == 0) {
            return g.EMPTY;
        }
        return readBytesSlowPath(readRawVarint32);
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
        if (this.pos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.protobuf.m
    public byte[] readRawBytes(int i) throws IOException {
        int i2 = this.pos;
        if (i <= this.bufferSize - i2 && i > 0) {
            int i3 = i + i2;
            this.pos = i3;
            return Arrays.copyOfRange(this.buffer, i2, i3);
        }
        return readRawBytesSlowPath(i, false);
    }

    @Override // com.google.protobuf.m
    public int readRawLittleEndian32() throws IOException {
        int i = this.pos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.m
    public long readRawLittleEndian64() throws IOException {
        int i = this.pos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
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
            int r1 = r5.bufferSize
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.readRawVarint32():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.readRawVarint64():long");
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
            int i = this.bufferSize;
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
        if (readRawVarint32 <= this.bufferSize) {
            refillBuffer(readRawVarint32);
            String str2 = new String(this.buffer, this.pos, readRawVarint32, r0.UTF_8);
            this.pos += readRawVarint32;
            return str2;
        }
        return new String(readRawBytesSlowPath(readRawVarint32, false), r0.UTF_8);
    }

    @Override // com.google.protobuf.m
    public String readStringRequireUtf8() throws IOException {
        byte[] readRawBytesSlowPath;
        int readRawVarint32 = readRawVarint32();
        int i = this.pos;
        int i2 = this.bufferSize;
        if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
            readRawBytesSlowPath = this.buffer;
            this.pos = i + readRawVarint32;
        } else {
            if (readRawVarint32 == 0) {
                return "";
            }
            i = 0;
            if (readRawVarint32 <= i2) {
                refillBuffer(readRawVarint32);
                readRawBytesSlowPath = this.buffer;
                this.pos = readRawVarint32 + 0;
            } else {
                readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32, false);
            }
        }
        return ti3.decodeUtf8(readRawBytesSlowPath, i, readRawVarint32);
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
        this.totalBytesRetired = -this.pos;
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
        int i2 = this.bufferSize;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
        } else {
            skipRawBytesSlowPath(i);
        }
    }

    private k(InputStream inputStream, int i) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        r0.checkNotNull(inputStream, "input");
        this.input = inputStream;
        this.buffer = new byte[i];
        this.bufferSize = 0;
        this.pos = 0;
        this.totalBytesRetired = 0;
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
