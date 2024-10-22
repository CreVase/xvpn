package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YE implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ Y9 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = copyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i4] = (byte) ((b2 ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public YE(Y9 y9) {
        this.A00 = y9;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A9G(Throwable th) {
        this.A00.A07().A9M(A00(0, 5, 0), C01997x.A1d, new C02007y(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A9R(Throwable th) {
        this.A00.A07().A9M(A00(0, 5, 0), C01997x.A1f, new C02007y(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AEH(String str, int i, String str2, Long l, Long l2, AnonymousClass06 anonymousClass06) {
        C6T.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AEI(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C6T.A04(this.A00, new C6S(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}
