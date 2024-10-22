package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MQ extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2G A02;
    public final YA A03;
    public final MT A04;
    public final boolean A05;

    static {
        int i = (int) (C0506Ku.A02 * 16.0f);
        A09 = i;
        A0A = (int) (C0506Ku.A02 * 8.0f);
        A0D = (int) (C0506Ku.A02 * 44.0f);
        int i2 = (int) (C0506Ku.A02 * 10.0f);
        A08 = i2;
        A07 = i - i2;
        A0E = (int) (C0506Ku.A02 * 75.0f);
        A0B = (int) (C0506Ku.A02 * 25.0f);
        A0F = (int) (C0506Ku.A02 * 45.0f);
        A0C = (int) (C0506Ku.A02 * 15.0f);
        A06 = (int) (C0506Ku.A02 * 16.0f);
    }

    public MQ(MP mp) {
        super(MP.A01(mp));
        YA A01 = MP.A01(mp);
        this.A03 = A01;
        this.A02 = C2H.A00(A01.A01());
        this.A04 = MP.A03(mp);
        this.A01 = MP.A09(mp) ? A0E : A0F;
        this.A00 = MP.A09(mp) ? A0B : A0C;
        this.A05 = MP.A0A(mp);
        setFocusable(true);
        View A012 = A01(mp);
        View A00 = A00(mp);
        View footerView = getFooterView();
        LV.A0K(A012);
        LV.A0K(A00);
        LV.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A012.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(A012, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(MP.A0B(mp) ? 0 : 8);
    }

    public /* synthetic */ MQ(MP mp, MN mn) {
        this(mp);
    }

    private View A00(MP mp) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C0516Le.A01(MP.A02(mp)));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(MP.A00(mp));
        LV.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A09;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        LV.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(MP.A04(mp));
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i3, 0, i3, i3);
        TextView textView2 = new TextView(getContext());
        LV.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(MP.A05(mp));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i3, 0, i3, i3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (MP.A08(mp)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(MP.A06(mp))) {
                C0572Ni c0572Ni = new C0572Ni(this.A03);
                int i4 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i4, i4);
                subtitleParams.setMargins(0, 0, A0A, 0);
                c0572Ni.setFullCircleCorners(true);
                new T8(c0572Ni, this.A03).A05(i4, i4).A07(MP.A06(mp));
                linearLayout2.addView(c0572Ni, subtitleParams);
            }
            MV mv = new MV(this.A03);
            mv.setData(MP.A07(mp), EnumC0515Ld.CHECKMARK);
            mv.setSelected(true);
            linearLayout2.addView(mv, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(MP mp) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (MP.A0C(mp)) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C0516Le.A01(EnumC0515Ld.CROSS));
            imageView.setOnClickListener(new MN(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C0516Le.A01(EnumC0515Ld.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LV.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new MO(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
