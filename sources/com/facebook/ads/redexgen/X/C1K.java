package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1K implements Serializable {
    public static final long serialVersionUID = 5306126965868117466L;
    public final C1I A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C1K(C1J c1j) {
        String str;
        String str2;
        String str3;
        String str4;
        C1I c1i;
        this.A08 = c1j.A08;
        this.A07 = c1j.A07;
        this.A02 = c1j.A02;
        this.A05 = c1j.A05;
        str = c1j.A04;
        this.A04 = str;
        str2 = c1j.A01;
        this.A01 = str2;
        str3 = c1j.A03;
        this.A03 = str3;
        str4 = c1j.A06;
        this.A06 = str4;
        c1i = c1j.A00;
        this.A00 = c1i;
    }

    public final C1I A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A02;
    }

    public final String A02() {
        return this.A04;
    }

    public final String A03() {
        return this.A05;
    }

    public final String A04() {
        return this.A06;
    }

    public final String A05() {
        return this.A07;
    }

    public final String A06() {
        return this.A08;
    }
}
