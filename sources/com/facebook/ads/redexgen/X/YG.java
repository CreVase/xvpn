package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class YG extends K8 {
    public static byte[] A02;
    public final /* synthetic */ YF A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public YG(YF yf, AtomicBoolean atomicBoolean) {
        this.A00 = yf;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C7S c7s;
        long j;
        C7S c7s2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0451Im.A0H);
                c7s2 = this.A00.A02.A04;
                C6J c6j = this.A00.A01;
                int i = C6T.A00;
                String A00 = A00(11, 14, 17);
                j2 = this.A00.A02.A00;
                C6T.A02(c7s2, c6j, i, A00, j2);
                this.A00.A02.A0T();
                this.A00.A00.AAw();
                return;
            }
            this.A00.A02.A0I(EnumC0451Im.A0G);
            c7s = this.A00.A02.A04;
            C6J c6j2 = this.A00.A01;
            int i2 = C6T.A04;
            String A002 = A00(0, 11, 41);
            j = this.A00.A02.A00;
            C6T.A02(c7s, c6j2, i2, A002, j);
            this.A00.A02.A0U();
            this.A00.A00.AAn();
        }
    }
}
