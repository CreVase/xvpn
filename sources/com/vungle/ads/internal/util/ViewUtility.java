package com.vungle.ads.internal.util;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ViewUtility {
    public static final ViewUtility INSTANCE = new ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
