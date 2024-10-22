package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;

/* loaded from: classes.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1259a;

    /* renamed from: b, reason: collision with root package name */
    public final s9 f1260b;
    public final r4 c;
    public final e2 d;
    public final ka e;
    public final Mediation f;
    public final z1 g;
    public final v6 h;

    public w5(Context context, s9 s9Var, r4 r4Var, e2 e2Var, ka kaVar, Mediation mediation, z1 z1Var, v6 v6Var) {
        this.f1259a = context;
        this.f1260b = s9Var;
        this.c = r4Var;
        this.d = e2Var;
        this.e = kaVar;
        this.f = mediation;
        this.g = z1Var;
        this.h = v6Var;
    }

    public final g2 a(String str, h6 h6Var, String str2, String str3, String str4, String str5, c0 c0Var, f9 f9Var, wa waVar) {
        boolean z;
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ja(this.f1259a, str, h6Var, str2, this.f1260b, this.c, this.d, this.e, str5, this.f, s2.f1122b.d().i(), this.g, str3, this.h, c0Var, f9Var, waVar);
        }
        return new j2(this.f1259a, str, h6Var, str2, this.c, this.g, this.f1260b, this.d, this.f, str3, this.h, c0Var, f9Var, waVar);
    }
}
