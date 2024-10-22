package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class EP extends AbstractC0892Zw {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    public static final AnonymousClass24 A03 = new C0883Zl();
    public C0887Zq A00;
    public final AnonymousClass23 A01;

    public EP(AnonymousClass23 anonymousClass23) {
        super(anonymousClass23.A05(), A03.A4d(anonymousClass23));
        this.A01 = anonymousClass23;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0892Zw
    public final void A05() {
        C0887Zq c0887Zq = this.A00;
        if (c0887Zq != null) {
            c0887Zq.A0F();
        }
        InterfaceC00581y interfaceC00581y = super.A00;
        EnumC00571x enumC00571x = EnumC00571x.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC00581y.AFC(enumC00571x);
    }

    public final C0887Zq A07() {
        return this.A00;
    }

    public final void A08() {
        C0887Zq c0887Zq = new C0887Zq(this.A01, this, this.A02);
        this.A00 = c0887Zq;
        c0887Zq.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5Y()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C0887Zq c0887Zq = this.A00;
        if (c0887Zq != null) {
            c0887Zq.A0I(cacheFlags, str);
            return;
        }
        this.A01.A0J(cacheFlags);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C0887Zq c0887Zq = this.A00;
        if (c0887Zq != null) {
            return c0887Zq.A0J();
        }
        if (this.A01.A00() > 0) {
            long A00 = LM.A00();
            long A002 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (A00 > A002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C0887Zq c0887Zq = this.A00;
        if (c0887Zq != null) {
            return c0887Zq.A0K();
        }
        return super.A00.A5r() == EnumC00571x.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5Z()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C0887Zq c0887Zq = this.A00;
        if (c0887Zq != null) {
            return c0887Zq.A0L();
        }
        C0887Zq c0887Zq2 = new C0887Zq(this.A01, this, this.A02);
        this.A00 = c0887Zq2;
        c0887Zq2.A0L();
        return false;
    }
}
