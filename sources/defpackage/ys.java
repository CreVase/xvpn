package defpackage;

import com.google.protobuf.g;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ys extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] buffer;
    private int bufferPos;
    private final ArrayList<g> flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    public ys(int i) {
        if (i >= 0) {
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer size < 0");
    }

    private byte[] copyArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    private void flushFullBuffer(int i) {
        this.flushedBuffers.add(new ws(this.buffer));
        int length = this.flushedBuffersTotalBytes + this.buffer.length;
        this.flushedBuffersTotalBytes = length;
        this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
        this.bufferPos = 0;
    }

    private void flushLastBuffer() {
        int i = this.bufferPos;
        byte[] bArr = this.buffer;
        if (i < bArr.length) {
            if (i > 0) {
                this.flushedBuffers.add(new ws(copyArray(bArr, i)));
            }
        } else {
            this.flushedBuffers.add(new ws(this.buffer));
            this.buffer = EMPTY_BYTE_ARRAY;
        }
        this.flushedBuffersTotalBytes += this.bufferPos;
        this.bufferPos = 0;
    }

    public synchronized void reset() {
        this.flushedBuffers.clear();
        this.flushedBuffersTotalBytes = 0;
        this.bufferPos = 0;
    }

    public synchronized int size() {
        return this.flushedBuffersTotalBytes + this.bufferPos;
    }

    public synchronized g toByteString() {
        flushLastBuffer();
        return g.copyFrom(this.flushedBuffers);
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.bufferPos == this.buffer.length) {
            flushFullBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.bufferPos;
        this.bufferPos = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        g[] gVarArr;
        byte[] bArr;
        int i;
        synchronized (this) {
            ArrayList<g> arrayList = this.flushedBuffers;
            gVarArr = (g[]) arrayList.toArray(new g[arrayList.size()]);
            bArr = this.buffer;
            i = this.bufferPos;
        }
        for (g gVar : gVarArr) {
            gVar.writeTo(outputStream);
        }
        outputStream.write(copyArray(bArr, i));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.buffer;
        int length = bArr2.length;
        int i3 = this.bufferPos;
        if (i2 <= length - i3) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.bufferPos += i2;
        } else {
            int length2 = bArr2.length - i3;
            System.arraycopy(bArr, i, bArr2, i3, length2);
            int i4 = i2 - length2;
            flushFullBuffer(i4);
            System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
            this.bufferPos = i4;
        }
    }
}
