package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02489v {
    public static final C02489v A02;
    public static final C02489v A03;
    public static final C02489v A04;
    public static final C02489v A05;
    public static final C02489v A06;
    public final long A00;
    public final long A01;

    static {
        C02489v c02489v = new C02489v(0L, 0L);
        A04 = c02489v;
        A02 = new C02489v(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new C02489v(Long.MAX_VALUE, 0L);
        A05 = new C02489v(0L, Long.MAX_VALUE);
        A03 = c02489v;
    }

    public C02489v(long j, long j2) {
        HI.A03(j >= 0);
        HI.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02489v c02489v = (C02489v) obj;
        return this.A01 == c02489v.A01 && this.A00 == c02489v.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
