package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class NO {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            NN nn = new NN(onClickListener);
            view.setOnClickListener(nn);
            view.setOnTouchListener(new NM(nn));
        }
    }
}
