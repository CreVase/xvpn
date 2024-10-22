package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class CD {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C7 A04;
    public CM A05;
    public final InterfaceC0288Bm A06;
    public final CO A07 = new CO();
    public final C0420Hh A09 = new C0420Hh(1);
    public final C0420Hh A08 = new C0420Hh();

    public CD(InterfaceC0288Bm interfaceC0288Bm) {
        this.A06 = interfaceC0288Bm;
    }

    private CN A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            CO co = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return co.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0420Hh c0420Hh = this.A07.A09;
        CN encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c0420Hh.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0420Hh.A0Z(c0420Hh.A0I() * 6);
        }
    }

    public final int A03() {
        C0420Hh c0420Hh;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        CN A00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = "c";
        if (A00.A00 != 0) {
            c0420Hh = this.A07.A09;
            vectorSize = A00.A00;
        } else {
            byte[] bArr = A00.A04;
            this.A08.A0b(bArr, bArr.length);
            c0420Hh = this.A08;
            vectorSize = bArr.length;
        }
        boolean subsampleEncryption = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((subsampleEncryption ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        this.A06.AEr(this.A09, 1);
        this.A06.AEr(c0420Hh, vectorSize);
        if (!subsampleEncryption) {
            return vectorSize + 1;
        }
        C0420Hh c0420Hh2 = this.A07.A09;
        int A0I = c0420Hh2.A0I();
        c0420Hh2.A0Z(-2);
        int i = (A0I * 6) + 2;
        this.A06.AEr(c0420Hh2, i);
        return vectorSize + 1 + i;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long A01 = C9E.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < A01; i++) {
            if (this.A07.A0I[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        CN encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5j(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(CM cm, C7 c7) {
        this.A05 = (CM) HI.A01(cm);
        this.A04 = (C7) HI.A01(c7);
        this.A06.A5j(cm.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i = this.A00 + 1;
        this.A00 = i;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i != iArr[i2]) {
            return true;
        }
        this.A02 = i2 + 1;
        this.A00 = 0;
        return false;
    }
}
