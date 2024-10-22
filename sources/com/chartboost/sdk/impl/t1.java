package com.chartboost.sdk.impl;

import defpackage.hx2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t1 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1145a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f1146b;

        public a(String str, Object obj) {
            this.f1145a = str;
            this.f1146b = obj;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder u = hx2.u("put (", str, ")");
            u.append(e.toString());
            f6.b("CBJSON", u.toString());
        }
    }

    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.f1145a, aVar.f1146b);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }
}
