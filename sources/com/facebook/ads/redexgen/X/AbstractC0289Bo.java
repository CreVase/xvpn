package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0289Bo {
    public final InterfaceC0288Bm A00;

    public abstract void A0B(C0420Hh c0420Hh, long j) throws C02309d;

    public abstract boolean A0C(C0420Hh c0420Hh) throws C02309d;

    public AbstractC0289Bo(InterfaceC0288Bm interfaceC0288Bm) {
        this.A00 = interfaceC0288Bm;
    }

    public final void A00(C0420Hh c0420Hh, long j) throws C02309d {
        if (A0C(c0420Hh)) {
            A0B(c0420Hh, j);
        }
    }
}
