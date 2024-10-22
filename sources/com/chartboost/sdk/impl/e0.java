package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f784a;

    /* renamed from: b, reason: collision with root package name */
    public final h8 f785b;
    public b9 c;

    public e0(z1 z1Var, h8 h8Var) {
        this.f784a = z1Var;
        this.f785b = h8Var;
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
    }

    public final void a(String str, b9 b9Var) {
        this.c = b9Var;
        c2 c2Var = new c2("https://live.chartboost.com", str, this.f785b.build(), o7.NORMAL, this);
        c2Var.i = 1;
        a(c2Var, b9Var);
        this.f784a.a(c2Var);
    }

    public final void a(c2 c2Var, b9 b9Var) {
        c2Var.a("cached", "0");
        c2Var.a("location", b9Var.c());
        int e = b9Var.e();
        if (e >= 0) {
            c2Var.a("video_cached", Integer.valueOf(e));
        }
        String a2 = b9Var.a();
        if (a2 == null || a2.length() == 0) {
            return;
        }
        c2Var.a("ad_id", a2);
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        String errorDesc = cBError != null ? cBError.getErrorDesc() : null;
        if (errorDesc == null) {
            errorDesc = "Show failure";
        }
        String str = errorDesc;
        b9 b9Var = this.c;
        if (b9Var == null) {
            b9Var = null;
        }
        String b2 = b9Var.b();
        b9 b9Var2 = this.c;
        if (b9Var2 == null) {
            b9Var2 = null;
        }
        String c = b9Var2.c();
        b9 b9Var3 = this.c;
        y3.d(new w3("show_request_error", str, b2, c, (b9Var3 != null ? b9Var3 : null).d()));
    }
}
