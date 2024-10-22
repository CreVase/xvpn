package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DJ implements InterfaceC0806Wm {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public DJ(long j, long j2, Bg bg) {
        this.A04 = j2;
        this.A01 = bg.A02;
        this.A00 = bg.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j - j2;
            this.A03 = A7z(j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final long A6k() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final C0284Bi A7l(long j) {
        long j2 = this.A02;
        if (j2 == -1) {
            return new C0284Bi(new C0286Bk(0L, this.A04));
        }
        int i = this.A01;
        long A0E = C0436Hx.A0E((((this.A00 * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.A04 + A0E;
        long A7z = A7z(j3);
        C0286Bk seekPoint = new C0286Bk(A7z, j3);
        if (A7z < j) {
            long j4 = this.A02;
            int i2 = this.A01;
            if (A0E != j4 - i2) {
                long j5 = i2 + j3;
                return new C0284Bi(seekPoint, new C0286Bk(A7z(j5), j5));
            }
        }
        return new C0284Bi(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0806Wm
    public final long A7z(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final boolean A95() {
        return this.A02 != -1;
    }
}
