package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class OL extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final T3 A02;
    public final C0589Nz A03;
    public static final int A06 = (int) (C0506Ku.A02 * 36.0f);
    public static final int A07 = (int) (C0506Ku.A02 * 36.0f);
    public static final int A04 = (int) (C0506Ku.A02 * 23.0f);
    public static final int A05 = (int) (C0506Ku.A02 * 3.0f);
    public static final int A08 = (int) (C0506Ku.A02 * 4.0f);

    public OL(C0589Nz c0589Nz, String str, C1M c1m, NV nv) {
        super(c0589Nz.A05());
        this.A03 = c0589Nz;
        this.A00 = c1m.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c0589Nz.A05());
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(str);
        T3 t3 = new T3(c0589Nz.A05(), c0589Nz.A04().A0K(), null, c0589Nz.A06(), c0589Nz.A09(), c0589Nz.A0B(), c0589Nz.A07(), c0589Nz.A04().A0x());
        this.A02 = t3;
        t3.setCta(c0589Nz.A04().A0v().A0F(), c0589Nz.A04().A11(), new HashMap(), nv);
        t3.setIsInAppBrowser(true);
        addView(t3, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(C0516Le.A01(EnumC0515Ld.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        LV.A0K(button);
        int i = A07;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        LV.A0O(button, this.A00, A08);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A06);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC0924aS abstractC0924aS, AbstractC0530Ls abstractC0530Ls) {
        this.A02.A0A(abstractC0924aS, abstractC0530Ls);
    }
}
