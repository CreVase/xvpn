package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5Q {
    public static C0S A00(Context context, C7U c7u) {
        Y9 sdkContext = A07(context);
        C0V A70 = c7u.A70(sdkContext);
        if (A70 != null) {
            return A70.A9y();
        }
        return new C0956ay();
    }

    public static YA A01(Activity activity) {
        return new YA(activity, (C7U) A08(), A00(activity, A08()));
    }

    public static YA A02(Context context) {
        return new YA(context, A08(), new C0956ay());
    }

    public static YA A03(Context context) {
        return new YA(context, A08(), A00(context, A08()));
    }

    public static YA A04(Context context) {
        if (IP.A0s(context)) {
            return new YA(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static YA A05(Context context) {
        return new YA(context, A08(), A00(context, A08()));
    }

    public static C0336Dz A06(Context context) {
        return new C0336Dz(context, A08(), A08().A70(A07(context)));
    }

    public static Y9 A07(Context context) {
        return new Y9(context, A08());
    }

    public static synchronized C0828Xi A08() {
        C0828Xi A02;
        synchronized (C5Q.class) {
            A02 = C0828Xi.A02();
        }
        return A02;
    }
}
