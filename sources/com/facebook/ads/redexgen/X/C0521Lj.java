package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0521Lj {
    public static C0521Lj A02;
    public final C0734Tp A00;
    public final C0523Ll A01;

    public C0521Lj(YA ya, Executor executor, C8F c8f) {
        this.A01 = new C0523Ll(ya);
        this.A00 = new C0734Tp(executor, c8f, ya);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(YA ya, Executor executor, C8F c8f) {
        if (!IP.A1D(ya)) {
            return;
        }
        C0521Lj c0521Lj = A02;
        if (c0521Lj == null) {
            C0521Lj c0521Lj2 = new C0521Lj(ya, executor, c8f);
            A02 = c0521Lj2;
            c0521Lj2.A00();
            return;
        }
        c0521Lj.A02(c8f);
    }

    private void A02(C8F c8f) {
        this.A00.A07(c8f);
    }
}
