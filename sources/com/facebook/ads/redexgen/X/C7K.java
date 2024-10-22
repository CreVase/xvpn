package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7K extends SH {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    public AbstractC0585Nv A00;
    public PU A01;
    public EnumC0625Pj A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C5H A09;
    public final C0616Pa A0A;
    public final RX A0B;
    public final AnonymousClass76 A0C;
    public final AbstractC0591Ob A0D;
    public final AbstractC0577Nn A0E;
    public final MU A0F;
    public final MI A0G;
    public final MA A0H;
    public final M9 A0I;
    public final C0480Jr A0J;
    public final C0466Jb A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C7K(YA ya, MM mm, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya, mm, interfaceC0444If, abstractC0924aS, c6q, interfaceC0531Lt);
        this.A09 = new S6(this);
        MA ma = new MA() { // from class: com.facebook.ads.redexgen.X.8A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                C7K.this.A07 = true;
            }
        };
        this.A0H = ma;
        MI mi = new MI() { // from class: com.facebook.ads.redexgen.X.89
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                C7K.this.A08 = true;
                C7K.this.A0P();
            }
        };
        this.A0G = mi;
        MU mu = new MU() { // from class: com.facebook.ads.redexgen.X.88
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
            }
        };
        this.A0F = mu;
        M9 m9 = new M9() { // from class: com.facebook.ads.redexgen.X.80
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass71 anonymousClass71) {
                AbstractC0585Nv abstractC0585Nv;
                C7K.this.A0F(anonymousClass71);
                C7K.this.A0E(anonymousClass71);
                abstractC0585Nv = C7K.this.A00;
                abstractC0585Nv.A0C(anonymousClass71);
            }
        };
        this.A0I = m9;
        AbstractC0591Ob abstractC0591Ob = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.7t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                RX rx;
                C7K c7k = C7K.this;
                rx = c7k.A0B;
                c7k.A0D(anonymousClass75, rx.getState() != QY.A06, false);
            }
        };
        this.A0D = abstractC0591Ob;
        C7N c7n = new C7N(this);
        this.A0E = c7n;
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        RX rx = new RX(super.A03);
        this.A0B = rx;
        rx.setFunnelLoggingHandler(super.A05);
        rx.getEventBus().A03(ma, mi, mu, m9, abstractC0591Ob, c7n);
        this.A0C = new AnonymousClass76(super.A03, super.A04, rx, super.A01.A11());
        if (IP.A1Y(super.A03)) {
            this.A0A = new C0616Pa(super.A03, super.A04, rx, super.A01.A11(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new PU(super.A03, super.A09, super.A01.A0S(), interfaceC0531Lt);
        this.A0J = new C0480Jr(super.A03, super.A05);
        this.A0K = new C0466Jb(super.A03);
        A07();
        rx.setVideoURI(super.A02.A0S(super.A01.A0v().A0D().A08()));
        A05();
        int A03 = super.A01.A0v().A0D().A03();
        if (IP.A1s(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0v().A0M() && super.A01.A0v().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        LV.A0M(this, super.A01.A0u().A01().A07(true));
        if (IP.A1m(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC0585Nv A00(int i) {
        return C0586Nw.A00(new C0588Ny(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i).A0F(this.A0J).A0I(this.A0K).A0K(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new S5(this), IP.A0K(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new S4(this), IP.A0L(super.A03));
    }

    private void A06() {
        this.A05 = true;
        super.A07.A04();
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            abstractC0585Nv.A0x();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0v().A0D().A07())) {
            C01666j c01666j = new C01666j(super.A03);
            this.A0B.A0c(c01666j);
            c01666j.setImage(super.A01.A0v().A0D().A07());
        }
        C6E c6e = new C6E(super.A03, true, super.A05);
        this.A0B.A0c(c6e);
        this.A0B.A0c(new C0482Ju(c6e, EnumC0638Pw.A03, true));
        this.A0B.A0c(new C6Z(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass75 anonymousClass75, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            abstractC0585Nv.A0B(anonymousClass75);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(AnonymousClass71 anonymousClass71) {
        if (this.A0B.getState() == QY.A02 && IP.A1E(super.A03)) {
            this.A0B.postDelayed(new S7(this, anonymousClass71), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(AnonymousClass71 anonymousClass71) {
        int A00 = anonymousClass71.A00();
        if (this.A03) {
            int currentPosMs = A00 / 1000;
            int A02 = super.A01.A0v().A0D().A02() - currentPosMs;
            if (!T3.A08(super.A01)) {
                if (A02 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A10().A02().replace(A03(0, 6, 74), String.valueOf(A02)));
                } else {
                    super.A07.setToolbarActionMessage(A03(0, 0, 25));
                }
            }
            if (A02 <= 0) {
                String[] strArr = A0M;
                String str = strArr[2];
                String str2 = strArr[7];
                int totalSecondsForReward = str.length();
                int currentPosMs2 = str2.length();
                if (totalSecondsForReward == currentPosMs2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                A0H(false, false);
            }
        }
        int currentPosMs3 = super.A01.A0v().A0D().A03();
        float f = currentPosMs3 * 1000.0f;
        int currentPosMs4 = this.A0B.getDuration();
        float seenPercentage = A00 / Math.min(f, currentPosMs4);
        super.A07.setProgress(100.0f * seenPercentage);
        if (seenPercentage >= 1.0f && !this.A05) {
            A06();
            AbstractC0530Ls abstractC0530Ls = super.A07;
            int currentPosMs5 = getCloseButtonStyle();
            abstractC0530Ls.setToolbarActionMode(currentPosMs5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int i = 0;
        int i2 = 0;
        RX rx = this.A0B;
        if (rx != null) {
            i = rx.getCurrentPositionInMillis();
            i2 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0E().A2v(str);
        if (IP.A1F(super.A03)) {
            A0D(new AnonymousClass75(i, i2), false, true);
            return;
        }
        InterfaceC0531Lt interfaceC0531Lt = super.A08;
        int duration = A0M[3].charAt(0);
        if (duration == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC0531Lt.A3z(super.A09.A6r());
        super.A08.A3z(super.A09.A6n());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A3z(super.A09.A5o());
            this.A01.A05();
            this.A03 = false;
            AbstractC0585Nv abstractC0585Nv = this.A00;
            if (abstractC0585Nv != null) {
                abstractC0585Nv.A0v();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final void A0Q() {
        LV.A0L(this.A00);
        LV.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0v().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(EnumC0625Pj.A02, 20);
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null && this.A03) {
            abstractC0585Nv.A0w();
        }
        AbstractC0585Nv abstractC0585Nv2 = this.A00;
        if (abstractC0585Nv2 != null && !this.A05) {
            abstractC0585Nv2.A0y();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final void A0S(C5J c5j) {
        c5j.A0N(this.A09);
        int orientation = c5j.A0J().getResources().getConfiguration().orientation;
        AbstractC0585Nv A00 = A00(orientation);
        this.A00 = A00;
        addView(A00, SH.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        LV.A0H(this.A00);
        LV.A0H(super.A07);
        AbstractC0585Nv abstractC0585Nv = this.A00;
        setUpFullscreenMode(abstractC0585Nv != null && abstractC0585Nv.A10());
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final boolean A0T() {
        AbstractC0585Nv abstractC0585Nv = this.A00;
        return abstractC0585Nv != null && abstractC0585Nv.A11(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        EnumC0625Pj enumC0625Pj;
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == QY.A06 || (enumC0625Pj = this.A02) == null) {
            return;
        }
        if (!this.A04 || z) {
            RX rx = this.A0B;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            rx.A0b(enumC0625Pj, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            return abstractC0585Nv.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        super.onDestroy();
        if (IP.A1X(super.A03)) {
            super.A03.A0A().AFz(this.A0B);
        }
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            abstractC0585Nv.A0u();
        }
        RX rx = this.A0B;
        if (rx != null) {
            if (!this.A06) {
                rx.A0a(EnumC0620Pe.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        C0616Pa c0616Pa = this.A0A;
        if (c0616Pa != null) {
            c0616Pa.A0A();
        }
        this.A0C.A0g();
    }

    public void setServerSideRewardHandler(PU pu) {
        this.A01 = pu;
    }
}
