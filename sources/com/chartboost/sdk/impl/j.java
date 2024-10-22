package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ch3;
import defpackage.m20;
import defpackage.x31;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements i, c2.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f885a;

    /* renamed from: b, reason: collision with root package name */
    public final r4 f886b;
    public final h8 c;
    public final z1 d;
    public final x e;
    public final d7 f;
    public final w6 g;
    public j8 h;
    public d6 i;
    public x31 j;

    public j(q qVar, r4 r4Var, h8 h8Var, z1 z1Var, x xVar, d7 d7Var, w6 w6Var) {
        this.f885a = qVar;
        this.f886b = r4Var;
        this.c = h8Var;
        this.d = z1Var;
        this.e = xVar;
        this.f = d7Var;
        this.g = w6Var;
    }

    @Override // com.chartboost.sdk.impl.i
    public void a(d6 d6Var, x31 x31Var) {
        this.i = d6Var;
        this.j = x31Var;
        this.h = this.c.build();
        String d = d6Var.a().d();
        Integer b2 = d6Var.b();
        int intValue = b2 != null ? b2.intValue() : 0;
        Integer c = d6Var.c();
        int intValue2 = c != null ? c.intValue() : 0;
        boolean d2 = d6Var.d();
        j8 j8Var = this.h;
        if (j8Var == null) {
            j8Var = null;
        }
        c2 a2 = a(d, intValue, intValue2, d2, j8Var, this, this.g);
        a2.i = 1;
        this.d.a(a2);
    }

    public final r a(j8 j8Var, JSONObject jSONObject, String str) {
        r a2;
        try {
            q qVar = this.f885a;
            q.a aVar = q.a.g;
            if (m20.L(qVar, aVar)) {
                a2 = this.f.a(aVar, jSONObject);
            } else {
                if (!j8Var.a().b()) {
                    return null;
                }
                a2 = this.e.a(jSONObject);
            }
            return a2;
        } catch (Exception e) {
            y3.d(new j3("cache_get_response_parsing_error", e.getMessage(), this.f885a.b(), str, null, 16, null));
            return null;
        }
    }

    public final c2 a(String str, int i, int i2, boolean z, j8 j8Var, c2.a aVar, w6 w6Var) {
        int d;
        q qVar = this.f885a;
        if (m20.L(qVar, q.c.g)) {
            d = j8Var.h().e();
        } else {
            d = m20.L(qVar, q.b.g) ? j8Var.h().d() : j8Var.h().a();
        }
        int i3 = d;
        return m20.L(this.f885a, q.a.g) ? a(aVar, i, i2, str, i3, j8Var, w6Var) : a(aVar, str, i3, z, j8Var, w6Var);
    }

    public final k2 a(c2.a aVar, String str, int i, boolean z, j8 j8Var, w6 w6Var) {
        k7 c;
        k2 k2Var = new k2(String.format(this.f885a.e(), Arrays.copyOf(new Object[]{j8Var.a().c()}, 1)), j8Var, o7.NORMAL, aVar);
        k2Var.b("cache_assets", this.f886b.f());
        k2Var.b("location", str);
        k2Var.b("imp_depth", Integer.valueOf(i));
        if (w6Var.f() && (c = w6Var.c()) != null) {
            k2Var.c("omidpn", c.a());
            k2Var.c("omidpv", c.b());
        }
        k2Var.b("cache", Boolean.valueOf(z));
        k2Var.o = true;
        return k2Var;
    }

    public final e7 a(c2.a aVar, int i, int i2, String str, int i3, j8 j8Var, w6 w6Var) {
        return new e7(new n6("https://da.chartboost.com", this.f885a.e(), j8Var, o7.NORMAL, aVar), new k(this.f885a, Integer.valueOf(i), Integer.valueOf(i2), str, i3), w6Var);
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, JSONObject jSONObject) {
        if (c2Var != null && jSONObject != null) {
            j8 j8Var = this.h;
            ch3 ch3Var = null;
            if (j8Var == null) {
                j8Var = null;
            }
            d6 d6Var = this.i;
            if (d6Var == null) {
                d6Var = null;
            }
            r a2 = a(j8Var, jSONObject, d6Var.a().d());
            if (a2 != null) {
                a(a2, c2Var);
                ch3Var = ch3.f636a;
            }
            if (ch3Var == null) {
                a("Error parsing response");
                return;
            }
            return;
        }
        a("Unexpected response");
    }

    public final void a(r rVar, c2 c2Var) {
        x31 x31Var = this.j;
        if (x31Var == null) {
            x31Var = null;
        }
        d6 d6Var = this.i;
        x31Var.invoke(new e6((d6Var != null ? d6Var : null).a(), rVar, null, c2Var.h, c2Var.g));
    }

    public final void a(String str) {
        x31 x31Var = this.j;
        if (x31Var == null) {
            x31Var = null;
        }
        d6 d6Var = this.i;
        x31Var.invoke(new e6((d6Var != null ? d6Var : null).a(), null, new CBError(CBError.b.UNEXPECTED_RESPONSE, str), 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public void a(c2 c2Var, CBError cBError) {
        x31 x31Var = this.j;
        if (x31Var == null) {
            x31Var = null;
        }
        d6 d6Var = this.i;
        s0 a2 = (d6Var != null ? d6Var : null).a();
        if (cBError == null) {
            cBError = new CBError(CBError.b.INVALID_RESPONSE, "Error parsing response");
        }
        x31Var.invoke(new e6(a2, null, cBError, 0L, 0L, 26, null));
    }
}
