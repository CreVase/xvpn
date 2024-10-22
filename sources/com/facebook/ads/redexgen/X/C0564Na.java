package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0564Na extends Button {
    public static final int A0A = (int) (C0506Ku.A02 * 16.0f);
    public static final int A0B = (int) (C0506Ku.A02 * 4.0f);
    public int A00;
    public int A01;
    public C1M A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public C0564Na(YA ya, C1M c1m) {
        super(ya);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new T2(this);
        this.A09 = new T1(this);
        this.A02 = c1m;
        this.A07 = IP.A04(ya);
        this.A06 = IP.A00(ya);
        LV.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C1M c1m = this.A02;
        if (c1m != null) {
            this.A00 = c1m.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        LV.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (IP.A27(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public C1M getColorInfo() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1M c1m) {
        this.A02 = c1m;
        A03();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A03();
    }
}
