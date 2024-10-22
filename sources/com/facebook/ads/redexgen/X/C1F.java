package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1F */
/* loaded from: assets/audience_network.dex */
public class C1F implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C1Z A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final C1F A0C(int i) {
        this.A02 = i;
        return this;
    }

    public final C1F A0D(int i) {
        this.A03 = i;
        return this;
    }

    public final C1F A0E(int i) {
        this.A04 = i;
        return this;
    }

    public final C1F A0F(int i) {
        this.A00 = i;
        return this;
    }

    public final C1F A0G(int i) {
        this.A01 = i;
        return this;
    }

    public final C1F A0H(long j) {
        this.A05 = j;
        return this;
    }

    public final C1F A0I(C1Z c1z) {
        this.A06 = c1z;
        return this;
    }

    public final C1F A0J(String str) {
        this.A08 = str;
        return this;
    }

    public final C1F A0K(String str) {
        this.A07 = str;
        return this;
    }

    public final C1F A0L(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C1F A0M(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C1F A0N(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C1G A0O() {
        return new C1G(this);
    }
}
