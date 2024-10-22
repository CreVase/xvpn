package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class P6 {
    public final int[] A00(View view, int i, int i2) {
        C01134d c01134d = (C01134d) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c01134d.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c01134d.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c01134d.leftMargin + c01134d.rightMargin, childWidthSpec3 + c01134d.bottomMargin + c01134d.topMargin};
    }
}
