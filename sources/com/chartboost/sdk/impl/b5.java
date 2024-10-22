package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.p71;

/* loaded from: classes.dex */
public final class b5 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final z4 f724a;

    /* renamed from: b, reason: collision with root package name */
    public final d8 f725b;

    public b5(z4 z4Var, d8 d8Var) {
        this.f724a = z4Var;
        this.f725b = d8Var;
    }

    @Override // com.chartboost.sdk.impl.a
    public void a(ra raVar) {
        this.f724a.a(raVar);
    }

    public boolean b() {
        String str;
        try {
            return this.f725b.e();
        } catch (Exception e) {
            str = c5.f736a;
            p71.z("onBackPressed: ", e, str);
            return false;
        }
    }

    public void c() {
        String str;
        try {
            this.f725b.d();
        } catch (Exception e) {
            str = c5.f736a;
            f6.a(str, "Cannot perform onStop: " + e);
        }
    }

    public void d() {
        this.f725b.a(this, this.f724a.c());
        this.f724a.b();
    }

    public void e() {
        String str;
        try {
            this.f725b.h();
        } catch (Exception e) {
            str = c5.f736a;
            f6.a(str, "Cannot perform onStop: " + e);
        }
    }

    public void f() {
        String str;
        String str2;
        try {
            this.f725b.f();
        } catch (Exception e) {
            str = c5.f736a;
            f6.a(str, "Cannot perform onPause: " + e);
        }
        try {
            CBUtility.b(this.f724a.c(), this.f725b.c());
        } catch (Exception e2) {
            str2 = c5.f736a;
            f6.a(str2, "Cannot lock the orientation in activity: " + e2);
        }
    }

    public void g() {
        String str;
        String str2;
        String str3;
        try {
            this.f725b.a(this, this.f724a.c());
        } catch (Exception e) {
            str = c5.f736a;
            f6.a(str, "Cannot setActivityRendererInterface: " + e);
        }
        try {
            this.f725b.b();
        } catch (Exception e2) {
            str2 = c5.f736a;
            f6.a(str2, "Cannot perform onResume: " + e2);
        }
        this.f724a.b();
        try {
            CBUtility.a(this.f724a.c(), this.f725b.c());
        } catch (Exception e3) {
            str3 = c5.f736a;
            f6.a(str3, "Cannot lock the orientation in activity: " + e3);
        }
    }

    public void h() {
        String str;
        try {
            this.f725b.g();
        } catch (Exception e) {
            str = c5.f736a;
            f6.a(str, "Cannot perform onResume: " + e);
        }
    }

    public void i() {
        String str;
        String str2;
        try {
            if (!this.f724a.d()) {
                str2 = c5.f736a;
                f6.b(str2, "The activity passed down is not hardware accelerated, so Chartboost cannot show ads");
                this.f725b.a(CBError.CBImpressionError.HARDWARE_ACCELERATION_DISABLED);
                this.f724a.a();
            }
        } catch (Exception e) {
            str = c5.f736a;
            p71.z("onAttachedToWindow: ", e, str);
        }
    }

    @Override // com.chartboost.sdk.impl.a
    public void a() {
        this.f724a.a();
    }
}
