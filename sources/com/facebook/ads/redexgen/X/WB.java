package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC0278Ba {
    public static String[] A08 = {"pV6afMZIVEGTOqSkK4PJAxqV3cRTXe0d", "IAHwWl6p9dkO64XBfZ0QYdoG1FARrH3l", "8O8qDLmpQAmlCV9yXa4a4pqjSYQFT4zH", "zdF1gQZIlZar6BQddk1LhfG9pE3e2nBq", "3CFwU8lFm", "v9T9Lg78nTaSAiVLG9Jw7rJGA2UCfL0z", "6lAaLpwrnWkg", "Pzi"};
    public static final InterfaceC0281Bd A09 = new WC();
    public long A00;
    public InterfaceC0280Bc A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0304Cn> A05;
    public final C0420Hh A06;
    public final C0432Ht A07;

    public WB() {
        this(new C0432Ht(0L));
    }

    public WB(C0432Ht c0432Ht) {
        this.A07 = c0432Ht;
        this.A06 = new C0420Hh(v.DEFAULT_BUFFER_SIZE);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A01 = interfaceC0280Bc;
        interfaceC0280Bc.AEx(new X0(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        long j;
        if (!interfaceC0279Bb.ADm(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int A082 = this.A06.A08();
        if (A082 == 441) {
            return -1;
        }
        if (A082 == 442) {
            interfaceC0279Bb.ADl(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            interfaceC0279Bb.AFe((nextStartCode & 7) + 14);
            return 0;
        }
        if (A082 == 443) {
            interfaceC0279Bb.ADl(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            int i = nextStartCode2 + 6;
            if (A08[7].length() != 22) {
                String[] strArr = A08;
                strArr[5] = "HKquBkRqV5bg6e7zOk5qC1bF2o25gd0c";
                strArr[0] = "faW9VDigV6ilhrF8PW3drZ4wwMfODA0N";
                interfaceC0279Bb.AFe(i);
                return 0;
            }
        } else {
            int nextStartCode3 = A082 & (-256);
            if ((nextStartCode3 >> 8) != 1) {
                interfaceC0279Bb.AFe(1);
                return 0;
            }
            int i2 = A082 & 255;
            C0304Cn c0304Cn = this.A05.get(i2);
            if (!this.A02) {
                if (c0304Cn == null) {
                    InterfaceC0299Cg elementaryStreamReader = null;
                    if (i2 == 189) {
                        elementaryStreamReader = new WQ();
                        this.A03 = true;
                        this.A00 = interfaceC0279Bb.A7a();
                    } else if ((i2 & 224) == 192) {
                        elementaryStreamReader = new WE();
                        this.A03 = true;
                        this.A00 = interfaceC0279Bb.A7a();
                    } else if ((i2 & 240) == 224) {
                        elementaryStreamReader = new WJ();
                        this.A04 = true;
                        this.A00 = interfaceC0279Bb.A7a();
                    }
                    if (elementaryStreamReader != null) {
                        elementaryStreamReader.A4l(this.A01, new C0310Cu(i2, UserVerificationMethods.USER_VERIFY_HANDPRINT));
                        c0304Cn = new C0304Cn(elementaryStreamReader, this.A07);
                        this.A05.put(i2, c0304Cn);
                    }
                }
                if (this.A03 && this.A04) {
                    j = this.A00 + 8192;
                } else {
                    j = 1048576;
                }
                if (interfaceC0279Bb.A7a() > j) {
                    this.A02 = true;
                    InterfaceC0280Bc interfaceC0280Bc = this.A01;
                    if (A08[6].length() != 7) {
                        A08[4] = "xdmI1xGjCkbROfx6HlMFi8Q1HtnAUXbK";
                        interfaceC0280Bc.A5T();
                    }
                }
            }
            interfaceC0279Bb.ADl(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode4 = this.A06.A0I();
            int i3 = nextStartCode4 + 6;
            if (c0304Cn == null) {
                interfaceC0279Bb.AFe(i3);
            } else {
                this.A06.A0W(i3);
                interfaceC0279Bb.readFully(this.A06.A00, 0, i3);
                this.A06.A0Y(6);
                c0304Cn.A03(this.A06);
                C0420Hh c0420Hh = this.A06;
                int nextStartCode5 = c0420Hh.A05();
                c0420Hh.A0X(nextStartCode5);
            }
            return 0;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEw(long r3, long r5) {
        /*
            r2 = this;
            com.facebook.ads.redexgen.X.Ht r0 = r2.A07
            r0.A08()
            r1 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Cn> r0 = r2.A05
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            android.util.SparseArray<com.facebook.ads.redexgen.X.Cn> r0 = r2.A05
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Cn r0 = (com.facebook.ads.redexgen.X.C0304Cn) r0
            r0.A02()
            int r1 = r1 + 1
            goto L6
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WB.AEw(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC0279Bb.ADl(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4) {
            return false;
        }
        int i = bArr[8] & 4;
        if (A08[4].length() != 31) {
            A08[6] = "Yb1F33WkxQfWiaSVh137";
            if (i != 4) {
                return false;
            }
            String[] strArr = A08;
            if (strArr[5].charAt(30) == strArr[0].charAt(30)) {
                String[] strArr2 = A08;
                strArr2[2] = "0jRSG84WTzZndWahG37MGXBabYk0DmjV";
                strArr2[3] = "QaZZpRdUVGXpS1N3yC2DPVE3W204sMee";
                if ((bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
                    return false;
                }
                int packStuffingLength = bArr[13] & 7;
                interfaceC0279Bb.A3S(packStuffingLength);
                interfaceC0279Bb.ADl(bArr, 0, 3);
                int packStuffingLength2 = bArr[0];
                int i2 = (packStuffingLength2 & 255) << 16;
                int packStuffingLength3 = bArr[1];
                int i3 = i2 | ((packStuffingLength3 & 255) << 8);
                int packStuffingLength4 = bArr[2];
                return 1 == ((packStuffingLength4 & 255) | i3);
            }
        }
        throw new RuntimeException();
    }
}
