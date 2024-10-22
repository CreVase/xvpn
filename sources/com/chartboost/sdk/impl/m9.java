package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m9 {
    public String a(o9 o9Var, v3 v3Var) {
        String str;
        String str2;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        if (o9Var != null && v3Var != null) {
            try {
                j9 j = o9Var.j();
                if (j != null) {
                    str = j.b();
                    str2 = j.a();
                } else {
                    str = "";
                    str2 = "";
                }
                String a2 = o9Var.a();
                if (a2 != null) {
                    a2 = a2.toLowerCase();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("chartboost_sdk_autocache_enabled", v3Var.c());
                jSONObject2.put("chartboost_sdk_gdpr", v3Var.f());
                String d = v3Var.d();
                if (d != null && d.length() > 0) {
                    jSONObject2.put("chartboost_sdk_ccpa", d);
                }
                String e = v3Var.e();
                if (e != null && e.length() > 0) {
                    jSONObject2.put("chartboost_sdk_coppa", e);
                }
                String g = v3Var.g();
                if (g != null && g.length() > 0) {
                    jSONObject2.put("chartboost_sdk_lgpd", g);
                }
                Mediation e2 = o9Var.e();
                if (e2 != null) {
                    jSONObject.put("mediation_sdk", e2.mediationType);
                    jSONObject.put("mediation_sdk_version", e2.libraryVersion);
                    jSONObject.put("mediation_sdk_adapter_version", e2.adapterVersion);
                }
                jSONObject2.put("device_battery_level", v3Var.j());
                jSONObject2.put("device_charging_status", v3Var.k());
                jSONObject2.put("device_language", v3Var.o());
                jSONObject2.put("device_timezone", v3Var.x());
                jSONObject2.put("device_volume", v3Var.z());
                jSONObject2.put("device_mute", v3Var.s());
                jSONObject2.put("device_audio_output", v3Var.i());
                jSONObject2.put("device_storage", v3Var.w());
                jSONObject2.put("device_low_memory_warning", v3Var.p());
                jSONObject2.put("device_up_time", v3Var.y());
                a(jSONObject2, v3Var, o9Var.a());
                jSONObject2.put("session_duration", v3Var.F());
                jSONObject.put("session_id", v3Var.G());
                jSONObject.put("session_count", v3Var.E());
                jSONObject.put("event_name", o9Var.g());
                jSONObject.put("event_message", o9Var.f());
                jSONObject.put("event_type", o9Var.k().name());
                jSONObject.put("event_timestamp", o9Var.i());
                jSONObject.put("event_latency", o9Var.c());
                jSONObject.put("ad_type", a2);
                jSONObject.put("ad_impression_id", str);
                jSONObject.put("ad_creative_id", str2);
                jSONObject.put("app_id", v3Var.a());
                jSONObject.put("chartboost_sdk_version", v3Var.h());
                jSONObject.put("framework", v3Var.A());
                jSONObject.put("framework_version", v3Var.C());
                jSONObject.put("framework_adapter_version", v3Var.B());
                jSONObject.put("device_id", v3Var.n());
                jSONObject.put("device_make", v3Var.q());
                jSONObject.put("device_model", v3Var.r());
                jSONObject.put("device_os_version", v3Var.u());
                jSONObject.put("device_platform", v3Var.v());
                jSONObject.put("device_country", v3Var.m());
                jSONObject.put("device_connection_type", v3Var.l());
                jSONObject.put("device_orientation", v3Var.t());
                jSONObject.put("payload", jSONObject2);
                jSONArray.put(jSONObject);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public final void a(JSONObject jSONObject, v3 v3Var, String str) throws JSONException {
        int H;
        if (str == null || str.length() <= 0) {
            return;
        }
        if (str.equals(q.b.g.b())) {
            H = v3Var.I();
        } else if (str.equals(q.c.g.b())) {
            H = v3Var.J();
        } else {
            H = str.equals(q.a.g.b()) ? v3Var.H() : 0;
        }
        jSONObject.put("session_impression_count", H);
    }
}
