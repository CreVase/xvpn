package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0900a4 implements AnonymousClass13 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0351Eo A04;
    public final /* synthetic */ C8D A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public C0900a4(C0351Eo c0351Eo, Runnable runnable, long j, C8D c8d) {
        this.A04 = c0351Eo;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c8d;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void ACA(C0939ah c0939ah) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(C8H.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void ACB(C0939ah c0939ah) {
        Map A01;
        if (c0939ah != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        this.A04.A01 = c0939ah;
        this.A04.A06.A0F(c0939ah);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A05(this.A05.A03(C8H.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void ACC(C0939ah c0939ah) {
        if (!this.A01) {
            this.A01 = true;
            C0351Eo c0351Eo = this.A04;
            C8D c8d = this.A05;
            C8H c8h = C8H.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c0351Eo.A05(c8d.A03(c8h), null);
        }
        this.A04.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void ACE(C0939ah c0939ah, JG jg) {
        Map A01;
        if (c0939ah != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        this.A04.A0M(c0939ah);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(jg.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(jg.A04()));
            this.A04.A05(this.A05.A03(C8H.A05), A01);
        }
        this.A04.ABH(jg);
    }
}
