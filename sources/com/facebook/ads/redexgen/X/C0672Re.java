package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0672Re extends LinearLayout implements PY {
    public final NativeBannerAd A00;
    public final YA A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C0506Ku.A02 * 42.0f);
    public static final int A03 = (int) (C0506Ku.A02 * 48.0f);
    public static final int A05 = (int) (C0506Ku.A02 * 54.0f);
    public static final int A07 = (int) (C0506Ku.A02 * 4.0f);
    public static final int A06 = (int) (C0506Ku.A02 * 8.0f);

    public C0672Re(YA ya, NativeBannerAd nativeBannerAd, J6 j6, J7 j7, MediaView mediaView, AdOptionsView adOptionsView) {
        super(ya);
        LinearLayout.LayoutParams ctaButtonParams;
        ViewGroup.LayoutParams layoutParams;
        ArrayList<View> arrayList = new ArrayList<>();
        this.A02 = arrayList;
        this.A00 = nativeBannerAd;
        this.A01 = ya;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(j7);
        C0573Nj c0573Nj = new C0573Nj(ya);
        c0573Nj.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        c0573Nj.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c0573Nj, layoutParams2);
        PV pv = new PV(ya, nativeBannerAd, j7, j6, adOptionsView);
        int i = A06;
        pv.setPadding(i, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(pv, layoutParams3);
        if (j7 != J7.A0A) {
            setPadding(i, i, i, i);
            setOrientation(1);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, i);
        } else {
            int i2 = A07;
            setPadding(i2, i2, i2, i2);
            setOrientation(0);
            ctaButtonParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, i2, 0);
        }
        ctaButtonParams.weight = 1.0f;
        addView(linearLayout, ctaButtonParams);
        TextView textView = new TextView(getContext());
        int i3 = A07;
        textView.setPadding(i, i3, i, i3);
        j6.A05(textView);
        textView.setText(nativeBannerAd.getAdCallToAction());
        addView(textView, layoutParams);
        arrayList.add(mediaView);
        arrayList.add(textView);
    }

    public static int A00(J7 j7) {
        switch (PW.A00[j7.ordinal()]) {
            case 1:
                return A04;
            case 2:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
