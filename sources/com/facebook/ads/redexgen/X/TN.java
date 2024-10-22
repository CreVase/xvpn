package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TN extends MR {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2G A04;
    public final YA A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (C0506Ku.A02 * 4.0f);
        A08 = (int) (C0506Ku.A02 * 10.0f);
        A07 = (int) (C0506Ku.A02 * 44.0f);
    }

    public TN(YA ya, InterfaceC0444If interfaceC0444If, String str) {
        super(ya, interfaceC0444If, str);
        this.A05 = ya;
        this.A04 = C2H.A00(ya.A01());
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i = A08;
        imageView.setPadding(i, i, i, i);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(-10459280);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.A00 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A03 = linearLayout2;
        linearLayout2.setOrientation(0);
        LV.A0M(linearLayout2, -218103809);
        linearLayout2.setMotionEventSplittingEnabled(false);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0L() {
        this.A01.setImageBitmap(C0516Le.A01(EnumC0515Ld.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC0538Ma(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        MV mv = new MV(this.A05);
        mv.setData(this.A04.A0H(), EnumC0515Ld.HIDE_AD);
        mv.setOnClickListener(new ViewOnClickListenerC0539Mb(this, mv));
        MV mv2 = new MV(this.A05);
        mv2.setData(this.A04.A0L(), EnumC0515Ld.REPORT_AD);
        mv2.setOnClickListener(new ViewOnClickListenerC0540Mc(this, mv2));
        MV mv3 = new MV(this.A05);
        mv3.setData(this.A04.A0M(), EnumC0515Ld.AD_CHOICES_ICON);
        mv3.setOnClickListener(new ViewOnClickListenerC0541Md(this, mv3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        LV.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(mv, layoutParams);
        this.A02.addView(mv2, layoutParams);
        this.A02.addView(mv3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0M() {
        LV.A0I(this);
        LV.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0N(C2K c2k, C2I c2i) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        LV.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        LV.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0O(C2K c2k, C2I c2i) {
        LV.A0T(this.A03);
        this.A01.setImageBitmap(C0516Le.A01(EnumC0515Ld.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC0542Me(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        for (C2K c2k2 : c2k.A05()) {
            MV mv = new MV(this.A05);
            mv.setData(c2k2.A04(), null);
            mv.setOnClickListener(new ViewOnClickListenerC0543Mf(this, mv, c2k2));
            this.A02.addView(mv, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final boolean A0P() {
        return true;
    }
}
