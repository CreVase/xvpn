package com.chartboost.sdk.impl;

import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1296a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f1297b;
    public final String c;

    public x9(String str, URL url, String str2) {
        this.f1296a = str;
        this.f1297b = url;
        this.c = str2;
    }

    public static x9 a(String str, URL url, String str2) {
        kc.a(str, "VendorKey is null or empty");
        kc.a(url, "ResourceURL is null");
        kc.a(str2, "VerificationParameters is null or empty");
        return new x9(str, url, str2);
    }

    public String b() {
        return this.f1296a;
    }

    public String c() {
        return this.c;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "vendorKey", this.f1296a);
        tb.a(jSONObject, "resourceUrl", this.f1297b.toString());
        tb.a(jSONObject, "verificationParameters", this.c);
        return jSONObject;
    }

    public URL a() {
        return this.f1297b;
    }
}
