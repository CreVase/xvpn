package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WW implements InterfaceC0278Ba {
    public static byte[] A03;
    public static final InterfaceC0281Bd A04;
    public InterfaceC0280Bc A00;
    public CW A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new WX();
    }

    public static C0420Hh A00(C0420Hh c0420Hh) {
        c0420Hh.A0Y(0);
        return c0420Hh;
    }

    private boolean A03(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        CS cs = new CS();
        if (!cs.A03(interfaceC0279Bb, true) || (cs.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(cs.A00, 8);
        C0420Hh c0420Hh = new C0420Hh(length);
        interfaceC0279Bb.ADl(c0420Hh.A00, 0, length);
        if (WY.A04(A00(c0420Hh))) {
            this.A01 = new WY();
        } else if (WT.A06(A00(c0420Hh))) {
            this.A01 = new WT();
        } else {
            if (!WV.A04(A00(c0420Hh))) {
                return false;
            }
            this.A01 = new WV();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A00 = interfaceC0280Bc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0279Bb)) {
                interfaceC0279Bb.AEm();
            } else {
                throw new C02309d(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            InterfaceC0288Bm AFx = this.A00.AFx(0, 1);
            this.A00.A5T();
            this.A01.A06(this.A00, AFx);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0279Bb, c0283Bh);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void AEw(long j, long j2) {
        CW cw = this.A01;
        if (cw != null) {
            cw.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0279Bb);
        } catch (C02309d unused) {
            return false;
        }
    }
}
