package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PN extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC0924aS A03;
    public final C1Z A04;
    public final YA A05;
    public final InterfaceC0444If A06;
    public final NE A07;
    public final TA A08;
    public final PL A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (C0506Ku.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public PN(YA ya, AbstractC0924aS abstractC0924aS, C1Z c1z, InterfaceC0444If interfaceC0444If, PL pl, Map<String, String> playableMetricsData) {
        super(ya);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new TD() { // from class: com.facebook.ads.redexgen.X.7G
            @Override // com.facebook.ads.redexgen.X.NE
            public final void AAY() {
            }

            @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
            public final void ABM(int i, String str) {
                AtomicBoolean atomicBoolean;
                PL pl2;
                atomicBoolean = PN.this.A0B;
                atomicBoolean.set(true);
                pl2 = PN.this.A09;
                pl2.ABu();
            }

            @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
            public final void ABZ() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                PL pl2;
                atomicBoolean = PN.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = PN.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                pl2 = PN.this.A09;
                pl2.ABZ();
            }

            @Override // com.facebook.ads.redexgen.X.NE
            public final void ADZ() {
                PL pl2;
                pl2 = PN.this.A09;
                pl2.ADZ();
            }
        };
        this.A05 = ya;
        this.A03 = abstractC0924aS;
        this.A04 = c1z;
        this.A06 = interfaceC0444If;
        this.A09 = pl;
        this.A02 = playableMetricsData;
        TA A04 = A04();
        this.A08 = A04;
        if (IP.A1X(ya)) {
            ya.A0A().AGA(A04, abstractC0924aS.A11(), false);
        }
        addView(A04, A0F);
    }

    public static /* synthetic */ int A00(PN pn) {
        int i = pn.A00;
        pn.A00 = i + 1;
        return i;
    }

    private TA A04() {
        TA ta = new TA(this.A05, (WeakReference<NE>) new WeakReference(this.A07), 10, IP.A1e(this.A05));
        ta.setCornerRadius(A0E);
        ta.setLogMultipleImpressions(false);
        ta.setCheckAssetsByJavascriptBridge(false);
        ta.setWebViewTimeoutInMillis(this.A04.A08());
        ta.setRequestId(this.A03.A0R());
        ta.setOnTouchListener(new PM(this));
        WebSettings settings = ta.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            ta.addJavascriptInterface(new PO(this.A05, this, this.A06, this.A02, this.A03.A11()), A06(0, 12, 104));
        }
        return ta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:            if (r3 <= com.facebook.ads.redexgen.X.IP.A0H(r8)) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:            r3 = r9.A09;        r2 = com.facebook.ads.redexgen.X.PN.A0D;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:            if (r2[0].charAt(14) == r2[7].charAt(14)) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:            r3.AAy();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:            r2 = com.facebook.ads.redexgen.X.PN.A0D;        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";        r3.AAy();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:            r6.A03(0);        r9.A05.A07().A9M(r5, com.facebook.ads.redexgen.X.C01997x.A2D, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:            if (r3 <= com.facebook.ads.redexgen.X.IP.A0H(r8)) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PN.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C02007y c02007y = new C02007y(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A11());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            c02007y.A05(jSONObject);
            c02007y.A03(1);
            InterfaceC01987w A07 = this.A05.A07();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C01997x.A2F;
            String A06 = A06(155, 15, 98);
            A07.A9N(A06, i, c02007y);
            if (IP.A0o(this.A05) && LK.A00(this.A05) == LJ.A07) {
                this.A05.A07().A9N(A06, C01997x.A2E, c02007y);
                this.A07.ABM(0, null);
                return;
            }
        }
        try {
            TA ta = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            ta.loadUrl(A0E2);
        } catch (Exception e2) {
            this.A05.A07().A9M(A06(192, 8, 57), C01997x.A2c, new C02007y(e2));
        }
    }

    public final void A0C() {
        if (IP.A1X(this.A05)) {
            YA ya = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            ya.A0A().AFz(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
        } else {
            this.A08.destroy();
        }
    }

    public LN getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C0643Qb getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
