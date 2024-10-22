package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q6 {
    public static final p6 a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("viewabilitySettings");
        if (optJSONObject != null) {
            return new p6(jSONObject.optBoolean("enabled", false), jSONObject.optBoolean("verificationEnabled", false), optJSONObject.optInt("minVisibleDips", 1), optJSONObject.optInt("minVisibleDurationMs", 0), optJSONObject.optLong("visibilityCheckIntervalMs", 100L), optJSONObject.optInt("traversalLimit", 25));
        }
        return new p6(jSONObject.optBoolean("enabled", false), false, 0, 0, 0L, 0, 62, null);
    }
}
