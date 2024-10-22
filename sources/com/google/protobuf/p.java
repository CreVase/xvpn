package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class p extends v {
    final byte[] buffer;
    final int limit;
    int position;
    int totalBytesWritten;

    public p(int i) {
        super();
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void buffer(byte b2) {
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b2;
        this.totalBytesWritten++;
    }

    public final void bufferFixed32NoTag(int i) {
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
        this.totalBytesWritten += 4;
    }

    public final void bufferFixed64NoTag(long j) {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.position = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.totalBytesWritten += 8;
    }

    public final void bufferInt32NoTag(int i) {
        if (i >= 0) {
            bufferUInt32NoTag(i);
        } else {
            bufferUInt64NoTag(i);
        }
    }

    public final void bufferTag(int i, int i2) {
        bufferUInt32NoTag(r1.makeTag(i, i2));
    }

    public final void bufferUInt32NoTag(int i) {
        boolean z;
        z = v.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z) {
            long j = this.position;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                n1.putByte(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            n1.putByte(bArr2, i3, (byte) i);
            this.totalBytesWritten += (int) (this.position - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.totalBytesWritten++;
            i >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i5 = this.position;
        this.position = i5 + 1;
        bArr4[i5] = (byte) i;
        this.totalBytesWritten++;
    }

    public final void bufferUInt64NoTag(long j) {
        boolean z;
        z = v.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z) {
            long j2 = this.position;
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
            this.totalBytesWritten += (int) (this.position - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.totalBytesWritten++;
            j >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        bArr4[i4] = (byte) j;
        this.totalBytesWritten++;
    }

    @Override // com.google.protobuf.v
    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // com.google.protobuf.v
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
