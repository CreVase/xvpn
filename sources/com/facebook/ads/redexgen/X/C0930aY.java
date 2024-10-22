package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0930aY extends AbstractC00240q {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C0930aY.class.getSimpleName();
    public C0932aa A00;
    public boolean A01;
    public final YA A02;
    public final InterfaceC0444If A03;
    public final NB A04;

    public C0930aY(YA ya, InterfaceC0444If interfaceC0444If, NB nb, C0643Qb c0643Qb, AbstractC00250r abstractC00250r) {
        super(ya, abstractC00250r, c0643Qb);
        this.A03 = interfaceC0444If;
        this.A04 = nb;
        this.A02 = ya;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00240q
    public final void A06(Map<String, String> map) {
        C0932aa c0932aa = this.A00;
        if (c0932aa != null && !TextUtils.isEmpty(c0932aa.A6N())) {
            this.A02.A0E().A2g();
            C2C.A00(this.A00.A05());
            InterfaceC0444If interfaceC0444If = this.A03;
            String A6N = this.A00.A6N();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC0444If.A9S(A6N, map);
        }
    }

    public final synchronized void A07() {
        C0932aa c0932aa;
        if (!this.A01 && (c0932aa = this.A00) != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(c0932aa.A03())) {
                LP.A00(new C0931aZ(this));
            }
        }
    }

    public final void A08(C0932aa c0932aa) {
        this.A00 = c0932aa;
    }
}
