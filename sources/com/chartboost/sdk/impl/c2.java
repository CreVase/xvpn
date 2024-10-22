package com.chartboost.sdk.impl;

import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.impl.t1;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c2 extends v1<JSONObject> {
    public final String k;
    public final String l;
    public JSONObject m;
    public final a n;
    public boolean o;
    public final j8 p;

    /* loaded from: classes.dex */
    public interface a {
        void a(c2 c2Var, CBError cBError);

        void a(c2 c2Var, JSONObject jSONObject);
    }

    public c2(String str, String str2, j8 j8Var, o7 o7Var, a aVar) {
        super("POST", NetworkHelper.a(str, str2), o7Var, null);
        this.o = false;
        this.m = new JSONObject();
        this.k = str2;
        this.p = j8Var;
        this.l = null;
        this.n = aVar;
    }

    public void f() {
        boolean z;
        a("app", this.p.h);
        a("model", this.p.f938a);
        a("make", this.p.k);
        a("device_type", this.p.j);
        a("actual_device_type", this.p.l);
        a("os", this.p.f939b);
        a("country", this.p.c);
        a("language", this.p.d);
        a("sdk", this.p.g);
        a("user_agent", u9.f1184a.a());
        a("timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.p.j().a())));
        a("session", Integer.valueOf(this.p.i()));
        a("reachability", this.p.g().b());
        a("is_portrait", Boolean.valueOf(this.p.b().k()));
        a("scale", Float.valueOf(this.p.b().h()));
        a("bundle", this.p.e);
        a("bundle_id", this.p.f);
        a("carrier", this.p.m);
        i6 d = this.p.d();
        if (d != null) {
            a("mediation", d.c());
            a("mediation_version", d.b());
            a("adapter_version", d.a());
        }
        a("timezone", this.p.o);
        a("connectiontype", Integer.valueOf(this.p.g().d().c()));
        a("dw", Integer.valueOf(this.p.b().c()));
        a("dh", Integer.valueOf(this.p.b().a()));
        a("dpi", this.p.b().d());
        a("w", Integer.valueOf(this.p.b().j()));
        a("h", Integer.valueOf(this.p.b().e()));
        a("commit_hash", "9207e889cf8bd637bf4c979a80534991868bea67");
        y4 c = this.p.c();
        if (c != null) {
            a("identity", c.b());
            q9 e = c.e();
            if (e != q9.TRACKING_UNKNOWN) {
                if (e == q9.TRACKING_LIMITED) {
                    z = true;
                } else {
                    z = false;
                }
                a("limit_ad_tracking", Boolean.valueOf(z));
            }
            Object d2 = c.d();
            if (d2 != null) {
                a("appsetidscope", d2);
            }
        } else {
            f6.e("CBRequest", "Missing identity in the CB SDK. This will affect ads performance.");
        }
        a("pidatauseconsent", this.p.f().d());
        String a2 = this.p.a().a();
        if (!p0.b().a(a2)) {
            a("config_variant", a2);
        }
        a("privacy", this.p.f().e());
    }

    public final String g() {
        r2 r2Var = r2.f1101a;
        String a2 = r2Var.a();
        int[] b2 = r2Var.b();
        JSONObject jSONObject = new JSONObject();
        if (a2 != null && a2.length() > 0 && b2 != null && b2.length > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i : b2) {
                    jSONArray.put(i);
                }
                jSONObject.put("exchangeMode", 2);
                jSONObject.put("bidFloor", 0.01d);
                jSONObject.put("code", a2);
                jSONObject.put("forceCreativeTypes", jSONArray);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject.toString();
    }

    public String h() {
        String str = "/";
        if (this.k == null) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        if (this.k.startsWith("/")) {
            str = "";
        }
        sb.append(str);
        sb.append(this.k);
        return sb.toString();
    }

    public String i() {
        return h();
    }

    public void a(String str, Object obj) {
        t1.a(this.m, str, obj);
    }

    public final void a(y1 y1Var, CBError cBError) {
        t1.a[] aVarArr = new t1.a[5];
        aVarArr[0] = t1.a("endpoint", h());
        aVarArr[1] = t1.a("statuscode", y1Var == null ? "None" : Integer.valueOf(y1Var.f1304a));
        aVarArr[2] = t1.a(MRAIDPresenter.ERROR, cBError == null ? "None" : cBError.getError().toString());
        aVarArr[3] = t1.a("errorDescription", cBError != null ? cBError.getErrorDesc() : "None");
        aVarArr[4] = t1.a("retryCount", (Object) 0);
        f6.a("CBRequest", "sendToSessionLogs: " + t1.a(aVarArr).toString());
    }

    public c2(String str, String str2, j8 j8Var, o7 o7Var, String str3, a aVar) {
        super("POST", NetworkHelper.a(str, str2), o7Var, null);
        this.o = false;
        this.m = new JSONObject();
        this.k = str2;
        this.p = j8Var;
        this.n = aVar;
        this.l = str3;
    }

    @Override // com.chartboost.sdk.impl.v1
    public w1 a() {
        String g;
        f();
        String jSONObject = this.m.toString();
        j8 j8Var = this.p;
        String str = j8Var.h;
        String a2 = n1.a(String.format(Locale.US, "%s %s\n%s\n%s", c(), i(), j8Var.i, jSONObject));
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-API", "9.4.1");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", a2);
        if (p8.f1074a.d()) {
            String b2 = p8.b();
            if (b2.length() > 0) {
                hashMap.put("X-Chartboost-Test", b2);
            }
            String a3 = p8.a();
            if (a3 != null) {
                hashMap.put("X-Chartboost-Test", a3);
            }
        }
        if (ChartboostDSP.INSTANCE.isDSP() && (g = g()) != null && g.length() > 0) {
            hashMap.put("X-Chartboost-DspDemoApp", g);
        }
        return new w1(hashMap, jSONObject.getBytes(), "application/json");
    }

    @Override // com.chartboost.sdk.impl.v1
    public x1<JSONObject> a(y1 y1Var) {
        try {
            if (y1Var.f1305b == null) {
                return x1.a(new CBError(CBError.b.INVALID_RESPONSE, "Response is not a valid json object"));
            }
            JSONObject jSONObject = new JSONObject(new String(y1Var.f1305b));
            f6.d("CBRequest", "Request " + h() + " succeeded. Response code: " + y1Var.f1304a + ", body: " + jSONObject.toString(4));
            if (this.o) {
                int optInt = jSONObject.optInt("status");
                if (optInt == 404) {
                    return x1.a(new CBError(CBError.b.HTTP_NOT_FOUND, "404 error from server"));
                }
                if (optInt < 200 || optInt > 299) {
                    String str = "Request failed due to status code " + optInt + " in message";
                    f6.b("CBRequest", str);
                    return x1.a(new CBError(CBError.b.UNEXPECTED_RESPONSE, str));
                }
            }
            return x1.a(jSONObject);
        } catch (Exception e) {
            y3.d(new j3("response_json_serialization_error", e.getMessage(), "", ""));
            f6.b("CBRequest", "parseServerResponse: " + e);
            return x1.a(new CBError(CBError.b.MISCELLANEOUS, e.getLocalizedMessage()));
        }
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(JSONObject jSONObject, y1 y1Var) {
        f6.d("CBRequest", "Request success: " + e() + " status: " + y1Var.f1304a);
        a aVar = this.n;
        if (aVar != null && jSONObject != null) {
            aVar.a(this, jSONObject);
        }
        a(y1Var, (CBError) null);
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(CBError cBError, y1 y1Var) {
        if (cBError == null) {
            return;
        }
        f6.d("CBRequest", "Request failure: " + e() + " status: " + cBError.getErrorDesc());
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(this, cBError);
        }
        a(y1Var, cBError);
    }
}
