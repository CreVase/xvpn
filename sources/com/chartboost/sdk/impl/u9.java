package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebSettings;

/* loaded from: classes.dex */
public final class u9 {

    /* renamed from: a, reason: collision with root package name */
    public static final u9 f1184a = new u9();

    /* renamed from: b, reason: collision with root package name */
    public static String f1185b = "Invalid user-agent value";

    public final String a() {
        return f1185b;
    }

    public final void a(Context context) {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e) {
            a(e.toString());
            str = "";
        }
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e2) {
            a(e2.toString());
        }
        if (str != null) {
            f1185b = str;
        }
    }

    public final void a(String str) {
        try {
            y3.d(new w3("user_agent_update_error", str, "", ""));
        } catch (Exception unused) {
        }
    }
}
