package com.facebook.ads.redexgen.X;

import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0433Hu {
    public static void A00() {
        if (C0436Hx.A02 >= 18) {
            A01();
        }
    }

    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (C0436Hx.A02 >= 18) {
            A03(str);
        }
    }

    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
