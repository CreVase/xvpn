package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v2 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f1228a;

    /* renamed from: b, reason: collision with root package name */
    public final h8 f1229b;
    public w2 c;

    public v2(z1 z1Var, h8 h8Var) {
        this.f1228a = z1Var;
        this.f1229b = h8Var;
    }

    public final void a(w2 w2Var, u2 u2Var) {
        this.c = w2Var;
        c2 c2Var = new c2("https://live.chartboost.com", "/api/click", this.f1229b.build(), o7.NORMAL, this);
        c2Var.o = true;
        a(c2Var, u2Var);
        this.f1228a.a(c2Var);
    }

    public final void a(c2 c2Var, u2 u2Var) {
        String str;
        c2Var.a("ad_id", u2Var.a());
        c2Var.a("to", u2Var.g());
        c2Var.a("cgn", u2Var.b());
        c2Var.a("creative", u2Var.c());
        c2Var.a("location", u2Var.e());
        if (u2Var.d() == r5.BANNER) {
            c2Var.a("creative", "");
        } else if (u2Var.i() != null && u2Var.h() != null) {
            float f = 1000;
            c2Var.a("total_time", Float.valueOf(u2Var.h().floatValue() / f));
            c2Var.a("playback_time", Float.valueOf(u2Var.i().floatValue() / f));
            str = x2.f1288a;
            f6.a(str, "TotalDuration: " + u2Var.h() + " PlaybackTime: " + u2Var.i());
        }
        Boolean f2 = u2Var.f();
        if (f2 != null) {
            c2Var.a("retarget_reinstall", Boolean.valueOf(f2.booleanValue()));
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
        JSONObject a2 = t1.a(jSONObject, "response");
        w2 w2Var = this.c;
        if (w2Var != null) {
            w2Var.a(a2);
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        String errorDesc = (cBError == null || cBError.getErrorDesc() == null) ? "Click failure" : cBError.getErrorDesc();
        w2 w2Var = this.c;
        if (w2Var != null) {
            w2Var.a(errorDesc);
        }
    }
}
