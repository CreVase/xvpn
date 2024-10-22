package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e7 extends c2 {
    public static final String q = "e7";

    public e7(n6 n6Var, k kVar, w6 w6Var) {
        super(n6Var.f1010a, n6Var.f1011b, n6Var.c, n6Var.d, n6Var.e);
        this.m = new f7(n6Var.c, kVar, w6Var).f();
    }

    @Override // com.chartboost.sdk.impl.c2, com.chartboost.sdk.impl.v1
    public x1<JSONObject> a(y1 y1Var) {
        if (y1Var.f1305b == null) {
            return x1.a(new CBError(CBError.b.INVALID_RESPONSE, "Response is not a valid json object"));
        }
        try {
            return x1.a(new JSONObject(new String(y1Var.f1305b)));
        } catch (JSONException e) {
            f6.b(q, "parseServerResponse: " + e.toString());
            return x1.a(new CBError(CBError.b.HTTP_NOT_FOUND, "No Bid"));
        }
    }

    @Override // com.chartboost.sdk.impl.c2
    public void f() {
    }
}
