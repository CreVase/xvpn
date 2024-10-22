package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.callbacks.StartCallback;
import defpackage.vu3;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f1038b;
    public final u8 c;
    public final j1 d;
    public final o1 e;

    public o2(Context context, ScheduledExecutorService scheduledExecutorService, u8 u8Var, j1 j1Var, o1 o1Var) {
        this.f1037a = context;
        this.f1038b = scheduledExecutorService;
        this.c = u8Var;
        this.d = j1Var;
        this.e = o1Var;
    }

    public final void a(String str, String str2, StartCallback startCallback) {
        this.f1038b.execute(new vu3(this, str, str2, startCallback));
    }

    public final void b() {
        try {
            Thread.sleep(100L);
            this.e.k();
        } catch (Exception e) {
            e.toString();
        }
    }

    public static final void a(o2 o2Var, String str, String str2, StartCallback startCallback) {
        o2Var.b();
        u9.f1184a.a(o2Var.f1037a);
        o2Var.c.a(str, str2, startCallback);
    }

    public final String a() {
        return this.d.a();
    }
}
