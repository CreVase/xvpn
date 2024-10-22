package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i8 implements h8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f878a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f879b;
    public final a2 c;
    public final AtomicReference<t8> d;
    public final SharedPreferences e;
    public final h9 f;
    public final m2 g;
    public final x8 h;
    public final p7 i;
    public final Mediation j;

    public i8(Context context, o1 o1Var, a2 a2Var, AtomicReference<t8> atomicReference, SharedPreferences sharedPreferences, h9 h9Var, m2 m2Var, x8 x8Var, p7 p7Var, Mediation mediation) {
        this.f878a = context;
        this.f879b = o1Var;
        this.c = a2Var;
        this.d = atomicReference;
        this.e = sharedPreferences;
        this.f = h9Var;
        this.g = m2Var;
        this.h = x8Var;
        this.i = p7Var;
        this.j = mediation;
    }

    @Override // com.chartboost.sdk.impl.h8
    public j8 build() {
        i6 i6Var;
        s2 s2Var = s2.f1122b;
        String b2 = s2Var.b();
        String c = s2Var.c();
        y4 k = this.f879b.k();
        z7 reachabilityBodyFields = n4.toReachabilityBodyFields(this.c);
        l2 a2 = this.g.a(this.f878a);
        y8 h = this.h.h();
        i9 bodyFields = n4.toBodyFields(this.f);
        q7 g = this.i.g();
        f3 h2 = this.d.get().h();
        o3 deviceBodyFields = n4.toDeviceBodyFields(this.f878a);
        Mediation mediation = this.j;
        if (mediation != null) {
            i6Var = mediation.toMediationBodyFields();
        } else {
            i6Var = null;
        }
        return new j8(b2, c, k, reachabilityBodyFields, a2, h, bodyFields, g, h2, deviceBodyFields, i6Var);
    }
}
