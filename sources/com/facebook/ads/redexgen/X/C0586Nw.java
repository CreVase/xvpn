package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0586Nw {
    public static byte[] A00;
    public static String[] A01 = {"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{8, 97, 91, 8, 97, 70, 91, 92, 73, 70, 92, 8, 79, 73, 69, 77, 91, 8, 73, 68, 68, 71, 95, 77, 76, 18, 8, 64, 41, 19, 64, 41, 14, 19, 20, 1, 14, 20, 64, 7, 1, 13, 5, 19, 90, 64, 77, 10, 2, 2, 10, 1, 8, 77, 11, 12, 1, 1, 15, 12, 14, 6, 77, 24, 31, 1, 77, 12, 27, 12, 4, 1, 12, 15, 1, 8, 87, 77, 119, 62, 36, 4, 35, 56, 37, 50, 109, 119, 124, 108, 58, 37, 40, 41, 35, 108, 57, 62, 32, 108, 37, 63, 108, 34, 57, 32, 32, 118, 108, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 86, 92, 73, 92, 83, 92, 74, 77, 86, 75, 92, 120, Byte.MAX_VALUE, 100, 121, 110, 84, 126, 121, 103, 84, 124, 110, 105, 84, 109, 106, 103, 103, 105, 106, 104, 96, 69, 90, 87, 86, 92, 108, 70, 65, 95};
    }

    static {
        A02();
    }

    public static AbstractC0585Nv A00(final C0589Nz c0589Nz, Bundle bundle, boolean z) {
        AbstractC0585Nv c0714Su;
        C1D A0v = c0589Nz.A04().A0v();
        double A002 = C0583Nt.A00(A0v);
        boolean isWatchAndBrowse = c0589Nz.A04().A0v().A0N();
        final boolean A06 = C0583Nt.A06(c0589Nz.A00(), c0589Nz.A01(), A002);
        AbstractC00150g A003 = C00160h.A00(c0589Nz.A05(), c0589Nz.A06(), A01(0, 0, 67), C0490Kc.A00(c0589Nz.A04().A0v().A0F().A05()), new HashMap(), c0589Nz.A04().A0x());
        boolean z2 = !TextUtils.isEmpty(A0v.A0D().A08());
        if (IP.A1X(c0589Nz.A05())) {
            c0589Nz.A05().A0A().AGA(c0589Nz.A02(), c0589Nz.A04().A11(), z2);
        }
        boolean A03 = A03(c0589Nz, z2);
        if ((isWatchAndBrowse && (A003 instanceof FG)) || A03) {
            c0714Su = new C0705Sl(c0589Nz, A03);
        } else if (z2) {
            c0714Su = new C9D(c0589Nz);
        } else if (!z2 && IP.A26(c0589Nz.A05())) {
            c0714Su = new AbstractC0718Sy(c0589Nz, A06) { // from class: com.facebook.ads.redexgen.X.9F
                public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
                public final View A00;
                public final boolean A01;

                {
                    super(c0589Nz, true);
                    this.A01 = A06;
                    View A022 = c0589Nz.A02();
                    this.A00 = A022;
                    A13();
                    if (A06) {
                        addView(c0589Nz.A02(), new RelativeLayout.LayoutParams(-1, -1));
                    } else {
                        FrameLayout frameLayout = new FrameLayout(c0589Nz.A05());
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(2, getAdDetailsView().getId());
                        frameLayout.setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        layoutParams2.setMargins(AbstractC0585Nv.A07, 0, AbstractC0585Nv.A07, 0);
                        frameLayout.addView(A022, layoutParams2);
                        addView(frameLayout);
                    }
                    if (A022 != null && IP.A17(getAdContextWrapper())) {
                        NO.A00(A022, IP.A18(getAdContextWrapper()), new O0(this));
                    }
                    getAdDetailsView().bringToFront();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
                public final boolean A02() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
                public final boolean A0D() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0718Sy, com.facebook.ads.redexgen.X.AbstractC0585Nv
                public final void A0z(C1D c1d, String str, double d, Bundle bundle2) {
                    super.A0z(c1d, str, d, bundle2);
                    if (!this.A01 && d > 0.0d) {
                        int mediaHeight = (int) ((A02 - (AbstractC0585Nv.A07 * 2)) / d);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
                        layoutParams.gravity = 17;
                        int i = AbstractC0585Nv.A07;
                        int mediaHeight2 = AbstractC0585Nv.A07;
                        layoutParams.setMargins(i, 0, mediaHeight2, 0);
                        this.A00.setLayoutParams(layoutParams);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
                public final boolean A10() {
                    return this.A01;
                }
            };
        } else if (!A06) {
            c0714Su = new C0714Su(c0589Nz, C0583Nt.A04(A002));
        } else {
            int A004 = c0589Nz.A00();
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            A01[6] = "JelR9";
            c0714Su = new C0717Sx(c0589Nz, A004 == 2);
        }
        if (z) {
            c0714Su.A0z(A0v, c0589Nz.A04().A11(), A002, bundle);
        }
        return c0714Su;
    }

    public static boolean A03(C0589Nz c0589Nz, boolean z) {
        boolean z2 = false;
        if (!c0589Nz.A04().A0n() || !z) {
            return false;
        }
        Uri A002 = C0490Kc.A00(c0589Nz.A04().A0v().A0F().A05());
        String authority = A002.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c0589Nz.A05().A0E().A9v();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 126));
        boolean isInstantGames = A002.getQueryParameter(A01(155, 9, 116)) == null;
        String queryParameter = A002.getQueryParameter(A01(133, 22, 76));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c0589Nz.A04().A0P());
        boolean equals = c0589Nz.A05().getPackageName().equals(A01(109, 19, 122));
        boolean A0o = c0589Nz.A04().A0o();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!equals || A0o)) {
            z2 = true;
        }
        if (!z2) {
            int i = Build.VERSION.SDK_INT;
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "ixVJz4LKAvkUhWpfUwnrm68OXA5reQsq";
            strArr[1] = "n4hyezKFC81nHjNiPwRfUtRp762j8aVq";
            if (i >= 24) {
                c0589Nz.A05().A0E().A9u(A01(78, 11, 16) + isInstantGamesEnabled + A01(89, 20, 11) + isInstantGames + A01(46, 32, 42) + isGoogleFallBackUrlAvailable + A01(27, 19, 39) + equals + A01(0, 27, 111) + A0o);
            }
        }
        return z2;
    }
}
