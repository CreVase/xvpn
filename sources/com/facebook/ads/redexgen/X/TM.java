package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TM extends MR {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2G A03;
    public final YA A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (C0506Ku.A02 * 8.0f);
        A07 = (int) (C0506Ku.A02 * 10.0f);
        A06 = (int) (C0506Ku.A02 * 44.0f);
    }

    public TM(YA ya, InterfaceC0444If interfaceC0444If, String str) {
        super(ya, interfaceC0444If, str);
        this.A04 = ya;
        this.A03 = C2H.A00(ya.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        imageView.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i2, i2);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        LV.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0L() {
        this.A00.setImageBitmap(C0516Le.A01(EnumC0515Ld.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC0548Mk(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        MV mv = new MV(this.A04);
        mv.setData(this.A03.A0H(), EnumC0515Ld.HIDE_AD);
        mv.setOnClickListener(new ViewOnClickListenerC0549Ml(this, mv));
        MV mv2 = new MV(this.A04);
        mv2.setData(this.A03.A0L(), EnumC0515Ld.REPORT_AD);
        mv2.setOnClickListener(new ViewOnClickListenerC0550Mm(this, mv2));
        MV mv3 = new MV(this.A04);
        mv3.setData(this.A03.A0M(), EnumC0515Ld.AD_CHOICES_ICON);
        mv3.setOnClickListener(new ViewOnClickListenerC0551Mn(this, mv3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        menuParams.setMargins(i, i, i, i);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LV.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(mv, menuParams);
        linearLayout.addView(mv2, menuParams);
        linearLayout.addView(mv3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0M() {
        LV.A0I(this);
        LV.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0N(C2K c2k, C2I c2i) {
        String A0H;
        EnumC0515Ld enumC0515Ld;
        int i;
        this.A00.setOnClickListener(null);
        if (c2i == C2I.A05) {
            A0H = this.A03.A0F();
            enumC0515Ld = EnumC0515Ld.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC0515Ld = EnumC0515Ld.HIDE_AD;
            i = -13272859;
        }
        MP A0I = new MP(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        MP A0H2 = A0I.A0H(title);
        String title2 = c2k.A04();
        MQ adHiddenView = A0H2.A0F(title2).A0K(false).A0E(enumC0515Ld).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LV.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0O(C2K c2k, C2I c2i) {
        boolean isReportFlow = c2i == C2I.A05;
        C0547Mj c0547Mj = new C0547Mj(this.A04, c2k, this.A0B, isReportFlow ? EnumC0515Ld.REPORT_AD : EnumC0515Ld.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(C0516Le.A01(EnumC0515Ld.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC0552Mo(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        LV.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c0547Mj, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final boolean A0P() {
        return true;
    }
}
