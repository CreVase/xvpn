package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k2 extends c2 {
    public final JSONObject q;
    public final JSONObject r;
    public final JSONObject s;
    public final JSONObject t;

    public k2(String str, j8 j8Var, o7 o7Var, c2.a aVar) {
        super("https://live.chartboost.com", str, j8Var, o7Var, aVar);
        this.q = new JSONObject();
        this.r = new JSONObject();
        this.s = new JSONObject();
        this.t = new JSONObject();
    }

    public void b(String str, Object obj) {
        t1.a(this.t, str, obj);
        a("ad", this.t);
    }

    public void c(String str, Object obj) {
        t1.a(this.q, str, obj);
        a("sdk", this.q);
    }

    @Override // com.chartboost.sdk.impl.c2
    public void f() {
        t1.a(this.r, "app", this.p.h);
        t1.a(this.r, "bundle", this.p.e);
        t1.a(this.r, "bundle_id", this.p.f);
        t1.a(this.r, "session_id", "");
        t1.a(this.r, "ui", -1);
        JSONObject jSONObject = this.r;
        Boolean bool = Boolean.FALSE;
        t1.a(jSONObject, "test_mode", bool);
        a("app", this.r);
        boolean z = false;
        t1.a(this.s, "carrier", t1.a(t1.a("carrier_name", this.p.m.optString("carrier-name")), t1.a("mobile_country_code", this.p.m.optString("mobile-country-code")), t1.a("mobile_network_code", this.p.m.optString("mobile-network-code")), t1.a("iso_country_code", this.p.m.optString("iso-country-code")), t1.a("phone_type", Integer.valueOf(this.p.m.optInt("phone-type")))));
        t1.a(this.s, "model", this.p.f938a);
        t1.a(this.s, "make", this.p.k);
        t1.a(this.s, "device_type", this.p.j);
        t1.a(this.s, "actual_device_type", this.p.l);
        t1.a(this.s, "os", this.p.f939b);
        t1.a(this.s, "country", this.p.c);
        t1.a(this.s, "language", this.p.d);
        t1.a(this.s, "timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.p.j().a())));
        t1.a(this.s, "reachability", this.p.g().b());
        t1.a(this.s, "is_portrait", Boolean.valueOf(this.p.b().k()));
        t1.a(this.s, "scale", Float.valueOf(this.p.b().h()));
        t1.a(this.s, "timezone", this.p.o);
        t1.a(this.s, "connectiontype", Integer.valueOf(this.p.g().d().c()));
        t1.a(this.s, "dw", Integer.valueOf(this.p.b().c()));
        t1.a(this.s, "dh", Integer.valueOf(this.p.b().a()));
        t1.a(this.s, "dpi", this.p.b().d());
        t1.a(this.s, "w", Integer.valueOf(this.p.b().j()));
        t1.a(this.s, "h", Integer.valueOf(this.p.b().e()));
        t1.a(this.s, "user_agent", u9.f1184a.a());
        t1.a(this.s, "device_family", "");
        t1.a(this.s, "retina", bool);
        y4 c = this.p.c();
        if (c != null) {
            t1.a(this.s, "identity", c.b());
            q9 e = c.e();
            if (e != q9.TRACKING_UNKNOWN) {
                if (e == q9.TRACKING_LIMITED) {
                    z = true;
                }
                t1.a(this.s, "limit_ad_tracking", Boolean.valueOf(z));
            }
            Integer d = c.d();
            if (d != null) {
                t1.a(this.s, "appsetidscope", d);
            }
        } else {
            f6.e("CBWebViewRequest", "Missing identity in the CB SDK. This will affect ads performance.");
        }
        t1.a(this.s, "pidatauseconsent", this.p.f().d());
        t1.a(this.s, "privacy", this.p.f().e());
        a("device", this.s);
        t1.a(this.q, "sdk", this.p.g);
        if (this.p.d() != null) {
            t1.a(this.q, "mediation", this.p.d().c());
            t1.a(this.q, "mediation_version", this.p.d().b());
            t1.a(this.q, "adapter_version", this.p.d().a());
        }
        t1.a(this.q, "commit_hash", "9207e889cf8bd637bf4c979a80534991868bea67");
        String a2 = this.p.a().a();
        if (!p0.b().a(a2)) {
            t1.a(this.q, "config_variant", a2);
        }
        a("sdk", this.q);
        t1.a(this.t, "session", Integer.valueOf(this.p.i()));
        if (this.t.isNull("cache")) {
            t1.a(this.t, "cache", bool);
        }
        if (this.t.isNull("amount")) {
            t1.a(this.t, "amount", 0);
        }
        if (this.t.isNull("retry_count")) {
            t1.a(this.t, "retry_count", 0);
        }
        if (this.t.isNull("location")) {
            t1.a(this.t, "location", "");
        }
        a("ad", this.t);
    }
}
