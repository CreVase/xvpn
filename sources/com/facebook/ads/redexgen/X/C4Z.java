package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4Z {
    @Deprecated
    private final void A00(Rect rect, int i, ED ed) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, ED ed, C01264r c01264r) {
        A00(rect, ((C01134d) view.getLayoutParams()).A00(), ed);
    }
}
