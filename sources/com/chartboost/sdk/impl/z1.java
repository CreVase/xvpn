package com.chartboost.sdk.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1328a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1329b;
    public final m6 c;
    public final a2 d;
    public final h9 e;
    public final Handler f;
    public final String g = s2.f1122b.b();

    public z1(Executor executor, m6 m6Var, a2 a2Var, h9 h9Var, Handler handler, Executor executor2) {
        this.f1328a = executor2;
        this.f1329b = executor;
        this.c = m6Var;
        this.d = a2Var;
        this.e = h9Var;
        this.f = handler;
    }

    public <T> void a(v1<T> v1Var) {
        f6.d("CBRequest", "Execute request: " + v1Var.e());
        this.f1328a.execute(new l6(this.f1329b, this.c, this.d, this.e, this.f, v1Var));
    }

    public String a() {
        return this.g;
    }
}
