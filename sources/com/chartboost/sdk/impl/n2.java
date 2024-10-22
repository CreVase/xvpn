package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class n2 {
    public JSONObject a(l2 l2Var) {
        if (l2Var == null) {
            return new JSONObject();
        }
        return t1.a(t1.a("carrier-name", l2Var.d()), t1.a("mobile-country-code", l2Var.a()), t1.a("mobile-network-code", l2Var.b()), t1.a("iso-country-code", l2Var.c()), t1.a("phone-type", Integer.valueOf(l2Var.e())));
    }
}
