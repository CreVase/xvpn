package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: assets/audience_network.dex */
public final class V1 implements InterfaceC0389Ga {
    public long A00;
    public long A01;
    public C0395Gg A02;
    public C0427Ho A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final H2 A09;
    public final boolean A0A;

    public V1(H2 h2, long j) {
        this(h2, j, 20480, true);
    }

    public V1(H2 h2, long j, int i, boolean z) {
        this.A09 = (H2) HI.A01(h2);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            C0436Hx.A0X(this.A06);
            this.A06 = null;
            File fileToCommit = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A4K(fileToCommit);
            } else {
                fileToCommit.delete();
            }
        } catch (Throwable th) {
            C0436Hx.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A4K(file);
            } else {
                file.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AFi(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A04);
        this.A05 = fileOutputStream;
        if (this.A07 > 0) {
            C0427Ho c0427Ho = this.A03;
            if (c0427Ho == null) {
                this.A03 = new C0427Ho(this.A05, this.A07);
            } else {
                c0427Ho.A00(fileOutputStream);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0389Ga
    public final void ADd(C0395Gg c0395Gg) throws V2 {
        if (c0395Gg.A02 == -1 && !c0395Gg.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0395Gg;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new V2(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0389Ga
    public final void close() throws V2 {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new V2(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0389Ga
    public final void write(byte[] bArr, int i, int i2) throws V2 {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i2 - i3;
                int min = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i + i3;
                this.A06.write(bArr, bytesWritten2, min);
                i3 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new V2(e);
            }
        }
    }
}
