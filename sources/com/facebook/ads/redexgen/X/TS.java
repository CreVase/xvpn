package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TS implements InterfaceC0532Lu {
    public static byte[] A0D;
    public int A00;
    public C0616Pa A01;
    public AnonymousClass76 A02;
    public String A03;
    public final YA A04;
    public final InterfaceC0444If A05;
    public final InterfaceC0531Lt A06;
    public final MH A07;
    public final RX A08;
    public final AbstractC0591Ob A09;
    public final AbstractC0577Nn A0A;
    public final MU A0B;
    public final MI A0C;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public TS(YA ya, MH mh, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt) {
        AD ad = new AD(this);
        this.A0C = ad;
        A6 a6 = new A6(this);
        this.A0B = a6;
        AbstractC0591Ob abstractC0591Ob = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.9r
            public static byte[] A01;
            public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
                String[] strArr = A02;
                if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
                A01 = bArr;
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                InterfaceC0531Lt interfaceC0531Lt2;
                interfaceC0531Lt2 = TS.this.A06;
                interfaceC0531Lt2.A40(A00(0, 21, 69), anonymousClass75);
            }
        };
        this.A09 = abstractC0591Ob;
        AbstractC0577Nn abstractC0577Nn = new AbstractC0577Nn() { // from class: com.facebook.ads.redexgen.X.9l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(OK ok) {
                MH mh2;
                mh2 = TS.this.A07;
                mh2.ABN();
            }
        };
        this.A0A = abstractC0577Nn;
        this.A04 = ya;
        this.A05 = interfaceC0444If;
        this.A07 = mh;
        RX rx = new RX(ya);
        this.A08 = rx;
        rx.A0c(new C01726r(ya));
        rx.getEventBus().A03(ad, a6, abstractC0591Ob, abstractC0577Nn);
        this.A06 = interfaceC0531Lt;
        rx.setIsFullScreen(true);
        rx.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC0531Lt.A3Q(rx, layoutParams);
        C0535Lx closeButton = new C0535Lx(ya);
        closeButton.setOnClickListener(new MF(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC0531Lt.A3Q(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        String ctaText = A02(8, 11, 102);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            PA pa = new PA(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * C0506Ku.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            pa.setOnClickListener(new MG(this));
            this.A06.A3Q(pa, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A02 = new AnonymousClass76(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 1)));
        if (IP.A1Y(this.A04)) {
            this.A01 = new C0616Pa(this.A04, this.A05, this.A08, this.A03, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A08.A0Y(i2);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A08.A0b(EnumC0625Pj.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        this.A06.A40(A02(37, 21, 27), new NQ());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        this.A06.A40(A02(37, 21, 27), new N3());
        if (!this.A08.A0j()) {
            this.A08.A0b(EnumC0625Pj.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        this.A06.A40(A02(37, 21, 27), new M8(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0d(this.A08.getCurrentPositionInMillis());
        C0616Pa c0616Pa = this.A01;
        if (c0616Pa != null) {
            c0616Pa.A09();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
