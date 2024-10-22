package com.chartboost.sdk.impl;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.BuildConfig;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f888a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f889b;
    public final o1 c;
    public final AtomicReference<t8> d;
    public final w6 e;

    public j1(Context context, h1 h1Var, o1 o1Var, AtomicReference<t8> atomicReference, w6 w6Var) {
        this.f888a = context;
        this.f889b = h1Var;
        this.c = o1Var;
        this.d = atomicReference;
        this.e = w6Var;
    }

    public final String a() {
        int i;
        k7 c;
        p6 b2;
        y4 k = this.c.k();
        t8 t8Var = this.d.get();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_version", BuildConfig.VERSION_NAME);
        String c2 = k.c();
        if (c2 == null) {
            c2 = "";
        }
        jSONObject.put("appSetId", c2);
        Integer d = k.d();
        boolean z = false;
        if (d != null) {
            i = d.intValue();
        } else {
            i = 0;
        }
        jSONObject.put("appSetIdScope", i);
        jSONObject.put("package", this.f888a.getPackageName());
        if (t8Var != null && (b2 = t8Var.b()) != null && b2.f()) {
            z = true;
        }
        if (z && (c = this.e.c()) != null) {
            jSONObject.put("omidpn", c.a());
            jSONObject.put("omidpv", c.b());
        }
        return this.f889b.c(jSONObject.toString());
    }
}
