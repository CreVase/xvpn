package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0896a0 implements AnonymousClass15 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ EV A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{81, 82, 83, 80, 87, 2, 85, 86, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, Byte.MAX_VALUE, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    static {
        A01();
    }

    public C0896a0(EV ev, Runnable runnable) {
        this.A00 = ev;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACk(AbstractC0928aW abstractC0928aW) {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACl(AbstractC0928aW abstractC0928aW) {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACm(AbstractC0928aW abstractC0928aW) {
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACn(AbstractC0928aW abstractC0928aW) {
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A01 = abstractC0928aW;
        this.A00.A0H();
        this.A00.A06.A0F(abstractC0928aW);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACo(AbstractC0928aW abstractC0928aW) {
        JU.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACp(AbstractC0928aW abstractC0928aW) {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACq(AbstractC0928aW abstractC0928aW, AdError adError) {
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0B.A0E().A4p(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && IP.A1W(this.A00.A0B)) {
            this.A00.A06.A0G(JG.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            AdError adError2 = AdError.NO_FILL;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            if (adError2.equals(adError)) {
                this.A00.A06.A0G(JG.A00(AdErrorType.NO_FILL));
            } else {
                this.A00.A06.A0G(JG.A00(AdErrorType.INTERNAL_ERROR));
            }
        }
        this.A00.A0M(abstractC0928aW);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}
