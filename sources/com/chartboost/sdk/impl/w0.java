package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t1;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.hx2;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1255b;
    public final String c;

    public w0(String str, String str2, String str3) {
        this.f1254a = str;
        this.f1255b = str2;
        this.c = str3;
    }

    public static Map<String, w0> b(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("templates".equals(next)) {
                    hashMap.putAll(a(jSONObject2, i));
                } else {
                    hashMap.putAll(a(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            f6.b("Asset", "v2PrefetchToAssets: " + e.toString());
        }
        return hashMap;
    }

    public String a() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Asset{directory='");
        sb.append(this.f1254a);
        sb.append("', filename='");
        sb.append(this.f1255b);
        sb.append("', url='");
        return hx2.s(sb, this.c, "'}");
    }

    public static Map<String, w0> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            f6.a("Asset", "deserializeAssets assetsJson is null");
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new w0(next, jSONObject3.getString("filename"), jSONObject3.getString(ImagesContract.URL)));
            }
        }
        return hashMap;
    }

    public static JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject a2 = t1.a(new t1.a[0]);
        if (jSONArray == null) {
            return a2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString4 = jSONObject.optString("param");
            if (!"param".equals(optString2) && optString4.isEmpty()) {
                JSONObject optJSONObject = a2.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = t1.a(new t1.a[0]);
                    a2.put(optString2, optJSONObject);
                }
                optJSONObject.put("html".equals(optString2) ? "body" : optString, t1.a(t1.a("filename", optString), t1.a(ImagesContract.URL, optString3)));
            }
        }
        return a2;
    }

    public static Map<String, w0> a(JSONObject jSONObject, int i) throws JSONException {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int min = Math.min(i, optJSONArray.length());
            for (int i2 = 0; i2 < min; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                Iterator<Map.Entry<String, w0>> it = a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    w0 value = it.next().getValue();
                    hashMap.put(value.f1255b, value);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, w0> a(JSONObject jSONObject, String str) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                hashMap.put(string, new w0(str, string, jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            }
        }
        return hashMap;
    }

    public File a(File file) {
        if (this.f1254a != null && this.f1255b != null) {
            String str = this.f1254a + "/" + this.f1255b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                StringBuilder u = hx2.u("Cannot create file for path: ", str, ". Error: ");
                u.append(e.toString());
                f6.a("Asset", u.toString());
            }
        } else {
            f6.a("Asset", "Cannot create file. Directory or filename is null.");
        }
        return null;
    }
}
