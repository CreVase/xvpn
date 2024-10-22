package defpackage;

import java.io.BufferedInputStream;

/* loaded from: classes.dex */
public final class dt0 extends zs0 {
    public dt0(byte[] bArr) {
        super(bArr);
        this.f5539a.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.f5539a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public dt0(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        if (bufferedInputStream.markSupported()) {
            this.f5539a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
