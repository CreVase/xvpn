package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class A2 {
    public final int A00;
    public final EW A01;

    public A2(int i, EW ew) {
        this.A00 = i;
        this.A01 = ew;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A2 a2 = (A2) obj;
        return this.A00 == a2.A00 && this.A01.equals(a2.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
