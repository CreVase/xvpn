package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class U9 implements InterfaceC0650Qi {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0470Jg A01;
    public final /* synthetic */ C0472Jj A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{97, 52, 101, 97, 96, 101, 105, 53, 16, 70, 18, 30, 70, 16, 65, 68, 1, 24, 4, 5, 14, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, 31, 90, 77, 77, 80, 77, 31, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public U9(C0472Jj c0472Jj, C0470Jg c0470Jg, long j) {
        this.A02 = c0472Jj;
        this.A01 = c0470Jg;
        this.A00 = j;
    }

    private final void A02(C0662Qu c0662Qu) {
        YA ya;
        long j;
        YA ya2;
        long j2;
        C0473Jk c0473Jk;
        YA ya3;
        YA ya4;
        long j3;
        Jf.A06(this.A01);
        try {
            InterfaceC0648Qg response = c0662Qu.A00();
            if (response != null) {
                String A64 = response.A64();
                c0473Jk = this.A02.A05;
                ya3 = this.A02.A04;
                C0475Jm serverResponse = c0473Jk.A06(ya3, A64, this.A00);
                if (serverResponse.A01() == EnumC0474Jl.A03) {
                    U5 u5 = (U5) serverResponse;
                    String A04 = u5.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(u5.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A64 = A04;
                    }
                    ya4 = this.A02.A04;
                    C0S A0E = ya4.A0E();
                    j3 = this.A02.A00;
                    A0E.A2r(LM.A01(j3), adErrorTypeFromCode.getErrorCode(), A64, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(JG.A01(adErrorTypeFromCode, A64));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = c0662Qu.getMessage();
            ya2 = this.A02.A04;
            C0S A0E2 = ya2.A0E();
            j2 = this.A02.A00;
            A0E2.A2r(LM.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(JG.A01(adErrorType, errorMessage));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage2 = c0662Qu.getMessage();
            ya = this.A02.A04;
            C0S A0E3 = ya.A0E();
            j = this.A02.A00;
            A0E3.A2r(LM.A01(j), adErrorType2.getErrorCode(), A00(16, 15, 65) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(JG.A01(adErrorType2, errorMessage2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650Qi
    public final void AAu(InterfaceC0648Qg interfaceC0648Qg) {
        JU.A05(A00(79, 10, 46), A00(52, 27, 18), A00(0, 8, 90));
        if (interfaceC0648Qg != null) {
            String A64 = interfaceC0648Qg.A64();
            Jf.A06(this.A01);
            this.A02.A0N(A64, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650Qi
    public final void ABI(Exception exc) {
        YA ya;
        long j;
        JU.A05(A00(89, 7, 58), A00(31, 21, 53), A00(8, 8, 45));
        if (C0662Qu.class.equals(exc.getClass())) {
            A02((C0662Qu) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        ya = this.A02.A04;
        C0S A0E = ya.A0E();
        j = this.A02.A00;
        A0E.A2r(LM.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(JG.A01(adErrorType, errorMessage));
    }
}
