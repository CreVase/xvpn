package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class WN implements InterfaceC0299Cg {
    public static byte[] A0H;
    public static String[] A0I = {"aRSbhnMLIcOzj", "ArMoJofeV0W2c5eK3C8YvO0k1qJSW4Bu", "08qFCQPWLGI3uv5FT5gA6GEjfGrW3Yqx", "08xirDFjjs8oqtTIfBkr", "oUVAEbDN9zve", "EoNb", "rtTHy9LVM9SlY", "UaKoPz55Hu2hTR949azFeJYsN1lXPKTw"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0288Bm A07;
    public InterfaceC0288Bm A08;
    public InterfaceC0288Bm A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0419Hg A0D;
    public final C0420Hh A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-31, -43, 23, 42, 41, -43, 22, 40, 40, 42, 34, 30, 35, 28, -43, -10, -10, -8, -43, 1, -8, -29, -8, 27, 43, 42, 9, 28, 24, 27, 28, 41, -39, -6, 9, -6, -8, 9, -6, -7, -75, -10, 10, -7, -2, 4, -75, 4, -9, -1, -6, -8, 9, -75, 9, 14, 5, -6, -49, -75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 42, 37, -12, 0, 20, 3, 8, 14, -50, 12, 15, -45, 0, -52, 11, 0, 19, 12};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public WN(boolean z) {
        this(z, null);
    }

    public WN(boolean z, String str) {
        this.A0D = new C0419Hg(new byte[7]);
        this.A0E = new C0420Hh(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws C02309d {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 59), A00(32, 28, 25) + A04 + A00(0, 22, 57));
                A04 = 2;
            }
            int channelConfig = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] audioSpecificConfig = HM.A07(A04, channelConfig, audioObjectType);
            Pair<Integer, Integer> A03 = HM.A03(audioSpecificConfig);
            Format A07 = Format.A07(this.A0A, A00(75, 15, 35), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(audioSpecificConfig), null, 0, this.A0F);
            int audioObjectType2 = A07.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A5j(A07);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int A042 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A042 -= 2;
        }
        A07(this.A09, this.A05, 0, A042);
    }

    private void A02() {
        this.A08.AEr(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0288Bm interfaceC0288Bm, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = interfaceC0288Bm;
        this.A04 = j;
        this.A02 = i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0031. Please report as an issue. */
    private void A08(C0420Hh c0420Hh) {
        byte[] bArr = c0420Hh.A00;
        int A06 = c0420Hh.A06();
        int A07 = c0420Hh.A07();
        while (A06 < A07) {
            int i = A06 + 1;
            int i2 = bArr[A06] & 255;
            int endOffset = this.A01;
            if (endOffset == 512 && i2 >= 240 && i2 != 255) {
                this.A0B = (i2 & 1) == 0;
                A04();
                c0420Hh.A0Y(i);
                return;
            }
            switch (endOffset | i2) {
                case 329:
                    this.A01 = 768;
                    A06 = i;
                case 511:
                    this.A01 = 512;
                    A06 = i;
                case 836:
                    this.A01 = UserVerificationMethods.USER_VERIFY_ALL;
                    A06 = i;
                case 1075:
                    A05();
                    c0420Hh.A0Y(i);
                    return;
                default:
                    if (endOffset != 256) {
                        this.A01 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        A06 = i - 1;
                    } else {
                        A06 = i;
                    }
            }
        }
        c0420Hh.A0Y(A06);
    }

    private void A09(C0420Hh c0420Hh) {
        int min = Math.min(c0420Hh.A04(), this.A02 - this.A00);
        this.A07.AEr(c0420Hh, min);
        int bytesToRead = this.A00 + min;
        this.A00 = bytesToRead;
        int i = this.A02;
        if (bytesToRead == i) {
            this.A07.AEs(this.A06, 1, i, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0420Hh c0420Hh, byte[] bArr, int i) {
        int min = Math.min(c0420Hh.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c0420Hh.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void A4O(C0420Hh c0420Hh) throws C02309d {
        while (c0420Hh.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(c0420Hh);
                    break;
                case 1:
                    if (!A0A(c0420Hh, this.A0E.A00, 10)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 2:
                    if (!A0A(c0420Hh, this.A0D.A00, this.A0B ? 7 : 5)) {
                        break;
                    } else {
                        A01();
                        break;
                    }
                case 3:
                    A09(c0420Hh);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void A4l(InterfaceC0280Bc interfaceC0280Bc, C0310Cu c0310Cu) {
        c0310Cu.A05();
        this.A0A = c0310Cu.A04();
        this.A09 = interfaceC0280Bc.AFx(c0310Cu.A03(), 1);
        if (this.A0G) {
            c0310Cu.A05();
            InterfaceC0288Bm AFx = interfaceC0280Bc.AFx(c0310Cu.A03(), 4);
            this.A08 = AFx;
            if (A0I[4].length() != 12) {
                throw new RuntimeException();
            }
            A0I[5] = "GBp";
            AFx.A5j(Format.A0B(c0310Cu.A04(), A00(60, 15, 69), null, -1, null));
            return;
        }
        this.A08 = new X2();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADi() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADj(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void AEv() {
        A03();
    }
}
