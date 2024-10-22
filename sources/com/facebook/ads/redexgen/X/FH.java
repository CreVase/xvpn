package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC0954aw {
    public static byte[] A03;
    public static String[] A04 = {"OXbCEMjwdPN5xvU2NT0kKgep5UeL1Sqr", "SX0ygsPxRN6KiRybC8JMsMv996SDI", "L77PzfY5dGd9ppcaJeqEYdg5mL", "qaE4mxmFDXDzve4pMTR5s0xQhV", "rrEUCxltihDw1phZ7LTyezPpJ6vgfWBl", "FdpTQfSalwXKw6iuOYHl49ZbqEAaQDuv", "IFg4N7XoM6S2Rxr", "IzcF2xeWDVSzXIhxKqlgaOjlVHZ1W1Z3"};
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {104, 109, 106, 111, 37, 34, 57, 36, 51, 9, 35, 36, 58, 9, 33, 51, 52, 9, 48, 55, 58, 58, 52, 55, 53, 61};
        if (A04[5].charAt(30) != 'u') {
            throw new RuntimeException();
        }
        A04[5] = "82m81CO1d0OwjHPL38rD7xdABiLQ6kup";
        A03 = bArr;
    }

    static {
        A01();
    }

    public FH(YA ya, InterfaceC0444If interfaceC0444If, String str, Uri uri, Map<String, String> mExtraData) {
        super(ya, interfaceC0444If, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public FH(YA ya, InterfaceC0444If interfaceC0444If, String str, Uri uri, Map<String, String> mExtraData, boolean z) {
        this(ya, interfaceC0444If, str, uri, mExtraData);
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0954aw
    public final void A0D() {
        A0E(this.A00, null);
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 70));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return C0490Kc.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, 20);
        return C0490Kc.A00(uri.getQueryParameter(url));
    }
}
