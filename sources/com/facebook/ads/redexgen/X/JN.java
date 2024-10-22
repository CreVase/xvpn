package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class JN {
    public static JL A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C0507Kv.A04(i, screenHeight)) {
            return JL.A0H;
        }
        if (screenHeight > i) {
            return JL.A0J;
        }
        return JL.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, JJ jj) {
        int ceil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = jj.A03();
        if (i >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = jj.A03();
            ceil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = jj.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
