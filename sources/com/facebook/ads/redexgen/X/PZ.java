package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* loaded from: assets/audience_network.dex */
public final class PZ extends LinearLayout {
    public static final int A00 = (int) (C0506Ku.A02 * 32.0f);
    public static final int A01 = (int) (C0506Ku.A02 * 8.0f);

    public PZ(YA ya, NativeAd nativeAd, J6 j6, C0572Ni c0572Ni, AdOptionsView adOptionsView) {
        super(ya);
        setOrientation(0);
        c0572Ni.setFullCircleCorners(true);
        int i = A00;
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(i, i);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c0572Ni, iconViewParams);
        TextView textView = new TextView(ya);
        j6.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(ya);
        j6.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(ya);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        ViewGroup.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
