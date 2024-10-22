package com.chartboost.sdk.impl;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lb {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return "Android";
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "deviceType", a());
        tb.a(jSONObject, "osVersion", c());
        tb.a(jSONObject, "os", b());
        return jSONObject;
    }
}
