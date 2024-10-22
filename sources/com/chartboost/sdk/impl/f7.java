package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f7 {
    public static final String j = "f7";
    public static Integer k;
    public static final String l = Build.VERSION.RELEASE;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f821a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f822b;
    public final JSONArray c;
    public final JSONObject d;
    public final JSONObject e;
    public final JSONObject f;
    public final j8 g;
    public final k h;
    public final w6 i;

    public f7(j8 j8Var, k kVar, w6 w6Var) {
        k = j8Var.e();
        this.g = j8Var;
        this.h = kVar;
        this.i = w6Var;
        this.f822b = new JSONObject();
        this.c = new JSONArray();
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.f821a = new JSONObject();
        n();
        k();
        l();
        j();
        m();
        o();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, "lat", JSONObject.NULL);
        t1.a(jSONObject, "lon", JSONObject.NULL);
        t1.a(jSONObject, "country", this.g.c);
        t1.a(jSONObject, "type", 2);
        return jSONObject;
    }

    public final Integer b() {
        j8 j8Var = this.g;
        if (j8Var != null) {
            return j8Var.f().b();
        }
        return null;
    }

    public final int c() {
        j8 j8Var = this.g;
        if (j8Var != null && j8Var.f().a() != null) {
            return this.g.f().a().intValue();
        }
        return 0;
    }

    public final Collection<DataUseConsent> d() {
        j8 j8Var = this.g;
        if (j8Var != null) {
            return j8Var.f().f();
        }
        return new ArrayList();
    }

    public final int e() {
        j8 j8Var = this.g;
        if (j8Var != null && j8Var.f().c() != null) {
            return this.g.f().c().intValue();
        }
        return 0;
    }

    public JSONObject f() {
        return this.f821a;
    }

    public final int g() {
        o6 d = this.g.g().d();
        if (d != null) {
            return d.c();
        }
        return 0;
    }

    public final String h() {
        q qVar = this.h.f945a;
        if (qVar == q.b.g) {
            f6.b(j, "INTERSTITIAL NOT COMPATIBLE WITH OPENRTB");
        } else if (qVar == q.c.g) {
            f6.b(j, "REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB");
        }
        return this.h.f945a.b().toLowerCase(Locale.ROOT);
    }

    public final Integer i() {
        return Integer.valueOf(this.h.f945a.f() ? 1 : 0);
    }

    public final void j() {
        t1.a(this.d, FacebookMediationAdapter.KEY_ID, this.g.h);
        t1.a(this.d, AppMeasurementSdk.ConditionalUserProperty.NAME, JSONObject.NULL);
        t1.a(this.d, "bundle", this.g.f);
        t1.a(this.d, "storeurl", JSONObject.NULL);
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, FacebookMediationAdapter.KEY_ID, JSONObject.NULL);
        t1.a(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, JSONObject.NULL);
        t1.a(this.d, "publisher", jSONObject);
        t1.a(this.d, "cat", JSONObject.NULL);
        t1.a(this.f821a, "app", this.d);
    }

    public final void k() {
        y4 c = this.g.c();
        t1.a(this.f822b, "devicetype", k);
        t1.a(this.f822b, "w", Integer.valueOf(this.g.b().c()));
        t1.a(this.f822b, "h", Integer.valueOf(this.g.b().a()));
        t1.a(this.f822b, "ifa", c.a());
        t1.a(this.f822b, "osv", l);
        t1.a(this.f822b, "lmt", Integer.valueOf(c.e().b()));
        t1.a(this.f822b, "connectiontype", Integer.valueOf(g()));
        t1.a(this.f822b, "os", "Android");
        t1.a(this.f822b, "geo", a());
        t1.a(this.f822b, "ip", JSONObject.NULL);
        t1.a(this.f822b, "language", this.g.d);
        t1.a(this.f822b, "ua", u9.f1184a.a());
        t1.a(this.f822b, "make", this.g.k);
        t1.a(this.f822b, "model", this.g.f938a);
        t1.a(this.f822b, "carrier", this.g.n);
        t1.a(this.f822b, "ext", a(c, this.i));
        t1.a(this.f821a, "device", this.f822b);
    }

    public final void l() {
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, FacebookMediationAdapter.KEY_ID, JSONObject.NULL);
        JSONObject jSONObject2 = new JSONObject();
        t1.a(jSONObject2, "w", this.h.c);
        t1.a(jSONObject2, "h", this.h.f946b);
        t1.a(jSONObject2, "btype", JSONObject.NULL);
        t1.a(jSONObject2, "battr", JSONObject.NULL);
        t1.a(jSONObject2, "pos", JSONObject.NULL);
        t1.a(jSONObject2, "topframe", JSONObject.NULL);
        t1.a(jSONObject2, "api", JSONObject.NULL);
        JSONObject jSONObject3 = new JSONObject();
        t1.a(jSONObject3, "placementtype", h());
        t1.a(jSONObject3, "playableonly", JSONObject.NULL);
        t1.a(jSONObject3, "allowscustomclosebutton", JSONObject.NULL);
        t1.a(jSONObject2, "ext", jSONObject3);
        t1.a(jSONObject, "banner", jSONObject2);
        t1.a(jSONObject, "instl", i());
        t1.a(jSONObject, "tagid", this.h.d);
        t1.a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        t1.a(jSONObject, "displaymanagerver", this.g.g);
        t1.a(jSONObject, "bidfloor", JSONObject.NULL);
        t1.a(jSONObject, "bidfloorcur", "USD");
        t1.a(jSONObject, "secure", 1);
        this.c.put(jSONObject);
        t1.a(this.f821a, "imp", this.c);
    }

    public final void m() {
        Integer b2 = b();
        if (b2 != null) {
            t1.a(this.e, COPPA.COPPA_STANDARD, b2);
        }
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, GDPR.GDPR_STANDARD, Integer.valueOf(e()));
        for (DataUseConsent dataUseConsent : d()) {
            if (!dataUseConsent.getPrivacyStandard().equals(COPPA.COPPA_STANDARD)) {
                t1.a(jSONObject, dataUseConsent.getPrivacyStandard(), dataUseConsent.getConsent());
            }
        }
        t1.a(this.e, "ext", jSONObject);
        t1.a(this.f821a, "regs", this.e);
    }

    public final void n() {
        t1.a(this.f821a, FacebookMediationAdapter.KEY_ID, JSONObject.NULL);
        t1.a(this.f821a, "test", JSONObject.NULL);
        t1.a(this.f821a, "cur", new JSONArray().put("USD"));
        t1.a(this.f821a, "at", 2);
    }

    public final void o() {
        t1.a(this.f, FacebookMediationAdapter.KEY_ID, JSONObject.NULL);
        t1.a(this.f, "geo", a());
        JSONObject jSONObject = new JSONObject();
        t1.a(jSONObject, "consent", Integer.valueOf(c()));
        t1.a(jSONObject, "impdepth", Integer.valueOf(this.h.e));
        t1.a(this.f, "ext", jSONObject);
        t1.a(this.f821a, "user", this.f);
    }

    public final JSONObject a(y4 y4Var, w6 w6Var) {
        JSONObject jSONObject = new JSONObject();
        if (y4Var.c() != null) {
            t1.a(jSONObject, "appsetid", y4Var.c());
        }
        if (y4Var.d() != null) {
            t1.a(jSONObject, "appsetidscope", y4Var.d());
        }
        k7 c = w6Var.c();
        if (w6Var.f() && c != null) {
            t1.a(jSONObject, "omidpn", c.a());
            t1.a(jSONObject, "omidpv", c.b());
        }
        return jSONObject;
    }
}
