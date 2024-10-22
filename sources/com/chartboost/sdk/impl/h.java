package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final xa f847a;

    public h(xa xaVar) {
        this.f847a = xaVar;
    }

    public static h a(l lVar) {
        xa xaVar = (xa) lVar;
        kc.a(lVar, "AdSession is null");
        kc.g(xaVar);
        kc.b(xaVar);
        h hVar = new h(xaVar);
        xaVar.k().a(hVar);
        return hVar;
    }

    public void b() {
        kc.a(this.f847a);
        kc.e(this.f847a);
        this.f847a.p();
    }

    public void a() {
        kc.b(this.f847a);
        kc.e(this.f847a);
        if (!this.f847a.h()) {
            try {
                this.f847a.b();
            } catch (Exception unused) {
            }
        }
        if (this.f847a.h()) {
            this.f847a.o();
        }
    }
}
