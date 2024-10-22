package com.chartboost.sdk.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f697a;

    public a2(Context context) {
        this.f697a = context;
    }

    public final int a() {
        return h3.f(this.f697a);
    }

    public final String b() {
        return h3.g(this.f697a).b();
    }

    public final g3 c() {
        g3 g3Var;
        String str;
        Context context = this.f697a;
        if (!h3.d(context)) {
            g3Var = g3.CONNECTION_ERROR;
        } else if (h3.e(context)) {
            g3Var = g3.CONNECTION_WIFI;
        } else if (h3.c(context)) {
            g3Var = g3.CONNECTION_MOBILE;
        } else {
            g3Var = g3.CONNECTION_UNKNOWN;
        }
        str = b2.f717a;
        f6.a(str, "NETWORK TYPE: " + g3Var);
        return g3Var;
    }

    public final boolean d() {
        if (c() == g3.CONNECTION_MOBILE) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return h3.d(this.f697a);
    }

    public final o6 f() {
        return h3.g(this.f697a);
    }
}
