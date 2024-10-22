package com.chartboost.sdk.impl;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f743a;

    public static p3 a() {
        UiModeManager uiModeManager = f743a;
        if (uiModeManager == null) {
            return p3.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? p3.OTHER : p3.CTV : p3.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f743a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
