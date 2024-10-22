package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class EC extends ZB {
    public final /* synthetic */ AbstractC0868Yw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC(AbstractC0868Yw abstractC0868Yw, Context context) {
        super(context);
        this.A00 = abstractC0868Yw;
    }

    @Override // com.facebook.ads.redexgen.X.ZB, com.facebook.ads.redexgen.X.AbstractC01244p
    public final void A0I(View view, C01264r c01264r, C01224n c01224n) {
        AbstractC0868Yw abstractC0868Yw = this.A00;
        int[] A0H = abstractC0868Yw.A0H(abstractC0868Yw.A00.getLayoutManager(), view);
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
}
