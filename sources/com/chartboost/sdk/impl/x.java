package com.chartboost.sdk.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.model.AdPayload;
import defpackage.m20;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public int f1285b;

    /* renamed from: a, reason: collision with root package name */
    public String f1284a = "";
    public String c = "";
    public String d = "";

    public final r a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
            JSONObject jSONObject2 = jSONObject.getJSONObject("webview");
            a(jSONObject2.getJSONArray("elements"), linkedHashMap, linkedHashMap2);
            String string = jSONObject2.getString(AdPayload.KEY_TEMPLATE);
            String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string2 = jSONObject.getString("ad_id");
            String str = this.d;
            String string3 = jSONObject.getString("cgn");
            String string4 = jSONObject.getString("creative");
            String optString2 = jSONObject.optString("media-type");
            String str2 = this.f1284a;
            String a2 = y.a(str2);
            String string5 = jSONObject.getString("link");
            String optString3 = jSONObject.optString("deep-link");
            String string6 = jSONObject.getString("to");
            int i = this.f1285b;
            String str3 = this.c;
            w0 w0Var = (w0) linkedHashMap.get("body");
            if (w0Var != null) {
                return new r(optString, string2, str, string3, string4, optString2, linkedHashMap, str2, a2, string5, optString3, string6, i, str3, string, w0Var, linkedHashMap2, b(jSONObject.optJSONObject("events")), null, null, y.a(jSONObject.optInt("mtype")), 786432, null);
            }
            throw new IllegalStateException("WebView AdUnit does not have a template html body asset".toString());
        }
        throw new JSONException("Missing response");
    }

    public final Map<String, List<String>> b(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                hashMap.put(next, arrayList);
            }
        }
        return hashMap;
    }

    public final void a(JSONArray jSONArray, Map<String, w0> map, Map<String, String> map2) throws JSONException {
        Iterator it = n4.iterator(jSONArray);
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString = jSONObject.optString("param");
            if (string2 != null) {
                int hashCode = string2.hashCode();
                if (hashCode != -1333900842) {
                    if (hashCode != 3213227) {
                        if (hashCode == 106436749 && string2.equals("param")) {
                            map2.put(optString, string3);
                            if (m20.L(string, "reward_amount")) {
                                a(string3);
                            } else if (m20.L(string, "reward_currency")) {
                                this.c = string3;
                            } else if (m20.L("impression_id", string)) {
                                this.d = string3;
                            }
                        }
                    } else if (string2.equals("html")) {
                        if (optString.length() == 0) {
                            optString = "body";
                        }
                    }
                } else if (string2.equals("preCachedVideo")) {
                    this.f1284a = string3;
                }
                map.put(optString, new w0(string2, string, string3));
            }
            if (optString.length() == 0) {
                optString = string;
            }
            map.put(optString, new w0(string2, string, string3));
        }
    }

    public final void a(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.f1285b = i;
    }
}
