package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.nb;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mb implements nb.b {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f1000a;

    /* renamed from: b, reason: collision with root package name */
    public final vb f1001b;

    public mb(vb vbVar) {
        this.f1001b = vbVar;
    }

    @Override // com.chartboost.sdk.impl.nb.b
    public JSONObject a() {
        return this.f1000a;
    }

    public void b() {
        this.f1001b.b(new ac(this));
    }

    @Override // com.chartboost.sdk.impl.nb.b
    public void a(JSONObject jSONObject) {
        this.f1000a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f1001b.b(new hc(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f1001b.b(new ec(this, hashSet, jSONObject, j));
    }
}
