package com.chartboost.sdk.impl;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public ob f1053a;

    /* renamed from: b, reason: collision with root package name */
    public h f1054b;
    public g6 c;
    public a d;
    public long e;

    /* loaded from: classes.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public p() {
        a();
        this.f1053a = new ob(null);
    }

    public void a() {
        this.e = gc.b();
        this.d = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f1053a.clear();
    }

    public h c() {
        return this.f1054b;
    }

    public g6 d() {
        return this.c;
    }

    public boolean e() {
        return this.f1053a.get() != null;
    }

    public void f() {
        jc.a().a(h());
    }

    public void g() {
        jc.a().b(h());
    }

    public WebView h() {
        return this.f1053a.get();
    }

    public void i() {
        jc.a().c(h());
    }

    public void j() {
    }

    public void a(float f) {
        jc.a().a(h(), f);
    }

    public void b(String str, long j) {
        if (j >= this.e) {
            this.d = a.AD_STATE_VISIBLE;
            jc.a().a(h(), str);
        }
    }

    public void a(WebView webView) {
        this.f1053a = new ob(webView);
    }

    public void a(g6 g6Var) {
        this.c = g6Var;
    }

    public void a(h hVar) {
        this.f1054b = hVar;
    }

    public void a(m mVar) {
        jc.a().a(h(), mVar.c());
    }

    public void a(xa xaVar, n nVar) {
        a(xaVar, nVar, null);
    }

    public void a(xa xaVar, n nVar, JSONObject jSONObject) {
        String j = xaVar.j();
        JSONObject jSONObject2 = new JSONObject();
        tb.a(jSONObject2, "environment", "app");
        tb.a(jSONObject2, "adSessionType", nVar.a());
        tb.a(jSONObject2, "deviceInfo", lb.d());
        tb.a(jSONObject2, "deviceCategory", cb.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        tb.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        tb.a(jSONObject3, "partnerName", nVar.f().a());
        tb.a(jSONObject3, "partnerVersion", nVar.f().b());
        tb.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        tb.a(jSONObject4, "libraryVersion", "1.4.8-Chartboost");
        tb.a(jSONObject4, "appId", ic.b().a().getApplicationContext().getPackageName());
        tb.a(jSONObject2, "app", jSONObject4);
        if (nVar.b() != null) {
            tb.a(jSONObject2, "contentUrl", nVar.b());
        }
        if (nVar.c() != null) {
            tb.a(jSONObject2, "customReferenceData", nVar.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (x9 x9Var : nVar.g()) {
            tb.a(jSONObject5, x9Var.b(), x9Var.c());
        }
        jc.a().a(h(), j, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(String str) {
        jc.a().a(h(), str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.e) {
            a aVar = this.d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.d = aVar2;
                jc.a().a(h(), str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        jc.a().a(h(), str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        jc.a().b(h(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            jc.a().b(h(), z ? "foregrounded" : "backgrounded");
        }
    }
}
