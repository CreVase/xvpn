package com.facebook.ads.redexgen.X;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class BP extends XC<BO, BN, FX> implements InterfaceC0773Vc {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract FW A0b(byte[] bArr, int i, boolean z) throws FX;

    public BP(String str) {
        super(new BO[2], new BN[2]);
        this.A00 = str;
        A0Y(UserVerificationMethods.USER_VERIFY_ALL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3C] */
    @Override // com.facebook.ads.redexgen.X.XC
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C3C A0V() {
        return new BN(this) { // from class: com.facebook.ads.redexgen.X.3C
            public final BP A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.BN
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.XC
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final FX A0W(BO bo, BN bn, boolean z) {
        try {
            ByteBuffer inputData = bo.A01;
            bn.A09(((XE) bo).A00, A0b(inputData.array(), inputData.limit(), z), bo.A00);
            bn.A01(Integer.MIN_VALUE);
            return null;
        } catch (FX e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.XC
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final FX A0X(Throwable th) {
        return new FX(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.XC
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final BO A0T() {
        return new BO();
    }

    @Override // com.facebook.ads.redexgen.X.XC
    /* renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final void A0a(BN bn) {
        super.A0a(bn);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Vc
    public final void AFQ(long j) {
    }
}
