package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7R {
    public static final AtomicReference<Y9> A00 = new AtomicReference<>();

    public static Y9 A00() {
        return A00.get();
    }

    public static void A01(Y9 y9) {
        if (y9 == null) {
            return;
        }
        C7Q.A00(A00, null, y9);
    }
}
