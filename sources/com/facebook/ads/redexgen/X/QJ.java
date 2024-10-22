package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class QJ {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C0319Di A00;
    public final VI A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public QJ(YA ya) {
        VI vi = new VI();
        this.A01 = vi;
        GN trackSelectionFactory = new VP(vi);
        this.A00 = C9M.A00(new XU(ya), new C0276Ay(trackSelectionFactory), new XW());
    }

    public static String A01(C9K c9k) {
        return A00(41, 11, 55) + c9k.A01 + A00(14, 22, 116) + c9k.A00 + A00(0, 14, 98) + c9k.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A66();
    }

    public final long A06() {
        return this.A00.A6X();
    }

    public final long A07() {
        return this.A00.A6j();
    }

    public final QH A08() {
        Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new QH(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.AEO();
    }

    public final void A0A() {
        this.A00.AEz();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AEy(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(Y9 y9, Uri uri) {
        if (IP.A2M(y9, A03())) {
            QN cacheManager = QN.A05(y9);
            C0779Vi c0779Vi = new C0779Vi(cacheManager.A0F(y9));
            String A08 = QN.A08(y9, uri);
            if (A08 != null) {
                c0779Vi.A00(A08);
            }
            this.A00.A0P(c0779Vi.A01(uri));
            return;
        }
        EY mediaSource = new C0779Vi(new VG(y9, C0436Hx.A0K(y9, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(QG qg) {
        this.A00.A3M(new JR(this, qg));
    }

    public final void A0H(QI qi) {
        this.A00.A0Q(new JS(this, qi));
    }

    public final void A0I(boolean z) {
        this.A00.AFO(z);
    }

    public final boolean A0J() {
        return this.A00.A7Y();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
