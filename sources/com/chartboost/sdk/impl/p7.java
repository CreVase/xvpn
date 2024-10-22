package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t8;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p7 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f1072a;

    /* renamed from: b, reason: collision with root package name */
    public final u4 f1073b;
    public final a8 c;
    public final v4 d;
    public final w4 e;
    public t8.b f;

    public p7(v7 v7Var, u4 u4Var, a8 a8Var, v4 v4Var, w4 w4Var) {
        this.f1072a = v7Var;
        this.f1073b = u4Var;
        this.c = a8Var;
        this.d = v4Var;
        this.e = w4Var;
    }

    public void a(t8.b bVar) {
        this.f = bVar;
    }

    public void b(String str) {
        a8 a8Var = this.c;
        if (a8Var != null) {
            a8Var.a(str);
        }
    }

    public int c() {
        return !d().equals("-1") ? 1 : 0;
    }

    public String d() {
        DataUseConsent a2 = this.f1073b.a(GDPR.GDPR_STANDARD);
        if (a2 == null) {
            return "-1";
        }
        return (String) a2.getConsent();
    }

    public JSONObject e() {
        List<DataUseConsent> f = f();
        v4 v4Var = this.d;
        if (v4Var != null && f != null) {
            return v4Var.a(f);
        }
        return null;
    }

    public List<DataUseConsent> f() {
        t8.b bVar;
        w4 w4Var = this.e;
        if (w4Var != null && (bVar = this.f) != null) {
            return w4Var.a(bVar);
        }
        return null;
    }

    public q7 g() {
        return new q7(Integer.valueOf(a()), f(), Integer.valueOf(c()), b(), e(), d());
    }

    public void a(DataUseConsent dataUseConsent) {
        v7 v7Var = this.f1072a;
        if (v7Var != null) {
            v7Var.a(dataUseConsent);
        }
    }

    public Integer b() {
        COPPA coppa = (COPPA) a(COPPA.COPPA_STANDARD);
        if (coppa == null) {
            return null;
        }
        if (coppa.getConsent().booleanValue()) {
            return 1;
        }
        return 0;
    }

    public DataUseConsent a(String str) {
        u4 u4Var = this.f1073b;
        if (u4Var != null) {
            return u4Var.a(str);
        }
        return null;
    }

    public int a() {
        return d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }
}
