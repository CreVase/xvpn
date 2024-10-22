package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0908aC extends K8 {
    public static byte[] A03;
    public final /* synthetic */ C0942ak A00;
    public final /* synthetic */ C00521s A01;
    public final /* synthetic */ C0360Ex A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C0908aC(C0360Ex c0360Ex, C00521s c00521s, C0942ak c0942ak) {
        this.A02 = c0360Ex;
        this.A01 = c00521s;
        this.A00 = c0942ak;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.ABH(new JG(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
