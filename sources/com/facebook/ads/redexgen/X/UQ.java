package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UQ implements C6I {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C0939ah A00;
    public final /* synthetic */ UJ A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public UQ(UJ uj, C0939ah c0939ah, boolean z) {
        this.A01 = uj;
        this.A00 = c0939ah;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        YA ya;
        long j;
        UI ui;
        UI ui2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        ya = this.A01.A0c;
        C0S A0E = ya.A0E();
        j = this.A01.A00;
        A0E.A2i(LM.A01(j), adErrorType.getErrorCode(), A00);
        ui = this.A01.A0G;
        if (ui != null) {
            UJ uj = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            ui2 = uj.A0G;
            ui2.ABH(JG.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        UI ui;
        EnumC0463Iy enumC0463Iy;
        YA ya;
        UI ui2;
        YA ya2;
        boolean A0q;
        UI ui3;
        C0351Eo c0351Eo;
        C0351Eo c0351Eo2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c0351Eo = this.A01.A0A;
            if (c0351Eo != null) {
                c0351Eo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                c0351Eo2.A0H();
            }
        }
        ui = this.A01.A0G;
        if (ui != null) {
            enumC0463Iy = this.A01.A0E;
            if (enumC0463Iy.equals(EnumC0463Iy.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    ui3 = this.A01.A0G;
                    ui3.AC3();
                }
            }
            if (this.A02) {
                ya = this.A01.A0c;
                if (!IP.A1R(ya) || this.A01.A0z() == null || !this.A01.A0z().A0k()) {
                    ui2 = this.A01.A0G;
                    ui2.AAR();
                } else {
                    UJ uj = this.A01;
                    ya2 = uj.A0c;
                    uj.A0M = C0598Oi.A01(ya2, this.A01.A0z(), 4, new UR(this));
                }
            }
        }
    }
}
