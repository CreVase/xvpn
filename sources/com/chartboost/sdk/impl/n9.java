package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1015a;

    /* renamed from: b, reason: collision with root package name */
    public String f1016b;
    public int c;
    public int d;

    public n9(boolean z, String str, int i, int i2) {
        this.f1015a = z;
        this.f1016b = str;
        this.c = i;
        this.d = i2;
    }

    public String a() {
        return this.f1016b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.f1015a;
    }

    public static n9 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new n9(optJSONObject.optBoolean("enabled", false), optJSONObject.optString("endpoint", "https://ssp-events.chartboost.com/track/sdk"), optJSONObject.optInt("eventLimit", 10), optJSONObject.optInt("windowDuration", 60));
    }
}
