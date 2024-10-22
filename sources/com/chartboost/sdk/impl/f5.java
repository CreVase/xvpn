package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.p71;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    public final r f817a;

    /* renamed from: b, reason: collision with root package name */
    public final f2 f818b;
    public final v2 c;
    public final r5 d;
    public final q5 e;
    public final v6 f;
    public final c0 g;
    public Boolean h;
    public boolean i;
    public boolean j;

    /* loaded from: classes.dex */
    public static final class a implements w2 {
        @Override // com.chartboost.sdk.impl.w2
        public void a(JSONObject jSONObject) {
            String str;
            String str2;
            str = g5.f842a;
            if (jSONObject == null || (str2 = jSONObject.toString()) == null) {
                str2 = "";
            }
            f6.c(str, "onClickRequestSuccess ".concat(str2));
        }

        @Override // com.chartboost.sdk.impl.w2
        public void a(String str) {
            String str2;
            str2 = g5.f842a;
            f6.c(str2, "onClickRequestFailure " + str);
        }
    }

    public f5(r rVar, f2 f2Var, v2 v2Var, r5 r5Var, q5 q5Var, v6 v6Var, c0 c0Var) {
        this.f817a = rVar;
        this.f818b = f2Var;
        this.c = v2Var;
        this.d = r5Var;
        this.e = q5Var;
        this.f = v6Var;
        this.g = c0Var;
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(boolean z) {
        this.j = z;
    }

    @Override // com.chartboost.sdk.impl.h5
    public void b(String str, Float f, Float f2) {
        this.c.a(new a(), new u2(str, this.f817a.a(), this.f817a.s(), this.f817a.e(), this.f817a.f(), f, f2, this.d, this.h));
    }

    @Override // com.chartboost.sdk.impl.h5
    public void c() {
        this.g.b(this.f817a.i());
        if (this.i) {
            this.e.D();
        }
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(String str, CBError.CBClickError cBClickError) {
        this.g.a(this.f817a.i(), str, cBClickError);
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(Context context, String str, Boolean bool) {
        b(context, str, bool);
    }

    @Override // com.chartboost.sdk.impl.h5
    public boolean a(Context context, Boolean bool, s5 s5Var) {
        if (bool != null) {
            this.i = bool.booleanValue();
        }
        if (s5Var != s5.DISPLAYED) {
            return false;
        }
        String j = this.f817a.j();
        String g = this.f817a.g();
        if (b(context, g)) {
            this.h = Boolean.TRUE;
            j = g;
        } else {
            this.h = Boolean.FALSE;
        }
        if (this.j) {
            return false;
        }
        this.j = true;
        this.e.b(false);
        b(context, j, Boolean.valueOf(this.i));
        return true;
    }

    public final boolean b(Context context, String str) {
        String str2;
        if (str.length() > 0) {
            try {
                return this.f818b.a(context, str);
            } catch (Exception e) {
                str2 = g5.f842a;
                p71.z("CBImpression try open deep link: ", e, str2);
            }
        }
        return false;
    }

    public final CBError.CBClickError a(Context context, String str) {
        if (str == null || str.length() == 0) {
            f2 f2Var = this.f818b;
            q5 q5Var = this.e;
            CBError.CBClickError cBClickError = CBError.CBClickError.URI_INVALID;
            f2Var.a(q5Var, false, str, cBClickError);
            return cBClickError;
        }
        return this.f818b.a(context, this.e, str);
    }

    public final void b(Context context, String str, Boolean bool) {
        this.f.b();
        a(context, str);
        if (bool != null) {
            this.i = bool.booleanValue();
        }
    }
}
