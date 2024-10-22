package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z5 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f1331a;

    /* renamed from: b, reason: collision with root package name */
    public final h8 f1332b;
    public e3 c;

    public z5(z1 z1Var, h8 h8Var) {
        this.f1331a = z1Var;
        this.f1332b = h8Var;
    }

    public final void a(e3 e3Var) {
        this.c = e3Var;
        c2 c2Var = new c2("https://live.chartboost.com", "/api/config", this.f1332b.build(), o7.HIGH, this);
        c2Var.o = true;
        this.f1331a.a(c2Var);
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
        JSONObject a2 = t1.a(jSONObject, "response");
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.a(a2);
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        String errorDesc = (cBError == null || cBError.getErrorDesc() == null) ? "Config failure" : cBError.getErrorDesc();
        y3.d(new w3("config_request_error", errorDesc, "", ""));
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.a(errorDesc);
        }
    }
}
