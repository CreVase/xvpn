package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.Ol, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0601Ol extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0391Gc A02;
    public final Uri A03;
    public final Y9 A04;
    public final InterfaceC0390Gb A05;
    public final String A06;

    public C0601Ol(Y9 y9, Uri uri, InterfaceC0390Gb interfaceC0390Gb) throws IOException {
        this.A04 = y9;
        this.A05 = interfaceC0390Gb;
        this.A03 = uri;
        this.A06 = QN.A08(y9, uri);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC0391Gc interfaceC0391Gc = this.A02;
        if (interfaceC0391Gc != null) {
            interfaceC0391Gc.close();
        }
        this.A02 = this.A05.A4U();
        this.A01 = (int) this.A02.ADb(new C0395Gg(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b2 = new byte[1];
        return read(b2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01;
        int i = this.A00;
        long skipped = j2 - i;
        if (skipped <= 0) {
            return 0L;
        }
        if (j > skipped) {
            j = skipped;
        }
        int i2 = (int) (i + j);
        this.A00 = i2;
        A00(i2);
        return j;
    }
}
