package com.chartboost.sdk.impl;

import defpackage.i23;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class va {

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    public final void a(String str, a aVar) {
        if (a(str)) {
            f6.b("Chartboost", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource");
            if (aVar != null) {
                aVar.a(new JSONObject().put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    public final boolean a(String str) {
        return (str == null || !i23.R0(str, "Access-Control-Allow-Origin", false) || !i23.R0(str, "'null'", false) || i23.R0(str, "http://", false) || i23.R0(str, "https://", false)) ? false : true;
    }
}
