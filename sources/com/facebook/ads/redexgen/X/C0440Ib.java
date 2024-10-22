package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0440Ib {
    public double A00;
    public EnumC0446Ih A01;
    public EnumC0447Ii A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C0440Ib A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C0440Ib A01(EnumC0446Ih enumC0446Ih) {
        this.A01 = enumC0446Ih;
        return this;
    }

    public final C0440Ib A02(EnumC0447Ii enumC0447Ii) {
        this.A02 = enumC0447Ii;
        return this;
    }

    public final C0440Ib A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C0440Ib A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C0440Ib A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C0440Ib A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C0441Ic A07(C7S c7s) {
        return new C0441Ic(c7s, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
