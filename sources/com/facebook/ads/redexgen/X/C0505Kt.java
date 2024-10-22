package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0505Kt {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        AtomicReference<DisplayMetrics> atomicReference = A00;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        return C0506Ku.A03;
    }
}
