package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class M3 extends RelativeLayout {
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (C0506Ku.A02 * 60.0f);
    public static final int A07 = (int) (C0506Ku.A02 * 8.0f);
    public static final int A09 = (int) (C0506Ku.A02 * 16.0f);
    public static final int A0A = (int) (C0506Ku.A02 * 24.0f);
    public static final int A06 = (int) (C0506Ku.A02 * 12.0f);

    public M3(YA ya, int i, int i2, String str, String str2, String str3, String str4, Bitmap bitmap) {
        super(ya);
        TextView textView = new TextView(ya);
        this.A05 = textView;
        Button button = new Button(ya);
        this.A02 = button;
        Button button2 = new Button(ya);
        this.A01 = button2;
        ImageView imageView = new ImageView(ya);
        this.A03 = imageView;
        this.A04 = new LinearLayout(ya);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(ya);
        }
        textView.setText(str);
        textView.setTextColor(i);
        LV.A0X(textView, true, 20);
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(str2);
            this.A00.setTextColor(i);
            LV.A0X(this.A00, false, 18);
        }
        imageView.setImageBitmap(bitmap);
        imageView.setColorFilter(i);
        button.setText(str3);
        LV.A0X(button, true, 18);
        button.setAllCaps(true);
        button.setTextColor(i2);
        int i3 = A06;
        button.setPadding(i3, i3, i3, i3);
        button2.setText(str4);
        LV.A0X(button2, true, 18);
        button2.setAllCaps(true);
        button2.setTextColor(i);
        button2.setPadding(i3, i3, i3, i3);
        int A01 = C00632d.A01(i2, 20);
        int i4 = A07;
        LV.A0O(button, i, i4);
        LV.A0O(button2, A01, i4);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i = A0A;
        setPadding(i, i, i, i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i2 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        int i3 = A09;
        layoutParams2.setMargins(0, 0, 0, i3);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, i3 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, layoutParams3);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, 0, 0, i3);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, i3);
        this.A04.addView(this.A02, layoutParams5);
        this.A04.addView(this.A01, layoutParams5);
    }
}
