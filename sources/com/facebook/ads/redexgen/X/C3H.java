package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3H {
    public static final C3G A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0O() { // from class: com.facebook.ads.redexgen.X.04
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0O();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0R();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C00090a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C00110c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C00411h();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C00863b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            A00 = new EM();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new ZP();
        } else {
            A00 = new C3G();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(View view) {
        return A00.A07(view);
    }

    public static C3Y A05(View view, C3Y c3y) {
        return A00.A08(view, c3y);
    }

    public static C3Y A06(View view, C3Y c3y) {
        return A00.A09(view, c3y);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, C00802v c00802v) {
        A00.A0E(view, c00802v);
    }

    public static void A0C(View view, AnonymousClass31 anonymousClass31) {
        A00.A0F(view, anonymousClass31);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
