package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a6 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f701a;

    /* renamed from: b, reason: collision with root package name */
    public final h8 f702b;

    public a6(z1 z1Var, h8 h8Var) {
        this.f701a = z1Var;
        this.f702b = h8Var;
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
    }

    public final void a() {
        c2 c2Var = new c2("https://live.chartboost.com", "/api/install", this.f702b.build(), o7.NORMAL, this);
        c2Var.o = true;
        this.f701a.a(c2Var);
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        y3.d(new w3("install_request_error", cBError != null ? cBError.getErrorDesc() : "Install failure", "", ""));
    }
}
