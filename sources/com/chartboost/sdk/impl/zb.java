package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class zb {
    public static void a(String str) {
        if (!gb.f846a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void a(String str, Exception exc) {
        if ((!gb.f846a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
