package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.60, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass60 {
    public final long A00;
    public final EnumC01605z A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass60(String str, boolean z, EnumC01605z enumC01605z) {
        this(str, z, enumC01605z, System.currentTimeMillis());
    }

    public AnonymousClass60(String str, boolean z, EnumC01605z enumC01605z, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC01605z;
        this.A00 = j;
    }

    public static AnonymousClass60 A00() {
        return new AnonymousClass60("", true, EnumC01605z.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC01605z A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
