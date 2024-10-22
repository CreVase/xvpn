package com.chartboost.sdk.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class pb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1076a;

    public void a(Context context) {
        b(context);
        if (a()) {
            return;
        }
        a(true);
        mc.c().a(context);
        jb.g().a(context);
        cb.a(context);
        tb.a(context);
        cc.a(context);
        ic.b().a(context);
        za.a().a(context);
    }

    public void b() {
        kc.a();
        za.a().d();
    }

    public void a(boolean z) {
        this.f1076a = z;
    }

    public final void b(Context context) {
        kc.a(context, "Application Context cannot be null");
    }

    public boolean a() {
        return this.f1076a;
    }
}
