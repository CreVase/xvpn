package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01013r {
    public static final C01003q A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new ZF();
        } else {
            A00 = new C01003q();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f, float f2) {
        A00.A00(edgeEffect, f, f2);
    }
}
