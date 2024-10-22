package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b3 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f718a;

    /* renamed from: b, reason: collision with root package name */
    public final h8 f719b;
    public c3 c;

    public b3(z1 z1Var, h8 h8Var) {
        this.f718a = z1Var;
        this.f719b = h8Var;
    }

    public final void a(c3 c3Var, a3 a3Var) {
        this.c = c3Var;
        c2 c2Var = new c2("https://live.chartboost.com", "/api/video-complete", this.f719b.build(), o7.NORMAL, this);
        a(c2Var, a3Var);
        this.f718a.a(c2Var);
    }

    public final void a(c2 c2Var, a3 a3Var) {
        String str;
        c2Var.a("location", a3Var.c());
        c2Var.a("reward", Integer.valueOf(a3Var.d()));
        c2Var.a("currency-name", a3Var.e());
        c2Var.a("ad_id", a3Var.a());
        c2Var.a("force_close", Boolean.FALSE);
        c2Var.a("cgn", a3Var.b());
        if (a3Var.g() == null || a3Var.f() == null) {
            return;
        }
        float f = 1000;
        c2Var.a("total_time", Float.valueOf(a3Var.f().floatValue() / f));
        c2Var.a("playback_time", Float.valueOf(a3Var.g().floatValue() / f));
        str = d3.f750a;
        f6.a(str, "TotalDuration: " + a3Var.f() + " PlaybackTime: " + a3Var.g());
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
        JSONObject a2 = t1.a(jSONObject, "response");
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.a(a2);
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        String errorDesc = (cBError == null || cBError.getErrorDesc() == null) ? "Click failure" : cBError.getErrorDesc();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.a(errorDesc);
        }
    }
}
