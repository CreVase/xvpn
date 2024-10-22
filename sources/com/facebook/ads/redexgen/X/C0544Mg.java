package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0544Mg extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (C0506Ku.A02 * 8.0f);
    public static final int A06 = (int) (C0506Ku.A02 * 14.5d);
    public static final int A04 = (int) (C0506Ku.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C0544Mg(YA ya) {
        super(ya);
        ImageView imageView = new ImageView(ya);
        this.A00 = imageView;
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(ya);
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = A03;
        linearLayout.setLayoutParams(layoutParams2);
        TextView textView = new TextView(ya);
        this.A02 = textView;
        LV.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        linearLayout.addView(textView, layoutParams2);
        setOrientation(0);
        addView(imageView);
        addView(linearLayout);
    }

    public void setInfo(EnumC0515Ld enumC0515Ld, String str, String str2) {
        this.A00.setImageBitmap(C0516Le.A01(enumC0515Ld));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            LV.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i = A05;
            setPadding(0, i, 0, i);
            return;
        }
        int i2 = A06;
        setPadding(0, i2, 0, i2);
    }
}
