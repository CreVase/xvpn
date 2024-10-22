package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class EF extends ZB {
    public final /* synthetic */ EE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EF(EE ee, Context context) {
        super(context);
        this.A00 = ee;
    }

    @Override // com.facebook.ads.redexgen.X.ZB, com.facebook.ads.redexgen.X.AbstractC01244p
    public final void A0I(View view, C01264r c01264r, C01224n c01224n) {
        EE ee = this.A00;
        int[] A0H = ee.A0H(((AbstractC0868Yw) ee).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c01224n.A04(time, dy, dx, ((ZB) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
