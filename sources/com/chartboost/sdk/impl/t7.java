package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, DataUseConsent> f1154a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1155b;

    public t7(SharedPreferences sharedPreferences) {
        this.f1155b = sharedPreferences;
        b();
    }

    public HashMap<String, DataUseConsent> a() {
        return this.f1154a;
    }

    public void b(DataUseConsent dataUseConsent) {
        f6.a("Chartboost", "Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent());
        this.f1154a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        c();
    }

    public final void c() {
        if (this.f1155b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<DataUseConsent> it = this.f1154a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            a(this.f1155b, jSONArray);
        }
    }

    public void a(String str) {
        this.f1154a.remove(str);
        c();
    }

    public final void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb A[Catch: JSONException -> 0x0119, TryCatch #0 {JSONException -> 0x0119, blocks: (B:8:0x0018, B:10:0x0025, B:24:0x007e, B:26:0x00eb, B:29:0x00f5, B:31:0x008c, B:32:0x0096, B:33:0x00a0, B:35:0x00ac, B:36:0x00b2, B:38:0x00be, B:40:0x00c4, B:42:0x00d0, B:43:0x00d6, B:45:0x00e2, B:46:0x004d, B:49:0x0057, B:52:0x0061, B:55:0x006b), top: B:7:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5 A[Catch: JSONException -> 0x0119, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0119, blocks: (B:8:0x0018, B:10:0x0025, B:24:0x007e, B:26:0x00eb, B:29:0x00f5, B:31:0x008c, B:32:0x0096, B:33:0x00a0, B:35:0x00ac, B:36:0x00b2, B:38:0x00be, B:40:0x00c4, B:42:0x00d0, B:43:0x00d6, B:45:0x00e2, B:46:0x004d, B:49:0x0057, B:52:0x0061, B:55:0x006b), top: B:7:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[Catch: JSONException -> 0x0119, TryCatch #0 {JSONException -> 0x0119, blocks: (B:8:0x0018, B:10:0x0025, B:24:0x007e, B:26:0x00eb, B:29:0x00f5, B:31:0x008c, B:32:0x0096, B:33:0x00a0, B:35:0x00ac, B:36:0x00b2, B:38:0x00be, B:40:0x00c4, B:42:0x00d0, B:43:0x00d6, B:45:0x00e2, B:46:0x004d, B:49:0x0057, B:52:0x0061, B:55:0x006b), top: B:7:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.t7.b():void");
    }

    public final JSONObject a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put("consent", dataUseConsent.getConsent());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
