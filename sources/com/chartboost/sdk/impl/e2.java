package com.chartboost.sdk.impl;

import defpackage.hx2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e2 {
    public final void a(i2 i2Var, String str, String str2) {
        b(k6.ON_BACKGROUND.c(), i2Var, str, str2);
    }

    public final void b(String str, i2 i2Var, String str2, String str3) {
        a(hx2.q("javascript:Chartboost.EventHandler.handleNativeEvent(\"", str, "\")"), i2Var, str2, str3);
    }

    public final void c(i2 i2Var, String str, String str2) {
        b(k6.VIDEO_ENDED.c(), i2Var, str, str2);
    }

    public final void d(i2 i2Var, String str, String str2) {
        b(k6.VIDEO_FAILED.c(), i2Var, str, str2);
    }

    public final void a(i2 i2Var, float f, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f));
        a(k6.PLAYBACK_TIME.c(), jSONObject.toString(), i2Var, str, str2);
    }

    public final void a(String str, String str2, i2 i2Var, String str3, String str4) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ')', i2Var, str3, str4);
    }

    public final void a(String str, i2 i2Var, String str2, String str3) {
        try {
            if (i2Var != null) {
                f6.a("CBTemplateProxy", "Calling native to javascript: " + str);
                i2Var.loadUrl(str);
            } else {
                y3.d(new j3("show_webview_error", "Webview is null", str3, str2, null, 16, null));
                f6.c("CBTemplateProxy", "Calling native to javascript webview is null");
            }
        } catch (Exception e) {
            y3.d(new j3("show_webview_crash", "Cannot open url", str3, str2, null, 16, null));
            f6.c("CBTemplateProxy", "Calling native to javascript. Cannot open url: " + e);
        }
    }

    public final void b(i2 i2Var, String str, String str2) {
        b(k6.ON_FOREGROUND.c(), i2Var, str, str2);
    }

    public final void b(i2 i2Var, float f, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f));
        a(k6.VIDEO_STARTED.c(), jSONObject.toString(), i2Var, str, str2);
    }
}
