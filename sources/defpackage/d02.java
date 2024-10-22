package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes2.dex */
public final class d02 extends InputStream {
    private final ByteBuffer buf;
    final /* synthetic */ e02 this$0;

    public d02(e02 e02Var) {
        ByteBuffer byteBuffer;
        this.this$0 = e02Var;
        byteBuffer = e02Var.buffer;
        this.buf = byteBuffer.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.buf.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.buf.hasRemaining()) {
            return this.buf.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
        } catch (InvalidMarkException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.buf.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.buf.remaining());
        this.buf.get(bArr, i, min);
        return min;
    }
}
