package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class YX implements InterfaceC00551v {
    public static byte[] A03;
    public C01355a A00;
    public YA A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public YX(C01355a c01355a, YA ya, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c01355a;
        this.A01 = ya;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00551v
    public final void ABH(JG jg) {
        C0487Jz.A00(new C0846Ya(this, jg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00551v
    public final void ACD(List<C0939ah> list) {
        C6Q manager = new C6Q(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C0939ah c0939ah : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c0939ah.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c0939ah.A0E().A0G() != null) {
                    manager.A0b(new C6O(c0939ah.A0E().A0G().getUrl(), c0939ah.A0E().A0G().getHeight(), c0939ah.A0E().A0G().getWidth(), c0939ah.A0G(), A02(0, 6, 2)));
                }
                if (c0939ah.A0E().A0F() != null) {
                    manager.A0b(new C6O(c0939ah.A0E().A0F().getUrl(), c0939ah.A0E().A0F().getHeight(), c0939ah.A0E().A0F().getWidth(), c0939ah.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c0939ah.A0E().A0d())) {
                    manager.A0a(new C6M(c0939ah.A0E().A0d(), c0939ah.A0G(), A02(0, 6, 2), c0939ah.A0E().A0A()));
                }
            }
        }
        manager.A0W(new YY(this, list), new C6J(firstRequestId, A02(0, 6, 2)));
    }
}
