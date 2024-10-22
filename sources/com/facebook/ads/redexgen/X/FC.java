package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class FC extends AbstractC0909aD {
    public static String[] A04 = {"9yCAU6vHH5iW2uzgCW6HgdGPEZSQZZfL", "J47", "6rlZoFx9Uu0Bsrona1cKRXumzm4YYBbS", "bhq", "umQrlUDl61wUXIIBom7yT3QugrS", "j4Wkewb2uBFqLUCHLR63rcK9C", "eNU4QeIs11d2vjS0Im22LGZCKxJhHCKO", "6j5HGQ5u8FmBkqYMwiejF76PKOqfr1XC"};
    public final /* synthetic */ FA A00;
    public final /* synthetic */ AbstractC0928aW A01;
    public final /* synthetic */ C0361Ey A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FC(FA fa, boolean z, boolean z2, C0361Ey c0361Ey, AbstractC0928aW abstractC0928aW) {
        super(z);
        this.A00 = fa;
        this.A03 = z2;
        this.A02 = c0361Ey;
        this.A01 = abstractC0928aW;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0909aD
    public final void A00() {
        AnonymousClass15 anonymousClass15;
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACq(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0909aD
    public final void A01(boolean z) {
        YA ya;
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass15;
        YA ya2;
        ya = this.A00.A04;
        if (!IP.A1S(ya) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            if (A04[4].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "NG7";
            strArr[3] = "cbl";
            atomicBoolean.set(true);
            anonymousClass15 = this.A00.A01;
            anonymousClass15.ACn(this.A01);
            return;
        }
        FA fa = this.A00;
        ya2 = fa.A04;
        fa.A06 = C0598Oi.A01(ya2, this.A02, 0, new C0935ad(this));
    }
}
