package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class P3 extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final YA A02;
    public final C0572Ni A03;
    public final C0578No A04;
    public static final int A07 = (int) (C0506Ku.A02 * 16.0f);
    public static final int A08 = (int) (C0506Ku.A02 * 16.0f);
    public static final int A06 = (int) (C0506Ku.A02 * 8.0f);
    public static final int A05 = (int) (C0506Ku.A02 * 72.0f);

    public P3(P1 p1) {
        super(P1.A04(p1));
        YA A04 = P1.A04(p1);
        this.A02 = A04;
        this.A03 = new C0572Ni(A04);
        this.A04 = new C0578No(A04, P1.A02(p1), true, false, true);
        this.A01 = P1.A00(p1);
        A03(p1);
    }

    public /* synthetic */ P3(P1 p1, S8 s8) {
        this(p1);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(P1 p1) {
        if (!TextUtils.isEmpty(P1.A05(p1))) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i = A08;
            linearLayout2.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LV.A0X(textView, false, 16);
            textView.setText(P1.A05(p1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new T8(imageView, this.A02).A04().A07(P1.A06(p1));
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams2.setMargins(0, 0, i / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            LV.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(P1 p1) {
        LV.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (P1.A01(p1).A00() == C1I.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new T8(this.A03, this.A02).A04().A07(P1.A03(p1).A01());
        this.A04.A03(P1.A01(p1).A06(), P1.A03(p1).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i2, i2);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(p1);
        LV.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(P2 p2) {
        A00();
        postDelayed(new S8(this, p2), this.A01);
    }
}
