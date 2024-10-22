package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public class ic {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static ic f883b = new ic();

    /* renamed from: a, reason: collision with root package name */
    public Context f884a;

    public static ic b() {
        return f883b;
    }

    public Context a() {
        return this.f884a;
    }

    public void a(Context context) {
        this.f884a = context != null ? context.getApplicationContext() : null;
    }
}
