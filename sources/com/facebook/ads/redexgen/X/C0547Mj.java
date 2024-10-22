package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0547Mj extends LinearLayout {
    public static final int A03 = (int) (C0506Ku.A02 * 40.0f);
    public static final int A04 = (int) (C0506Ku.A02 * 20.0f);
    public static final int A05 = (int) (C0506Ku.A02 * 10.0f);
    public final C2K A00;
    public final YA A01;
    public final MT A02;

    public C0547Mj(YA ya, C2K c2k, MT mt, EnumC0515Ld enumC0515Ld) {
        this(ya, c2k, mt, null, enumC0515Ld);
    }

    public C0547Mj(YA ya, C2K c2k, MT mt, String str, EnumC0515Ld enumC0515Ld) {
        super(ya);
        this.A01 = ya;
        this.A00 = c2k;
        this.A02 = mt;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            LV.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(c2k.A03())) {
            View A00 = A00(enumC0515Ld, c2k.A03());
            int i = A05;
            A00.setPadding(0, i, 0, i);
            addView(A00, layoutParams);
        }
        C0553Mp A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(EnumC0515Ld enumC0515Ld, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C0516Le.A01(enumC0515Ld));
        TextView textView = new TextView(getContext());
        LV.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C0516Le.A01(EnumC0515Ld.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new ViewOnClickListenerC0545Mh(this));
        TextView titleView = new TextView(getContext());
        titleView.setGravity(17);
        titleView.setText(str);
        LV.A0X(titleView, true, 16);
        titleView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, i2, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(titleView, layoutParams2);
        return linearLayout;
    }

    private C0553Mp A03() {
        C0553Mp c0553Mp = new C0553Mp(this.A01);
        for (C2K c2k : this.A00.A05()) {
            MV mv = new MV(this.A01);
            mv.setData(c2k.A04(), null);
            mv.setOnClickListener(new ViewOnClickListenerC0546Mi(this, mv, c2k));
            c0553Mp.addView(mv);
        }
        return c0553Mp;
    }
}
