package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class f1 extends FilterInputStream {
    private int limit;

    public f1(InputStream inputStream, int i) {
        super(inputStream);
        this.limit = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.limit);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.limit <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.limit--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int skip = (int) super.skip(Math.min(j, this.limit));
        if (skip >= 0) {
            this.limit -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.limit;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.limit -= read;
        }
        return read;
    }
}
