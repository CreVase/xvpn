package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FF extends AbstractC0954aw {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = FF.class.getSimpleName();
    }

    public FF(YA ya, InterfaceC0444If interfaceC0444If, String str, Uri uri, Map<String, String> mExtraData, C00210n c00210n, boolean z) {
        super(ya, interfaceC0444If, str, c00210n, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00150g
    public final EnumC00140f A0A() {
        try {
            KZ.A0B(new KZ(), ((AbstractC00150g) this).A00, C0490Kc.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC00150g) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC00140f.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0954aw
    public final void A0D() {
        EnumC00140f enumC00140f = null;
        if (((AbstractC0954aw) this).A02) {
            enumC00140f = A0A();
        }
        A0E(this.A01, enumC00140f);
    }
}
