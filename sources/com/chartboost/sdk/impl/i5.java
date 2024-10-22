package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.q;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i5 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final r f872a;

    /* renamed from: b, reason: collision with root package name */
    public final q f873b;
    public final b3 c;
    public final c0 d;

    /* loaded from: classes.dex */
    public static final class a implements c3 {
        @Override // com.chartboost.sdk.impl.c3
        public void a(JSONObject jSONObject) {
            String str;
            str = j5.f892a;
            f6.c(str, "onCompleteRequestSuccess " + jSONObject);
        }

        @Override // com.chartboost.sdk.impl.c3
        public void a(String str) {
            String str2;
            str2 = j5.f892a;
            f6.c(str2, "onCompleteRequestFailure " + str);
        }
    }

    public i5(r rVar, q qVar, b3 b3Var, c0 c0Var) {
        this.f872a = rVar;
        this.f873b = qVar;
        this.c = b3Var;
        this.d = c0Var;
    }

    @Override // com.chartboost.sdk.impl.k5
    public void a(String str, Float f, Float f2) {
        this.c.a(new a(), new a3(str, this.f872a.a(), this.f872a.e(), this.f872a.p(), this.f872a.q(), f, f2));
    }

    @Override // com.chartboost.sdk.impl.k5
    public void d() {
        String str;
        q qVar = this.f873b;
        if (qVar == q.b.g) {
            str = j5.f892a;
            f6.c(str, "didCompleteInterstitial delegate used to be sent here");
        } else if (qVar == q.c.g) {
            this.d.a(this.f872a.i(), this.f872a.p());
        }
    }
}
