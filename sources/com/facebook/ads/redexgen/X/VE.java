package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VE implements InterfaceC0391Gc {
    public static byte[] A00;
    public static final InterfaceC0390Gb A01;
    public static final VE A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, 26, 26, 14, 87, 4, 24, 2, 5, 20, 18};
    }

    static {
        A01();
        A02 = new VE();
        A01 = new VF();
    }

    public VE() {
    }

    public /* synthetic */ VE(VF vf) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
