package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9D extends AbstractC0718Sy implements MB {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public View A00;
    public View A01;
    public YA A02;
    public C0501Kn A03;
    public AbstractC0530Ls A04;
    public PS A05;
    public JT A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC0531Lt A09;
    public final InterfaceC0569Nf A0A;
    public final C0570Ng A0B;
    public final RX A0C;
    public final C0466Jb A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public C9D(C0589Nz c0589Nz) {
        super(c0589Nz, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = c0589Nz.A05();
        this.A04 = c0589Nz.A08();
        View view = new View(this.A02);
        this.A01 = view;
        LV.A0K(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        InterfaceC0531Lt A09 = c0589Nz.A09();
        this.A09 = A09;
        C0579Np.A00(c0589Nz.A05(), this, getAdInfo().A0D().A07());
        RX A01 = A01(c0589Nz);
        this.A0C = A01;
        getAdDetailsView().bringToFront();
        C0466Jb A02 = A02(c0589Nz);
        this.A0D = A02;
        A13();
        this.A05 = new PS(this.A02, c0589Nz.A06(), getAdDataBundle());
        C0716Sw c0716Sw = new C0716Sw(this);
        this.A0A = c0716Sw;
        this.A0B = new C0570Ng(c0589Nz, getAdDataBundle(), A01, A02, getAdDetailsView(), A09, c0716Sw);
        if (IP.A19(getAdContextWrapper())) {
            NO.A00(A01.getVideoImplView(), IP.A1A(getAdContextWrapper()), new O1(this));
        }
    }

    private RX A01(C0589Nz c0589Nz) {
        RX rx = (RX) c0589Nz.A02();
        int A12 = A12(c0589Nz.A08());
        ImageView imageView = (ImageView) c0589Nz.A03();
        int i = AbstractC0718Sy.A0D;
        int i2 = AbstractC0718Sy.A0D;
        int toolbarHeight = AbstractC0718Sy.A0D;
        imageView.setPadding(i, i2, toolbarHeight, AbstractC0718Sy.A0D);
        int toolbarHeight2 = AbstractC0718Sy.A0E;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC0718Sy.A0E);
        int toolbarHeight3 = AbstractC0718Sy.A0C;
        layoutParams.setMargins(0, A12, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(rx, layoutParams2);
        rx.addView(imageView, layoutParams);
        return rx;
    }

    private C0466Jb A02(C0589Nz c0589Nz) {
        C0466Jb A0A = c0589Nz.A0A();
        A0A.A06(-1, AbstractC0718Sy.A09);
        A0A.setPadding(AbstractC0718Sy.A0H, AbstractC0718Sy.A0H, AbstractC0718Sy.A0H, AbstractC0718Sy.A0H);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC0718Sy.A0G);
        progressBarLayoutParams.addRule(12);
        addView(A0A, progressBarLayoutParams);
        return A0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        AbstractC0530Ls abstractC0530Ls = this.A04;
        if (abstractC0530Ls == null) {
            return;
        }
        this.A06 = new JT(abstractC0530Ls, 400, -abstractC0530Ls.getToolbarHeight(), 0);
    }

    private void A06() {
        new C0452In(getAdDataBundle().A11(), getAdEventManager()).A04(EnumC0451Im.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        LV.A0T(this);
        LV.A0H(this.A0C);
        LV.A0Z(this.A0C, this.A0D, this.A0B, this.A00);
        LV.A0L(this.A04);
        PS ps = this.A05;
        T3 ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<PR, View> A03 = ps.A03(ctaButton);
        this.A00 = (View) A03.second;
        switch (O2.A00[((PR) A03.first).ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A12(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                LV.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC0718Sy.A0F, AbstractC0718Sy.A0F, AbstractC0718Sy.A0F, AbstractC0718Sy.A0F);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            AbstractC0530Ls abstractC0530Ls = this.A04;
            if (abstractC0530Ls != null) {
                abstractC0530Ls.setToolbarActionMode(2);
                this.A04.setProgressImmediate(0.0f);
            }
            C0501Kn c0501Kn = new C0501Kn((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C0715Sv(this));
            this.A03 = c0501Kn;
            c0501Kn.A08();
        }
    }

    private void A07() {
        JT jt = this.A06;
        if (jt != null) {
            jt.A3U(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3U(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final void A0B(AnonymousClass75 anonymousClass75) {
        super.A0B(anonymousClass75);
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final void A0C(AnonymousClass71 anonymousClass71) {
        super.A0C(anonymousClass71);
        int videoLengthMs = anonymousClass71.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final void A0u() {
        super.A0u();
        A04();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0718Sy, com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final void A0z(C1D c1d, String str, double d, Bundle bundle) {
        super.A0z(c1d, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            C0570Ng c0570Ng = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            c0570Ng.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final boolean A10() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final boolean A11(boolean z) {
        if (z && !this.A08) {
            boolean z2 = this.A0E.get();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0G;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A0B.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0G[5].charAt(17) != 'k') {
            A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0E.get()) {
                this.A0C.A0a(EnumC0620Pe.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0718Sy
    public final void A13() {
        super.A13();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9D(this.A0C);
        }
    }

    public final boolean A14() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A14() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0718Sy, com.facebook.ads.redexgen.X.AbstractC0585Nv, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
