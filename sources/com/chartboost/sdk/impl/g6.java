package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final xa f843a;

    public g6(xa xaVar) {
        this.f843a = xaVar;
    }

    public static g6 a(l lVar) {
        xa xaVar = (xa) lVar;
        kc.a(lVar, "AdSession is null");
        kc.f(xaVar);
        kc.c(xaVar);
        kc.b(xaVar);
        kc.h(xaVar);
        g6 g6Var = new g6(xaVar);
        xaVar.k().a(g6Var);
        return g6Var;
    }

    public void b() {
        kc.a(this.f843a);
        this.f843a.k().a("bufferStart");
    }

    public void c() {
        kc.a(this.f843a);
        this.f843a.k().a("complete");
    }

    public void d() {
        kc.a(this.f843a);
        this.f843a.k().a("firstQuartile");
    }

    public void e() {
        kc.a(this.f843a);
        this.f843a.k().a("midpoint");
    }

    public void f() {
        kc.a(this.f843a);
        this.f843a.k().a("pause");
    }

    public void g() {
        kc.a(this.f843a);
        this.f843a.k().a("resume");
    }

    public void h() {
        kc.a(this.f843a);
        this.f843a.k().a("skipped");
    }

    public void i() {
        kc.a(this.f843a);
        this.f843a.k().a("thirdQuartile");
    }

    public void a() {
        kc.a(this.f843a);
        this.f843a.k().a("bufferFinish");
    }

    public final void b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public void c(float f) {
        b(f);
        kc.a(this.f843a);
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        tb.a(jSONObject, "deviceVolume", Float.valueOf(mc.c().b()));
        this.f843a.k().a("volumeChange", jSONObject);
    }

    public final void a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    public void a(float f, float f2) {
        a(f);
        b(f2);
        kc.a(this.f843a);
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "duration", Float.valueOf(f));
        tb.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        tb.a(jSONObject, "deviceVolume", Float.valueOf(mc.c().b()));
        this.f843a.k().a("start", jSONObject);
    }

    public void a(b6 b6Var) {
        kc.a(b6Var, "InteractionType is null");
        kc.a(this.f843a);
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "interactionType", b6Var);
        this.f843a.k().a("adUserInteraction", jSONObject);
    }

    public void a(l7 l7Var) {
        kc.a(l7Var, "PlayerState is null");
        kc.a(this.f843a);
        JSONObject jSONObject = new JSONObject();
        tb.a(jSONObject, "state", l7Var);
        this.f843a.k().a("playerStateChange", jSONObject);
    }
}
