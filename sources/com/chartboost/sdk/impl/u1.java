package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u1 {
    public static final JSONObject a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            f6.b("CBJSON", "put (" + str + ')' + e);
        }
        return jSONObject;
    }

    public static final Boolean a(JSONObject jSONObject, String str) {
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            return null;
        }
    }
}
