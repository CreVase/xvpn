package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final j7 f978a;

    /* renamed from: b, reason: collision with root package name */
    public final j7 f979b;
    public final boolean c;
    public final i3 d;
    public final t5 e;

    public m(i3 i3Var, t5 t5Var, j7 j7Var, j7 j7Var2, boolean z) {
        this.d = i3Var;
        this.e = t5Var;
        this.f978a = j7Var;
        if (j7Var2 == null) {
            this.f979b = j7.NONE;
        } else {
            this.f979b = j7Var2;
        }
        this.c = z;
    }

    public static m a(i3 i3Var, t5 t5Var, j7 j7Var, j7 j7Var2, boolean z) {
        kc.a(i3Var, "CreativeType is null");
        kc.a(t5Var, "ImpressionType is null");
        kc.a(j7Var, "Impression owner is null");
        kc.a(j7Var, i3Var, t5Var);
        return new m(i3Var, t5Var, j7Var, j7Var2, z);
    }

    public boolean b() {
        return j7.NATIVE == this.f979b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "impressionOwner", this.f978a);
        tb.a(jSONObject, "mediaEventsOwner", this.f979b);
        tb.a(jSONObject, "creativeType", this.d);
        tb.a(jSONObject, "impressionType", this.e);
        tb.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }

    public boolean a() {
        return j7.NATIVE == this.f978a;
    }
}
