package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2F implements Serializable {
    public C2E A00;
    public C2E A01;

    public C2F() {
        this(0.5d, 0.5d);
    }

    public C2F(double d) {
        this(d, 0.5d);
    }

    public C2F(double d, double d2) {
        this.A00 = new C2E(d);
        this.A01 = new C2E(d2);
        A02();
    }

    public final C2E A00() {
        return this.A00;
    }

    public final C2E A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A06();
        this.A01.A06();
    }

    public final void A03() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A04(double d, double d2) {
        this.A00.A08(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A08(d, d2);
    }
}
